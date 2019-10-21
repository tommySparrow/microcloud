package com.at.springcloud.mapper;

import com.at.springcloud.entities.Dept;
import com.at.springcloud.utils.MapperUtil;

/**
 *
 * @author User
 */
public interface DeptMapper extends MapperUtil<Dept> {

    Integer insertDept(Dept dept);
}