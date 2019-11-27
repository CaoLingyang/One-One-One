package com.controller;

import com.entity.Emp;
import com.entity.EmpVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/wrapper")
    public String index(String abc,Integer pageNum){
        System.out.println("---"+abc);
        System.out.println("----debug:pageNum = " + pageNum);
        return "index";
    }

    @GetMapping("/simple")
    public String index(int pageNum){
        System.out.println("pageNum = " + pageNum);
        return "index";
    }

    @GetMapping("/simple/page/{pageNo}")
    public String index3(@PathVariable("pageNo")int pageNo){
        System.out.println("pageNo = " + pageNo);
        return "index";
    }

    @GetMapping("/complex")
    public String index(Emp emp){
        System.out.println("emp = " + emp);
        return "index";
    }

    @GetMapping("/list")
    public String index(EmpVO empVO){
        System.out.println("empVO = " + empVO);
        return "index";
    }
}
