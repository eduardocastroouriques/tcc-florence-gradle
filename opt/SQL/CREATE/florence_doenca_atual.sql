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
-- Table structure for table `doenca_atual`
--

DROP TABLE IF EXISTS `doenca_atual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doenca_atual` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `aspecto` varchar(255) DEFAULT NULL,
  `choque` varchar(255) DEFAULT NULL,
  `craniotomia` char(1) DEFAULT NULL,
  `ddavp` varchar(255) DEFAULT NULL,
  `dialise` varchar(255) DEFAULT NULL,
  `diurese_ultimas_seis_horas` char(1) DEFAULT NULL,
  `diurese_ultimas_vinte_e_quatro_horas` char(1) DEFAULT NULL,
  `febre` varchar(255) DEFAULT NULL,
  `ira` varchar(255) DEFAULT NULL,
  `medicacao_em_uso` varchar(255) DEFAULT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  `pcr` char(1) DEFAULT NULL,
  `pcr_numero` int(11) DEFAULT NULL,
  `pcr_tempo_maximo` varchar(255) DEFAULT NULL,
  `primeira_creatina` char(1) DEFAULT NULL,
  `primeira_creatinina_data` datetime DEFAULT NULL,
  `secrecao_tot` varchar(255) DEFAULT NULL,
  `trauma_de_abdome` varchar(255) DEFAULT NULL,
  `trauma_de_torax` varchar(255) DEFAULT NULL,
  `vm_inicio` varchar(255) DEFAULT NULL,
  `processo_doacao_id` bigint(20) DEFAULT NULL,
  `doenca_atual_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKs37wawhuphmh11x9125dxdvv4` (`processo_doacao_id`),
  KEY `FKkvislgv7dx1aohpqa3klf06dl` (`doenca_atual_id`),
  CONSTRAINT `FKkvislgv7dx1aohpqa3klf06dl` FOREIGN KEY (`doenca_atual_id`) REFERENCES `processo_doacao` (`id`),
  CONSTRAINT `FKs37wawhuphmh11x9125dxdvv4` FOREIGN KEY (`processo_doacao_id`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doenca_atual`
--

LOCK TABLES `doenca_atual` WRITE;
/*!40000 ALTER TABLE `doenca_atual` DISABLE KEYS */;
INSERT INTO `doenca_atual` VALUES (1,'MOCK','MOCK','1','MOCK','MOCK','s','s','MOCK','MOCK','MOCK','MOCK','s',1,'MOCK','s','2017-09-07 19:11:52','MOCK','MOCK','MOCK','MOCK',1,1);
/*!40000 ALTER TABLE `doenca_atual` ENABLE KEYS */;
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
