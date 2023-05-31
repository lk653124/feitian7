package cn.bdqn.feitian.service.impl;

import cn.bdqn.feitian.dao.SysPostMapper;
import cn.bdqn.feitian.domain.po.SysPost;
import cn.bdqn.feitian.service.SysPostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author M
* @description 针对表【sys_post(岗位信息表)】的数据库操作Service实现
* @createDate 2023-05-31 15:57:33
*/
@Service
public class SysPostServiceImpl extends ServiceImpl<SysPostMapper, SysPost> implements SysPostService {

    @Resource
    private SysPostMapper postMapper;

    @Override
    public List<SysPost> getAll() {
        return postMapper.getAll();
    }
}




