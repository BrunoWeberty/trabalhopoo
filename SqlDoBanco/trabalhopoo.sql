-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 01-Maio-2019 às 21:38
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trabalhopoo`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `id` int(11) NOT NULL,
  `NOME` varchar(255) NOT NULL,
  `DATANASCIMENTO` varchar(255) NOT NULL,
  `CURSO` varchar(255) NOT NULL,
  `RA` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`id`, `NOME`, `DATANASCIMENTO`, `CURSO`, `RA`) VALUES
(1, 'Maria', '12/12/2000', 'ADS', '23128');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE `professor` (
  `id` int(11) NOT NULL,
  `NOME` varchar(255) NOT NULL,
  `DATANASCIMENTO` varchar(255) NOT NULL,
  `DISCIPLINA` varchar(255) NOT NULL,
  `MATRICULA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`id`, `NOME`, `DATANASCIMENTO`, `DISCIPLINA`, `MATRICULA`) VALUES
(1, 'Manoel', '23/12/2019', 'Matematica', 1239201);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tecnico`
--

CREATE TABLE `tecnico` (
  `id` int(11) NOT NULL,
  `NOME` varchar(255) NOT NULL,
  `DATANASCIMENTO` varchar(255) NOT NULL,
  `FUNCAO` varchar(255) NOT NULL,
  `DEPARTAMENTO` varchar(255) NOT NULL,
  `MATRICULA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tecnico`
--

INSERT INTO `tecnico` (`id`, `NOME`, `DATANASCIMENTO`, `FUNCAO`, `DEPARTAMENTO`, `MATRICULA`) VALUES
(1, 'Edson', '31/10/2003', 'TAE', 'Cont�bil', 3241238);

-- --------------------------------------------------------

--
-- Estrutura da tabela `terceirizado`
--

CREATE TABLE `terceirizado` (
  `id` int(11) NOT NULL,
  `NOME` varchar(255) NOT NULL,
  `ATIVIDADE` varchar(255) NOT NULL,
  `EMPRESA` varchar(255) NOT NULL,
  `ATIVO` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `terceirizado`
--

INSERT INTO `terceirizado` (`id`, `NOME`, `ATIVIDADE`, `EMPRESA`, `ATIVO`) VALUES
(1, 'Pedro', 'Auxiliar Administrativo', 'Banco do Brasil', 'SIM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tecnico`
--
ALTER TABLE `tecnico`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `terceirizado`
--
ALTER TABLE `terceirizado`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `aluno`
--
ALTER TABLE `aluno`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `professor`
--
ALTER TABLE `professor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tecnico`
--
ALTER TABLE `tecnico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `terceirizado`
--
ALTER TABLE `terceirizado`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
