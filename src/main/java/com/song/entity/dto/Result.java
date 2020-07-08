package com.song.entity.dto;

import lombok.Data;

/**
 * @Author Song
 * @Date 2020/7/8 15:08
 * @Version 1.0
 * @Description
 */
@Data
public class Result<T> {
    /**
     * 本次请求的状态码
     */
    private int code;

    /**
     * 本次请求结果的详情
     */
    private String msg;

    /**
     * 本次请求返回的结果集
     */
    private T data;
}
