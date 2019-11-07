package com.xkit.pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@JsonIgnoreProperties(value = {"handler"})
public class Menu {

  private String menuid;//菜单ID
  private String menuname;//菜单名称
  private String icon;//图标
  private String url;//URL

  private List<Menu> menus;

  public Menu() {
  }

  @Override
  public String toString() {
    return "Menu{" +
            "menuid=" + menuid +
            ", menuname='" + menuname + '\'' +
            ", icon='" + icon + '\'' +
            ", url='" + url + '\'' +
            ", menus=" + menus +
            '}';
  }

  public String getMenuid() {
    return menuid;
  }

  public void setMenuid(String menuid) {
    this.menuid = menuid;
  }

  public String getMenuname() {
    return menuname;
  }

  public void setMenuname(String menuname) {
    this.menuname = menuname;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public List<Menu> getMenus() {
    return menus;
  }

  public void setMenus(List<Menu> menus) {
    this.menus = menus;
  }

  public Menu(String menuid, String menuname, String icon, String url, List<Menu> menus) {
    this.menuid = menuid;
    this.menuname = menuname;
    this.icon = icon;
    this.url = url;
    this.menus = menus;
  }
}
