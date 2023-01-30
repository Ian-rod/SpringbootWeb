package com.example.WebTest;
import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
@Component
public class Template {
    static JdbcTemplate template;
   
    public static void registerUser(Data userData)
    {
        //query format=insert into login values(31,"clarence","12345","male",null);
        try {
            DriverManagerDataSource datasource=new DriverManagerDataSource();
            datasource.setDriverClassName("com.mysql.jdbc.Driver");
            datasource.setUrl("jdbc:mysql://localhost:3306/springboot?autoreconnect = true");
            datasource.setUsername("root");
            datasource.setPassword("");
            template=new JdbcTemplate(datasource);
            template.execute("insert into login values("+userData.ID+",'"+userData.name+"','"+userData.password+"','"+userData.gender+"',"+null+")");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static List<Map<String,Object>> readUserData()
    {
        //query format=select *from login
        List<Map<String,Object>> usersList=null;
        try {
            DriverManagerDataSource datasource=new DriverManagerDataSource();
            datasource.setDriverClassName("com.mysql.jdbc.Driver");
            datasource.setUrl("jdbc:mysql://localhost:3306/springboot?autoreconnect = true");
            datasource.setUsername("root");
            datasource.setPassword("");
            template=new JdbcTemplate(datasource);
            usersList=template.queryForList("select *from login");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return usersList;
    }
    public static void updateRecords(Updatable update)
    {
        //query format=update login set password=3456 where ID=31;
        try {
            DriverManagerDataSource datasource=new DriverManagerDataSource();
            datasource.setDriverClassName("com.mysql.jdbc.Driver");
            datasource.setUrl("jdbc:mysql://localhost:3306/springboot?autoreconnect = true");
            datasource.setUsername("root");
            datasource.setPassword("");
            template=new JdbcTemplate(datasource);
            template.update("update login set password='"+update.password+"',username='"+update.name+"' where ID="+update.ID);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void deleteRecords(int ID)
    {
        //query format=delete from login where ID=567;;
        try {
            DriverManagerDataSource datasource=new DriverManagerDataSource();
            datasource.setDriverClassName("com.mysql.jdbc.Driver");
            datasource.setUrl("jdbc:mysql://localhost:3306/springboot?autoreconnect = true");
            datasource.setUsername("root");
            datasource.setPassword("");
            template=new JdbcTemplate(datasource);
            template.execute("delete from login where ID="+ID);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
