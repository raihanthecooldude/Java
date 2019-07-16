-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 09, 2017 at 08:29 AM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aiub`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `UserId` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `UserType` int(20) NOT NULL,
  `Name` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UserId`, `Password`, `UserType`, `Name`) VALUES
('16-32200-2', 'nashif', 1, 'Nashif Iftekhar'),
('16-32600-2', 'anika', 1, 'Anika Ahmed'),
('1601-1675-2', 'ooad', 2, 'Victor Stany Rozario'),
('1509-1661-2', 'algo', 2, 'Mir Riyanul Islam'),
('1701-1751-2', 'java', 2, 'Mohaimen Bin Noor'),
('1509-1659-2', 'coa', 2, 'Md. Hasibul Hasan'),
('1009-1113-2', 'database', 2, 'Rezwan Ahmed'),
('16-32123-2', 'rashed', 1, 'Rashedul Alam'),
('1000-1001-3', 'admin1', 3, 'Aegon Targarian'),
('1000-1002-3', 'admin2', 3, 'Brandon Stark');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD UNIQUE KEY `UserId` (`UserId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
