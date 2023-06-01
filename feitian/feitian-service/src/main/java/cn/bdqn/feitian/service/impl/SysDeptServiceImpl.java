package cn.bdqn.feitian.service.impl;

import cn.bdqn.feitian.dao.SysDeptMapper;
import cn.bdqn.feitian.domain.po.SysDept;
import cn.bdqn.feitian.service.SysDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Resource
    private SysDeptMapper sysDeptMapper;

    @Override
    public int selectDeptCount(SysDept dept) {

        return sysDeptMapper.selectDeptCount(dept);
    }
}
