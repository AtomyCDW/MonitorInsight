package com.bjksrs.controller;

import com.bjksrs.entity.Disk;
import com.bjksrs.entity.ShanXing;
import com.bjksrs.service.DiskService;
import com.bjksrs.util.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @RequestMapping(value = "getDiskShanxing.do")
    public List<ShanXing> getDiskShanxing(String device){
        List<Disk> list = diskService.getDiskShanxing(device);
        Double diskSize = 0.0;
        Double diskSizeG = 0.0;
        Double diskSizeM = 0.0;
        Double diskSizeT= 0.0;

        Double diskUsed = 0.0;
        Double diskUsedG = 0.0;
        Double diskUsedM = 0.0;
        Double diskUsedT = 0.0;
        String [] arrUsed ;
        String [] arrSize ;


        for (int i=0;i<list.size();i++){
            if(list.get(i).getDisk_used().contains("G")){
                arrUsed = list.get(i).getDisk_used().split("G");
                diskUsedG += (Double.parseDouble(arrUsed[0]))*1024;

            }
            if(list.get(i).getDisk_used().contains("M")){
                arrUsed = list.get(i).getDisk_used().split("M");
                diskUsedM += Double.parseDouble(arrUsed[0]);

            }
            if(list.get(i).getDisk_used().contains("T")){
                arrUsed = list.get(i).getDisk_used().split("T");
                diskUsedT += (Double.parseDouble(arrUsed[0]))*1024*1024;
            }
        }

        for (int i=0;i<list.size();i++){
            if(list.get(i).getDisk_size().contains("G")){
                arrSize = list.get(i).getDisk_size().split("G");
                diskSizeG += (Double.parseDouble(arrSize[0]))*1024;
            }
            if(list.get(i).getDisk_size().contains("M")){
                arrSize = list.get(i).getDisk_size().split("M");
                diskSizeM += Double.parseDouble(arrSize[0]);
            }
            if(list.get(i).getDisk_size().contains("T")){
                arrSize = list.get(i).getDisk_size().split("T");
                diskSizeT += (Double.parseDouble(arrSize[0]))*1024*1024;
            }
        }

        //已用磁盘空间，单位:M
        diskUsed = diskUsedG + diskUsedM + diskUsedT;
        diskSize = diskSizeG + diskSizeM + diskSizeT;

        List<ShanXing> shan = new ArrayList<>();
        shan.add(new ShanXing(diskUsed,"磁盘已用空间(单位:M)"));
        shan.add(new ShanXing(diskSize-diskUsed,"磁盘可用空间(单位:M)"));
        return shan;
    }


}
