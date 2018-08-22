package com.atguigu.financial.inter;

import com.atguigu.financial.bean.NplmRepaymentDetail;
import com.atguigu.financial.bean.NplmRepaymentRecord;

import java.util.List;

public interface RepaymentService {
    List<NplmRepaymentDetail> getAll(String hId,Integer page,Integer rows);

    List<NplmRepaymentRecord> getRepaymentDetail(String hId, int i, Integer rows);
}
