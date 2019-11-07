package com.xkit.pojo;

import org.springframework.stereotype.Component;

@Component
public class Dep {

  private Integer id;
  private String name;
  private String tele;

  private int rows;//记录数
  private int page;//第几页

  public Dep() {
  }


  @Override
  public String toString() {
    return "Dep{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", tele='" + tele + '\'' +
            ", rows=" + rows +
            ", page=" + page +
            '}';
  }

  public Dep(Integer id, String name, String tele, int rows, int page) {
    this.id = id;
    this.name = name;
    this.tele = tele;
    this.rows = rows;
    this.page = page;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public int getRows() {
    return rows;
  }

  public void setRows(int rows) {
    this.rows = rows;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getTele() {
    return tele;
  }

  public void setTele(String tele) {
    this.tele = tele;
  }

}
