-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 18 Jul 2019 pada 12.12
-- Versi Server: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `soaltravel`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `penumpang`
--

CREATE TABLE IF NOT EXISTS `penumpang` (
`Id` bigint(20) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `no_telp` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data untuk tabel `penumpang`
--

INSERT INTO `penumpang` (`Id`, `nama`, `no_telp`, `alamat`) VALUES
(1, 'Lukman', '0812341234213', 'Jl.cisaranten'),
(2, 'Akbar', '0918234483343', 'Jl.Melawai'),
(3, 'Dewa Ngoman', '0900934483343', 'Jl.panglima polim'),
(4, 'Udin', '08988787565', 'Jl.Tebet');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tiket`
--

CREATE TABLE IF NOT EXISTS `tiket` (
`Id` bigint(20) NOT NULL,
  `id_penumpang` bigint(20) DEFAULT NULL,
  `id_travel` bigint(20) DEFAULT NULL,
  `jadwal` datetime DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data untuk tabel `tiket`
--

INSERT INTO `tiket` (`Id`, `id_penumpang`, `id_travel`, `jadwal`) VALUES
(1, 1, 1, '2017-10-20 10:00:00'),
(2, 2, 3, '2017-10-20 10:00:00'),
(3, 3, 2, '2017-10-20 10:00:00'),
(4, 4, 4, '2017-11-21 11:00:00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `travel`
--

CREATE TABLE IF NOT EXISTS `travel` (
`Id` bigint(20) NOT NULL,
  `nama_supir` varchar(255) DEFAULT NULL,
  `no_telp` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `no_polisi` varchar(255) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data untuk tabel `travel`
--

INSERT INTO `travel` (`Id`, `nama_supir`, `no_telp`, `alamat`, `no_polisi`) VALUES
(1, 'Eko', '0813284343433', 'Jl.cisaraten', 'D 2524 ZZC'),
(2, 'Budi', '0918234483343', 'Jl.Melawai', 'B 4343 KDF'),
(3, 'Adi Putra', '09009344833', 'Jl. panglima polim', 'B 2343 DKJ'),
(4, 'Ujang', '098976763421', 'Jl.Cawang', 'B 7646 JDK'),
(5, 'Jajang', '0985342876', 'Jl.Depok', 'B 5656 JEE');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `penumpang`
--
ALTER TABLE `penumpang`
 ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
 ADD PRIMARY KEY (`Id`), ADD KEY `fk_penumpang` (`id_penumpang`), ADD KEY `fk_idtravel` (`id_travel`);

--
-- Indexes for table `travel`
--
ALTER TABLE `travel`
 ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `penumpang`
--
ALTER TABLE `penumpang`
MODIFY `Id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tiket`
--
ALTER TABLE `tiket`
MODIFY `Id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `travel`
--
ALTER TABLE `travel`
MODIFY `Id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tiket`
--
ALTER TABLE `tiket`
ADD CONSTRAINT `fk_idtravel` FOREIGN KEY (`id_travel`) REFERENCES `travel` (`Id`),
ADD CONSTRAINT `fk_penumpang` FOREIGN KEY (`id_penumpang`) REFERENCES `penumpang` (`Id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
