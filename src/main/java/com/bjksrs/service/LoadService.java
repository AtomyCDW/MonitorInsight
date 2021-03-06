package com.bjksrs.service;

import com.bjksrs.entity.Load;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
public interface LoadService {
     List<Load> getLoad();
     List<Load> getLoadDynamic(String device);
     List<Load> getLoadByDevice(String device);
}
