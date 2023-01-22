-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 10, 2018 at 04:37 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `javaproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE IF NOT EXISTS `adminlogin` (
  `No` int(100) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) COLLATE utf8_bin NOT NULL,
  `Time of logging in` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=28 ;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`No`, `Name`, `Time of logging in`) VALUES
(1, 'Phyo Maw Ko', 'Tues Mar 27 08:05:47 MMT 2018'),
(2, 'Myo Myo Khant', 'Tues Mar 27 10:08:16 MMT 2018'),
(3, 'Thiri Wah Wah Thein', 'Tues Mar 27 10:19:02 MMT 2018'),
(4, 'May Yadanar', 'Tues Mar 27 10:20:16 MMT 2018'),
(5, 'Ei Ei Moe Pwint', 'Thu Mar 29 16:02:53 MMT 2018'),
(6, 'Myat Theingi New', 'Thu Mar 29 16:22:43 MMT 2018'),
(7, 'Thae Hnin Su', 'Thu Mar 29 16:49:32 MMT 2018'),
(8, 'Myat Thiri Khaing', 'Thu Mar 29 17:06:10 MMT 2018'),
(9, 'Nang Mo Mo Khan', 'Thu Mar 29 17:12:30 MMT 2018'),
(10, 'Hsu Wai Htet', 'Thu Mar 29 17:37:20 MMT 2018'),
(11, 'Thin Thant Tun', 'Thu Mar 29 17:50:32 MMT 2018'),
(12, 'Nilar Myint', 'Thu Mar 29 18:03:20 MMT 2018'),
(13, 'Sai Kuan Ngin', 'Thu Mar 29 18:25:02 MMT 2018'),
(14, 'Sittye Yint Tun', 'Thu Mar 29 20:05:02 MMT 2018'),
(15, 'Phyo Thu Ta', 'Fri Mar 30 08:34:07 MMT 2018'),
(16, 'Nilar Myint', 'Thu Apr 05 21:39:39 PDT 2018'),
(17, 'aa', 'Thu Apr 05 22:51:19 PDT 2018'),
(18, 'aaa', 'Thu Apr 05 22:55:50 PDT 2018'),
(19, 'aaa', 'Thu Apr 05 23:02:30 PDT 2018'),
(20, 'aaa', 'Thu Apr 05 23:09:01 PDT 2018'),
(21, 'aaa', 'Thu Apr 05 23:09:01 PDT 2018'),
(22, 'aaa', 'Thu Apr 05 23:32:43 PDT 2018'),
(23, 'aaa', 'Thu Apr 05 23:39:12 PDT 2018'),
(24, '123', 'Sat Apr 07 00:00:03 PDT 2018'),
(25, 'bb', 'Sun Apr 08 07:26:10 PDT 2018'),
(26, 'aa', 'Sun Apr 08 08:49:37 PDT 2018'),
(27, 'urieu', 'Sun Apr 08 08:55:06 PDT 2018');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
