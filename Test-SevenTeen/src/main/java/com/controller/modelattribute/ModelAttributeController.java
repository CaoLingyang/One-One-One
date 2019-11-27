package com.controller.modelattribute;

import com.controller.Vo.UserInfoVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model")
public class ModelAttributeController {
    @ModelAttribute("abc")
    public UserInfoVo initData(){
        UserInfoVo userInfoVo=new UserInfoVo();
        userInfoVo.setUsername("init");
        return userInfoVo;
    }
    @RequestMapping("/demo1")
    public String demo1(UserInfoVo userInfoVo, Model model){
        return "model";
    }

    @RequestMapping("/demo2")
    public String demo2(@ModelAttribute(value = "abc",binding = false)UserInfoVo us
    ,Model model){
        return "model";
    }
}
