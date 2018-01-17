package com.bjksrs.dao;

import com.bjksrs.entity.Io;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
public interface IoMapper {
    List<Io> getIo();
    List<Io> getTpsDynamic(String device);
    List<Io> getTpsByDevice(String devie);
}
