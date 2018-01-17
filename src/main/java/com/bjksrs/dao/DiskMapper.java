package com.bjksrs.dao;

import com.bjksrs.entity.Disk;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
public interface DiskMapper {
     List<Disk> getDisk();
     List<Disk> getDiskByDevice(String device);
}
