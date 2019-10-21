package com.at.springcloud.service.impl;

import com.at.springcloud.entities.Dept;
import com.at.springcloud.mapper.DeptMapper;
import com.at.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Description：
 * @ throws
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept get(Integer id) {
        return deptMapper.selectByPrimaryKey(id);
    }
}
