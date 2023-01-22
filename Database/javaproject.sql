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

-- --------------------------------------------------------

--
-- Table structure for table `usedata`
--

CREATE TABLE IF NOT EXISTS `usedata` (
  `uid` int(200) NOT NULL AUTO_INCREMENT,
  `uname` longtext NOT NULL,
  `umark` int(200) NOT NULL,
  `ufield` longtext NOT NULL,
  `utotal` int(200) NOT NULL,
  `uadd` longtext NOT NULL,
  `uinfo` longtext NOT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `uid` (`uid`),
  UNIQUE KEY `uid_3` (`uid`),
  UNIQUE KEY `uid_5` (`uid`),
  KEY `uid_2` (`uid`),
  KEY `uid_4` (`uid`),
  KEY `uid_6` (`uid`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 ROW_FORMAT=REDUNDANT AUTO_INCREMENT=32 ;

--
-- Dumping data for table `usedata`
--

INSERT INTO `usedata` (`uid`, `uname`, `umark`, `ufield`, `utotal`, `uadd`, `uinfo`) VALUES
(1, 'University of Medicine 1, Yangon', 497, 'Medicine', 200, ' 1. Lanmadaw (Main),245 Myo Ma School Road 2. Pyay Road 3. Thaton Road', '\n\n	Established:  \n2 Feb 1927\n	\n	Coursework \n     First M.B.,B.S.		1 year\n		     Second M.B.,B.S.		1.5 year\n		     Third M.B.,B.S.		1 year\n		     Final M.B.,B.S. (Part I)            	1 year\n		     Final M.B.,B.S. (Part II)   	1.5 year\n		     House Surgeon		1 year\n		     ___________________________________\n		     TOTAL			7 years\n	\n	Subject:\n		1.First year\n•	Myanmarsar\n•	English\n•	Mathematics & statistics\n•	Physics\n•	Chemistry\n•	Botany\n•	Zoology\n		2.Second year\n•	Anatomy\n•	Physiology\n•	Biochemistry\n\n\n		3.Third year\n•	General pathology\n•	Microbiology\n•	Pharmacology\n	Students are also posted for 18 weeks each to the medical and surgical wards for clinical training.\n\n		4.Final year (Part I)\n•	Forensic Medicine\n•	Preventive and Social Medicine \n(with three weeks residential field training in the rural areas)\n•	Systemic Pathology and Haematology\n	Students attend lectures & clinics in Medicine, Surgery, Child health, Obstetrics & gynecology, and are posted to the various teaching hospitals, including Urban Health facilities as part of Preventive and Social Medicine teaching.\n\n		5.Final year (Part II)\n•	Child Health\n•	Medicine\n•	Obstetrics & Gynaecology\n•	Surgery\n	Students study the allied specialties, namely, eye, ear, nose & throat diseases, urology, neurology, tuberculosis,  venereal diseases, orthopaedics and traumatology, skin diseases, mental health and psychiatry, orthomaxillo-facial  surgery, radiology, radiotherapy, nuclear medicine, anesthesiology, thoracic surgery, and paediatric surgery.\n\n	A summative examination is held at the end of the Final M.B., B.S.Part II course. Problem Based Learning (PBL), Community Based Learning (CBL) and Behavioural Science will be incorporated, as relevant, in the M.B.B.S.  course.\n\n		6.House surgeon training\n	All students, after successful completion of Final Part II examination, are continued to train hands-on for 	period of one year as house surgeons in the recognized Teaching Hospitals in Yangon and / or the State and Division Hospitals. Training Periods are as following: -\n\n			Subject Duration\n				Child Health			  	2 ½ months\n				Community Medicine		  	2 weeks\n				Medicine (including Psychiatry) 	  	3 months\n				Obstetrics & Gynaecology	  	3 months\n				Surgery(including Traumatology)   	3 months\n	Only after completion of house-surgeonship M.B., B.S. Degree is offered to the students. Before 1997, the degree was conferred upon completion of the second part of the final year.\n	Website Links--www.um1ygn.edu.mm\n'),
(2, 'University of Medicine(2),Yangon', 493, 'Medicine', 0, 'Khaymarthi Road,NorthOakkalapa Township,Yangon', 'marks: boy 493, girls 507\n	Established: \n15 July 1963\n			Coursework:\n First M.B.B.S.			1 year\n		   	 Second M.B.B.S.		1.5 year\n		     	 Third M.B.B.S.			1 year\n		    	 Final M.B.B.S. Part I		1 year\n		     	 Final M.B.B.S. Part II		1.5 year\n		     	 House Surgeon			1 year\n		________________________________________________\nTOTAL			7 years\n	Activities: Dhamma Tabin, TOT workshops on Student Centered learning, Skill Lab Training, Radio Protocol, knowledge sharing, lunch time talk, fresher welcome, delegation on the university, htamanae pwal.\n	Subjects:\n		1.First year\n•	Myanmar\n•	English\n•	Mathematics & statistics\n•	Physics\n•	Chemistry\n•	Botany\n•	Zoology\n		2.Second year\n•	Anatomy\n•	Physiology\n•	Biochemistry\n		3.Third year\n•	General pathology\n•	Microbiology\n•	Pharmacology\n	Students are also posted for 18 weeks each to the medical and surgical wards for clinical training.\n\n		4.Final year (Part I)\n•	Forensic Medicine\n•	Preventive and Social Medicine \n(with three weeks residential field training in the rural areas).\n•	Systemic Pathology and Haematology\n	Students attend lectures & clinics in Medicine, Surgery, Child health, Obstetrics & gynecology, and are posted to the various teaching hospitals, including Urban Health facilities as part of Preventive and Social Medicine teaching.\n\n		5.Final year (Part II)\n•	Child Health\n•	Medicine\n•	Obstetrics & Gynaecology\n•	Surgery\n	Students study the allied specialties, namely, eye, ear, nose & throat diseases, urology, neurology, tuberculosis, venereal diseases, orthopaedics and traumatology, skin diseases, mental health and psychiatry, orthomaxillo-facial surgery, radiology, radiotherapy, nuclear medicine, anesthesiology, thoracic surgery, and paediatric surgery.\n\n	A summative examination is held at the end of the Final M.B., B.S.Part II course. Problem Based Learning (PBL), Community Based Learning (CBL) and Behavioural Science will be incorporated, as relevant, in the M.B., B.S. course.\n\n		6.House surgeon training\n	All students, after successful completion of Final Part II examination, are continued to train hands-on for period of one year as house surgeons in the recognized Teaching Hospitals in Yangon and / or the State and Division Hospitals. Training Periods are as following: -\n\n			Subject Duration\n				Child Health				2 ½ months\n				Community Medicine			2 weeks\n				Medicine (including Psychiatry)		3 months\n				Obstetrics & Gynaecology		3 months\n				Surgery(including Traumatology)	3 months\n	Only after completion of house-surgeonship M.B., B.S. Degree is offered to the students. Before 1997, the degree was conferred upon completion of the second part of the final year.\n	-Website Link: www.um2ygn.gov.mm\n\n'),
(3, 'University of Medicine, Mandalay', 493, 'Medicine', 0, '30th st, between 73rd and 74th st, Mandalay', '\n\n	Established:  \n2 Feb 1927\n	\n	Coursework \n     First M.B.,B.S.		1 year\n		     Second M.B.,B.S.		1.5 year\n		     Third M.B.,B.S.		1 year\n		     Final M.B.,B.S. (Part I)            	1 year\n		     Final M.B.,B.S. (Part II)   	1.5 year\n		     House Surgeon		1 year\n		     ___________________________________\n		     TOTAL			7 years\n	\n	Subject:\n		1.First year\n•	Myanmarsar\n•	English\n•	Mathematics & statistics\n•	Physics\n•	Chemistry\n•	Botany\n•	Zoology\n		2.Second year\n•	Anatomy\n•	Physiology\n•	Biochemistry\n\n\n		3.Third year\n•	General pathology\n•	Microbiology\n•	Pharmacology\n	Students are also posted for 18 weeks each to the medical and surgical wards for clinical training.\n\n		4.Final year (Part I)\n•	Forensic Medicine\n•	Preventive and Social Medicine \n(with three weeks residential field training in the rural areas)\n•	Systemic Pathology and Haematology\n	Students attend lectures & clinics in Medicine, Surgery, Child health, Obstetrics & gynecology, and are posted to the various teaching hospitals, including Urban Health facilities as part of Preventive and Social Medicine teaching.\n\n		5.Final year (Part II)\n•	Child Health\n•	Medicine\n•	Obstetrics & Gynaecology\n•	Surgery\n	Students study the allied specialties, namely, eye, ear, nose & throat diseases, urology, neurology, tuberculosis,  venereal diseases, orthopaedics and traumatology, skin diseases, mental health and psychiatry, orthomaxillo-facial  surgery, radiology, radiotherapy, nuclear medicine, anesthesiology, thoracic surgery, and paediatric surgery.\n\n	A summative examination is held at the end of the Final M.B., B.S.Part II course. Problem Based Learning (PBL), Community Based Learning (CBL) and Behavioural Science will be incorporated, as relevant, in the M.B.B.S.  course.\n\n		6.House surgeon training\n	All students, after successful completion of Final Part II examination, are continued to train hands-on for 	period of one year as house surgeons in the recognized Teaching Hospitals in Yangon and / or the State and Division Hospitals. Training Periods are as following: -\n\n			Subject Duration\n				Child Health			  	2 ½ months\n				Community Medicine		  	2 weeks\n				Medicine (including Psychiatry) 	  	3 months\n				Obstetrics & Gynaecology	  	3 months\n				Surgery(including Traumatology)   	3 months\n	Only after completion of house-surgeonship M.B., B.S. Degree is offered to the students. Before 1997, the degree was conferred upon completion of the second part of the final year.\n	Website Links--www.ummdy.edu.mm\n'),
(5, 'University of Medicine, Magway\r\n', 493, 'Medicine', 0, 'Natmauk Road, 7th Mile, Pyaye, Magway, Burma', 'marks: boy 493, girls 507\n	Established: \n22 May 2011\n			Coursework:\n First M.B.B.S.			1 year\n		   	 Second M.B.B.S.		1.5 year\n		     	 Third M.B.B.S.			1 year\n		    	 Final M.B.B.S. Part I		1 year\n		     	 Final M.B.B.S. Part II		1.5 year\n		     	 House Surgeon			1 year\n		________________________________________________\nTOTAL			7 years\n	Activities: Dhamma Tabin, TOT workshops on Student Centered learning, Skill Lab Training, Radio Protocol, knowledge sharing, lunch time talk, fresher welcome, delegation on the university, htamanae pwal.\n	Subjects:\n		1.First year\n•	Myanmar\n•	English\n•	Mathematics & statistics\n•	Physics\n•	Chemistry\n•	Botany\n•	Zoology\n		2.Second year\n•	Anatomy\n•	Physiology\n•	Biochemistry\n		3.Third year\n•	General pathology\n•	Microbiology\n•	Pharmacology\n	Students are also posted for 18 weeks each to the medical and surgical wards for clinical training.\n\n		4.Final year (Part I)\n•	Forensic Medicine\n•	Preventive and Social Medicine \n(with three weeks residential field training in the rural areas).\n•	Systemic Pathology and Haematology\n	Students attend lectures & clinics in Medicine, Surgery, Child health, Obstetrics & gynecology, and are posted to the various teaching hospitals, including Urban Health facilities as part of Preventive and Social Medicine teaching.\n\n		5.Final year (Part II)\n•	Child Health\n•	Medicine\n•	Obstetrics & Gynaecology\n•	Surgery\n	Students study the allied specialties, namely, eye, ear, nose & throat diseases, urology, neurology, tuberculosis, venereal diseases, orthopaedics and traumatology, skin diseases, mental health and psychiatry, orthomaxillo-facial surgery, radiology, radiotherapy, nuclear medicine, anesthesiology, thoracic surgery, and paediatric surgery.\n\n	A summative examination is held at the end of the Final M.B., B.S.Part II course. Problem Based Learning (PBL), Community Based Learning (CBL) and Behavioural Science will be incorporated, as relevant, in the M.B., B.S. course.\n\n		6.House surgeon training\n	All students, after successful completion of Final Part II examination, are continued to train hands-on for period of one year as house surgeons in the recognized Teaching Hospitals in Yangon and / or the State and Division Hospitals. Training Periods are as following: -\n\n			Subject Duration\n				Child Health				2 ½ months\n				Community Medicine			2 weeks\n				Medicine (including Psychiatry)		3 months\n				Obstetrics & Gynaecology		3 months\n				Surgery(including Traumatology)	3 months\n	Only after completion of house-surgeonship M.B., B.S. Degree is offered to the students. Before 1997, the degree was conferred upon completion of the second part of the final year.\n	-Website Link: www\n'),
(6, 'University of Dental', 479, 'Medicine', 0, 'Than Thu Mar Road, Thingangyun, Yangon', '\n	Marks: \n			boys 479, girls 499\n	Establised: \n			Since 1964..\n	\n	\n	Coursework: \n		     First B.D.S.		1 year\n		     Second B.D.S.	1 year\n		     Third B.D.S.		1 year\n		     Fourth B.D.S.		1 year\n		     Final B.D.S.		1 year\n		     House Surgeon	1 year\n   		_______________________________\n			TOTAL		6 years\n	-Activities: \n	Educational talks, workshops, donations, freshers'' welcome, CBCT training\n	Subjects: \n      			First B.D.S.\n•	Myanmar\n•	English\n•	Mathematics and Statistics\n•	Physics\n•	Chemistry\n•	Biology, (Botany and Zoology)\n			Second B.D.S.\n•	Anatomy\n•	Physiology\n•	Biochemistry\n•	Oral and Biological Science\n				Third B.D.S.\n•	General pathology\n•	Microbiology\n•	Pharmacology and Dental Therapeutics\n•	Basic Prosthodontics and Dental Materials\n•	Conservative Dentistry\n•	Fourth B.D.S. Part I\n•	Preventive and Social Medicine, Preventive and Community Dentistry, Periodontology\n•	General Medicine\n•	General Surgery\n•	Oral Medicine, Oral and Maxillofacial Surgery\n•	Orthodontics and Paedodontics\nFinal B.D.S. Part II\n	All students, after a successful completion of Final B.D.S. Examination, continue on to hands-on training for a period of 5 months as house surgeons in the recognized teaching hospitals. Only after the completion of house-surgeonship, is the student awarded the B.D.S. degree.\nWebsite link- www.udmyangon.edu.mm\n'),
(7, 'University of Dental Mandalay', 500, 'Medicine', 0, '62nd street, Myo Thit(1)Ward, Chan Mya Thazi Township, Mandalay', '\n	Marks: \nboys 479, girls 499\n	Established: Since 1998..\n	Activities: \n	Hta Ma Nae Pwal, football competitions, TPPD Programme, Clinical Observation, Dhamma Tabin, Bright Smile Band, Educational Seminars, Freshers'' Welcome, Waso Robe Offering Ceremony, Khatain Tinkan Kat Pwal, Phatan Pwal\n	-Male 479-492, Female 499-506\n	Coursework: \n		     First B.D.S.		1 year\n		     Second B.D.S.	1 year\n		     Third B.D.S.		1 year\n		     Fourth B.D.S.		1 year\n		     Final B.D.S.		1 year\n		     House Surgeon	1 year\n   		_______________________________\n			TOTAL		6 years\nSubjects: \n      			First B.D.S.\n•	Myanmar\n•	English\n•	Mathematics and Statistics\n•	Physics\n•	Chemistry\n•	Biology, (Botany and Zoology)\n			Second B.D.S.\n•	Anatomy\n•	Physiology\n•	Biochemistry\n•	Oral and Biological Science\n				Third B.D.S.\n•	General pathology\n•	Microbiology\n•	Pharmacology and Dental Therapeutics\n•	Basic Prosthodontics and Dental Materials\n•	Conservative Dentistry\n•	Fourth B.D.S. Part I\n•	Preventive and Social Medicine, Preventive and Community Dentistry, Periodontology\n•	General Medicine\n•	General Surgery\n•	Oral Medicine, Oral and Maxillofacial Surgery\n•	Orthodontics and Paedodontics\nFinal B.D.S. Part II\n	All students, after a successful completion of Final B.D.S. Examination, continue on to hands-on training for a period of 5 months as house surgeons in the recognized teaching hospitals. Only after the completion of house-surgeonship, is the student awarded the B.D.S. degree.\nWebsite Link: www.udmmandalay.gov.mm\n\n'),
(8, 'University of Pharmacy Yangon', 457, 'Medicine', 0, ' North Okkalapa 11031, Yangon Division, Myanmar', 'Established:\n      Since 1992\n	Marks: \n              457\n	Programs:\n\n                       	1. Pharmaceutics\n			2. Pharmaceutical Chemistry\n			3. Pharmacology\n			4. Pharmacognosy\n\n	Subjects:   \n\n1st Supportive Subjects(7)		\n•	Myanmar		       			\n•	English						\n•	Chemistry		      	\n•	Zoology			      		       \n•	Botany				\n•	Mathematics			\n•	Behavioral Science\n2nd  Supportive Subjects(6)\n•	Anatomy\n•	Physiology\n•	Biochemistry\n•	Pathology\n•	Microbiology\n•	Preventive and social medicine\n Major Subjects (4)\n•	Pharmacology\n•	Pharmaceutics\n•	Pharmaceutical Chemistry\n•	 Pharmacognosy\n\n\n'),
(9, 'University of Pharmacy, Mandalay', 457, 'Medicine', 0, 'Mandalay, Mandalay Division', '	Marks: 	457\n	Subjects:   \n\n1st Supportive Subjects(7)		\n•	Myanmar		       			\n•	English						\n•	Chemistry		      	\n•	Zoology			      		       \n•	Botany				\n•	Mathematics			\n•	Behavioral Science\n2nd  Supportive Subjects(6)\n•	Anatomy\n•	Physiology\n•	Biochemistry\n•	Pathology\n•	Microbiology\n•	Preventive and social medicine\n Major Subjects (4)\n•	Pharmacology\n•	Pharmaceutics\n•	Pharmaceutical Chemistry\n•	 Pharmacognosy\n	Activities:  		Khatainn, Freshers'' Welcome, HtaMaNae Pwal\n	Website Link: www.uopmdy.gov.mm\n'),
(10, 'University of Medical Technology,Yangon', 457, 'Medicine', 0, '', 'Established: 	1993\n	Marks:		452\n	\n	Programs: 	1. Radiotheraphy\n			2. Medical Imaging Technology\n			3. Medical Laboratory	\n			4. Physiotheraphy\n Website Link: www.umty.gov.mm\n'),
(11, 'University of Medical Technology, Mandalay', 452, 'Medicine', 0, 'Yakin Hill Road, 19th Street, Patheingyi Township; Mandalay', 'Established: 	1999\n	Marks: 		452\n		Each program accepts 60 students per year\n		1. Department of Medical Laboratory Technology\n		2. Department of Physiotheraphy	\n		3. Department of Medical Imaging Technology\n	Activities: \nFreshers'' Welcome, Convocation, Talks, Conferences, Sport events\nWebsite Link: www.umtmandalay.gov.mm\n\n'),
(12, 'University of Nursing,Yangon', 437, 'Medicine', 0, '677-709, Bogyoke Aung San Road, Yangon', 'Boy 10%, Girl 90%\n	Marks: 	boys 437, girls 453\n	Established: 1986\n	Location:	 677-709, Bogyoke Aung San Road, Yangon\n	Website Link:	www.uonygn.gov.mm\n	Activities: 	cultural exchange, workshops, educational talks, \n	\n'),
(13, 'University of Nursing, Mandalay', 437, 'Medicine', 0, '62nd and 63rd street, Chanmyathazi Road, Mandalay', 'Boy 10%, Girl 90%\n	Established: 1998\n	Marks: 	boys 437, girls 453\n	Location:	 62nd and 63rd street, Chanmyathazi Road, Mandalay\n	Website Link:	www.uonmdy.gov.mm\n'),
(14, 'University of Traditional Medicine, Mandalay 	', 405, 'Medicine', 0, 'Aung myethazan, Mandalay', 'Boy 50%, girl 50%\n	Marks: 	boys 405, girls 412\n	Established: 9 January 2002\n•	First year: 	literature and basic science subjects such as Burmese, English, Pali and Sanskrit (Oriental Studies), physics, chemistry, zoology, botany, behavioral science and Pharmacology(TM), computer science.\n•	Second year: Basic Medical Sciences (Western) subjects—anatomy, physiology, biochemistry, pathology and microbiology, and Basic Medical Science (Traditional) subjects—anatomy, physiology, pharmacology, medicinal plants, principles of traditional medicine, pharmacognosy and traditional clinical methods.\n•	Third year: 	Traditional clinical subjects such as internal medicine, gynecology, child health, ulcers and sores, physical medicine, orthopedics, panchakarma and Chinese acupuncture, and Western pharmacology, preventive and social medicine and clinical methods.\n•	Fourth year: Continuation of traditional clinical subjects plus additional subjects like research methodology and forensic medicine.\n•	Fifth year: 	Internship\n'),
(15, 'Yangon Technological University', 503, 'Technology', 0, '', 'boy 60%, girl 40%\n	Marks : 	boy 503,girl 503\n	Established: 1924		\n	Programs: 	1. 6 years B.E. and B.Arch\n		      	2 years M.E. and M.Arch\n		  	 2. Ph.D 3 to 5 years\nMajor Subject:\n	1. Architecture\n	 2. Civil Engineering\n	 3. Chemical Engineering\n	 4. Electrical Engineering\n	 5. Electronic Engineering\n	 6. Mechanical Engineering\n	 7. Mechatronic Engineering\n	 8. Mining\n	 9. Metallurgical Engineering and Materials Science\n	 10. Petroleum Engineering\n	 11. Textile Engineering\n	 12. Computer of Engineering and Information Technology\nWebsite Link:www.ytu.edu.mm\n'),
(16, 'Mandalay Technological University', 492, 'Technology', 300, 'Patheingyi, Mandalay', 'Establised: 	1 October 1991\n	Marks: 	492\n	Intake:	 around 300 per year\nMajor Subject:\n	1. Architecture\n	 2. Civil Engineering\n	 3. Chemical Engineering\n	 4. Electrical Engineering\n	 5. Electronic Engineering\n	 6. Mechanical Engineering\n	 7. Mechatronic Engineering\n	 8. Mining\n	 9. Metallurgical Engineering and Materials Science\n	 10. Petroleum Engineering\n	 11. Textile Engineering\n	 12. Computer of Engineering and Information Technology\n	\n'),
(17, 'Thanlyin Technological University', 447, 'Technology', 0, 'Thanlyin 11292, Yangon division', 'Establised: 		2007\n	         Marks: 		447\n    Major Subject:	\n1.	Architecture\n2.	Civil Engineering\n3.	Chemical Engineering\n4.	Electrical Engineering\n5.	Electronic Engineering\n6.	Mechanical Engineering\n7.	Mechatronic Engineering\n8.	Mining\n9.	Metallurgical Engineering and Materials Science\n10.	Petroleum Engineering\n11.	Textile Engineering\n12.	Computer of Engineering and Information Technology\nWebsite Link:	www.ttu.edu.mm\n'),
(18, 'University of Computer Studies Yangon', 430, 'Computer Science', 0, 'No.4, Main Road, Shwe Pyi Thar, Yangon', '  Established:	 1988\n\nTotal marks	:	 440 (at least)\n                     Majors:\n• 	Software Engineering\n•	Business Information Systems\n•	High Performance Computing\n•	Knowledge Engineering \n•	Embedded System\n•	Communication and Networking\n•	Computer Systems\n\n      Duration: 	5 years\n       Degrees: \nDoctorate Degree\n1.	Ph.D (Information Technology)\nMaster Degree\n1.	M.C.Sc (Computer Science)\n2.	M.C.Tech (Computer Technology)\nBachelor Degreee\n1.	B.C.Sc (Bachelor of Computer Science)\n2.	B.C.Tech (Bachelor of Computer Technology)\n\nWebsite: http://www.ucsy.edu.mm/\n\n'),
(19, 'University of Computer Studies, Mandalay', 420, 'Computer Science', 0, 'PatheinGyi, Mandalay', 'Established : 	1997\nTotal marks:	 424 (at least)\nMajors:\n1.	Software Engineering\n2.	Business Information Systems\n3.	High Performance Computing\n4.	Knowledge Engineering \n5.	Embedded System\n6.	Communication and Networking\n7.	Computer Systems\nDuration:	 5 years\nDegrees: \nDoctorate Degree\n1.	Ph.D (Information Technology) \nMaster Degree\n1.	M.C.Sc (Computer Science)\n2.	M.C.Tech (Computer Technology)\nBachelor Degreee\n1.	B.C.Sc (Bachelor of Computer Science)\n2.	B.C.Tech (Bachelor of Computer Technology)\nWebsite: http://www.ucsym.edu.mm\n\n\n'),
(20, 'University of Yangon', 420, 'Education', 0, 'Pyay Road, Hledan, Yangon', ''),
(21, 'University of Dagon', 360, 'Education', 0, '', 'Majors: \n1.	Myanmar (400)\n2.	English (450)\n3.	Geography  \n4.	History (380)\n5.	Anthropology ()\n6.	Psychology\n7.	Law (429)\n8.	Archaeology (380)\n9.	Chemistry (416)\n10.	Physics (419)\n11.	Mathematics (413)\n12.	Zoology (401)\n13.	Botany (400)\n14.	Geology (401)\n15.	Industrial Chemistry (430)\n16.	Computer Science (420)\n17.	Political Science (420)\n18.	Library and Information Studies\n19.	International Relationships (470)\n20.	Oriental Studies\n21.	Philosophy (380)\nDuration:	 4 years\n'),
(22, 'Yangon Institute of Economy(COE)', 450, 'Business', 0, 'Parami Road, Hlaing Campus', 'Established : 	1924\nTotal marks: 	477\nMajors: \n1.	Accounting\n2.	Business Administration Commerce\n3.	Development Studies\n4.	Economics \n5.	Population Stu\n6.	Public Administration \n7.	Statistics\nDuration: 		4 years\nWebsite: http://www.facebook.com//yuecocoe\n'),
(23, 'University of Economy', 370, 'Business', 0, 'No(2) Road,YwarTharGyi', 'Established: 	1969\nTotal marks: 	419\nMajors: \n1.	Economics, \n2.	Applied Economics,\n3.	Statistics, Commerce, \n4.	Management Studies.\nDuration: 		4 years\nWebsite: http://yueco.edu.mm\n\n'),
(24, 'Yangon Institute of Education', 460, 'Education', 0, 'Pyay Road opposite MRTV', 'Total marks: 	448, 478\nDuration: 		5 years\nEstablished :	 1931\nCourses:\n1.B. Ed. Five-year Course (on campus pre-service teacher training)\n2. B.Ed. Two-year Course (on – campus pre- service teacher training)\n3. B.Ed. Two-year Correspondence Course (in –service teacher training)\n4.M.Ed Two-year Course\n5. M.A. (Teaching of English as a foreign Language)\n6. Ph.D. (Education)\nWebsite: www.yuoe.edu.mm\n'),
(25, 'University of Foreign Languages Yangon', 450, 'Languages', 0, '119-131 University Avenue, Kamayut', 'Majors: \n1.	English (475)\n2.	German (432)\n3.	Chinese (445)\n4.	France (439)\n5.	Korean (443)\n6.	Japanese (457)\n7.	Russia (420)\n8.	Thailand (422)\nDuration: 		4 years\nEstablished: 	1964\nWebsite: www.yufl.edu.mm\n'),
(26, 'University of Foreign Languages, Mandalay', 440, 'Languages', 0, '62nd Street, between 22nd and 23rd Streets, Aungmyethazan Township, Mandalay', 'Majors:\n1.	English,\n2.	Chinese,\n3.	Japanese,\n4.	French,\n5.	Korean,\n6.	German,\n7.	Russian,\n8.	Thai, and\n9.	Myanmar for international students.\n\nDuration:	 4 years\nEstablished: 1997\n'),
(27, 'National Management Degree College', 480, 'Business', 0, 'Merchant Road, Botahtaung', 'Majors:\n1.	Business Management\n2.	English for Professional Purposes\n3.	Journalism\n4.	Tourism\nDuration: 	4 years\nEstablished: 2004\nWebsite: http://www.facebook.com/mmdc\n'),
(28, 'Yatanarbon Cyber City', 450, 'Technology', 0, 'Nay Pyi Taw', 'Total marks: 	460, 450\nMajors: \n1.	Information Science and Technology\n2.	Computer Engineering \n3.	Electronic Engineering\n4.	Mechanical Precision and Automation\n5.	Metallurgical Engineering\nDuration: 		6 years\nEstablished: 	2010\nWebsite: http://utycc.edu.mm\n'),
(29, 'Myanmar Institute of Information Technology', 460, 'Computer Science', 0, 'ChanMyathazi, Mandalay', '*Entrance exam\nMajors:\n1.	Computer Science and Engineering\n2.	Electronics Communication and Engineering\nWebsite: www.miit.edu.mm\n'),
(30, 'University of Information Technology(UIT)', 487, 'Computer Science', 200, 'Parami Road, Hlaing Campus, Yangon', 'Established : 	2012\nTotal marks: 	487 (at least)\nMajors:\n1.	Software Engineering\n2.	Business Information Systems\n3.	High Performance Computing\n4.	Knowledge Engineering \n5.	Embedded System\n6.	Communication and Networking\n7.	Computer Systems\nDuration: 		5 years\nWebsite: http://www.uit.edu.mm/\n'),
(31, 'University', 500, 'Technology', 600, 'Hlainh', 'dslkgj;asjg;klsd');

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
