package com.bjksrs.service.impl;

import com.bjksrs.dao.LoadMapper;
import com.bjksrs.entity.Load;
import com.bjksrs.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
@Service
public class ILoadService implements LoadService {
    @Autowired
    LoadMapper loadMapper;
    @Override
    public List<Load> getLoad() {
        return loadMapper.getLoad();
    }

    @Override
    public List<Load> getLoadDynamic(String device) {
        return loadMapper.getLoadDynamic(device);
    }

    @Override
    public List<Load> getLoadByDevice(String device) {
        return loadMapper.getLoadByDevice(device);
    }
}
