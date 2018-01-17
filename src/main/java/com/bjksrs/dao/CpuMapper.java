package com.bjksrs.dao;

import com.bjksrs.entity.Cpu;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
public interface CpuMapper {
    List<Cpu> getCpu();
    List<Cpu> getCpuByDevice(String device);
    List<Cpu> getCpuDynamic(String device);
}
