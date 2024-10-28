package com.wimoor.amazon.adv.report.dao;

import com.wimoor.amazon.adv.report.pojo.AmzAdvRequest;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AmzAdvRequestMapper extends BaseMapper<AmzAdvRequest> {

    List<AmzAdvRequest> getNeedTreatReport(@Param("profileid") String profileid);

    void deleteByProfileAndType(@Param("profileid") String profileid, @Param("recordtype") String recordtype,
            @Param("campaigntype") String campaignType, @Param("segment") String segment);

    Map<String, Object> getNeedRequestReport(@Param("profileid") String profileid,
            @Param("non_segment") String non_segment, @Param("refreshnow") String refreshnow);

    List<AmzAdvRequest> getAllNeedTreatReport();

}