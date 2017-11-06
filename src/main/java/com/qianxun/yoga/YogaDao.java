package com.qianxun.yoga;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

public class YogaDao {
	static String sql = null;  
    static DbHelper dbHelper = null;  
    static ResultSet ret = null;  
  
    public static void applyOff(String name, String wechatName, List<String> offDateList) {
        dbHelper = new DbHelper();
  
        try {  
            Connection con = DbHelper.getConnection();
            PreparedStatement
            st = con.prepareStatement("INSERT INTO off (studentId, normal, offDate, name, wechatName) VALUES (?,?,?,?,?,?)");
            for( String offDate :offDateList){
            	st.setString(1, studentId);
            	st.setBoolean(2, isNormal);
            	st.setDate(3, offDate);
            	st.setString(4, name);
            	st.setString(5, wechatName);
            	st.set
            }
            st.execute(sql);
            con.close();
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  
}
