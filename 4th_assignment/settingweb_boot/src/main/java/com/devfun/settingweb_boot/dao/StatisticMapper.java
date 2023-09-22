package com.devfun.settingweb_boot.dao;
import java.util.HashMap;
 
//import com.devfun.settingweb_boot.dto.StatisticDto;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
    public HashMap<String, Object> selectMonthLogin(String month);
    public HashMap<String, Object> selectDayLogin(String day);
    public HashMap<String, Object> selectAllMonthLogin();
    public HashMap<String, Object> averageDayLogin(String day);
    public HashMap<String, Object> exceptHoliday(String year);
    public HashMap<String, Object> deptMonthLogin(String month, String dept);
}