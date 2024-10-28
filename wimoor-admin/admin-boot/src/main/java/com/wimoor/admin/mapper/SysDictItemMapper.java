package com.wimoor.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wimoor.admin.pojo.entity.SysDictItem;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysDictItemMapper extends BaseMapper<SysDictItem> {

    List<SysDictItem> list(Page<SysDictItem> page, SysDictItem dictItem);
}
