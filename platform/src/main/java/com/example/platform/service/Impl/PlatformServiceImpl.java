package com.example.platform.service.Impl;

import com.example.platform.dao.PlatformMapper;
import com.example.platform.service.PlatformService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PlatformServiceImpl implements PlatformService {
    @Resource
    private PlatformMapper platformMapper;

    @Override
    public Integer selectSum() {
        return platformMapper.selectSum();
    }
}
