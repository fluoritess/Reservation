/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : reservation

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2020-01-23 22:21:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `address`
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `address_id` int(11) NOT NULL,
  `address_provence` varchar(32) NOT NULL,
  `address_city` varchar(32) NOT NULL,
  `address_district` varchar(32) NOT NULL,
  `address_street` varchar(32) NOT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES ('1', '四川省', '成都', '武侯区', '龙腾中路125号');
INSERT INTO `address` VALUES ('2', '四川省', '成都', '青阳区', '青阳路222号');
INSERT INTO `address` VALUES ('3', '四川省', '成都', '锦江区', '靖江路45号');
INSERT INTO `address` VALUES ('4', '四川省', '成都', '金牛区', '人民路35号');
INSERT INTO `address` VALUES ('5', '四川省', '成都', '武侯区', '龙腾上路23号');
INSERT INTO `address` VALUES ('6', '四川省', '成都', '武侯区', '杜甫草堂路45号');
INSERT INTO `address` VALUES ('7', '四川省', '成都', '龙泉驿区', '十陵上街100号');
INSERT INTO `address` VALUES ('8', '四川省', '成都', '高新区', '金融街99号');

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `admin_password` varchar(32) NOT NULL,
  `system_time` datetime DEFAULT NULL,
  `admin_name` varchar(255) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for `advertisement`
