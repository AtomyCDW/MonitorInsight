package com.bjksrs.service.impl;

import com.bjksrs.dao.DiskMapper;
import com.bjksrs.entity.Disk;
import com.bjksrs.service.DiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
@Service
public class IDiskService implements DiskService {
    @Autowired
    DiskMapper diskMapper;
    @Override
    public List<Disk> getDisk() {
        return diskMapper.getDisk();
    }

    @Override
    public List<Disk> getDiskByDevice(String device) {
        return diskMapper.getDiskByDevice(device);
    }

    @Override
    public List<Disk> getDiskShanxing(String device) {
        return diskMapper.getDiskShanxing(device);
    }
}
