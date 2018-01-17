package com.bjksrs.service.impl;

import com.bjksrs.dao.CpuMapper;
import com.bjksrs.entity.Cpu;
import com.bjksrs.service.CpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
@Service
public class ICpuService implements CpuService {
    @Autowired
    CpuMapper cpuMapper;
    @Override
    public List<Cpu> getCpu() {
        return cpuMapper.getCpu();
    }

    @Override
    public List<Cpu> getCpuByDevice(String device) {
        return cpuMapper.getCpuByDevice(device);
    }

    @Override
    public List<Cpu> getCpuDynamic(String device){
        return cpuMapper.getCpuDynamic(device);
    }
}
