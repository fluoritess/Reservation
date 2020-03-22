/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : reservation

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2020-03-22 21:29:30
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
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES ('1', '四川省', '成都', '武侯区', '龙腾中路125号', '1');
INSERT INTO `address` VALUES ('2', '四川省', '成都', '青阳区', '青阳路222号', '2');
INSERT INTO `address` VALUES ('3', '四川省', '成都', '锦江区', '靖江路45号', '1');
INSERT INTO `address` VALUES ('4', '四川省', '成都', '金牛区', '人民路35号', '2');
INSERT INTO `address` VALUES ('5', '四川省', '成都', '武侯区', '龙腾上路23号', '3');
INSERT INTO `address` VALUES ('6', '四川省', '成都', '武侯区', '杜甫草堂路45号', '3');
INSERT INTO `address` VALUES ('7', '四川省', '成都', '龙泉驿区', '十陵上街100号', '4');
INSERT INTO `address` VALUES ('8', '四川省', '成都', '高新区', '金融街99号', '4');
INSERT INTO `address` VALUES ('9', '四川省', '成都', '双流区', '机场路66号', '5');

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
INSERT INTO `admin` VALUES ('1', '123', '2020-02-08 14:37:33', '森');
INSERT INTO `admin` VALUES ('2', '123', '2020-02-14 17:43:12', 'admin');

