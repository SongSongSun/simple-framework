package com.song.controller.frontend;

import com.song.entity.dto.MainPageInfoDTO;
import com.song.entity.dto.Result;
import com.song.service.combine.HeadLineShopCategoryCombineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Song
 * @Date 2020/7/8 15:53
 * @Version 1.0
 * @Description
 */
public class MainPageController {
    private HeadLineShopCategoryCombineService headLineShopCategoryCombineService;

    public Result<MainPageInfoDTO> getMainPageInfo(HttpServletRequest req, HttpServletResponse res) {
        return headLineShopCategoryCombineService.getMainPageInfo();
    }
}
