package com.bjksrs.dao;

import com.bjksrs.entity.Memory;
import com.bjksrs.entity.MemoryPercent;

import javax.swing.*;
import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
public interface MemoryMapper {
    List<MemoryPercent> getMemoryPercent();

    List<MemoryPercent> getMemoryPercentDynamic(String device);
    List<MemoryPercent> getMemoryPercentByDevice(String device);
}
