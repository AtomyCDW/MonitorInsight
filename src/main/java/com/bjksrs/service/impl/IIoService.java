package com.bjksrs.service.impl;

import com.bjksrs.dao.IoMapper;
import com.bjksrs.entity.Io;
import com.bjksrs.service.IoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
@Service
public class IIoService implements IoService {
    @Autowired
    IoMapper ioMapper;
    @Override
    public List<Io> getIo() {
        return ioMapper.getIo();
    }

    @Override
    public List<Io> getTpsDynamic(String device) {

        return ioMapper.getTpsDynamic(device);
    }

    @Override
    public List<Io> getTpsByDevice(String devie) {
        return ioMapper.getTpsByDevice(devie);
    }
}
