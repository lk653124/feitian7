package cn.bdqn.feitian.web.controller;

import cn.bdqn.feitian.domain.po.SysPost;
import cn.bdqn.feitian.service.SysPostService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 岗位管理控制层
 */
@RestController
@CrossOrigin
@RequestMapping("/job")
public class SysPostController {

    @Resource
    private SysPostService sysPostService;

    @GetMapping("")
    public List<SysPost> getAll(){
        return sysPostService.getAll();
    }

    /**
     * 新增岗位
     * @return
     */
    @PostMapping("/save")
    public boolean save(@RequestBody SysPost sysPost){
        return sysPostService.save(sysPost);
    }
}
