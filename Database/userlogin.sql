-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 10, 2018 at 04:38 PM
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
-- Table structure for table `userlogin`
--

CREATE TABLE IF NOT EXISTS `userlogin` (
  `No` int(100) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) COLLATE utf8_bin NOT NULL,
  `Time of logging in` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=17 ;

--
-- Dumping data for table `userlogin`
--

INSERT INTO `userlogin` (`No`, `Name`, `Time of logging in`) VALUES
(1, 'Phyo Maw Ko', ''),
(2, 'Thin Thant Tun', ''),
(3, 'Myo Myo', ''),
(4, 'Aung Net', ''),
(5, 'Thandar', 'Thu Mar 29 20:01:25 MMT 2018'),
(6, 'Tun Tun', 'Thu Mar 29 20:02:11 MMT 2018'),
(7, 'Maw Maw', 'Fri Mar 30 14:48:48 MMT 2018'),
(8, 'aaa', 'Thu Apr 05 22:53:58 PDT 2018'),
(9, 'aa', 'Thu Apr 05 22:58:22 PDT 2018'),
(10, 'aaa', 'Thu Apr 05 23:18:47 PDT 2018'),
(11, 'aaa', 'Thu Apr 05 23:18:47 PDT 2018'),
(12, 'aaa', 'Thu Apr 05 23:31:58 PDT 2018'),
(13, 'aaa', 'Thu Apr 05 23:31:58 PDT 2018'),
(14, 'aaa', 'Sat Apr 07 00:01:20 PDT 2018'),
(15, 'dd', 'Sun Apr 08 07:27:44 PDT 2018'),
(16, 'aa', 'Sun Apr 08 08:49:48 PDT 2018');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
