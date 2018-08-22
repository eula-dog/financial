package com.atguigu.financial.hetong.service.impl;

import com.atguigu.financial.bean.NplmRepaymentDetail;
import com.atguigu.financial.bean.NplmRepaymentRecord;
import com.atguigu.financial.hetong.mapper.NplmRepaymentDetailMapper;
import com.atguigu.financial.hetong.mapper.NplmRepaymentRecordMapper;
import com.atguigu.financial.inter.RepaymentService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepaymentServiceImpl implements RepaymentService {

    @Autowired
    private NplmRepaymentDetailMapper nplmRepaymentDetailMapper;

    @Autowired
    private NplmRepaymentRecordMapper nplmRepaymentRecordMapper;

    @Override
    public List<NplmRepaymentDetail> getAll(String hId,Integer page,Integer rows) {
        RowBounds rb = new RowBounds(page,rows);
        NplmRepaymentDetail nplmRepaymentDetail = new NplmRepaymentDetail();
        nplmRepaymentDetail.setLoanContractNum(Integer.parseInt(hId));
        return nplmRepaymentDetailMapper.selectByRowBounds(nplmRepaymentDetail,rb);
    }

    @Override
    public List<NplmRepaymentRecord> getRepaymentDetail(String hId, int page, Integer rows) {
        RowBounds rb = new RowBounds(page,rows);
        NplmRepaymentRecord nplmRepaymentRecord = new NplmRepaymentRecord();
        nplmRepaymentRecord.setLoanContractNum(Integer.parseInt(hId));
        return nplmRepaymentRecordMapper.selectByRowBounds(nplmRepaymentRecord,rb);
    }
}
