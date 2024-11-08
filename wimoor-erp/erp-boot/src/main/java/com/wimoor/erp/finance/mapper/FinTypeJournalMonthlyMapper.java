package com.wimoor.erp.finance.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.finance.pojo.entity.FinTypeJournalMonthly;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FinTypeJournalMonthlyMapper extends BaseMapper<FinTypeJournalMonthly> {

    FinTypeJournalMonthly selectByYearMonth(@Param("year") String year, @Param("month") String month,
            @Param("projectid") String projectid, @Param("acct") String acct);

}