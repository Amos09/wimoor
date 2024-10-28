package com.wimoor.amazon.base;

import java.util.List;
import org.apache.ibatis.annotations.InsertProvider;

@tk.mybatis.mapper.annotation.RegisterMapper
public interface InsertListWithKeyMapper<T> {

    @InsertProvider(type = MyProvider.class, method = "insertListWithKey")
    int insertListWithKey(List<T> recordList);

}