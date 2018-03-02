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
public class Io {
    /**
     * @diskDevice 磁盘设备
     * @tps 该设备每秒的传输次数
     * @readKBPersencond 每秒从设备读取的数据量
     * @wrtnKBPersencond 每秒向设备写入的数据量
     * @readKB 读取的总数据量
     * @wrtnKB 写入的总数量数据量
     @checkTime
     @device 服务器
     */
    private String bi;
    private String bo;
    private String checktime;
    private String device;
}
