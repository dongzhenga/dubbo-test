package com.dz.provider2.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dz.service.TestService;


/**
 * @author Satsuki
 * @time 2019/8/27 15:35
 * @description:
 * 模拟数据库事务实现
 */
@Service(version = "1.0.0",interfaceClass = TestService.class)
//@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    @Override
    public String ins() {
      return "ins2";
    }

    @Override
    public String del() {
        return "del2";
    }

    @Override
    public String upd() {
        return "upd2";
    }

    @Override
    public String sel() {
        return "sel";
    }
}
