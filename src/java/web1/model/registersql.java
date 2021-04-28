/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web1.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import web1.dao.registerdao;

/**
 *
 * @author Windows
 */
public class registersql {
    int i;
     public int register(registerdao dao)
    {
    try{
        Connection con=Mysql.MySqlConnection.getconnection();
        PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?)");
        ps.setString(1,dao.getName());
        ps.setString(2,dao.getEmail());
        ps.setString(3,dao.getPhno());
        ps.setString(4,dao.getPassword());
        ps.setString(5,dao.getUserid());
        ps.setString(6,dao.getBranch());
        ps.setString(7,dao.getClas());
        ps.executeUpdate();
    }catch(Exception e){
        e.printStackTrace();
    }
    return i;
    }
}