-- ----------------------------
-- Table structure for `advertisement`
-- ----------------------------
DROP TABLE IF EXISTS `advertisement`;
CREATE TABLE `advertisement` (
  `advertisement_id` int(11) NOT NULL AUTO_INCREMENT,
  `advertisement_title` varchar(255) NOT NULL,
  `advertisement_imag` varchar(255) DEFAULT NULL,
  `advertisement_content` varchar(2000) NOT NULL,
  `restaurant_id` int(11) NOT NULL,
  `advertisement_state` int(11) NOT NULL,
  `adStartDate` date DEFAULT NULL,
  `adEndDate` date DEFAULT NULL,
  `advertisement_price` decimal(11,2) DEFAULT NULL,
  PRIMARY KEY (`advertisement_id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `advertisement_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of advertisement
-- ----------------------------
INSERT INTO `advertisement` VALUES ('1', '新品上市！', 'hualaishi.jpg', '华莱士成为圣农牛排全国最大经销商!', '9', '1', '2020-03-19', '2020-03-25', '6000.00');

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
-- Table structure for `collect`
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect` (
  `collecte_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `restaurant_id` int(11) NOT NULL,
  `food_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`collecte_id`),
  KEY `user_id` (`user_id`),
  KEY `restaurant_id` (`restaurant_id`),
  KEY `food_id` (`food_id`),
  CONSTRAINT `collect_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `collect_ibfk_2` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `collect_ibfk_3` FOREIGN KEY (`food_id`) REFERENCES `food` (`food_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect
-- ----------------------------
INSERT INTO `collect` VALUES ('5', '1', '4', null);
INSERT INTO `collect` VALUES ('12', '2', '9', null);

-- ----------------------------
-- Table structure for `coupon`
-- ----------------------------
DROP TABLE IF EXISTS `coupon`;
CREATE TABLE `coupon` (
  `coupon_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `restaurant_id` int(11) NOT NULL,
  `price` double(11,0) DEFAULT NULL,
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
INSERT INTO `coupon` VALUES ('1', '1', '9', '10', '2020-02-01 17:06:57', '2020-02-03 17:06:59', '华莱士10元优惠卷');
INSERT INTO `coupon` VALUES ('2', '1', '4', '8', '2020-01-29 17:07:47', '2020-02-03 17:07:52', '菜香源川菜馆8元优惠卷');

-- ----------------------------
-- Table structure for `evaluation`
-- ----------------------------
DROP TABLE IF EXISTS `evaluation`;
CREATE TABLE `evaluation` (
  `evaluation_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL,
  `evaluation_content` varchar(255) DEFAULT NULL,
  `evaluation_data` datetime DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `restaurant_id` int(11) NOT NULL,
  `score` double(11,2) DEFAULT NULL,
  PRIMARY KEY (`evaluation_id`),
  KEY `user_id` (`user_id`),
  KEY `restaurant_id` (`restaurant_id`),
  KEY `order_id` (`order_id`),
  CONSTRAINT `evaluation_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `evaluation_ibfk_3` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `evaluation_ibfk_4` FOREIGN KEY (`order_id`) REFERENCES `order` (`orderId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluation
-- ----------------------------
INSERT INTO `evaluation` VALUES ('1', '2', '好！', '2020-03-07 17:40:06', '1', '4', '4.00');
INSERT INTO `evaluation` VALUES ('2', '3', '好！', '2020-03-07 17:50:41', '1', '7', '4.00');
INSERT INTO `evaluation` VALUES ('3', '3', '好！', '2020-03-07 17:51:59', '1', '8', '4.00');
INSERT INTO `evaluation` VALUES ('4', '3', '好！', '2020-03-07 17:53:44', '1', '4', '4.00');
INSERT INTO `evaluation` VALUES ('5', '1', '好！', '2020-03-07 18:02:08', '1', '9', '5.00');
INSERT INTO `evaluation` VALUES ('6', '30', '好', '2020-03-11 17:23:17', '2', '9', '4.00');
INSERT INTO `evaluation` VALUES ('7', '31', '好', '2020-03-11 17:23:40', '2', '4', '5.00');
INSERT INTO `evaluation` VALUES ('8', '32', '好', '2020-03-11 17:23:55', '2', '7', '5.00');
INSERT INTO `evaluation` VALUES ('9', '33', '好', '2020-03-11 17:24:10', '2', '8', '4.00');
INSERT INTO `evaluation` VALUES ('10', '31', '好', '2020-03-12 15:06:08', '2', '4', '5.00');

-- ----------------------------
-- Table structure for `food`
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food` (
  `food_id` int(11) NOT NULL,
  `restaurant_id` int(11) NOT NULL,
  `food_price` double(11,2) NOT NULL,
  `food_bargain` double(11,2) DEFAULT NULL,
  `food_name` varchar(255) DEFAULT NULL,
  `category_id` int(11) NOT NULL,
  `food_describe` varchar(2500) DEFAULT NULL,
  `sales` int(11) DEFAULT NULL,
  `food_image` varchar(255) DEFAULT NULL,
  `stock` int(11) NOT NULL,
  `cumulative_evaluation` int(11) DEFAULT NULL,
  `score` double(11,2) DEFAULT NULL,
  `food_state` int(11) NOT NULL,
  PRIMARY KEY (`food_id`),
  KEY `restaurant_id` (`restaurant_id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `food_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `food_ibfk_2` FOREIGN KEY (`category_id`) REFERENCES `food_category` (`food_category_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES ('1', '1', '108.00', '89.00', '黑胡椒牛排', '2', '黑胡椒牛排是以牛里脊肉为主要食材的大众菜，口味咸鲜', '241', 'upload/food/niupai.jpg', '29', '198', '4.77', '1');
INSERT INTO `food` VALUES ('2', '2', '42.00', '30.00', '烤芝士沙拉', '7', '烤芝士配上蔬菜沙拉,口味新颖，很别样的感觉! ', '303', 'upload/shala2.jpg', '42', '278', '4.86', '1');
INSERT INTO `food` VALUES ('3', '8', '16.00', '10.00', '烧仙草', '9', '烧仙草', '2011', 'upload/food/shaoxiancao.jpg', '230', '1672', '4.67', '1');
INSERT INTO `food` VALUES ('4', '4', '28.00', '20.00', '回锅肉', '1', '是一种四川传统菜式中家常（味型）菜肴的代表菜肴之一，属于川菜系列。', '1526', 'upload/food/huiguorou.jpg', '226', '1482', '4.87', '1');
INSERT INTO `food` VALUES ('5', '4', '26.00', '22.00', '干煸肥肠', '1', '干煸肥肠是用肥肠制作的一道著名的地方佳肴，属于川菜。具有色泽深红、筋韧辣香等口味特点。', '3105', 'upload/food/feichang.jpg', '320', '2983', '4.90', '1');
INSERT INTO `food` VALUES ('6', '4', '23.00', '18.00', '鱼香肉丝', '1', '鱼香肉丝是一道传统名菜，以鱼香味调味而得名，属于川菜。', '2809', 'upload/food/rousi.jpg', '198', '2769', '4.79', '1');
INSERT INTO `food` VALUES ('7', '4', '32.00', '30.00', '糖醋里脊', '1', '糖醋里脊是经典传统名菜之一，以猪里脊肉为主材，配以面粉、淀粉、醋等佐料，酸甜可口，让人食欲大开。', '1443', 'upload/food/liji.jpg', '264', '1098', '4.78', '1');
INSERT INTO `food` VALUES ('8', '9', '15.00', '12.00', '秘制烤鸡腿堡', '2', '华莱士秘制烤鸡腿堡菜单,新鲜嫩滑的鸡腿肉,腌入华莱士秘制五味料,烹制后再淋上一层秘制酱料,配以爽脆的有机蔬菜,味道浓郁,咬一口满满腌制的鸡腿肉', '5980', 'upload/food/jituibao.jpg', '1612', '3895', '4.89', '1');
INSERT INTO `food` VALUES ('9', '9', '12.00', '10.00', '香辣鸡翅', '2', '香辣鸡翅酥脆可口,肉嫩味美,咬一口,咔呲咔呲,鲜香劲脆!', '5120', 'upload/food/jichi.jpg', '1480', '3758', '4.81', '1');
INSERT INTO `food` VALUES ('10', '9', '4.00', '3.00', '可乐', '2', '可乐(Cola)，是指有甜味、含咖啡因但不含酒精的碳酸饮料，非常流行。可乐主要口味包括有香草、肉桂、柠檬香味等。', '4897', 'upload/food/kele.jpg', '4275', '3412', '4.62', '1');
INSERT INTO `food` VALUES ('11', '9', '20.00', '16.50', '秘制烤鸡腿堡套餐', '2', '华莱士秘制烤鸡腿堡菜单,新鲜嫩滑的鸡腿肉,腌入华莱士秘制五味料,烹制后再淋上一层秘制酱料,配以爽脆的有机蔬菜,味道浓郁,咬一口满满腌制的鸡腿肉', '8051', 'upload/food/jituibaotaocan.jpg', '4052', '4687', '4.88', '1');

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
  `Item_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `food_id` int(11) NOT NULL,
  `number` int(11) NOT NULL,
  PRIMARY KEY (`Item_id`),
  KEY `food_id` (`food_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `item_ibfk_1` FOREIGN KEY (`food_id`) REFERENCES `food` (`food_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `item_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('9', '1', '10', '8');
INSERT INTO `item` VALUES ('15', '2', '9', '1');
INSERT INTO `item` VALUES ('18', '2', '8', '2');

-- ----------------------------
-- Table structure for `messageboard`
-- ----------------------------
DROP TABLE IF EXISTS `messageboard`;
CREATE TABLE `messageboard` (
  `messageboard_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `restaurant_id` int(11) NOT NULL,
  `content` varchar(2500) NOT NULL,
  PRIMARY KEY (`messageboard_id`),
  KEY `user_id` (`user_id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `messageboard_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `messageboard_ibfk_2` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of messageboard
-- ----------------------------
INSERT INTO `messageboard` VALUES ('1', '1', '9', '请问最近几天有优惠活动吗?');
INSERT INTO `messageboard` VALUES ('2', '1', '9', '测试');

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
INSERT INTO `notice` VALUES ('1', '1', '网络订餐全程监管 维护消费者“舌尖上的安全”', ' 民以食为天，食以安为先。想让人民幸福，食品安全少不了。主题教育如何落到实处？今年，区市场监管局将整治网络订餐食品安全问题与主题教育有机结合，自“不忘初心、牢记使命”主题教育开展以来，以破解百姓密切关注的网络订餐安全难题为使命，狠抓网络订餐食品安全监管，严厉查处侵害群众利益的违法行为，全力维护广大消费群众“舌尖上的安全”。    \r\n\r\n　　网络订餐监管：线上、线下、路上齐发力\r\n\r\n　　网络订餐是项新兴产业，对食品安全监管来讲也是新开辟的领域。随着人民生活方式的转变，消费者选择网上订餐到店消费、外卖送到家这些餐饮消费新方式越来越广泛，餐饮单位入网经营的激情水涨船高。记者从区市场监管局了解到，余杭区从事网络订餐的单位达5千余家。“互联网＋订餐”模式给传统餐饮服务行业注入了新的商机和活力，也逐渐改变着人们的生活习惯和消费模式。然而，通过网络平台订购餐食，也暴露出诸多食品安全问题与监管难题。网络订餐存在的问题主要包括线上的资质问题、线下的食品安全问题、路上的安全问题。\r\n\r\n　　线上问题主要是入网餐饮单位的资质问题，表现为：假证，即通过不法手段取得造假的证照，实际为无证单位。套证，即有证单位不从事网络订餐，实行“拿来主义”。证照不全，或有照无证，由于达不到相应的许可条件，无《食品经营许可证》。超范围，即果品零售或预包装食品零售的单位，也在供应中式快餐等；或者热食类制售单位，在供应冷菜、生食类食品。线下问题主要是入网餐饮单位卫生差、操作不规范问题。入网餐饮单位位置偏僻，监督相对薄弱，无证现象突出，同时一些不符合规范的操作行为一时难以发现，存在隐患；加工现场卫生条件差，食品安全意识淡薄，自身管理水平低下，加上从业人员健康状况不明（家庭成员帮忙），超负荷运转等等问题。路上问题主要为外送箱不符合冷热贮存要求；包装材料质量差，易渗漏、倾斜倒翻等；外送人员身份杂，存在较多违规行为。为此，区市场监管局积极开展网络订餐监管治理提升工作，制订了《余杭区网络订餐食品安全治理提升工作方案》，线上、线下、路上齐发力。', '2020-02-08 14:43:42');

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `orderNo` varchar(255) NOT NULL,
  `userId` int(11) NOT NULL,
  `restaurantId` int(11) NOT NULL,
  `price` decimal(11,2) NOT NULL,
  `isRefund` tinyint(4) unsigned zerofill DEFAULT NULL,
  `deliverMoney` decimal(11,2) unsigned zerofill DEFAULT NULL,
  `createTime` datetime NOT NULL,
  `deliveryTime` datetime DEFAULT NULL,
  `receiveTime` datetime DEFAULT NULL,
  `orderState` tinyint(4) NOT NULL,
  `orderRemarks` varchar(255) DEFAULT NULL,
  `address_id` int(11) NOT NULL,
  PRIMARY KEY (`orderId`),
  KEY `userId` (`userId`),
  KEY `restaurantId` (`restaurantId`),
  KEY `address_id` (`address_id`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`restaurantId`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `order_ibfk_3` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', '202054687521022', '1', '9', '25.00', '0000', '000000000.00', '2020-02-01 16:53:02', '2020-02-01 16:54:14', '2020-02-01 17:13:22', '4', null, '1');
INSERT INTO `order` VALUES ('2', '202021346782322', '1', '4', '36.00', '0000', '000000000.00', '2020-02-01 19:21:03', '2020-02-01 19:21:05', '2020-02-01 19:21:08', '5', null, '1');
INSERT INTO `order` VALUES ('3', '202080346893212', '1', '4', '32.00', '0000', '000000000.00', '2020-02-01 19:25:19', '2020-02-01 19:25:23', '2020-02-01 19:25:26', '4', null, '1');
INSERT INTO `order` VALUES ('30', '202003071803542', '2', '9', '22.00', null, null, '2020-03-07 18:03:55', null, null, '2', null, '4');
INSERT INTO `order` VALUES ('31', '202003111721042', '2', '4', '12.00', null, null, '2020-03-11 17:21:04', null, null, '4', null, '4');
INSERT INTO `order` VALUES ('32', '202003111721402', '2', '7', '12.00', null, null, '2020-03-11 17:21:40', null, null, '1', null, '4');
INSERT INTO `order` VALUES ('33', '202003111721512', '2', '8', '12.00', null, null, '2020-03-11 17:21:51', null, null, '0', null, '4');
INSERT INTO `order` VALUES ('34', '202003191525012', '2', '9', '34.00', null, null, '2020-03-19 15:25:01', null, null, '1', null, '4');

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
INSERT INTO `restaurant` VALUES ('1', '123', '1', '15249875321', '香霏牛排', '1', '2', '4.62', 'upload/niupai.jpg', '0', '香霏牛排现已打造成功近百家连锁店，在业界，以西餐技能过硬，办理共同见长，赢得了广阔顾客的好评。', '3642', '1', '30', 'upload/shop/niupai.jpg', '80');
INSERT INTO `restaurant` VALUES ('2', '123', '5', '16332854759', 'you味沙拉', '1', '10', '4.83', 'upload/shala.jpg', '0', '国内提出主食沙拉的连锁餐饮品牌，是一个以各国风味主食色拉为特色的健康轻食品牌。', '634', '1', '4', 'upload/shop/shala.jpg', '20');
INSERT INTO `restaurant` VALUES ('3', '123', '7', '13245677893', '小郡干火锅', '1', '3', '4.88', 'upload/huoguo.jpg', '0', '小郡肝就是店里的“头牌”,只留鸡胗中间最嫩的两小块肉,头天晚上腌制时,师傅要手打一个多钟头,脆生生的小郡肝。', '4876', '1', '10', 'upload/shop/xiaojungan.jpg', '40');
INSERT INTO `restaurant` VALUES ('4', '123', '4', '13245674425', '菜香源川菜馆', '1', '1', '4.77', 'upload/jiachang.jpg', '0', '“闻之口生津，菜香源头寻”。这正是菜香源川菜馆赋予“新概念川菜”的全新内涵。', '7654', '1', '22', 'upload/shop/chuancai.jpg', '20');
INSERT INTO `restaurant` VALUES ('5', '123', '2', '16235613211', '壹级日本料理', '1', '5', '4.74', 'upload/riliao.jpg', '0', '日料吃的就是一个新鲜和精致!超级刺身大拼盘,低调中透露着奢华,每款都很吸睛,摆盘更是仙气十足~', '1983', '1', '8', 'upload/shop/riliao.jpg', '90');
INSERT INTO `restaurant` VALUES ('6', '123', '3', '13568900432', '小龙坎', '1', '3', '4.62', 'upload/xiaolongkan.jpg', '0', null, '9867', '1', '20', null, '70');
INSERT INTO `restaurant` VALUES ('7', '123', '8', '15678234561', '家常小炒', '1', '1', '4.89', 'upload/jiachangxiaochao.jpg', '0', null, '8975', '1', '15', 'upload/jiachangxiaochao.jpg', '25');
INSERT INTO `restaurant` VALUES ('8', '123', '2', '13457688934', '书亦烧仙草', '1', '9', '4.78', 'upload/shaoxiancao.jpg', '0', null, '4826', '1', '18', null, '15');
INSERT INTO `restaurant` VALUES ('9', '123', '9', '13973683572', '华莱士', '1', '2', '4.89', 'upload/hualaishi.jpg', '1', '华莱士快餐连锁店，是中国本土最大的一家集产品开发、生产、销售为一体的西式快餐企业。', '10523', '1', '6', 'upload/shop/hualaishi.jpg', '24');

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
  `realName` varchar(32) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `user_state` int(11) NOT NULL,
  `last_date` datetime DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `this_date` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `user_address` (`user_address`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`user_address`) REFERENCES `address` (`address_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '12341234112', '1', '1', 'upload/user/shan.jpg', '王杉杉', '杉', '1', '2020-03-18 15:43:06', '253681597@qq.com', '2020-03-19 15:43:06');
INSERT INTO `user` VALUES ('2', '123', '13224567231', '2', '1', 'upload/user/fluoritess.jpg', '彬彬', 'fluorites', '1', '2020-03-19 16:24:59', '308751395@qq.com', '2020-03-20 20:38:39');
