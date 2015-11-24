package app.controller;

import app.models.User;
import app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by cjl20 on 2015/11/24.
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/user")
    public List<User> greeting() {
        User user = new User("cjl",2,15,"sadasdasdsda");
        userRepository.save(user);
        List<User> userList = userRepository.findAll();
        for (User user1:userList){
            System.out.println(user1.toString());
        }
        return userList;
    }

}
