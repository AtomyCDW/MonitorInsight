package com.bjksrs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Atomy
 * @date 2017/12/28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Basic {
    private String linux_version;
    private String proc_version;
    private String sys_bit;
    private String cpu_name;
    private String cpu_num;
    private String cpu_cores;
    private String cpu_physicalNum;

    private String mem_type;
    private String mem_speed;
    private String disk_model;
    private String device;
    private String checktime;
    private String  mem_size;
    private String mem_manufacturer;
    private String mem_serialnumber ;
    private String mem_count        ;
}
