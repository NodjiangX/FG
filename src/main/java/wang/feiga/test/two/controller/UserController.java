package wang.feiga.test.two.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import wang.feiga.test.two.pojo.User;
import wang.feiga.test.two.service.UserService;
 
  
@Controller  
@RequestMapping("/user")
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
       // int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.selectUserById(1);
        model.addAttribute("user", user);  
        return "index";  
    }  
} 