-- ----------------------------
DROP TABLE IF EXISTS `advertisement`;
CREATE TABLE `advertisement` (
  `advertisement_id` int(11) NOT NULL,
  `advertisement_title` varchar(255) NOT NULL,
  `advertisement_imag` varchar(255) DEFAULT NULL,
  `advertisement_content` varchar(2000) DEFAULT NULL,
  `restaurant_id` int(11) DEFAULT NULL,
  `advertisement_state` int(11) NOT NULL,
  PRIMARY KEY (`advertisement_id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `advertisement_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of advertisement
-- ----------------------------

-- ----------------------------
-- Table structure for `city_info`
-- ----------------------------
DROP TABLE IF EXISTS `city_info`;
CREATE TABLE `city_info` (
  `city_name` varchar(32) NOT NULL,
  `city_distict` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city_info
-- ----------------------------
INSERT INTO `city_info` VALUES ('成都', '青阳区');
INSERT INTO `city_info` VALUES ('成都', '锦江区');
INSERT INTO `city_info` VALUES ('成都', '金牛区');
INSERT INTO `city_info` VALUES ('成都', '武侯区');
INSERT INTO `city_info` VALUES ('成都', '成华区');
INSERT INTO `city_info` VALUES ('成都', '龙泉驿区');
INSERT INTO `city_info` VALUES ('成都', '青白江区');
INSERT INTO `city_info` VALUES ('成都', '新都区');
INSERT INTO `city_info` VALUES ('成都', '温江区');
INSERT INTO `city_info` VALUES ('成都', '双流区');
INSERT INTO `city_info` VALUES ('成都', '高新区');

-- ----------------------------
-- Table structure for `coupon`
-- ----------------------------
DROP TABLE IF EXISTS `coupon`;
CREATE TABLE `coupon` (
  `coupon_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `restaurant_id` int(11) NOT NULL,
  `price` double DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `Instructions` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`coupon_id`),
  KEY `user_id` (`user_id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `coupon_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `coupon_ibfk_2` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of coupon
-- ----------------------------

-- ----------------------------
-- Table structure for `evaluation`
-- ----------------------------
DROP TABLE IF EXISTS `evaluation`;
CREATE TABLE `evaluation` (
  `evaluation_id` int(11) NOT NULL,
  `order_id` varchar(32) NOT NULL,
  `evaluation_content` varchar(255) DEFAULT NULL,
  `evaluation_start` datetime DEFAULT NULL,
  `evaluation_data` datetime DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `restaurant_id` int(11) NOT NULL,
  PRIMARY KEY (`evaluation_id`),
  KEY `order_id` (`order_id`),
  KEY `user_id` (`user_id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `evaluation_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `order` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `evaluation_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `evaluation_ibfk_3` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluation
-- ----------------------------
INSERT INTO `evaluation` VALUES ('1', '1', '还不错，速度挺快,还不错，速度挺快还不错，速度挺快还不错，速度挺快还不错，速度挺快还不错，速度挺快还不错，速度挺快。。。', '2020-01-23 22:19:13', '2020-01-23 22:19:15', '1', '4');

-- ----------------------------
-- Table structure for `food`
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food` (
  `food_id` int(11) NOT NULL,
  `restaurant_id` int(11) NOT NULL,
  `food_price` double(11,0) NOT NULL,
  `food_name` varchar(255) DEFAULT NULL,
  `category_id` int(11) NOT NULL,
  `food_describe` varchar(2500) DEFAULT NULL,
  `sales` int(11) DEFAULT NULL,
  `food_image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`food_id`),
  KEY `restaurant_id` (`restaurant_id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `food_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `food_ibfk_2` FOREIGN KEY (`category_id`) REFERENCES `food_category` (`food_category_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES ('1', '1', '89', '黑胡椒牛排', '2', '黑胡椒牛排是以牛里脊肉为主要食材的大众菜，口味咸鲜', '2', 'upload/food/niupai.jpg');
INSERT INTO `food` VALUES ('2', '2', '30', '烤芝士沙拉', '7', '烤芝士配上蔬菜沙拉,口味新颖，很别样的感觉! ', '3', 'upload/food/zhishi.jpg');
INSERT INTO `food` VALUES ('3', '8', '10', '烧仙草', '9', '烧仙草', '20', 'upload/food/shaoxiancao.jpg');
INSERT INTO `food` VALUES ('4', '4', '20', '回锅肉', '1', '是一种四川传统菜式中家常（味型）菜肴的代表菜肴之一，属于川菜系列。', '15', 'upload/food/huiguorou.jpg');
INSERT INTO `food` VALUES ('5', '4', '22', '干煸肥肠', '1', '干煸肥肠是用肥肠制作的一道著名的地方佳肴，属于川菜。具有色泽深红、筋韧辣香等口味特点。', '31', 'upload/food/feichang.jpg');
INSERT INTO `food` VALUES ('6', '4', '18', '鱼香肉丝', '1', '鱼香肉丝是一道传统名菜，以鱼香味调味而得名，属于川菜。', '28', 'upload/food/rousi.jpg');
INSERT INTO `food` VALUES ('7', '4', '30', '糖醋里脊', '1', '糖醋里脊是经典传统名菜之一，以猪里脊肉为主材，配以面粉、淀粉、醋等佐料，酸甜可口，让人食欲大开。', '14', 'upload/food/liji.jpg');

-- ----------------------------
-- Table structure for `food_category`
-- ----------------------------
DROP TABLE IF EXISTS `food_category`;
CREATE TABLE `food_category` (
  `food_category_id` int(11) NOT NULL,
  `category_name` varchar(255) NOT NULL,
  PRIMARY KEY (`food_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of food_category
-- ----------------------------
INSERT INTO `food_category` VALUES ('1', '家常菜谱');
INSERT INTO `food_category` VALUES ('2', '西式快餐');
INSERT INTO `food_category` VALUES ('3', '火锅/干锅');
INSERT INTO `food_category` VALUES ('4', '米面菜谱');
INSERT INTO `food_category` VALUES ('5', '日本料理');
INSERT INTO `food_category` VALUES ('6', '东南亚菜');
INSERT INTO `food_category` VALUES ('7', '意大利餐');
INSERT INTO `food_category` VALUES ('8', '法国菜谱');
INSERT INTO `food_category` VALUES ('9', '时尚饮品');
INSERT INTO `food_category` VALUES ('10', '甜点点心');
INSERT INTO `food_category` VALUES ('11', '其他菜系');

-- ----------------------------
-- Table structure for `item`
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `Item_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `food_id` int(11) NOT NULL,
  `number` int(11) NOT NULL,
  PRIMARY KEY (`Item_id`),
  KEY `food_id` (`food_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `item_ibfk_1` FOREIGN KEY (`food_id`) REFERENCES `food` (`food_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `item_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------

-- ----------------------------
-- Table structure for `messageboard`
-- ----------------------------
DROP TABLE IF EXISTS `messageboard`;
CREATE TABLE `messageboard` (
  `messageboard_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `restaurant_id` int(11) NOT NULL,
  `content` varchar(2500) NOT NULL,
  PRIMARY KEY (`messageboard_id`),
  KEY `user_id` (`user_id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `messageboard_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `messageboard_ibfk_2` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of messageboard
-- ----------------------------

-- ----------------------------
-- Table structure for `notice`
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `notice_id` int(11) NOT NULL,
  `admin_id` int(11) NOT NULL,
  `notice_title` varchar(255) DEFAULT NULL,
  `notice_content` varchar(2000) DEFAULT NULL,
  `notice_data` datetime DEFAULT NULL,
  PRIMARY KEY (`notice_id`),
  KEY `admin_id` (`admin_id`),
  CONSTRAINT `notice_ibfk_1` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` varchar(32) NOT NULL,
  `order_user` int(11) NOT NULL,
  `order_restaurant` int(11) NOT NULL,
  `order_price` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime DEFAULT NULL,
  `order_food` varchar(255) NOT NULL,
  `order_state` int(11) NOT NULL,
  `is_ship` int(11) NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `order_user` (`order_user`),
  KEY `order_restaurant` (`order_restaurant`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`order_user`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`order_restaurant`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', '1', '4', '24', '2020-01-23 22:16:27', '2020-01-23 22:16:30', '1', '1', '1');

-- ----------------------------
-- Table structure for `restaurant`
-- ----------------------------
DROP TABLE IF EXISTS `restaurant`;
CREATE TABLE `restaurant` (
  `restaurant_id` int(11) NOT NULL,
  `restaurant_password` varchar(32) NOT NULL,
  `restaurant_address` int(11) DEFAULT NULL,
  `restaurant_phone` varchar(32) NOT NULL,
  `restaurant_name` varchar(255) NOT NULL,
  `restaurant_state` int(11) NOT NULL,
  `restaurant_category_id` int(11) NOT NULL,
  `score` double(11,2) DEFAULT NULL,
  `restaurant_image` varchar(255) DEFAULT NULL,
  `collection` int(11) DEFAULT NULL,
  `restaurant_describe` varchar(2500) DEFAULT NULL,
  `sales` int(11) DEFAULT NULL,
  `wifi` int(11) DEFAULT NULL,
  `parkingspace` int(11) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `averageprice` double DEFAULT NULL,
  PRIMARY KEY (`restaurant_id`),
  KEY `restaurant_address` (`restaurant_address`),
  CONSTRAINT `restaurant_ibfk_1` FOREIGN KEY (`restaurant_address`) REFERENCES `address` (`address_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of restaurant
-- ----------------------------
INSERT INTO `restaurant` VALUES ('1', '123', '1', '15249875321', '香霏牛排', '1', '2', '4.62', 'upload/niupai.jpg', '1211', '香霏牛排现已打造成功近百家连锁店，在业界，以西餐技能过硬，办理共同见长，赢得了广阔顾客的好评。', '3642', '1', '30', 'upload/shop/niupai.jpg', '80');
INSERT INTO `restaurant` VALUES ('2', '123', '5', '16332854759', 'you味沙拉', '1', '10', '4.83', 'upload/shala.jpg', '223', '国内提出主食沙拉的连锁餐饮品牌，是一个以各国风味主食色拉为特色的健康轻食品牌。', '634', '1', '4', 'upload/shop/shala.jpg', '20');
INSERT INTO `restaurant` VALUES ('3', '123', '7', '13245677893', '小郡干火锅', '1', '3', '4.88', 'upload/huoguo.jpg', '2452', '小郡肝就是店里的“头牌”,只留鸡胗中间最嫩的两小块肉,头天晚上腌制时,师傅要手打一个多钟头,脆生生的小郡肝。', '4876', '1', '10', 'upload/shop/xiaojungan.jpg', '40');
INSERT INTO `restaurant` VALUES ('4', '123', '4', '13245674425', '菜香源川菜馆', '1', '1', '4.77', 'upload/jiachang.jpg', '4427', '“闻之口生津，菜香源头寻”。这正是菜香源川菜馆赋予“新概念川菜”的全新内涵。', '7654', '1', '22', 'upload/shop/chuancai.jpg', '20');
INSERT INTO `restaurant` VALUES ('5', '123', '2', '16235613211', '壹级日本料理', '1', '5', '4.74', 'upload/riliao.jpg', '782', '日料吃的就是一个新鲜和精致!超级刺身大拼盘,低调中透露着奢华,每款都很吸睛,摆盘更是仙气十足~', '1983', '1', '8', 'upload/shop/riliao.jpg', '90');
INSERT INTO `restaurant` VALUES ('6', '123', '3', '13568900432', '小龙坎', '1', '3', '4.62', 'upload/xiaolongkan.jpg', '4792', null, '9867', '1', '20', null, '70');
INSERT INTO `restaurant` VALUES ('7', '123', '8', '15678234561', '家常小炒', '1', '1', '4.89', 'upload/03.jpg', '4671', null, '8975', '1', '15', null, '25');
INSERT INTO `restaurant` VALUES ('8', '123', '2', '13457688934', '书亦烧仙草', '1', '9', '4.78', 'upload/shaoxiancao.jpg', '2369', null, '4826', '1', '18', null, '15');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `user_password` varchar(32) NOT NULL,
  `user_phone` varchar(32) NOT NULL,
  `user_address` int(11) DEFAULT NULL,
  `user_sex` varchar(32) DEFAULT NULL,
  `user_imag` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) NOT NULL,
  `user_state` int(11) NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `user_address` (`user_address`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`user_address`) REFERENCES `address` (`address_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '12341234112', '1', '1', '1', '杉', '1');
INSERT INTO `user` VALUES ('2', '123', '13224567231', '2', '1', '1', 'fluorites', '1');
