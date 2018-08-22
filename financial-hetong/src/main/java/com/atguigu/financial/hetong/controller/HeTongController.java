package com.atguigu.financial.hetong.controller;


import com.atguigu.financial.bean.NplmBorrowerInfoEntity;
import com.atguigu.financial.bean.NplmContractAttributeEntity;
import com.atguigu.financial.bean.NplmLoanContractEntity;

import com.atguigu.financial.inter.HeTongService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HeTongController {

    @Autowired
    private HeTongService heTongService;

    @RequestMapping("smp")
    public String toSmp(){
        return "smp";
    }



  @RequestMapping("{pageName1}/{pageName2}.html")
    public String changePage(@PathVariable String pageName1,@PathVariable String pageName2,Model model){

        return pageName1+"/"+pageName2;
  }
    @RequestMapping("/query")
    @ResponseBody
    public Map<String,Object> query( @RequestParam("rows")Integer rows,@RequestParam("page")Integer page,NplmContractAttributeEntity contract, HttpServletRequest request){

        if( contract.getNbi()==null ) {
            contract = new NplmContractAttributeEntity();
            contract.setNbi(new NplmBorrowerInfoEntity());
            contract.setNlce(new NplmLoanContractEntity());
        }
        int total = heTongService.getCount(contract);
      //  System.out.println("total====="+total);
        List<NplmContractAttributeEntity> nps =  heTongService.queryByParams(contract,(page-1),rows);
        request.setAttribute("nps",nps);
       // System.out.println(nps.size());
        Map map = new HashMap<>();
        map.put("total",total);
        map.put("rows",nps);
        return map;
    }


    @RequestMapping("sendData")
    public String sendData(String id,HttpServletRequest request, Model model){

        NplmContractAttributeEntity np = heTongService.getNpByloanContractNum(id);
        model.addAttribute("np",np);
        HttpSession session = request.getSession();
        session.removeAttribute("hId");
        session.setAttribute("hId",id);
        String areaDetail = getAreaDetail(np);
        model.addAttribute("areaDetail",areaDetail);

        //逾期
       // NplmOverdueContract


        return "common/查看还款情况页面";
    }

    @RequestMapping("/update")
    public String update(String id,HttpServletRequest request, Model model){

        HttpSession session = request.getSession();
        session.removeAttribute("hId");
        session.setAttribute("hId",id);

        return "common/修改还款情况页面";
    }


    private String  getAreaDetail( NplmContractAttributeEntity np ){
        String areaDetail = "";
        areaDetail = np.getNbi().getfNation()+ np.getNbi().getfProvince()+ np.getNbi().getfCity()+ np.getNbi().getfStreet();
        return areaDetail;
    }
  /*  @RequestMapping("/getData")
    @ResponseBody
    public List<NplmContractAttributeEntity> getData(@RequestParam("rows")Integer rows,@RequestParam("page")Integer page){

        List<NplmContractAttributeEntity> nps = heTongService.getNp();
        for (NplmContractAttributeEntity np : nps) {
            NplmLoanContractEntity nlce = heTongService.getNplmLoanContractEntity(np.getLoanContractId());
            NplmBorrowerInfoEntity nbi = heTongService.getNplmBorrowerInfoEntity(nlce.getBorrowerId() );
            np.setNbi(nbi);
            np.setNlce(nlce);
        }
        return nps;

    }*/

  /*  @RequestMapping("/query")
    @ResponseBody
    public List<NplmContractAttributeEntity> query( NplmContractAttributeEntity contract, HttpServletRequest request){
       if( contract.getNbi()==null ) {
           contract = new NplmContractAttributeEntity();
           contract.setNbi(new NplmBorrowerInfoEntity());
           contract.setNlce(new NplmLoanContractEntity());

       }
        List<NplmContractAttributeEntity> nps =  heTongService.queryByParams(contract);
        request.setAttribute("nps",nps);
        System.out.println(nps.size());
        return nps;
    }*/
}
