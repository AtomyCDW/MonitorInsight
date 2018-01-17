package com.bjksrs.service.impl;

import com.bjksrs.dao.MemoryMapper;
import com.bjksrs.entity.Memory;
import com.bjksrs.entity.MemoryPercent;
import com.bjksrs.service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
@Service
public class IMemoryService implements MemoryService {
    @Autowired
    MemoryMapper memoryMapper;
    @Override
    public List<MemoryPercent> getMemoryPercent() {
        return memoryMapper.getMemoryPercent();
    }

    @Override
    public List<MemoryPercent> getMemoryPercentDynamic(String device) {
        return memoryMapper.getMemoryPercentDynamic(device);
    }

    @Override
    public List<MemoryPercent> getMemoryPercentByDevice(String device) {
        return memoryMapper.getMemoryPercentByDevice(device);
    }
}
