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
public class Disk {
    /**
     * @fileSystem 文件系统/扇区
     * @diskSize   磁盘容量
     * @diskUsed   已用容量
     * @diskAvail  可用/剩余容量
     * @diskUsedPercent 已用容量百分比
     * @diskMounteOn  挂载点(该分区所挂载的地方)
       @device 服务器
     */
    private String disk_filesystem;
    private String disk_size;
    private String disk_used;
    private String disk_avail;
    private String disk_used_percent;
    private String disk_mounted_on;
    private String checktime;
    private String device;
    private String disk_count;


}
