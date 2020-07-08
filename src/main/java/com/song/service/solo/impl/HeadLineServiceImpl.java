package com.song.service.solo.impl;

import com.song.entity.bo.HeadLine;
import com.song.entity.dto.Result;
import com.song.service.solo.HeadLineService;

import java.util.List;

/**
 * @Author Song
 * @Date 2020/7/8 15:18
 * @Version 1.0
 * @Description
 */
public class HeadLineServiceImpl implements HeadLineService {
    @Override
    public Result<Boolean> addHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<Boolean> removeHeadLine(int headLineId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<HeadLine> queryHeadLineById(int headLineId) {
        return null;
    }

    @Override
    public Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, int pageIndex, int pageSize) {
        return null;
    }
}
