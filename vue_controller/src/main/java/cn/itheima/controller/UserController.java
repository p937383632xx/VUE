package cn.itheima.controller;

import cn.itheima.service.UserService;
import cn.itheima.ssm.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll.do")
    public String findAll(Model model){
        List<User> userList = userService.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
        model.addAttribute("userList",userList);
        return "show";
    }
}
