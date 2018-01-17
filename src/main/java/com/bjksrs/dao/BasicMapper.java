package com.bjksrs.dao;


import com.bjksrs.entity.Basic;
import com.bjksrs.util.LayUiUtils;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
public interface BasicMapper {
     List<Basic> getBasic();
     List<Basic> getBasicByDevice(String device);
}
