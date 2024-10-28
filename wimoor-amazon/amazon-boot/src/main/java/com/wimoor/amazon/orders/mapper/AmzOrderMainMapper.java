package com.wimoor.amazon.orders.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.orders.pojo.entity.AmzOrderMain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 订单备注 Mapper 接口
 * </p>
 *
 * @author wimoor team
 * @since 2022-05-14
 */
@Mapper
public interface AmzOrderMainMapper extends BaseMapper<AmzOrderMain> {

    void removeDataArchive(@Param("amazonAuthId") String amazonAuthId);
}
