/*
Navicat MySQL Data Transfer

Source Server         : localhostTest
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : j2ee

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-07-12 10:57:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dept`
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(20) DEFAULT NULL,
  `dremark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '技术部', '技术相关工作');
INSERT INTO `dept` VALUES ('2', '财务部', '费用收支，预算');
INSERT INTO `dept` VALUES ('3', '人力资源部', '公司人事，培训，考勤，劳资，保险，职称');
INSERT INTO `dept` VALUES ('4', '总经理办公室', '负责全公司协调');
INSERT INTO `dept` VALUES ('5', '安全监察部', '安全生产管理监督');

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_id` int(11) DEFAULT NULL,
  `job_id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `party` enum('党员','共青团员','群众') DEFAULT '群众',
  `sex` enum('女','男') DEFAULT '男',
  `card_id` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `post_code` varchar(10) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `qq_num` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `race` varchar(10) DEFAULT NULL,
  `education` varchar(5) DEFAULT NULL,
  `speciality` varchar(15) DEFAULT NULL,
  `hobby` varchar(30) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`,`job_id`),
  KEY `fk_emp_dept` (`dept_id`),
  KEY `fk_emp_job` (`job_id`),
  CONSTRAINT `fk_emp_dept` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`did`),
  CONSTRAINT `fk_emp_job` FOREIGN KEY (`job_id`) REFERENCES `job` (`job`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '2', '2', '小李', '群众', '男', '10001', '广东广州', '510000', '5321351', '1323457855', '123456/78', '123456/78@qq.com', '2000-02-06 12:33:26', '汉族', '本科', '画画', '爬山', '闷骚', '2020-07-06 12:34:14');
INSERT INTO `employee` VALUES ('2', '2', '2', '啊啊啊啊', '群众', '男', '10002', '广东江门', '529000', '5123522', '13345675652', '123545678', '123545678@qq.com', '1999-05-01 03:22:54', '汉族', '本科', '学习很厉害', '跑步', '一个学生', '2020-07-06 03:23:40');
INSERT INTO `employee` VALUES ('3', '3', '3', '王小姐', '群众', '女', '10003', '广东珠海', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `employee` VALUES ('8', '2', '3', '小张', '共青团员', '男', '10004', '广东中山', null, null, null, null, null, '1999-02-10 00:00:00', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `job`
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
  `job` int(11) NOT NULL AUTO_INCREMENT,
  `jname` varchar(20) DEFAULT NULL,
  `jremark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`job`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of job
-- ----------------------------
INSERT INTO `job` VALUES ('2', 'PHP开发啊工程师', 'PHL是世界上最好的语言');
INSERT INTO `job` VALUES ('3', '前端开发工程师', '我完全不敢出声');
INSERT INTO `job` VALUES ('4', '项目经理', '今天有个需求要改一改');

-- ----------------------------
-- Table structure for `notice`
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `title` varchar(250) NOT NULL,
  `content` longtext NOT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `rid` int(11) NOT NULL,
  `rname` varchar(20) DEFAULT NULL,
  `rremark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员', '感觉还可以');
INSERT INTO `role` VALUES ('2', '普通用户', '普通感觉');
INSERT INTO `role` VALUES ('3', '某领导', '时不时来这里看看');

-- ----------------------------
-- Table structure for `uploadfile`
-- ----------------------------
DROP TABLE IF EXISTS `uploadfile`;
CREATE TABLE `uploadfile` (
  `id` int(11) NOT NULL,
  `uploadName` varchar(50) DEFAULT NULL,
  `fileName` varchar(100) DEFAULT NULL,
  `uploadDate` datetime DEFAULT NULL,
  `fileUrl` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of uploadfile
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `number` varchar(10) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `role_id` int(11) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `username` varchar(20) NOT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`number`),
  KEY `fk_user_role` (`role_id`),
  CONSTRAINT `fk_user_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123456', '1', '13536553213', 'admin', '管理');
INSERT INTO `user` VALUES ('123', '1357926aaa', '2', '13823453256', '老张', '今天天气挺好');
INSERT INTO `user` VALUES ('1234567', '1122334455', '2', '13536314588', '老王', '没错，就是隔壁的内位');
INSERT INTO `user` VALUES ('159', 'aaa321321', '3', '13675263125', '小李', '糟糕的一天');
