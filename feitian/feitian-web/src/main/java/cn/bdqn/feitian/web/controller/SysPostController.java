package cn.bdqn.feitian.web.controller;

import cn.bdqn.feitian.domain.po.SysPost;
import cn.bdqn.feitian.service.SysPostService;
import cn.bdqn.feitian.web.config.Result;
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
    public Result getAll(){
       return Result.success(sysPostService.getAll());
    }

    /**
     * 新增岗位
     * @return
     */
    @PostMapping("/save")
    public boolean save(SysPost sysPost){
        return sysPostService.save(sysPost);
    }

    /**
     * 修改岗位信息
     */
    @PostMapping("/update")
    public boolean updateById(@RequestBody SysPost sysPost){
        return sysPostService.updateById(sysPost);
    }

    /**
     * 删除岗位信息
     * @param postId
     * @return
     */
    @DeleteMapping("/removeById")
    public boolean removeById(@PathVariable("postId") Integer postId){
        return sysPostService.removeById(postId);
    }
}
