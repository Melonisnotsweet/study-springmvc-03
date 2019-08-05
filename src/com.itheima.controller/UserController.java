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
              System.out.println("ɾ���˵�id�ǣ�"+id);
          }
      }
      else System.out.println("ids=null");
      return "success";
    }

   /*
   ���û�ע��ҳ����ת
    */
    @RequestMapping(value = "/toRegister")
    public String toRegister()
    {
        return "register";
    }
    /*
    �����û���ע����Ϣ�����ص�ע��ɹ���ҳ�棬�����н��ܵĲ�����User����
     */
    @RequestMapping(value = "/registerUser")
    public String registerUser(User user)
    {
        //��ȡ�û����������ӡ�ڿ���̨�ϣ������ص�successҳ��
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
                System.out.println("�û�id"+user.getId()+"�û���"+user.getUsername());
            }

        }
        return "success";
    }

}
