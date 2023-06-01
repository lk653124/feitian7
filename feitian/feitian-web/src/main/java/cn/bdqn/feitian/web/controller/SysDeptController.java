package cn.bdqn.feitian.web.controller;

import cn.bdqn.feitian.domain.po.SysDept;
import cn.bdqn.feitian.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("dept")
public class SysDeptController {
    @Autowired
    private SysDeptService service;

    @PostMapping("")
    @ResponseBody
    public int dept(SysDept dept){
        return service.selectDeptCount(dept);
    }
}
