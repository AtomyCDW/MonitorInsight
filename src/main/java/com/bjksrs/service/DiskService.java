package com.bjksrs.service;

import com.bjksrs.entity.Disk;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
public interface DiskService {
     List<Disk> getDisk();
     List<Disk> getDiskByDevice(String device);
     List<Disk> getDiskShanxing(String device);
}
