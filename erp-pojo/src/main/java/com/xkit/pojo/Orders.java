package com.xkit.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class Orders {

  private Integer id;
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date createtime;
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date checktime;
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date starttime;
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date endtime;
  private String type;//1：采购 2：销售
  private long creater; //下单员
  private String createrName;
  private long checker;//审核员
  private String checkerName;
  private long starter;//采购员
  private String starterName;
  private long ender;//库管员
  private String enderName;
  private long supplierId;
  private double totalmoney;
  private String state;//订单状态 0：未审核 1:已审核 2：已确认 3：已入库
  private long waybillsn;

  public Orders(Integer id, Date createtime, Date checktime, Date starttime, Date endtime, String type, long creater, String createrName, long checker, String checkerName, long starter, String starterName, long ender, String enderName, long supplierId, double totalmoney, String state, long waybillsn) {
    this.id = id;
    this.createtime = createtime;
    this.checktime = checktime;
    this.starttime = starttime;
    this.endtime = endtime;
    this.type = type;
    this.creater = creater;
    this.createrName = createrName;
    this.checker = checker;
    this.checkerName = checkerName;
    this.starter = starter;
    this.starterName = starterName;
    this.ender = ender;
    this.enderName = enderName;
    this.supplierId = supplierId;
    this.totalmoney = totalmoney;
    this.state = state;
    this.waybillsn = waybillsn;
  }

  public Orders() {
  }

  public String getCreaterName() {
    return createrName;
  }

  public void setCreaterName(String createrName) {
    this.createrName = createrName;
  }

  public String getCheckerName() {
    return checkerName;
  }

  public void setCheckerName(String checkerName) {
    this.checkerName = checkerName;
  }

  public String getStarterName() {
    return starterName;
  }

  public void setStarterName(String starterName) {
    this.starterName = starterName;
  }

  public String getEnderName() {
    return enderName;
  }

  public void setEnderName(String enderName) {
    this.enderName = enderName;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

  public Date getChecktime() {
    return checktime;
  }

  public void setChecktime(Date checktime) {
    this.checktime = checktime;
  }

  public Date getStarttime() {
    return starttime;
  }

  public void setStarttime(Date starttime) {
    this.starttime = starttime;
  }

  public Date getEndtime() {
    return endtime;
  }

  public void setEndtime(Date endtime) {
    this.endtime = endtime;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getCreater() {
    return creater;
  }

  public void setCreater(long creater) {
    this.creater = creater;
  }

  public long getChecker() {
    return checker;
  }

  public void setChecker(long checker) {
    this.checker = checker;
  }

  public long getStarter() {
    return starter;
  }

  public void setStarter(long starter) {
    this.starter = starter;
  }

  public long getEnder() {
    return ender;
  }

  public void setEnder(long ender) {
    this.ender = ender;
  }

  public long getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(long supplierId) {
    this.supplierId = supplierId;
  }

  public double getTotalmoney() {
    return totalmoney;
  }

  public void setTotalmoney(double totalmoney) {
    this.totalmoney = totalmoney;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public long getWaybillsn() {
    return waybillsn;
  }

  public void setWaybillsn(long waybillsn) {
    this.waybillsn = waybillsn;
  }
}
