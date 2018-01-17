package com.bjksrs.service;

import com.bjksrs.entity.Basic;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
public interface BasicService {
    List<Basic> getBasic();
    List<Basic> getBasicByDevice(String device);
}
