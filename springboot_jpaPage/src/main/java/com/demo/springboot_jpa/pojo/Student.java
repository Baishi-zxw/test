package com.demo.springboot_jpa.pojo;

import javax.persistence.Table;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 *实体类
 */
@Entity
@Table(name = "s_student")
public class Student {
  @Id //主键
  @GeneratedValue //自增长
  private long studentNo;
  private String loginPwd;
  private String studentName;
  private String sex;
  private long gradeId;
  private String phone;
  private String address;
  private java.sql.Timestamp bornDate;
  private String email;
  private String identityCard;

  public Student(String loginPwd, String studentName, String sex, long gradeId, String phone, String address, Timestamp bornDate, String email, String identityCard) {
    this.loginPwd = loginPwd;
    this.studentName = studentName;
    this.sex = sex;
    this.gradeId = gradeId;
    this.phone = phone;
    this.address = address;
    this.bornDate = bornDate;
    this.email = email;
    this.identityCard = identityCard;
  }

  public Student() {
  }

  public long getStudentNo() {
    return studentNo;
  }

  public void setStudentNo(long studentNo) {
    this.studentNo = studentNo;
  }


  public String getLoginPwd() {
    return loginPwd;
  }

  public void setLoginPwd(String loginPwd) {
    this.loginPwd = loginPwd;
  }


  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public long getGradeId() {
    return gradeId;
  }

  public void setGradeId(long gradeId) {
    this.gradeId = gradeId;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public java.sql.Timestamp getBornDate() {
    return bornDate;
  }

  public void setBornDate(java.sql.Timestamp bornDate) {
    this.bornDate = bornDate;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getIdentityCard() {
    return identityCard;
  }

  public void setIdentityCard(String identityCard) {
    this.identityCard = identityCard;
  }

}
