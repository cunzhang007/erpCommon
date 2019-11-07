/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50560
Source Host           : localhost:3306
Source Database       : erp

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2019-11-08 00:31:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dep
-- ----------------------------
DROP TABLE IF EXISTS `dep`;
CREATE TABLE `dep` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `NAME` varchar(30) DEFAULT NULL COMMENT '部门名称',
  `TELE` varchar(30) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='部门';

-- ----------------------------
-- Records of dep
-- ----------------------------
INSERT INTO `dep` VALUES ('1', '教学部', '0731-28880000');
INSERT INTO `dep` VALUES ('2', '财务部', '0731-28880000');
INSERT INTO `dep` VALUES ('3', '人事部', '0731-28880000');
INSERT INTO `dep` VALUES ('4', '总经办4', '0731-28880000');
INSERT INTO `dep` VALUES ('5', '总经办', '0731-28880000');
INSERT INTO `dep` VALUES ('6', '总经办', '0731-28880000');
INSERT INTO `dep` VALUES ('7', '总经办', '0731-28880000');
INSERT INTO `dep` VALUES ('8', '总经办', '0731-28880000');
INSERT INTO `dep` VALUES ('9', '总经办', '0731-28880000');
INSERT INTO `dep` VALUES ('15', '总经办2', '0731-28880000');
INSERT INTO `dep` VALUES ('16', '总经办3', '0731-28880000');
INSERT INTO `dep` VALUES ('17', '村长', '18900003333');
INSERT INTO `dep` VALUES ('18', '总经办3', '0731-28880000');
INSERT INTO `dep` VALUES ('19', '总经办4', '0731-28880000');

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `USERNAME` varchar(15) DEFAULT NULL COMMENT '登陆名',
  `PWD` varchar(32) DEFAULT NULL COMMENT '登陆密码',
  `NAME` varchar(28) DEFAULT NULL COMMENT '真实姓名',
  `GENDER` int(11) DEFAULT NULL COMMENT '性别',
  `EMAIL` varchar(255) DEFAULT NULL COMMENT '邮件地址',
  `TELE` varchar(30) DEFAULT NULL COMMENT '联系电话',
  `ADDRESS` varchar(255) DEFAULT NULL COMMENT '联系地址',
  `BIRTHDAY` datetime DEFAULT NULL COMMENT '出生年月日',
  `DEPId` int(11) DEFAULT NULL COMMENT '部门编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='员工';

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('1', 'admin', '222', '张三', '1', '1@qq.com', '18000009999', '湖南长沙岳麓区', '2019-10-29 17:13:04', '1');
INSERT INTO `emp` VALUES ('2', 'admin888', 'admin', '李四', '1', '1@qq.com', '18000009999', '湖南长沙岳麓区', '2019-10-31 09:14:27', '2');

