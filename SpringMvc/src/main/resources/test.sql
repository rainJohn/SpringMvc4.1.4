/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50615
File Encoding         : 65001

Date: 2015-01-21 14:37:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `age` int(11) NOT NULL COMMENT '年龄',
  `name` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1 COMMENT='用户信息';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '26', 'boot1');
INSERT INTO `user` VALUES ('2', '27', 'boot2');
INSERT INTO `user` VALUES ('3', '10', '123');
INSERT INTO `user` VALUES ('4', '10', 'abc');
INSERT INTO `user` VALUES ('5', '10', 'abcdef');
INSERT INTO `user` VALUES ('6', '10', 'abc');
INSERT INTO `user` VALUES ('7', '10', 'abcefd');
