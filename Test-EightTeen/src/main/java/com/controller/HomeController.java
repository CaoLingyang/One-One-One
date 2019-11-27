package com.controller;


import com.entity.EmpVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;


@RestController
public class HomeController {
    @ResponseBody
    @RequestMapping("/index")
    public String index(){
      return "index";
  }

  @RequestMapping("/list")
  @ResponseBody
    public EmpVO list()throws ParseException{
        EmpVO empVO=new EmpVO(1,"aaa",new Date());
        return empVO;
  }
  @RequestMapping("insert")
    @ResponseBody
    public EmpVO insert(@RequestBody EmpVO empVO){
      System.out.println("empVO = " + empVO);
      EmpVO result=new EmpVO(1,"server",new Date());
      return result;
    }

    @RequestMapping("/insert2")
    @ResponseBody
    public EmpVO insert2(EmpVO empVO){
        System.out.println("empVO = " + empVO);
        EmpVO result=new EmpVO(2,"server2",new Date());
        return result;
    }
}
