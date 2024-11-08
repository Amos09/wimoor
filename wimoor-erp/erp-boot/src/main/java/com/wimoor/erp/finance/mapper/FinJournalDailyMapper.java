package com.wimoor.erp.finance.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.finance.pojo.entity.FinJournalDaily;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FinJournalDailyMapper extends BaseMapper<FinJournalDaily> {

    FinJournalDaily selectByday(@Param("day") String day, @Param("acct") String acct);

    List<FinJournalDaily> selectAfterByday(@Param("day") String day, @Param("acct") String acct);
}