package com.example.platform.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlatformMapper {
    Integer selectSum();
}
