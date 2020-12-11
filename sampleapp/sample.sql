-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2020 at 03:44 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sample`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(10) NOT NULL,
  `addname` varchar(50) NOT NULL,
  `addnic` varchar(15) DEFAULT NULL,
  `addemail` varchar(30) NOT NULL,
  `addpassword` varchar(15) NOT NULL,
  `addadd` varchar(50) NOT NULL,
  `addtell` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `addname`, `addnic`, `addemail`, `addpassword`, `addadd`, `addtell`) VALUES
(1, ' ytffgg', ' 345345', ' weferg', ' thrth', ' yttyt', ' 34345'),
(2, ' wasantha', ' 6878678', ' wasantha@gmail', 'wasantha123 ', ' negampaha', ' 0716662908');

-- --------------------------------------------------------

--
-- Table structure for table `spnote`
--

CREATE TABLE `spnote` (
  `No` int(10) NOT NULL,
  `Notice` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `spnote`
--

INSERT INTO `spnote` (`No`, `Notice`) VALUES
(1, ' check');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(4) NOT NULL,
  `arnumber` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `stemail` varchar(30) DEFAULT NULL,
  `stpassword` varchar(15) DEFAULT NULL,
  `tpnumber` int(12) NOT NULL,
  `stadd` varchar(50) DEFAULT NULL,
  `stdob` date DEFAULT NULL,
  `gender` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `arnumber`, `name`, `stemail`, `stpassword`, `tpnumber`, `stadd`, `stdob`, `gender`) VALUES
(1, 92946, 'kavi', NULL, NULL, 123456789, NULL, NULL, 'M'),
(2, 1234, 'ksd', NULL, NULL, 11223344, NULL, NULL, 'M'),
(3, 92914, 'kavudu', NULL, NULL, 712698828, NULL, NULL, 'M'),
(4, 76544, 'khgfdh', NULL, NULL, 1233445, NULL, NULL, 'M'),
(5, 0, '', '1AA', '2BB', 0, NULL, NULL, ''),
(6, 6677, 'KKSS', NULL, NULL, 9900, NULL, NULL, 'F'),
(7, 93114, 'sarath', ' sara@gmail', ' sara123', 7712345, ' radgaliyadhdha.uvaparanagama', '1998-12-03', 'F'),
(8, 923333, 'dilip', ' dilip@gmail', ' dilip123', 7156789, 'makiligasveva', '1998-04-23', 'M'),
(9, 92914, 'hansi', ' zvczc', ' zxcxzc', 234, ' sdf', '1998-05-10', 'F'),
(11, 234, 'dffg', ' zvczc', ' zxcxzc', 234, ' sdf', '1998-05-10', 'F'),
(12, 93114, 'sarath', ' sara@gmail', ' sara123', 7712345, ' radgaliyasvs', '1998-12-03', 'M'),
(13, 923333, 'dilip', ' dilip@gmail', ' dilip123', 7156789, ' yatiyana,pahala', '1998-04-23', 'M'),
(15, 94333, 'mahes', ' mahes@gmail.com', ' mahes1234', 719998883, ' amilagama', '1996-03-14', 'M'),
(16, 45, 'Bhanuka', 'banu@gmail', 'banu123', 81343657, 'tokiyo', '1995-03-11', 'M'),
(17, 98777, 'Amali', 'ama@gmail', 'ama123', 99090999, 'colombo', '1998-04-23', 'F');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `spnote`
--
ALTER TABLE `spnote`
  ADD PRIMARY KEY (`No`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `spnote`
--
ALTER TABLE `spnote`
  MODIFY `No` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
