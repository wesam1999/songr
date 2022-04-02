package com.example.songr.controller;

import com.example.songr.Models.ChatUser;
import com.example.songr.Repositries.ChatUserRepositrie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

@Controller
public class AuthenticationController {
    @Autowired
    ChatUserRepositrie chatUserRepositrie;


    @GetMapping("/login")
    public String Getloginpage(){


        return "login";
    }
    @GetMapping("/loginWithSecret")
public String  GetloginWithSecret  (){

return "loginWithSecret";
    }
    @GetMapping("/signup")
    public String Getsignup(){


        return "signup";
    }
    @PostMapping("/login")
    public RedirectView LoginUser(String username,String password){
        ChatUser UserFromDB=chatUserRepositrie.findByUsername(username);
        if ((UserFromDB == null) || (!BCrypt.checkpw(password, UserFromDB.password))) {
            return new RedirectView("/login");
        }

        return new RedirectView("/");
    }
    @PostMapping("/loginWithSecret")
    public RedirectView loginWithSecret(HttpServletRequest request, String username, String password){
        ChatUser userFromDb = chatUserRepositrie.findByUsername(username);
        if ((userFromDb == null)
                || (!BCrypt.checkpw(password, userFromDb.password)))
        {
            return new RedirectView("/loginWithSecret");
        }

        HttpSession session = request.getSession();
        session.setAttribute("username", username);

        return new RedirectView("/withSecret");

    }
    @PostMapping("/logoutWithSecret")
    public RedirectView logOutUserWithSecret(HttpServletRequest request)
    {
        HttpSession session = request.getSession();
        session.invalidate();

        return new RedirectView("/loginWithSecret");
    }
    @PostMapping("/signup")
    public RedirectView signUpUser(Model m, String username, String password)
    {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(12));
        ChatUser newChatUser = new ChatUser(username, hashedPassword);

        chatUserRepositrie.save(newChatUser);
        return new RedirectView("/login");
    }

}
