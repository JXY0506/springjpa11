package com.offcn.controller;

import com.offcn.dao.JxyDao;
import com.offcn.entity.Jxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/jxy")
public class JxyController {
    @Autowired
    JxyDao jxyDao;
    @RequestMapping(value = "/getMsg")
    @ResponseBody
    public List<Jxy> getMsg(){
        return jxyDao.findAll();
    }

    @RequestMapping(value = "/table")
    public String table(Model model){
        List<Jxy> jxyList = jxyDao.findAll();
        System.out.println(jxyList);
        model.addAttribute("userList",jxyList);
        return "user";
    }
}
