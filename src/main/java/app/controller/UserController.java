package app.controller;

import app.models.LoginStatus;
import app.models.User;
import app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by cjl20 on 2015/11/24.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/user/register/userIsExists")
    public boolean userIsExists(@RequestParam(value = "username") String username) {
        boolean isExists = false;
        User user = userRepository.findByUsername(username);
        if (user != null) isExists = true;
        return isExists;
    }

    @RequestMapping("/user/register")
    public String register(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        String message = "true";
        if (userIsExists(username)) {
            message = "false";
        }
        return message;
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public LoginStatus login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        LoginStatus status = new LoginStatus();
        if (userIsExists(username)){
            User user = userRepository.findByUsernameAndPassword(username, password);
            if (user != null) {
                status.setLoginer(new User());
                status.setStatus(1);
            }
        }else {
            status.setStatus(-1);
        }
        return status;
    }

//    @RequestMapping("/user/test")
//    public String test(String body){
//
//    }

}
