package web.com.nf.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.com.nf.test.service.DeptService;


import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("/list")
    public String list() {

        return "/dept/list";
    }
    @RequestMapping("/delete")
    public String delete(int deptid) {
        deptService.deleteById(deptid);
        return "redirect:/dept/list";
    }
}
