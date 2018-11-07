package cn.law.ssm.controller;

import cn.law.ssm.bean.User;
import cn.law.ssm.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserActionController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    private String insert(User user) {
//    private String insert() {
//        System.out.println(user);
//        User u = new User();
//        u.setUsername("u1");
//        u.setPassword("p3");
//        u.setAddress("a3");
//        u.setAge(1);
//        u.setGender("M");
//        u.setValidate(true);
//        u.setRegistration_platform("web");
        userDao.insertUser(user);
        return "success";
    }

    @RequestMapping("/count")
    private String statistics() {
        System.out.println(userDao.statistics());
        return "success";
    }

    @RequestMapping("/findUserById")
    private @ResponseBody
    User findUserById() {
//        System.out.println(userDao.findUserById(1L).toString());
        return userDao.findUserById(2L);
    }

    @RequestMapping("/signup")
    private @ResponseBody
    User signUp(User user) {
//        System.out.println(userDao.findUserById(1L).toString());
        return userDao.signup(user);
    }

    @RequestMapping("/checkExist")
    private String checkExist(User user) {
        System.out.println(checkExist2(user));
        return "success";
    }

    private boolean checkExist2(User u) {
        return userDao.checkExist(u.getUsername());
    }

}
