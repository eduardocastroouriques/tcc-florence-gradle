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
-- Table structure for table `aprovacao`
--

DROP TABLE IF EXISTS `aprovacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aprovacao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `amilase` double DEFAULT NULL,
  `bastoes` double DEFAULT NULL,
  `bil_direta` double DEFAULT NULL,
  `bil_total` double DEFAULT NULL,
  `ckmb` double DEFAULT NULL,
  `co_2` double DEFAULT NULL,
  `cpk` double DEFAULT NULL,
  `creatinina` double DEFAULT NULL,
  `data_hora` datetime DEFAULT NULL,
  `fos_alcalina` double DEFAULT NULL,
  `gama_gt` double DEFAULT NULL,
  `glicemia` double DEFAULT NULL,
  `hematocrito` double DEFAULT NULL,
  `hemoglobina` double DEFAULT NULL,
  `kttp` double DEFAULT NULL,
  `leucocitos` double DEFAULT NULL,
  `ph` double DEFAULT NULL,
  `plaquetas` double DEFAULT NULL,
  `po_2` double DEFAULT NULL,
  `potassio` double DEFAULT NULL,
  `sat` double DEFAULT NULL,
  `sodio` double DEFAULT NULL,
  `tgo` double DEFAULT NULL,
  `tgp` double DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL,
  `tp` double DEFAULT NULL,
  `ureias` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aprovacao`
--

LOCK TABLES `aprovacao` WRITE;
/*!40000 ALTER TABLE `aprovacao` DISABLE KEYS */;
INSERT INTO `aprovacao` VALUES (1,1,1,1,1,1,1,1,1,'2017-09-07 19:07:58',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),(2,1,1,1,1,1,1,1,1,'2017-09-07 19:07:58',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),(3,1,1,1,1,1,1,1,1,'2017-09-07 19:07:58',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),(4,1,1,1,1,1,1,1,1,'2017-09-07 19:07:58',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
/*!40000 ALTER TABLE `aprovacao` ENABLE KEYS */;
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
