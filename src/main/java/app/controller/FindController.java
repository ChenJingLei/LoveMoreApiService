package app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cjl20 on 2015/11/25.
 */

@RestController
public class FindController {

    @RequestMapping("/find/test/sss")
    public String test(){
        return "Connect success";
    }
}
