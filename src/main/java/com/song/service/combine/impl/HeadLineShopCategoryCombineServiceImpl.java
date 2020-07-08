package com.song.service.combine.impl;

import com.song.entity.bo.HeadLine;
import com.song.entity.bo.ShopCategory;
import com.song.entity.dto.MainPageInfoDTO;
import com.song.entity.dto.Result;
import com.song.service.combine.HeadLineShopCategoryCombineService;
import com.song.service.solo.HeadLineService;
import com.song.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @Author Song
 * @Date 2020/7/8 15:21
 * @Version 1.0
 * @Description
 */
public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {
    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;
    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {
        //1.获取头条列表
        HeadLine headLineCondition = new HeadLine();
        headLineCondition.setEnableStatus(1);
        Result<List<HeadLine>> HeadLineResult = headLineService.queryHeadLine(headLineCondition, 1, 4);
        //2.获取店铺类别列表
        ShopCategory shopCategoryCondition = new ShopCategory();
        Result<List<ShopCategory>> shopCategoryResult =shopCategoryService.queryShopCategory(shopCategoryCondition, 1, 100);
        //3.合并两者并返回
        Result<MainPageInfoDTO> result = mergeMainPageInfoResult(HeadLineResult, shopCategoryResult);
        return result;
    }

    private Result<MainPageInfoDTO> mergeMainPageInfoResult(Result<List<HeadLine>> headLineResult, Result<List<ShopCategory>> shopCategoryResult) {
        return  null;
    }
}
