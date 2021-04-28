/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web1.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import web1.dao.attendanceinputdao;
import web1.dao.welcomedao;

/**
 *
 * @author Windows
 */
public class attendanceinputsql {
   int i;
    public int attendanceinput(attendanceinputdao dao){
        try{
    Connection con=Mysql.MySqlConnection.getconnection();
        PreparedStatement ps=con.prepareStatement("insert into attendanceinput values(?,?,?,?,?,?)");
        ps.setString(1,dao.getSubjectid());
        ps.setString(2,dao.getSubjectname());
        ps.setInt(3,dao.getAttendance());
        ps.setInt(4,dao.getTotal());
        ps.setDouble(5,dao.getPercent());
        ps.setString(6,dao.getUserid());
         ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return i;
    }
    }
