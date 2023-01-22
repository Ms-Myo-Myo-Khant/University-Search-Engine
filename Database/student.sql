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
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `No` int(100) NOT NULL AUTO_INCREMENT,
  `sname` varchar(500) COLLATE utf8_bin NOT NULL,
  `birth` varchar(500) COLLATE utf8_bin NOT NULL,
  `mail` varchar(500) COLLATE utf8_bin NOT NULL,
  `phno` bigint(100) NOT NULL,
  `gen` varchar(100) COLLATE utf8_bin NOT NULL,
  `sadd` varchar(100) COLLATE utf8_bin NOT NULL,
  `nrc` varchar(100) COLLATE utf8_bin NOT NULL,
  `fname` varchar(100) COLLATE utf8_bin NOT NULL,
  `fnrc` varchar(100) COLLATE utf8_bin NOT NULL,
  `mname` varchar(100) COLLATE utf8_bin NOT NULL,
  `mnrc` varchar(100) COLLATE utf8_bin NOT NULL,
  `ppnno` int(100) NOT NULL,
  `padd` varchar(100) COLLATE utf8_bin NOT NULL,
  `dep` varchar(100) COLLATE utf8_bin NOT NULL,
  `roll` varchar(100) COLLATE utf8_bin NOT NULL,
  `tm` int(100) NOT NULL,
  `major` varchar(100) COLLATE utf8_bin NOT NULL,
  `sy` int(100) NOT NULL,
  `uniname` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=21 ;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`No`, `sname`, `birth`, `mail`, `phno`, `gen`, `sadd`, `nrc`, `fname`, `fnrc`, `mname`, `mnrc`, `ppnno`, `padd`, `dep`, `roll`, `tm`, `major`, `sy`, `uniname`) VALUES
