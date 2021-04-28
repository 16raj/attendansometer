/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web1.dao;

/**
 *
 * @author Windows
 */
public class registerteacherdao {
  private String name;
   private String email;
   private String phno;
   private String password;
   private String userid;
   private String branch;

    public registerteacherdao() {
    }

    public registerteacherdao(String name, String email, String phno, String password, String userid, String branch) {
        this.name = name;
        this.email = email;
        this.phno = phno;
        this.password = password;
        this.userid = userid;
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhno() {
        return phno;
    }

    public String getUserid() {
        return userid;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
   
}
