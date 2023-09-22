package com.devfun.settingweb_boot.service;
 
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
 
@Service
public class StatisticServiceImpl implements StatisticService {
    
    
    @Autowired
    private StatisticMapper uMapper;
    
    @Override
    public HashMap<String, Object> yearloginNum (String year) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearLogin(year);
            retVal.put("year", year);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> monthloginNum(String month){
        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            retVal = uMapper.selectMonthLogin(month);
            retVal.put("month", month);
            retVal.put("is_success", true);

        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("month", month);
            retVal.put("is_success", false);
        }

        return retVal;
    }
    
    @Override
    public HashMap<String, Object> dayloginNum(String day){
        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            retVal = uMapper.selectDayLogin(day);
            retVal.put("day", day);
            retVal.put("is_success", true);

        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("day", day);
            retVal.put("is_success", false);
        }

        return retVal;
    }
 
    @Override
    public HashMap<String, Object> dayallloginNum(){
        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            retVal = uMapper.selectAllMonthLogin();
            retVal.put("is_success", true);

        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("is_success", false);
        }

        return retVal;
    }
    
    @Override
    public HashMap<String, Object> dayaverageloginNum(String day){
        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            retVal = uMapper.averageDayLogin(day);
            retVal.put("day", day);
            retVal.put("is_success", true);

        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("day", day);
            retVal.put("is_success", false);
        }

        return retVal;
    }
    
    @Override
    public HashMap<String, Object> exceptholidayNum(String year){
        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            retVal = uMapper.exceptHoliday(year);
            retVal.put("year", year);
            retVal.put("is_success", true);

        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
        }

        return retVal;
    }
}