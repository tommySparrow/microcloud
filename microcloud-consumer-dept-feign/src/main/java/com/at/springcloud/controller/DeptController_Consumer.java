package com.at.springcloud.controller;

import com.at.springcloud.entities.Dept;
import com.at.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Description：消费端控制层
 * @ throws
 * @author User
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id)
    {
        return this.deptClientService.get(id);
    }

}
