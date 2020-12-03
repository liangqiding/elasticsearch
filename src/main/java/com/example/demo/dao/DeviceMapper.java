package com.example.demo.dao;

import com.example.demo.domain.Device;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domain.es.DeviceEs;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author lqd
 * @since 2020-11-11
 */

public interface DeviceMapper extends BaseMapper<Device> {
    List<DeviceEs> queryAll();
}