(1, 'Phyo Maw Ko', '1.1.2000', 'pmaw5980@gmail.com', 975149347, 'Male', '38,Hanthawaddy22Street South Okkalapa', '12/0KT(N)190031', 'U Thet Naing', '12/0KT(N)005482', 'Daw Myat Myat Htwe', '12/OKT(N)xxxxxx', 562868, '38,Hanthawaddy22Street', 'BEHS1 Yankin', 'YK-112', 490, 'Bio', 2016, 'University of Information Technology'),
(2, 'Sai Kuan Ngin', '17.7.2000', 'saikuanngin@gmail.com', 250492189, 'Male', 'Hlaing ', '12/0KT(N)190031', 'U Thet Naing', '12/0KT(N)005482', 'Daw Myat Myat Htwe', '12/OKT(N)xxxxxx', 562868, '38,Hanthawaddy22Street', 'BEHS1 Yankin', 'YK-112', 490, 'Bio', 2016, 'University of Information Technology'),
(3, 'Myo Myo Khant', '17.12.1999', 'mmk99@gmail.com', 97581368, 'Female', 'Hlaing', '8/TKN(N)157888', 'fefe', 'ferfe', 'efrfe', 'efefe', 23344, 'regergergre', 'fefe', 'fefr', 322, 'efef', 21, 'fefewfefef'),
(4, 'Ei Ei Moe Pwint', '10.9.2000', 'eiei00@gmail.com', 250489674, 'Female', '48th street,Botahtaung', '22', 'fef', 'fefe', 'efw', 'efwe', 33, 'fefef', 'fee', 'efe', 22, 'fefe', 33, 'wefw'),
(5, 'Myat Theingi Nwe', '8.10.1999', 'myattheingi@gmail.com', 468752985, 'Female', 'Pabaetan ', '22', 'fef', 'fefe', 'efw', 'efwe', 33, 'fefef', 'fee', 'efe', 22, 'fefe', 33, 'wefw'),
(6, 'May Yadanar', '11.11.1999', 'mayyadanar@gmail.com', 796257871, 'Female', 'Pazundaung', '14/TTT(N)4444', 'U Blah Blah', '14/TTT(n)3333', 'Daw Blah Blah', '14/TTT(N)444', 1234, 'Taunggyi', 'Shan State', '333', 491, 'BIO', 2016, 'University of Information Technology'),
(7, 'Min Htet Thu', '12.1.2000', 'minhtetthu@gmail.com', 4205078, 'Male', 'Hlaing', '14/TTT(N)4444', 'U Blah Blah', '14/TTT(n)3333', 'Daw Blah Blah', '14/TTT(N)444', 1234, 'Taunggyi', 'Shan State', '333', 491, 'BIO', 2016, 'University of Information Technology'),
(8, 'Aung Ko Ko Zaw', '5.3.2000', 'akkz00@gmail.com', 789455852, 'Male', 'Yangon', '14/TTT(N)4444', 'U Blah Blah', '14/TTT(n)3333', 'Daw Blah Blah', '14/TTT(N)444', 1234, 'Taunggyi', 'Shan State', '333', 491, 'BIO', 2016, 'University of Information Technology'),
(9, 'Chan Myae Khant', '14.6.2000', 'chanmyaekhant@gmail.com', 97581368, 'Male', 'Hledan', '12/KMN(N)005781', 'rrr', 'rrr', 'rrr', 'rrr', 333, 'werer', 'rrr', 'rrr', 44, 'tt', 33, 'ggrg'),
(10, 'Phyo Thuta', '12.11.1999', 'phyothuta@gmail.com', 408970122, 'Male', '46th Street,Yangon', '12/BTH(N)045879', 'U BA', '12/Bfn/1223', 'daw mya', '12/ggg', 91234, 'Yangon', 'Mandalay', '123', 560, 'Geo', 2000, 'Yangon University'),
(11, 'Sittye Yint Tun', '5.11.1999', 'sittyeyinttun@gmail.com', 94567, 'Male', 'Hlaing', '12/MGY(n)34444', 'Josh', '13/uuu(n)34555', 'Mary', '12/ttt(n)4333', 12344, 'London', 'Bangkok', '3344tt', 543, 'Mya', 1988, 'YUFL'),
(12, 'Sai Htet Aung', '10.7.2000', 'saihtetag@gmail.com', 975863353, 'Male', 'Kyi Myin Tine', '12/OKT(N)001234', 'U Nga Paw', '12/OKT(N)654321', 'Daw Yote Mar', '16/BBB(N)12345', 199, '234,Thingyinegon,Yayway,Insein', 'North Okkalapa', '2cst-8', 540, 'computer', 2080, 'UIT(COE)-not noob'),
(13, 'Zeya Min Maung', '7.11.1999', 'zeyaminmg@gmail.com', 94328745, 'Male', 'Yangon', '12/OKT(N)001234', 'U Nga Paw', '12/OKT(N)654321', 'Daw Yote Mar', '16/BBB(N)12345', 199, '234,Thingyinegon,Yayway,Insein', 'North Okkalapa', '2cst-8', 540, 'computer', 2080, 'UIT(COE)-not noob'),
(14, 'Aung Khant Thaw', '12.12.1999', 'akt@gmail.com', 94328745, 'Male', 'South Okkalapa', '12/OKT(N)001234', 'U Nga Paw', '12/OKT(N)654321', 'Daw Yote Mar', '16/BBB(N)12345', 199, '234,Thingyinegon,Yayway,Insein', 'North Okkalapa', '2cst-8', 540, 'computer', 2080, 'UIT(COE)-not noob'),
(15, 'Chan Myae Aung', '10.8.1999', 'chanmyae@gmail.com', 250488897, 'Male', 'Yangon', 'fwefw', 'fewwe', 'fwefew', 'fewfw', 'wfwe', 1234, 'fewfw', 'gerg', 'gregerg', 456, 'greg', 432, 'ferg'),
(16, 'Nilar Myint', '13.11.1999', 'rubymyint@gmail.com', 796458581, 'Female', 'Mingalar Taung Nyunt', '1234', 'U Mg', '1234', 'Daw Ma Ma', '567', 1234, 'Malaysia', 'China', '1234ff', 321, 'Eng', 2000, 'TTU'),
(17, 'Thae Hnin Su', '27.3.2000', 'thaehninsu@gmail.com', 420687921, 'Female', 'South Okkalapa', 'dewd', 'dwed', 'dwd', 'dwd', 'dww', 1234, 'wdwd', 'fef', 'fere', 234, 'fref', 123, 'fef'),
(18, 'Myat Thiri Khaing', '13.1.2000', 'myatthiri@gmail.com', 796854141, 'Female', 'Hlaing', 'wwr', 'rgr', 'grg', 'gee', 'ge', 666, 'ge', 'gerge', 'gergre', 666, 'fere', 34, 'fwer'),
(19, 'Thiri Wah Wah Thein', '10.6.2000', 'thiriwahwahthein@gmail.com', 2147483647, 'Female', 'Kamaryut', 'fef', 'fewfw', 'fewfewf', 'fweewf', 'weff', 1234, 'fweew', 'ger', 'ferge', 432, 'effef', 1999, 'rgrgr'),
(20, 'Eain Nyein Kyi', '5.7.2000', 'eainnyeinkyi@gmail.com', 258968777, 'Female', 'Mingalardon', 'w3r3w', 'rrw3r', 'ewr', 'rer', 'rwr', 6666, 'rw3r', '4t4', 'te4t44t', 555, 'eret', 555, 'ete4');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
