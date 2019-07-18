-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 18, 2019 at 09:29 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `satria`
--

-- --------------------------------------------------------

--
-- Table structure for table `penumpang`
--

CREATE TABLE `penumpang` (
  `id_penumpang` bigint(20) NOT NULL DEFAULT 0,
  `nama` varchar(30) NOT NULL DEFAULT '',
  `no_telp` varchar(20) NOT NULL DEFAULT '0',
  `alamat` varchar(100) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penumpang`
--

INSERT INTO `penumpang` (`id_penumpang`, `nama`, `no_telp`, `alamat`) VALUES
(1, 'Lukman', '0812341234213', 'Jl.cisaranten'),
(2, 'Akbar', '0918234483343', 'Jl.Melawai'),
(3, 'Dewa Ngoman', '0900934483343', 'Jl.panglima polim');

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE `tiket` (
  `id` bigint(20) NOT NULL,
  `id_penumpang` bigint(20) NOT NULL DEFAULT 0,
  `id_travel` bigint(20) NOT NULL DEFAULT 0,
  `jadwal` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tiket`
--

INSERT INTO `tiket` (`id`, `id_penumpang`, `id_travel`, `jadwal`) VALUES
(1, 1, 1, '2017-10-20 10:00:00'),
(2, 2, 3, '2017-10-20 10:00:00'),
(3, 3, 2, '2017-10-20 10:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `travel`
--

CREATE TABLE `travel` (
  `id_travel` bigint(20) NOT NULL DEFAULT 0,
  `nama_supir` char(20) NOT NULL DEFAULT '',
  `no_telp` varchar(20) NOT NULL DEFAULT '0',
  `alamat` varchar(100) NOT NULL DEFAULT '',
  `no_polisi` varchar(20) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `travel`
--

INSERT INTO `travel` (`id_travel`, `nama_supir`, `no_telp`, `alamat`, `no_polisi`) VALUES
(1, 'Eko', '0813284343433', 'Jl.cisaranten', 'D 2524 ZZC'),
(2, 'Budi', '0918234483343', 'Jl.Melawai', 'B 4343 KDF'),
(3, 'Adi Putra', '0900934483343', 'Jl.panglima polim', 'B 2343 DKJ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `penumpang`
--
ALTER TABLE `penumpang`
  ADD PRIMARY KEY (`id_penumpang`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_penumpang` (`id_penumpang`),
  ADD KEY `fk_travel` (`id_travel`);

--
-- Indexes for table `travel`
--
ALTER TABLE `travel`
  ADD PRIMARY KEY (`id_travel`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tiket`
--
ALTER TABLE `tiket`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tiket`
--
ALTER TABLE `tiket`
  ADD CONSTRAINT `fk_penumpang` FOREIGN KEY (`id_penumpang`) REFERENCES `penumpang` (`id_penumpang`),
  ADD CONSTRAINT `fk_travel` FOREIGN KEY (`id_travel`) REFERENCES `travel` (`id_travel`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
