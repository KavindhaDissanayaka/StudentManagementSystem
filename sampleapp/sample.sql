-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2020 at 05:42 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

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
-- RELATIONSHIPS FOR TABLE `admin`:
--

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `addname`, `addnic`, `addemail`, `addpassword`, `addadd`, `addtell`) VALUES
(1, ' ytffgg', ' 345345', '123', '123', ' yttyt', ' 34345'),
(2, ' wasantha', ' 6878678', ' wasantha@gmail', 'wasantha123 ', ' negampaha', ' 0716662908'),
(3, 'sdf', '234', '1233', '1233', '', '234'),
(9, 'Roshini', 'FFffffffffff', 'F', 'F', 'F', 'F'),
(11, 'A.D.Peiris', '1234567V', 'aqw12@gmail.com', 'uio123', 'kaluthara,sri lanka', '0987667789'),
(12, 'kumara', '46764V', '@com', '123qwe', 'Galle', '09876534');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `id` int(11) NOT NULL,
  `course_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- RELATIONSHIPS FOR TABLE `course`:
--

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `course_name`) VALUES
(1, 'ICT'),
(2, 'MATHSsd'),
(3, 'Python'),
(4, 'sdf');

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE `exam` (
  `id` int(10) NOT NULL,
  `course_id` int(11) NOT NULL,
  `course_name` varchar(20) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- RELATIONSHIPS FOR TABLE `exam`:
--   `course_id`
--       `course` -> `id`
--

--
-- Dumping data for table `exam`
--

INSERT INTO `exam` (`id`, `course_id`, `course_name`, `date`) VALUES
(1, 2, 'MATHS', '2020-08-04'),
(2, 2, 'MATHS', '2020-08-06'),
(3, 1, 'ICT2', '2020-10-10');

-- --------------------------------------------------------

--
-- Table structure for table `spnote`
--

CREATE TABLE `spnote` (
  `No` int(10) NOT NULL,
  `Notice` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- RELATIONSHIPS FOR TABLE `spnote`:
--

--
-- Dumping data for table `spnote`
--

INSERT INTO `spnote` (`No`, `Notice`) VALUES
(1, ' check'),
(2, ' check 2'),
(3, ' a'),
(4, '123234'),
(5, 'No anyone'),
(6, 'qwe');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(4) NOT NULL,
  `arnumber` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `course_id` int(11) NOT NULL,
  `stemail` varchar(30) DEFAULT NULL,
  `stpassword` varchar(15) DEFAULT NULL,
  `tpnumber` int(12) NOT NULL,
  `stadd` varchar(50) DEFAULT NULL,
  `stdob` date DEFAULT NULL,
  `gender` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- RELATIONSHIPS FOR TABLE `student`:
--   `course_id`
--       `course` -> `id`
--

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `arnumber`, `name`, `course_id`, `stemail`, `stpassword`, `tpnumber`, `stadd`, `stdob`, `gender`) VALUES
(1, 92946, 'kavi', 1, NULL, NULL, 123456789, NULL, NULL, 'M'),
(2, 1234, 'ksd', 1, NULL, NULL, 11223344, NULL, NULL, 'M'),
(3, 92914, 'kavudu', 1, NULL, NULL, 712698828, NULL, NULL, 'M'),
(4, 76544, 'khgfdh', 1, NULL, NULL, 1233445, NULL, NULL, 'M'),
(5, 0, '', 1, '1AA', '2BB', 0, NULL, NULL, ''),
(6, 6677, 'KKSS', 1, NULL, NULL, 9900, NULL, NULL, 'F'),
(9, 92914, 'hansi', 1, ' zvczc', ' zxcxzc', 234, ' sdfdsf', '1998-05-10', 'F'),
(21, 92914, 'hansi', 1, ' zvczc', ' zxcxzc', 234, ' sdfdsf', '1998-05-10', 'F'),
(23, 1554, '2626', 1, 'sdfsdf', '23r32r', 23234, 'sdfsf', '1998-03-03', 'm'),
(26, 234, 'dilip', 3, '123', ' dilip123', 7156789, 'makiligasveva', '1998-04-23', 'M'),
(27, 82934, 'kjkljlkj', 1, 'com', '899899', 89898989, '89898', '1982-02-02', 'm'),
(28, 56981, 'A.S.Perera', 1, 'abc123@gmail.com', 'Abc123', 98123454, 'galle,colombo', '1987-09-02', 'f'),
(29, 90900, 'Kumara Silva', 1, 'kumara@gmail.com', 'kumara12', 1231231234, 'Gampaha', '2000-08-15', 'm');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `exam`
--
ALTER TABLE `exam`
  ADD PRIMARY KEY (`id`),
  ADD KEY `exam_fk` (`course_id`);

--
-- Indexes for table `spnote`
--
ALTER TABLE `spnote`
  ADD PRIMARY KEY (`No`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`),
  ADD KEY `course` (`course_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `exam`
--
ALTER TABLE `exam`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `spnote`
--
ALTER TABLE `spnote`
  MODIFY `No` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `exam`
--
ALTER TABLE `exam`
  ADD CONSTRAINT `exam_fk` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `course` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
