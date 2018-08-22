package com.atguigu.financial.hetong.service.impl;

import com.atguigu.financial.bean.NplmBorrowerInfoEntity;
import com.atguigu.financial.bean.NplmContractAttributeEntity;
import com.atguigu.financial.bean.NplmLoanContractEntity;
import com.atguigu.financial.hetong.mapper.NplmBorrowerInfoEntityMapper;
import com.atguigu.financial.hetong.mapper.NplmContractAttributeEntityMapper;
import com.atguigu.financial.hetong.mapper.NplmLoanContractEntityMapper;
import com.atguigu.financial.inter.HeTongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeTongServiceImpl implements HeTongService {

    @Autowired
    private NplmContractAttributeEntityMapper np;

    @Autowired
    private NplmBorrowerInfoEntityMapper nbim;

    @Autowired
    private NplmLoanContractEntityMapper nlcm;

    @Override
    public List<NplmContractAttributeEntity> getNp() {
        return np.selectAll();

    }

    @Override
    public NplmLoanContractEntity getNplmLoanContractEntity(Integer loanContractId) {
        NplmLoanContractEntity nlc = new NplmLoanContractEntity();
        nlc.setLoanContractNum(loanContractId.toString());
        return nlcm.selectOne(nlc);
    }

    @Override
    public NplmBorrowerInfoEntity getNplmBorrowerInfoEntity(Integer borrowerId) {
        NplmBorrowerInfoEntity nb = new NplmBorrowerInfoEntity();
        nb.setId(borrowerId.toString());
        return nbim.selectOne(nb);
    }

    @Override
    public List<NplmContractAttributeEntity> queryByParams(NplmContractAttributeEntity contract, Integer pageNum, Integer rows) {
        List<NplmContractAttributeEntity> nps = np.queryByParams(contract,pageNum,rows);
        return nps;
    }

    @Override
    public int getCount(NplmContractAttributeEntity contract) {
        return np.getCount(contract).size();
    }

    @Override
    public NplmContractAttributeEntity getNpByloanContractNum(String id) {
        NplmContractAttributeEntity ncae = new NplmContractAttributeEntity();
        ncae.setLoanContractId(Integer.parseInt(id));
        NplmContractAttributeEntity nc = np.select(ncae).get(0);
        NplmLoanContractEntity nplmLoanContractEntity = new NplmLoanContractEntity();
        nplmLoanContractEntity.setLoanContractNum(id);
        NplmLoanContractEntity nplmLoanContractEntity1 = nlcm.select(nplmLoanContractEntity).get(0);
        NplmBorrowerInfoEntity nplmBorrowerInfoEntity = new NplmBorrowerInfoEntity();
        nplmBorrowerInfoEntity.setId(nplmLoanContractEntity1.getBorrowerId().toString());
        NplmBorrowerInfoEntity nplmBorrowerInfoEntity1 = nbim.select(nplmBorrowerInfoEntity).get(0);
        nc.setNbi(nplmBorrowerInfoEntity1);
        nc.setNlce(nplmLoanContractEntity1);
        return nc;
    }

   /* @Override
    public List<NplmContractAttributeEntity> queryByParams(NplmContractAttributeEntity contract) {
        List<NplmContractAttributeEntity> nps = np.queryByParams(contract);
        return nps;
    }*/


}
