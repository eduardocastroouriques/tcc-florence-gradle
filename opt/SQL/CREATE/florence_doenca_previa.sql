-- MySQL dump 10.13  Distrib 5.7.13, for linux-glibc2.5 (x86_64)
--
-- Host: localhost    Database: florence
-- ------------------------------------------------------
-- Server version	5.7.19-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `doenca_previa`
--

DROP TABLE IF EXISTS `doenca_previa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doenca_previa` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `aptto` varchar(255) DEFAULT NULL,
  `dvp` varchar(255) DEFAULT NULL,
  `hiv` char(1) DEFAULT NULL,
  `iam` varchar(255) DEFAULT NULL,
  `ap` varchar(255) DEFAULT NULL,
  `asma` varchar(255) DEFAULT NULL,
  `cirurgia_previa` varchar(255) DEFAULT NULL,
  `data_cura` datetime DEFAULT NULL,
  `data_diagn` datetime DEFAULT NULL,
  `data_transfusao` datetime DEFAULT NULL,
  `dm` varchar(255) DEFAULT NULL,
  `dm_desde` datetime DEFAULT NULL,
  `doenca_ocular` varchar(255) DEFAULT NULL,
  `doenca_snc` varchar(255) DEFAULT NULL,
  `dpoc` varchar(255) DEFAULT NULL,
  `has` varchar(255) DEFAULT NULL,
  `has_desde` datetime DEFAULT NULL,
  `hapetite` char(1) DEFAULT NULL,
  `homossexualismo` varchar(255) DEFAULT NULL,
  `informante_nome` varchar(255) DEFAULT NULL,
  `informante_parentesco` varchar(255) DEFAULT NULL,
  `irc` varchar(255) DEFAULT NULL,
  `maquiagem_definitiva` varchar(255) DEFAULT NULL,
  `neoplasia` varchar(255) DEFAULT NULL,
  `outras_doencas` varchar(255) DEFAULT NULL,
  `piercing` varchar(255) DEFAULT NULL,
  `quimio` varchar(255) DEFAULT NULL,
  `radio` varchar(255) DEFAULT NULL,
  `sistema_prisional` varchar(255) DEFAULT NULL,
  `sistema_prisional_qdo` varchar(255) DEFAULT NULL,
  `tatuagem` varchar(255) DEFAULT NULL,
  `tranfusao` varchar(255) DEFAULT NULL,
  `tuberculose` varchar(255) DEFAULT NULL,
  `tuberculose_tto` varchar(255) DEFAULT NULL,
  `vacinas_recentes` varchar(255) DEFAULT NULL,
  `processo_doacao_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5n4o6odvgkl5kp40gsj33y86o` (`processo_doacao_id`),
  CONSTRAINT `FK5n4o6odvgkl5kp40gsj33y86o` FOREIGN KEY (`processo_doacao_id`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doenca_previa`
--

LOCK TABLES `doenca_previa` WRITE;
/*!40000 ALTER TABLE `doenca_previa` DISABLE KEYS */;
INSERT INTO `doenca_previa` VALUES (1,'MOCK','MOCK','S','MOCK','MOCK','MOCK','MOCK','2018-09-07 19:13:21','2018-09-07 19:13:26','2017-09-07 19:13:30','MOCK','2017-09-07 19:13:40','MOCK','MOCK','MOCK','MOCK','2017-09-07 19:15:12','S','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',1),(2,'MOCK','MOCK','S','MOCK','MOCK','MOCK','MOCK','2018-09-07 19:13:21','2018-09-07 19:13:26','2017-09-07 19:13:30','MOCK','2017-09-07 19:13:40','MOCK','MOCK','MOCK','MOCK','2017-09-07 19:15:12','S','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',1);
/*!40000 ALTER TABLE `doenca_previa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-09 20:27:29
