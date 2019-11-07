package com.xkit.pojo;


import java.util.Date;
import java.util.List;

public class Emp {

  private Integer id;
  private String username;
  private String pwd;
  private String name;
  private int gender;
  private String email;
  private String tele;
  private String address;
  private Date birthday;
  private Integer depId;


  public Emp(Integer id, String username, String pwd, String name, int gender, String email, String tele, String address, Date birthday, Integer depId) {
    this.id = id;
    this.username = username;
    this.pwd = pwd;
    this.name = name;
    this.gender = gender;
    this.email = email;
    this.tele = tele;
    this.address = address;
    this.birthday = birthday;
    this.depId = depId;
  }

  public Emp() {
  }

  @Override
  public String toString() {
    return "Emp{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", pwd='" + pwd + '\'' +
            ", name='" + name + '\'' +
            ", gender=" + gender +
            ", email='" + email + '\'' +
            ", tele='" + tele + '\'' +
            ", address='" + address + '\'' +
            ", birthday=" + birthday +
            ", depId=" + depId +
            '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGender() {
    return gender;
  }

  public void setGender(int gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTele() {
    return tele;
  }

  public void setTele(String tele) {
    this.tele = tele;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Integer getDepId() {
    return depId;
  }

  public void setDepId(Integer depId) {
    this.depId = depId;
  }
}
