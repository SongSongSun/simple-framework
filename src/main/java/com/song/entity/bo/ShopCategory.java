package com.song.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * @Author Song
 * @Date 2020/7/8 13:59
 * @Version 1.0
 * @Description
 */
@Data
public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
