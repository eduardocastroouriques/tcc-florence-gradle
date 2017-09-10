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
-- Table structure for table `cirurgia`
--

DROP TABLE IF EXISTS `cirurgia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cirurgia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `destino` varchar(255) DEFAULT NULL,
  `motivo_nao_implante` varchar(255) DEFAULT NULL,
  `motivo_nao_remocao` varchar(255) DEFAULT NULL,
  `informacao_cirurgia_id` bigint(20) NOT NULL,
  `orgao_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKd43kov4f1stxwnami4cqotpe8` (`informacao_cirurgia_id`),
  KEY `FKeiu2yrbflb2216lqq8l0qvhbg` (`orgao_id`),
  CONSTRAINT `FKd43kov4f1stxwnami4cqotpe8` FOREIGN KEY (`informacao_cirurgia_id`) REFERENCES `informacao_cirurgia` (`id`),
  CONSTRAINT `FKeiu2yrbflb2216lqq8l0qvhbg` FOREIGN KEY (`orgao_id`) REFERENCES `orgao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cirurgia`
--

LOCK TABLES `cirurgia` WRITE;
/*!40000 ALTER TABLE `cirurgia` DISABLE KEYS */;
INSERT INTO `cirurgia` VALUES (1,'MOCK','MOCK','MOCK',1,2),(2,'MOCK','MOCK','MOCK',1,1);
/*!40000 ALTER TABLE `cirurgia` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-09 20:27:28
