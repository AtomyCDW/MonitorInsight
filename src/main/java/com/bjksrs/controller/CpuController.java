package com.bjksrs.controller;

import com.bjksrs.entity.Cpu;
import com.bjksrs.service.CpuService;
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
public class CpuController {

    @Autowired
    CpuService cpuService;

    @RequestMapping(value = "getCpu.do")
    public List<Cpu> getCpu(){
        List<Cpu> list = cpuService.getCpu();

        return list;
    }

    @RequestMapping(value = "getCpuByDevice.do")
    public List<Cpu> getCpuByDevice(String device){
        List<Cpu> list = cpuService.getCpuByDevice(device);
        System.out.println("hahahaahahah");

        return list;
    }

    @RequestMapping(value = "getCpuDynamic.do")
    public List<Cpu> getCpuDynamic(String device){
        List<Cpu> list = cpuService.getCpuDynamic(device);
        return list;
    }
}
