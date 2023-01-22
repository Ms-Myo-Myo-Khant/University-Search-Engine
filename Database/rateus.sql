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
-- Table structure for table `rateus`
--

CREATE TABLE IF NOT EXISTS `rateus` (
  `No` int(20) NOT NULL AUTO_INCREMENT,
  `gmail` varchar(100) NOT NULL,
  `comments` longtext NOT NULL,
  `rate` varchar(50) NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `rateus`
--

INSERT INTO `rateus` (`No`, `gmail`, `comments`, `rate`) VALUES
(1, 'myomyokhant4@gmail.com', 'Great application', 'Good'),
(2, 'clara.granger99@gmail.com', 'Useful application', 'Average'),
(3, 'saikuanngin@gmail.com', 'Convnient to use', 'Average'),
(4, 'eieimoepwint@gmail.com', 'Need more universities', 'Average'),
(5, 'myattheingi@gmail.com', 'Easy to use, convenient', 'Good'),
(6, 'myomyokhatn4@gmail.com', 'Good!', 'Good');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
