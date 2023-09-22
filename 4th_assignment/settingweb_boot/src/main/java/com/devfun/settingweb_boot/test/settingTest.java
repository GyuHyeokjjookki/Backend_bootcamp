package com.devfun.settingweb_boot.test;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.service.StatisticService;
 
 
 
@Controller
public class settingTest {
    
 
    @Autowired
    private StatisticService service;
    
    @ResponseBody 
    @RequestMapping("/sqlyearStatistic")
    public Map<String, Object> sqltest(String year) throws Exception{ 
        
        return service.yearloginNum(year);
    }
    
    @ResponseBody
    @RequestMapping("/sqlmonthStatistic")
    public Map<String, Object> sqltest_mon(String month) throws Exception{
        return service.monthloginNum(month);
    }
    
    @ResponseBody
    @RequestMapping("/sqldayStatistic")
    public Map<String, Object> sqltest_day(String day) throws Exception{
        return service.dayloginNum(day);
    }
    
    @ResponseBody
    @RequestMapping("/sqlAlldayStatistic")
    public Map<String, Object> sqltest_Allday() throws Exception{
        return service.dayallloginNum();
    }
    
    @ResponseBody
    @RequestMapping("/sqlAveragedayStatistic")
    public Map<String, Object> sqltest_Averageday(String day) throws Exception{
        return service.dayaverageloginNum(day);
    }
    
    @ResponseBody
    @RequestMapping("/sqlExceptHolidayStatistic")
    public Map<String, Object> sqltest_Except(String year) throws Exception{
        return service.exceptholidayNum(year);
    }
    
    @ResponseBody
    @RequestMapping("/sqldeptLoginStatistic")
    public Map<String, Object> sqltest_dept(String month, String dept) throws Exception{
        return service.deptmonthloginNum(month,dept);
    }
    
    
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
 
}