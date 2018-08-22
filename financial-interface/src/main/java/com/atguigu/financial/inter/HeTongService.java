package com.atguigu.financial.inter;

import com.atguigu.financial.bean.NplmBorrowerInfoEntity;
import com.atguigu.financial.bean.NplmContractAttributeEntity;
import com.atguigu.financial.bean.NplmLoanContractEntity;

import java.util.List;

public interface HeTongService {
   List<NplmContractAttributeEntity> getNp();

    NplmLoanContractEntity getNplmLoanContractEntity(Integer loanContractId);

    NplmBorrowerInfoEntity getNplmBorrowerInfoEntity(Integer borrowerId);

   // List<NplmContractAttributeEntity> queryByParams( NplmContractAttributeEntity contract );

   List<NplmContractAttributeEntity> queryByParams( NplmContractAttributeEntity contract,Integer pageNum,Integer rows );

    int getCount(NplmContractAttributeEntity contract);

    NplmContractAttributeEntity getNpByloanContractNum(String id);
}
