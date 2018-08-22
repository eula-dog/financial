package com.atguigu.financial.hetong.mapper;

import com.atguigu.financial.bean.NplmContractAttributeEntity;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface NplmContractAttributeEntityMapper extends Mapper<NplmContractAttributeEntity> {
    List<NplmContractAttributeEntity> queryByParams(@Param("contract") NplmContractAttributeEntity contract,@Param("pageNum")Integer pageNum,@Param("rows")Integer rows);

    List<NplmContractAttributeEntity> getCount(@Param("contract")NplmContractAttributeEntity contract);

}
