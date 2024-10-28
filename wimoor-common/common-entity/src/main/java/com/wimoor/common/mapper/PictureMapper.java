package com.wimoor.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.common.pojo.entity.Picture;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PictureMapper extends BaseMapper<Picture> {

    List<Picture> selectByImageName(String location);
}