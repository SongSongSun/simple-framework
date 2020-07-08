package com.song.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * @Author Song
 * @Date 2020/7/8 13:58
 * @Version 1.0
 * @Description
 */
@Data
public class HeadLine {
    private Long lineId;
    private String lineName;
    private  String lineLink;
    private String lineImg;
    private Integer priority;
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;
}
