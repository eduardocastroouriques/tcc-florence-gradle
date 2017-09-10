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
-- Table structure for table `exame_complementar`
--

DROP TABLE IF EXISTS `exame_complementar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exame_complementar` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_hora` datetime DEFAULT NULL,
  `medico` varchar(255) DEFAULT NULL,
  `resultado` varchar(255) DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL,
  `tipo_outro` varchar(255) DEFAULT NULL,
  `processo_doacao_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7xiitphqrckofjsnl2xmgdxtf` (`processo_doacao_id`),
  CONSTRAINT `FK7xiitphqrckofjsnl2xmgdxtf` FOREIGN KEY (`processo_doacao_id`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exame_complementar`
--

LOCK TABLES `exame_complementar` WRITE;
/*!40000 ALTER TABLE `exame_complementar` DISABLE KEYS */;
INSERT INTO `exame_complementar` VALUES (1,'2017-09-07 19:45:21','MOCK','MOCK',1,'MOCK',1);
/*!40000 ALTER TABLE `exame_complementar` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-09 20:27:30
