package com.atguigu.financial.hetong.controller;

import com.alibaba.fastjson.JSON;
import com.atguigu.financial.bean.NplmContractAttributeEntity;
import com.atguigu.financial.bean.NplmRepaymentDetail;
import com.atguigu.financial.bean.NplmRepaymentRecord;
import com.atguigu.financial.inter.RepaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class RepaymentController {
    @Autowired
    private  RepaymentService repaymentService;

    @RequestMapping("getRepaymentPlan")
    @ResponseBody
    public Map<String,Object> getRepaymentPlan(@RequestParam("rows")Integer rows, @RequestParam("page")Integer page
                                                    , HttpServletRequest request){
        HttpSession session = request.getSession();
        String hId = (String) session.getAttribute("hId");
        List<NplmRepaymentDetail> nrds = repaymentService.getAll(hId,(page-1),rows);

        Map<String,Object> map = new HashMap<>();
        map.put("total",nrds.size());
        map.put("rows",nrds);
        return map;
    }

    @RequestMapping("queryRepaymentDetail")
    @ResponseBody
    public Map<String,Object> queryRepaymentDetail(@RequestParam("rows")Integer rows, @RequestParam("page")Integer page
            , HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        String hId = (String) session.getAttribute("hId");
        List<NplmRepaymentRecord> nrrs = repaymentService.getRepaymentDetail(hId,(page-1),rows);
        Map<String,Object> map = new HashMap<>();
        map.put("total",nrrs.size());
        map.put("rows",nrrs);
        return map;
    }



}
