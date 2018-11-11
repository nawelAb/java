-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  Dim 11 nov. 2018 à 21:43
-- Version du serveur :  10.1.36-MariaDB
-- Version de PHP :  7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `comptebancaire`
--

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

CREATE TABLE `compte` (
  `id` int(11) NOT NULL,
  `personne_id` int(11) NOT NULL,
  `proprietaire` varchar(255) NOT NULL,
  `numero` int(11) NOT NULL,
  `solde` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `compte`
--

INSERT INTO `compte` (`id`, `personne_id`, `proprietaire`, `numero`, `solde`) VALUES
(1, 1, 'abbou', 1222, 48000),
(2, 2, 'abbou2', 1333, 12540);

-- --------------------------------------------------------

--
-- Structure de la table `comptecheque`
--

CREATE TABLE `comptecheque` (
  `id` int(11) NOT NULL,
  `compte_id` int(11) NOT NULL,
  `numeroCarte` int(11) NOT NULL,
  `decouvertAutorisation` int(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `comptecheque`
--

INSERT INTO `comptecheque` (`id`, `compte_id`, `numeroCarte`, `decouvertAutorisation`) VALUES
(1, 1, 1234, 100);

-- --------------------------------------------------------

--
-- Structure de la table `compteepargne`
--

CREATE TABLE `compteepargne` (
  `id` int(11) NOT NULL,
  `compte_id` int(11) NOT NULL,
  `taux` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `compteepargne`
--

INSERT INTO `compteepargne` (`id`, `compte_id`, `taux`) VALUES
(1, 1, 15);

-- --------------------------------------------------------

--
-- Structure de la table `credit`
--

CREATE TABLE `credit` (
  `id` int(11) NOT NULL,
  `compte_id` int(11) NOT NULL,
  `sommes` int(11) NOT NULL,
  `taux` int(11) NOT NULL,
  `dureeEnMois` int(11) NOT NULL,
  `mensualite` int(11) NOT NULL,
  `sommesRestante` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `credit`
--

INSERT INTO `credit` (`id`, `compte_id`, `sommes`, `taux`, `dureeEnMois`, `mensualite`, `sommesRestante`) VALUES
(1, 1, 500, 16, 8, 9, 1900),
(2, 1, 600, 16, 8, 9, 2000),
(3, 2, 5000, 18, 12, 5, 50005);

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

CREATE TABLE `personne` (
  `firstName` varchar(255) NOT NULL,
  `lastName` varchar(255) NOT NULL,
  `dateNaissance` varchar(255) NOT NULL,
  `listCompte` varchar(255) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `personne`
--

INSERT INTO `personne` (`firstName`, `lastName`, `dateNaissance`, `listCompte`, `id`) VALUES
('user3', 'naoual', '22-08-1991', 'compte 1 ', 4),
('abbou2', 'naoual2', '29 02 1992', 'compte A', 1),
('user1', 'lastname', '22-08-1991', 'compte 1', 2),
('usr2', 'lastname', '22-08-1991', 'compte 1 ', 3);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `compte`
--
ALTER TABLE `compte`
  ADD PRIMARY KEY (`id`),
  ADD KEY `personne_id` (`personne_id`) USING BTREE;

--
-- Index pour la table `comptecheque`
--
ALTER TABLE `comptecheque`
  ADD PRIMARY KEY (`id`),
  ADD KEY `compte_id` (`compte_id`);

--
-- Index pour la table `compteepargne`
--
ALTER TABLE `compteepargne`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `credit`
--
ALTER TABLE `credit`
  ADD PRIMARY KEY (`id`),
  ADD KEY `compte_id` (`compte_id`);

--
-- Index pour la table `personne`
--
ALTER TABLE `personne`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `compte`
--
ALTER TABLE `compte`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
