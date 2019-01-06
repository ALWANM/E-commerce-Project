-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- 主机： 127.0.0.1:3306
-- 生成日期： 2019-01-06 21:35:36
-- 服务器版本： 5.7.23
-- PHP 版本： 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 数据库： `ecommerce`
--

-- --------------------------------------------------------

--
-- 表的结构 `carteitem`
--

DROP TABLE IF EXISTS `carteitem`;
CREATE TABLE IF NOT EXISTS `carteitem` (
  `CARTEITEMID` int(5) NOT NULL AUTO_INCREMENT,
  `ORDERID` int(5) DEFAULT NULL,
  `PRODUCTID` int(5) DEFAULT NULL,
  `QUANTITY` int(5) DEFAULT NULL,
  PRIMARY KEY (`CARTEITEMID`),
  KEY `FK2qmcrlq5vogqqpq7lv05qeg5o` (`ORDERID`),
  KEY `FKkqbp7ws8ak3c7nd2eepsl2yky` (`PRODUCTID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- 表的结构 `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `IDCATEGORY` int(5) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(25) DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`IDCATEGORY`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `category`
--

INSERT INTO `category` (`IDCATEGORY`, `NAME`, `DESCRIPTION`) VALUES
(1, 'Monitor', 'Monitor'),
(2, 'Motherboard', 'Motherboard'),
(3, 'CPU', 'Microprocessor'),
(4, 'RAM', 'Main Memory'),
(5, 'Expansion cards', 'Expansion cards'),
(6, 'Power supply unit', 'Power supply unit'),
(7, 'Optical disc drive', 'Optical disc drive'),
(8, 'HDD', 'Hard disk drive'),
(9, 'Keyboard', 'Keyboard'),
(10, 'Mouse', 'Mouse');

-- --------------------------------------------------------

--
-- 表的结构 `order`
--

DROP TABLE IF EXISTS `order`;
CREATE TABLE IF NOT EXISTS `order` (
  `ORDERID` int(5) NOT NULL AUTO_INCREMENT,
  `IDUSER` int(5) DEFAULT NULL,
  `DATE` date DEFAULT NULL,
  `AMOUNT` float DEFAULT NULL,
  `SHIPPINGINFOID` int(5) DEFAULT NULL,
  `PAYMENTID` int(5) DEFAULT NULL,
  PRIMARY KEY (`ORDERID`),
  KEY `FKswa66c754y5e56ydo0s5uhmno` (`PAYMENTID`),
  KEY `FKp99889xibc8kks6i1lypi3tfy` (`SHIPPINGINFOID`),
  KEY `FKk2ftus8jg2lelkxcn98fabnlp` (`IDUSER`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `order`
--

INSERT INTO `order` (`ORDERID`, `IDUSER`, `DATE`, `AMOUNT`, `SHIPPINGINFOID`, `PAYMENTID`) VALUES
(1, 1, '2019-01-06', 100, 1, 1),
(2, 2, '2019-01-06', 100, 1, 1),
(3, 3, '2019-01-06', 100, 1, 1);

-- --------------------------------------------------------

--
-- 表的结构 `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE IF NOT EXISTS `payment` (
  `PAYMENTID` int(5) NOT NULL AUTO_INCREMENT,
  `PAYMENTDATE` date NOT NULL,
  `METHODOFPAYMENT` varchar(15) NOT NULL,
  PRIMARY KEY (`PAYMENTID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `payment`
--

INSERT INTO `payment` (`PAYMENTID`, `PAYMENTDATE`, `METHODOFPAYMENT`) VALUES
(1, '2019-01-06', 'CB');

-- --------------------------------------------------------

--
-- 表的结构 `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `PRODUCTID` int(5) NOT NULL AUTO_INCREMENT,
  `REFERENCE` varchar(5) DEFAULT NULL,
  `NAME` varchar(10) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `IDCATEGORY` int(5) DEFAULT NULL,
  `PRICE` float DEFAULT NULL,
  `VAT` float DEFAULT NULL,
  `QUANTITYSTOCK` int(5) DEFAULT NULL,
  `SIZE` int(5) DEFAULT NULL,
  `COLOR` int(5) DEFAULT NULL,
  `PICTURE` int(5) DEFAULT NULL,
  `SUPPLIERID` int(5) DEFAULT NULL,
  PRIMARY KEY (`PRODUCTID`),
  KEY `FKl22gu83pf6q9mbke1ln8wjbhx` (`SUPPLIERID`),
  KEY `FKb6hv4efr1txbj3ni1qlmj94uq` (`IDCATEGORY`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `product`
--

INSERT INTO `product` (`PRODUCTID`, `REFERENCE`, `NAME`, `DESCRIPTION`, `IDCATEGORY`, `PRICE`, `VAT`, `QUANTITYSTOCK`, `SIZE`, `COLOR`, `PICTURE`, `SUPPLIERID`) VALUES
(2, 'B250', 'ASUS B250 ', 'Carte mere\r\n', 2, 200, 10, 91, 1, 1, 2, 3),
(3, 'H110', 'ASUS H110', 'CARTE MERE', 2, 90, 10, 82, 1, 1, 3, 3),
(4, 'X470', 'X470', 'CARTE MERE', 2, 230, 10, 91, 1, 1, 4, 4);

-- --------------------------------------------------------

--
-- 表的结构 `shippinginfo`
--

DROP TABLE IF EXISTS `shippinginfo`;
CREATE TABLE IF NOT EXISTS `shippinginfo` (
  `SHIPPINGID` int(5) NOT NULL AUTO_INCREMENT,
  `SHIPPINGADDRESS` varchar(255) DEFAULT NULL,
  `SHIPPINGPOSTALCODE` varchar(10) DEFAULT NULL,
  `SHIPPINGTOWN` varchar(10) DEFAULT NULL,
  `SHIPPINGCOUNTRY` varchar(10) DEFAULT NULL,
  `SHIPPINGSTATUS` varchar(10) DEFAULT NULL,
  `RECIPIENT` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`SHIPPINGID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `shippinginfo`
--

INSERT INTO `shippinginfo` (`SHIPPINGID`, `SHIPPINGADDRESS`, `SHIPPINGPOSTALCODE`, `SHIPPINGTOWN`, `SHIPPINGCOUNTRY`, `SHIPPINGSTATUS`, `RECIPIENT`) VALUES
(1, 'france', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE IF NOT EXISTS `supplier` (
  `SUPPLIERID` int(5) NOT NULL AUTO_INCREMENT,
  `FIRSTNAME` varchar(10) DEFAULT NULL,
  `LASTNAME` varchar(10) DEFAULT NULL,
  `MAIL` varchar(25) DEFAULT NULL,
  `PHONENUMBER` varchar(15) DEFAULT NULL,
  `DATEOFBIRTH` date DEFAULT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `POSTALCODE` varchar(10) DEFAULT NULL,
  `TOWN` varchar(25) DEFAULT NULL,
  `COUNTRY` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`SUPPLIERID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `supplier`
--

INSERT INTO `supplier` (`SUPPLIERID`, `FIRSTNAME`, `LASTNAME`, `MAIL`, `PHONENUMBER`, `DATEOFBIRTH`, `ADDRESS`, `POSTALCODE`, `TOWN`, `COUNTRY`) VALUES
(3, 'ASUS', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, 'Gigabyte', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `IDUSER` int(5) NOT NULL AUTO_INCREMENT,
  `FIRSTNAME` varchar(10) DEFAULT NULL,
  `LASTNAME` varchar(10) DEFAULT NULL,
  `ROLE` varchar(10) DEFAULT NULL,
  `PASSWORD` varchar(10) DEFAULT NULL,
  `MAIL` varchar(25) DEFAULT NULL,
  `PHONENUMBER` varchar(15) DEFAULT NULL,
  `DATEOFBIRTH` date DEFAULT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `POSTALCODE` varchar(10) DEFAULT NULL,
  `TOWN` varchar(25) DEFAULT NULL,
  `COUNTRY` varchar(15) DEFAULT NULL,
  `DATEOPEN` date DEFAULT NULL,
  `GENDER` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`IDUSER`),
  UNIQUE KEY `MAIL` (`MAIL`),
  KEY `login` (`MAIL`,`PASSWORD`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `user`
--

INSERT INTO `user` (`IDUSER`, `FIRSTNAME`, `LASTNAME`, `ROLE`, `PASSWORD`, `MAIL`, `PHONENUMBER`, `DATEOFBIRTH`, `ADDRESS`, `POSTALCODE`, `TOWN`, `COUNTRY`, `DATEOPEN`, `GENDER`) VALUES
(1, 'ADMIN', 'ADMIN', 'ADMIN', 'ADMIN', 'ADMIN@ADMIN.FR', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'male'),
(2, 'USER', 'USER', 'USER', 'USER', 'USER@USER.FR', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 'WORKER', 'WORKER', 'WORKER', 'WORKER', 'WORKER@WORKER.FR', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- 限制导出的表
--

--
-- 限制表 `carteitem`
--
ALTER TABLE `carteitem`
  ADD CONSTRAINT `FK2qmcrlq5vogqqpq7lv05qeg5o` FOREIGN KEY (`ORDERID`) REFERENCES `order` (`ORDERID`),
  ADD CONSTRAINT `FK_ORDER` FOREIGN KEY (`ORDERID`) REFERENCES `order` (`ORDERID`),
  ADD CONSTRAINT `FK_PRODUCT` FOREIGN KEY (`PRODUCTID`) REFERENCES `product` (`PRODUCTID`),
  ADD CONSTRAINT `FKkqbp7ws8ak3c7nd2eepsl2yky` FOREIGN KEY (`PRODUCTID`) REFERENCES `product` (`PRODUCTID`);

--
-- 限制表 `order`
--
ALTER TABLE `order`
  ADD CONSTRAINT `FK_PAYMENT` FOREIGN KEY (`PAYMENTID`) REFERENCES `payment` (`PAYMENTID`),
  ADD CONSTRAINT `FK_SHIPPINGINFO` FOREIGN KEY (`SHIPPINGINFOID`) REFERENCES `shippinginfo` (`SHIPPINGID`),
  ADD CONSTRAINT `FK_USER` FOREIGN KEY (`IDUSER`) REFERENCES `user` (`IDUSER`),
  ADD CONSTRAINT `FKk2ftus8jg2lelkxcn98fabnlp` FOREIGN KEY (`IDUSER`) REFERENCES `user` (`IDUSER`),
  ADD CONSTRAINT `FKp99889xibc8kks6i1lypi3tfy` FOREIGN KEY (`SHIPPINGINFOID`) REFERENCES `shippinginfo` (`SHIPPINGID`),
  ADD CONSTRAINT `FKswa66c754y5e56ydo0s5uhmno` FOREIGN KEY (`PAYMENTID`) REFERENCES `payment` (`PAYMENTID`);

--
-- 限制表 `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `FK_CATEGORY` FOREIGN KEY (`IDCATEGORY`) REFERENCES `category` (`IDCATEGORY`),
  ADD CONSTRAINT `FK_SUPPLIER` FOREIGN KEY (`SUPPLIERID`) REFERENCES `supplier` (`SUPPLIERID`),
  ADD CONSTRAINT `FKb6hv4efr1txbj3ni1qlmj94uq` FOREIGN KEY (`IDCATEGORY`) REFERENCES `category` (`IDCATEGORY`),
  ADD CONSTRAINT `FKl22gu83pf6q9mbke1ln8wjbhx` FOREIGN KEY (`SUPPLIERID`) REFERENCES `supplier` (`SUPPLIERID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