-- ----------------------------
-- Table structure for emp_role
-- ----------------------------
DROP TABLE IF EXISTS `emp_role`;
CREATE TABLE `emp_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `EMPId` int(11) DEFAULT NULL COMMENT '员工编号',
  `ROLEId` int(11) DEFAULT NULL COMMENT '角色编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='员工角色';

-- ----------------------------
-- Records of emp_role
-- ----------------------------
INSERT INTO `emp_role` VALUES ('1', '1', '1');
INSERT INTO `emp_role` VALUES ('2', '2', '2');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) NOT NULL COMMENT '编号',
  `NAME` varchar(30) DEFAULT NULL COMMENT '名称',
  `ORIGIN` varchar(30) DEFAULT NULL COMMENT '产地',
  `PRODUCER` varchar(30) DEFAULT NULL COMMENT '厂家',
  `UNIT` varchar(30) DEFAULT NULL COMMENT '计量单位',
  `INPRICE` decimal(8,2) DEFAULT NULL COMMENT '进货价格',
  `OUTPRICE` decimal(8,2) DEFAULT NULL COMMENT '销售价格',
  `GOODSTYPEId` int(11) DEFAULT NULL COMMENT '商品类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品';

-- ----------------------------
-- Records of goods
-- ----------------------------

-- ----------------------------
-- Table structure for goodstype
-- ----------------------------
DROP TABLE IF EXISTS `goodstype`;
CREATE TABLE `goodstype` (
  `id` int(11) NOT NULL COMMENT '商品类型编号',
  `NAME` varchar(30) DEFAULT NULL COMMENT '商品类型名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品分类';

-- ----------------------------
-- Records of goodstype
-- ----------------------------

-- ----------------------------
-- Table structure for inventory
-- ----------------------------
DROP TABLE IF EXISTS `inventory`;
CREATE TABLE `inventory` (
  `id` int(11) NOT NULL COMMENT '编号',
  `GOODSId` int(11) DEFAULT NULL COMMENT '商品',
  `STOREId` int(11) DEFAULT NULL COMMENT '仓库',
  `NUM` int(11) DEFAULT NULL COMMENT '数量',
  `TYPE` char(1) DEFAULT NULL COMMENT '类型',
  `CREATETIME` datetime DEFAULT NULL COMMENT '登记日期',
  `CHECKTIME` datetime DEFAULT NULL COMMENT '审核日期',
  `CREATER` int(11) DEFAULT NULL COMMENT '登记人',
  `CHECKER` int(11) DEFAULT NULL COMMENT '审核人',
  `STATE` char(1) DEFAULT NULL COMMENT '状态',
  `REMARK` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='盘盈盘亏';

-- ----------------------------
-- Records of inventory
-- ----------------------------

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `MENUNAME` varchar(30) DEFAULT NULL COMMENT '菜单名称',
  `ICON` varchar(20) DEFAULT NULL COMMENT '图标',
  `URL` varchar(255) DEFAULT NULL COMMENT 'URL',
  `PID` varchar(20) DEFAULT NULL COMMENT '上级菜单ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=310 DEFAULT CHARSET=utf8 COMMENT='菜单';

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '系统菜单', 'icon-sys', '', '-1');
INSERT INTO `menu` VALUES ('100', '基础数据', 'icon-sys', '', '0');
INSERT INTO `menu` VALUES ('101', '商品类型', 'icon-sys', 'goodstype.html', '100');
INSERT INTO `menu` VALUES ('102', '商品', 'icon-sys', 'goods.html', '100');
INSERT INTO `menu` VALUES ('103', '仓库', 'icon-sys', 'store.html', '100');
INSERT INTO `menu` VALUES ('200', '人事管理', 'icon-sys', '', '0');
INSERT INTO `menu` VALUES ('201', '部门', 'icon-sys', 'toDepPage', '200');
INSERT INTO `menu` VALUES ('202', '员工', 'icon-sys', 'toEmpPage', '200');
INSERT INTO `menu` VALUES ('300', '采购管理', 'icon-sys', null, '0');
INSERT INTO `menu` VALUES ('301', '采购订单查询', 'icon-sys', 'toOrdersPage', '300');
INSERT INTO `menu` VALUES ('302', '采购申请', 'icon-sys', 'toAddOrderPage', '300');
INSERT INTO `menu` VALUES ('303', '采购审核', 'icon-sys', null, '300');
INSERT INTO `menu` VALUES ('304', '采购确认', 'icon-sys', null, '300');
INSERT INTO `menu` VALUES ('305', '采购入库', 'icon-sys', null, '300');
INSERT INTO `menu` VALUES ('306', '采购入库查询', 'icon-sys', null, '300');
INSERT INTO `menu` VALUES ('307', '采购退货登记', 'icon-sys', null, '300');
INSERT INTO `menu` VALUES ('308', '采购退货审核', 'icon-sys', null, '300');
INSERT INTO `menu` VALUES ('309', '采购退货出库', 'icon-sys', null, '300');

-- ----------------------------
-- Table structure for orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `orderdetail`;
CREATE TABLE `orderdetail` (
  `id` int(11) NOT NULL COMMENT '编号',
  `GOODSId` int(11) DEFAULT NULL COMMENT '商品编号',
  `GOODSNAME` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `PRICE` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `NUM` int(11) DEFAULT NULL COMMENT '数量',
  `MONEY` decimal(10,2) DEFAULT NULL COMMENT '金额',
  `ENDTIME` datetime DEFAULT NULL COMMENT '结束日期',
  `ENDER` int(11) DEFAULT NULL COMMENT '库管员',
  `STOREId` int(11) DEFAULT NULL COMMENT '仓库编号',
  `STATE` char(1) DEFAULT NULL COMMENT '采购：0=未入库，1=已入库  销售：0=未出库，1=已出库',
  `ORDERSId` int(11) DEFAULT NULL COMMENT '订单编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单明细';

-- ----------------------------
-- Records of orderdetail
-- ----------------------------

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `CREATETIME` datetime DEFAULT NULL COMMENT '生成日期',
  `CHECKTIME` datetime DEFAULT NULL COMMENT '审核日期',
  `STARTTIME` datetime DEFAULT NULL COMMENT '确认日期',
  `ENDTIME` datetime DEFAULT NULL COMMENT '入库或出库日期',
  `TYPE` char(1) DEFAULT NULL COMMENT '1:采购 2:销售',
  `CREATER` int(11) DEFAULT NULL COMMENT '下单员',
  `CHECKER` int(11) DEFAULT NULL COMMENT '审核员',
  `STARTER` int(11) DEFAULT NULL COMMENT '采购员',
  `ENDER` int(11) DEFAULT NULL COMMENT '库管员',
  `SUPPLIERId` int(11) DEFAULT NULL COMMENT '供应商或客户',
  `TOTALMONEY` decimal(10,2) DEFAULT NULL COMMENT '合计金额',
  `STATE` char(1) DEFAULT NULL COMMENT '采购: 0:未审核 1:已审核, 2:已确认, 3:已入库；销售：0:未出库 1:已出库',
  `WAYBILLSN` int(11) DEFAULT NULL COMMENT '运单号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='订单';

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', '2019-11-01 00:02:29', '2019-11-01 00:02:32', '2019-11-01 00:02:35', '2019-11-01 00:02:40', '1', '1', '1', '1', '1', '1', '300.00', '0', null);

-- ----------------------------
-- Table structure for returnorderdetail
-- ----------------------------
DROP TABLE IF EXISTS `returnorderdetail`;
CREATE TABLE `returnorderdetail` (
  `id` int(11) NOT NULL COMMENT '编号',
  `GOODSId` int(11) DEFAULT NULL COMMENT '商品编号',
  `GOODSNAME` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `PRICE` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `NUM` int(11) DEFAULT NULL COMMENT '数量',
  `MONEY` decimal(10,2) DEFAULT NULL COMMENT '金额',
  `ENDTIME` datetime DEFAULT NULL COMMENT '结束日期',
  `ENDER` int(11) DEFAULT NULL COMMENT '库管员',
  `STOREId` int(11) DEFAULT NULL COMMENT '仓库编号',
  `STATE` char(1) DEFAULT NULL COMMENT '状态',
  `ORDERSId` int(11) DEFAULT NULL COMMENT '退货订单编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='退货订单明细';

-- ----------------------------
-- Records of returnorderdetail
-- ----------------------------

-- ----------------------------
-- Table structure for returnorders
-- ----------------------------
DROP TABLE IF EXISTS `returnorders`;
CREATE TABLE `returnorders` (
  `id` int(11) NOT NULL COMMENT '编号',
  `CREATETIME` datetime DEFAULT NULL COMMENT '生成日期',
  `CHECKTIME` datetime DEFAULT NULL COMMENT '检查日期',
  `ENDTIME` datetime DEFAULT NULL COMMENT '结束日期',
  `TYPE` char(1) DEFAULT NULL COMMENT '订单类型',
  `CREATER` int(11) DEFAULT NULL COMMENT '下单员',
  `CHECKER` int(11) DEFAULT NULL COMMENT '审核员工编号',
  `ENDER` int(11) DEFAULT NULL COMMENT '库管员',
  `SUPPLIERId` int(11) DEFAULT NULL COMMENT '供应商及客户编号',
  `TOTALMONEY` decimal(10,2) DEFAULT NULL COMMENT '合计金额',
  `STATE` char(1) DEFAULT NULL COMMENT '订单状态',
  `WAYBILLSN` int(11) DEFAULT NULL COMMENT '运单号',
  `ORDERSId` int(11) DEFAULT NULL COMMENT '原订单编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='退货订单';

-- ----------------------------
-- Records of returnorders
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `NAME` varchar(30) DEFAULT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员');
INSERT INTO `role` VALUES ('2', '人事处');

-- ----------------------------
-- Table structure for role_menu
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ROLEId` int(11) DEFAULT NULL,
  `MENUId` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COMMENT='角色菜单';

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES ('1', '1', '100');
INSERT INTO `role_menu` VALUES ('2', '1', '101');
INSERT INTO `role_menu` VALUES ('3', '1', '102');
INSERT INTO `role_menu` VALUES ('4', '1', '103');
INSERT INTO `role_menu` VALUES ('5', '1', '200');
INSERT INTO `role_menu` VALUES ('6', '1', '201');
INSERT INTO `role_menu` VALUES ('7', '1', '202');
INSERT INTO `role_menu` VALUES ('8', '2', '100');
INSERT INTO `role_menu` VALUES ('9', '2', '101');
INSERT INTO `role_menu` VALUES ('10', '2', '102');
INSERT INTO `role_menu` VALUES ('11', '2', '103');
INSERT INTO `role_menu` VALUES ('12', '1', '300');
INSERT INTO `role_menu` VALUES ('13', '1', '301');
INSERT INTO `role_menu` VALUES ('14', '1', '302');
INSERT INTO `role_menu` VALUES ('15', '1', '303');
INSERT INTO `role_menu` VALUES ('16', '1', '304');
INSERT INTO `role_menu` VALUES ('17', '1', '305');
INSERT INTO `role_menu` VALUES ('18', '1', '306');
INSERT INTO `role_menu` VALUES ('19', '1', '307');
INSERT INTO `role_menu` VALUES ('20', '1', '308');
INSERT INTO `role_menu` VALUES ('21', '1', '309');

