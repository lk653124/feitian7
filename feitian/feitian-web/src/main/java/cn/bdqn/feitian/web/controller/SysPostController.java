package cn.bdqn.feitian.web.controller;

import cn.bdqn.feitian.domain.po.SysPost;
import cn.bdqn.feitian.service.SysPostService;
import cn.bdqn.feitian.web.config.Result;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
    public Result getAll(
            @RequestParam(value = "pageNum",defaultValue = "1",required = false) Long pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10",required = false) Long pageSize
    ){
       return Result.success(sysPostService.page(new Page<SysPost>(pageNum,pageSize)));
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
