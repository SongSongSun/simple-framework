package com.song.service.combine;


import com.song.entity.dto.MainPageInfoDTO;
import com.song.entity.dto.Result;

public interface HeadLineShopCategoryCombineService {
    Result<MainPageInfoDTO> getMainPageInfo();
}
