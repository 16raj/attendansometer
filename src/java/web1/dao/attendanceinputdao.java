package web1.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
public class attendanceinputdao {
  public String subjectid;
   private String subjectname;
   private int attendance;
   private int total;
   private double percent;
   private String userid;

    public attendanceinputdao() {
    }

    public attendanceinputdao(String subjectid, String subjectname, int attendance, int total, double percent, String userid) {
        this.subjectid = subjectid;
        this.subjectname = subjectname;
        this.attendance = attendance;
        this.total = total;
        this.percent = percent;
        this.userid = userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

   
    public void setPercent(double percent) {
        this.percent = percent;
    }

    
    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setTotal(int total) {
        this.total = total;
    } 

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getUserid() {
        return userid;
    }
    
    public int getAttendance() {
        return attendance;
    }

    public int getTotal() {
        return total;
    }

    public double getPercent() {
        return percent;
    }
    
    public String getSubjectid() {
        return subjectid;
    }

    public String getSubjectname() {
        return subjectname;
    }
   
}
