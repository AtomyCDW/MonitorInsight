package com.bjksrs.controller;

import com.bjksrs.entity.Disk;
import com.bjksrs.service.DiskService;
import com.bjksrs.util.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
@RestController
@RequestMapping(value = "/monitor/")
public class DiskController {
    @Autowired
    DiskService diskService;
    
    @RequestMapping(value = "getDiskByDevice.do")
    public LayUiUtils<Disk> getDiskByDevice(String device){
        LayUiUtils<Disk> lay = new LayUiUtils<>();
        List<Disk> list = diskService.getDiskByDevice(device);
        lay.setCode(0);
        lay.setCount(100);
        lay.setData(list);
        lay.setMsg("");
        return lay;
    }
}
