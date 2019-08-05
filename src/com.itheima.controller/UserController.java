package com.itheima.controller;

import com.itheima.vo.UserVO;
import com.ithieima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;


@Controller
public class UserController {
    @RequestMapping("/selectUser")
    public String selectUser()
    {
        return "user";
    }
    @RequestMapping("deleteUser")
    public String deleteUser(Integer[] ids)
    {
      if (ids!=null)
      {
          for (Integer id:ids)
          {
              System.out.println("删除了的id是："+id);
          }
      }
      else System.out.println("ids=null");
      return "success";
    }

   /*
   向用户注册页面跳转
    */
    @RequestMapping(value = "/toRegister")
    public String toRegister()
    {
        return "register";
    }
    /*
    接受用户的注册信息，返回到注册成功的页面，方法中接受的参数是User类型
     */
    @RequestMapping(value = "/registerUser")
    public String registerUser(User user)
    {
        //获取用户名和密码打印在控制台上，并返回到success页面
        String username=user.getUsername();
        Integer password=user.getPassword();
        System.out.println("username="+username);
        System.out.println("password="+password);
        return "success";
    }
    @RequestMapping("/toUsersEdit")
    public String toUsersEdit()
    {
        return "user_edit";
    }
    @RequestMapping("/editUsers")
    public String editUsers(UserVO usersList)
    {
        List<User> users=usersList.getUsers();
        for (User user:users)
        {
            if (user.getId()!=null){
                System.out.println("用户id"+user.getId()+"用户名"+user.getUsername());
            }

        }
        return "success";
    }

}