-- ----------------------------
-- Table structure for store
-- ----------------------------
DROP TABLE IF EXISTS `store`;
CREATE TABLE `store` (
  `id` int(11) NOT NULL COMMENT '编号',
  `NAME` varchar(30) DEFAULT NULL COMMENT '名称',
  `EMPId` int(11) DEFAULT NULL COMMENT '员工编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='仓库';

-- ----------------------------
-- Records of store
-- ----------------------------

-- ----------------------------
-- Table structure for storedetail
-- ----------------------------
DROP TABLE IF EXISTS `storedetail`;
CREATE TABLE `storedetail` (
  `id` int(11) NOT NULL COMMENT '编号',
  `STOREId` int(11) DEFAULT NULL COMMENT '仓库编号',
  `GOODSId` int(11) DEFAULT NULL COMMENT '商品编号',
  `NUM` int(11) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='仓库库存';

-- ----------------------------
-- Records of storedetail
-- ----------------------------

-- ----------------------------
-- Table structure for storeoper
-- ----------------------------
DROP TABLE IF EXISTS `storeoper`;
CREATE TABLE `storeoper` (
  `id` int(11) NOT NULL COMMENT '编号',
  `EMPId` int(11) DEFAULT NULL COMMENT '操作员工编号',
  `OPERTIME` datetime DEFAULT NULL COMMENT '操作日期',
  `STOREId` int(11) DEFAULT NULL COMMENT '仓库编号',
  `GOODSId` int(11) DEFAULT NULL COMMENT '商品编号',
  `NUM` int(11) DEFAULT NULL COMMENT '数量',
  `TYPE` char(1) DEFAULT NULL COMMENT '1：入库 2：出库',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='仓库操作记录';

-- ----------------------------
-- Records of storeoper
-- ----------------------------

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `id` int(11) NOT NULL COMMENT '编号',
  `NAME` varchar(30) DEFAULT NULL COMMENT '名称',
  `ADDRESS` varchar(100) DEFAULT NULL COMMENT '联系地址',
  `CONTACT` varchar(30) DEFAULT NULL COMMENT '联系人',
  `TELE` varchar(30) DEFAULT NULL COMMENT '联系电话',
  `EMAIL` varchar(100) DEFAULT NULL COMMENT '邮件地址',
  `TYPE` char(1) DEFAULT NULL COMMENT '1：供应商 2：客户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplier
-- ----------------------------
