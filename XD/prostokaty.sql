-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 24 Mar 2021, 18:58
-- Wersja serwera: 10.1.36-MariaDB
-- Wersja PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `figury`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `prostokaty`
--

CREATE TABLE `prostokaty` (
  `id_figury` int(11) NOT NULL,
  `boka` int(11) NOT NULL,
  `bokb` int(11) NOT NULL,
  `przekatna` varchar(255) NOT NULL,
  `pole` varchar(255) NOT NULL,
  `obwod` varchar(255) NOT NULL,
  `czas` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `prostokaty`
--

INSERT INTO `prostokaty` (`id_figury`, `boka`, `bokb`, `przekatna`, `pole`, `obwod`, `czas`) VALUES
(1, 25, 25, '35.35533905932738', '625.0', '100.0', '16:31:09'),
(2, 25, 25, '35.35533905932738', '625.0', '100.0', '16:35:45'),
(3, 5, 10, '11.180339887498949', '50.0', '30.0', '16:52:12'),
(4, 20, 20, '28.284271247461902', '400.0', '80.0', '17:01:55'),
(5, 20, 20, '28.284271247461902', '400.0', '80.0', '18:22:19'),
(6, 10, 55, '55.90169943749474', '550.0', '130.0', '18:23:50'),
(7, 20, 20, '28.284271247461902', '400.0', '80.0', '18:26:41'),
(8, 50, 44, '66.60330322138685', '2200.0', '188.0', '18:30:02');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `prostokaty`
--
ALTER TABLE `prostokaty`
  ADD PRIMARY KEY (`id_figury`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `prostokaty`
--
ALTER TABLE `prostokaty`
  MODIFY `id_figury` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
