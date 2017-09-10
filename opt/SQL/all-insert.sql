-- MySQL dump 10.13  Distrib 5.7.13, for linux-glibc2.5 (x86_64)
--
-- Host: sql10.freemysqlhosting.net    Database: sql10193843
-- ------------------------------------------------------
-- Server version	5.5.53-0ubuntu0.14.04.1

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
-- Dumping data for table `aprovacao`
--

LOCK TABLES `aprovacao` WRITE;
/*!40000 ALTER TABLE `aprovacao` DISABLE KEYS */;
INSERT INTO `aprovacao` VALUES (1,1,1,1,1,1,1,1,1,'2017-09-07 19:07:58',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,NULL),(2,1,1,1,1,1,1,1,1,'2017-09-07 19:07:58',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,NULL),(3,1,1,1,1,1,1,1,1,'2017-09-07 19:07:58',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,NULL),(4,1,1,1,1,1,1,1,1,'2017-09-07 19:07:58',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,NULL);
/*!40000 ALTER TABLE `aprovacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `cirurgia`
--

LOCK TABLES `cirurgia` WRITE;
/*!40000 ALTER TABLE `cirurgia` DISABLE KEYS */;
INSERT INTO `cirurgia` VALUES (1,'MOCK','MOCK','MOCK',1,2,NULL),(2,'MOCK','MOCK','MOCK',1,1,NULL);
/*!40000 ALTER TABLE `cirurgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `comunicacao_processo_doacao`
--

LOCK TABLES `comunicacao_processo_doacao` WRITE;
/*!40000 ALTER TABLE `comunicacao_processo_doacao` DISABLE KEYS */;
INSERT INTO `comunicacao_processo_doacao` VALUES (1,'2017-09-07 19:10:25','MOCK',1);
/*!40000 ALTER TABLE `comunicacao_processo_doacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `doenca_atual`
--

LOCK TABLES `doenca_atual` WRITE;
/*!40000 ALTER TABLE `doenca_atual` DISABLE KEYS */;
INSERT INTO `doenca_atual` VALUES (1,'MOCK','MOCK','1','MOCK','MOCK','s','s','MOCK','MOCK','MOCK','MOCK','s',1,'MOCK','s','2017-09-07 19:11:52','MOCK','MOCK','MOCK','MOCK',1);
/*!40000 ALTER TABLE `doenca_atual` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `doenca_atual_infeccao`
--

LOCK TABLES `doenca_atual_infeccao` WRITE;
/*!40000 ALTER TABLE `doenca_atual_infeccao` DISABLE KEYS */;
INSERT INTO `doenca_atual_infeccao` VALUES (1,1),(1,2);
/*!40000 ALTER TABLE `doenca_atual_infeccao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `doenca_previa`
--

LOCK TABLES `doenca_previa` WRITE;
/*!40000 ALTER TABLE `doenca_previa` DISABLE KEYS */;
INSERT INTO `doenca_previa` VALUES (1,'MOCK','MOCK','S','MOCK','MOCK','MOCK','MOCK',NULL,'2017-09-10 16:19:20','2017-09-10 16:19:02','MOCK','2017-09-10 16:19:25','MOCK','MOCK','MOCK','MOCK','2017-09-10 16:18:54','S','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',NULL);
/*!40000 ALTER TABLE `doenca_previa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dva`
--

LOCK TABLES `dva` WRITE;
/*!40000 ALTER TABLE `dva` DISABLE KEYS */;
INSERT INTO `dva` VALUES (1,'MOCK','01:00:00',1,1,'MOCK',1);
/*!40000 ALTER TABLE `dva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `entrevista_familiar`
--

LOCK TABLES `entrevista_familiar` WRITE;
/*!40000 ALTER TABLE `entrevista_familiar` DISABLE KEYS */;
INSERT INTO `entrevista_familiar` VALUES (1,'2017-09-07 19:15:24','MOCK','MOCK','MOCK',1,NULL),(2,'2017-09-07 19:15:24','MOCK','MOCK','MOCK',1,NULL),(3,'2017-09-07 19:15:24','MOCK','MOCK','MOCK',1,NULL);
/*!40000 ALTER TABLE `entrevista_familiar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `exame_complementar`
--

LOCK TABLES `exame_complementar` WRITE;
/*!40000 ALTER TABLE `exame_complementar` DISABLE KEYS */;
INSERT INTO `exame_complementar` VALUES (1,'2017-09-07 19:45:21','MOCK','MOCK',1,'MOCK',1,NULL);
/*!40000 ALTER TABLE `exame_complementar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `exame_doacao`
--

LOCK TABLES `exame_doacao` WRITE;
/*!40000 ALTER TABLE `exame_doacao` DISABLE KEYS */;
INSERT INTO `exame_doacao` VALUES (1,'MOCK','MOCK','MOCK','MOCK','MOCK',1),(2,'MOCK','MOCK','MOCK','MOCK','MOCK',1);
/*!40000 ALTER TABLE `exame_doacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `hla`
--

LOCK TABLES `hla` WRITE;
/*!40000 ALTER TABLE `hla` DISABLE KEYS */;
INSERT INTO `hla` VALUES (1,'2017-09-07 19:16:25','2017-09-07 19:16:26','2017-09-07','2017-09-07 19:16:35','19:00:00','19:00:00','2017-09-07 19:16:55','MOCK',NULL),(2,'2017-09-07 19:16:25','2017-09-07 19:16:26','2017-09-07','2017-09-07 19:16:35','19:00:00','19:00:00','2017-09-07 19:16:55','MOCK',NULL),(3,'2017-09-07 19:16:25','2017-09-07 19:16:26','2017-09-07','2017-09-07 19:16:35','19:00:00','19:00:00','2017-09-07 19:16:55','MOCK',NULL);
/*!40000 ALTER TABLE `hla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `infeccao`
--

LOCK TABLES `infeccao` WRITE;
/*!40000 ALTER TABLE `infeccao` DISABLE KEYS */;
INSERT INTO `infeccao` VALUES (1,'MOCK','2017-09-10','MOCK',1),(2,'MOCK','2017-09-10','MOCK',1);
/*!40000 ALTER TABLE `infeccao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `informacao_cirurgia`
--

LOCK TABLES `informacao_cirurgia` WRITE;
/*!40000 ALTER TABLE `informacao_cirurgia` DISABLE KEYS */;
INSERT INTO `informacao_cirurgia` VALUES (1,'19:00:00','19:00:00','19:00:00','19:00:00','19:00:00','MOCK','MOCK',NULL),(2,'19:00:00','19:00:00','19:00:00','19:00:00','19:00:00','MOCK','MOCK',NULL),(3,'19:00:00','19:00:00','19:00:00','19:00:00','19:00:00','MOCK','MOCK',NULL);
/*!40000 ALTER TABLE `informacao_cirurgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `obito`
--

LOCK TABLES `obito` WRITE;
/*!40000 ALTER TABLE `obito` DISABLE KEYS */;
INSERT INTO `obito` VALUES (1,'2017-09-07 19:20:02',1,NULL),(2,'2017-09-07 19:20:02',1,NULL),(3,'2017-09-07 19:20:02',1,NULL);
/*!40000 ALTER TABLE `obito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `orgao`
--

LOCK TABLES `orgao` WRITE;
/*!40000 ALTER TABLE `orgao` DISABLE KEYS */;
INSERT INTO `orgao` VALUES (1,'MOCK'),(2,'MOCK'),(3,'MOCK');
/*!40000 ALTER TABLE `orgao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `processo_doacao`
--

LOCK TABLES `processo_doacao` WRITE;
/*!40000 ALTER TABLE `processo_doacao` DISABLE KEYS */;
INSERT INTO `processo_doacao` VALUES (1,1.00,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','2017-09-10 16:15:51','2017-09-10','MOCK','MOCK','MOCK','MOCK',1,'MOCK','MOCK','MOCK',1.00,'MOCK','2017-09-10 16:15:19','MOCK','MOCK',1,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',1,1,NULL,NULL,1,1,1,1,1);
/*!40000 ALTER TABLE `processo_doacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `situacao_clinica`
--

LOCK TABLES `situacao_clinica` WRITE;
/*!40000 ALTER TABLE `situacao_clinica` DISABLE KEYS */;
INSERT INTO `situacao_clinica` VALUES (1,'2017-09-07 19:20:45','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',NULL),(2,'2017-09-07 19:20:45','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',NULL),(3,'2017-09-07 19:20:45','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',NULL);
/*!40000 ALTER TABLE `situacao_clinica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `sorologia`
--

LOCK TABLES `sorologia` WRITE;
/*!40000 ALTER TABLE `sorologia` DISABLE KEYS */;
INSERT INTO `sorologia` VALUES (1,'MOCK','MOCK','MOCK','MOCK',1,'MOCK','MOCK','MOCK','MOCK','MOCK','19:00:00','19:00:00','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',NULL),(2,'MOCK','MOCK','MOCK','MOCK',1,'MOCK','MOCK','MOCK','MOCK','MOCK','19:00:00','19:00:00','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',NULL),(3,'MOCK','MOCK','MOCK','MOCK',1,'MOCK','MOCK','MOCK','MOCK','MOCK','19:00:00','19:00:00','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',NULL);
/*!40000 ALTER TABLE `sorologia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `substancia_extra`
--

LOCK TABLES `substancia_extra` WRITE;
/*!40000 ALTER TABLE `substancia_extra` DISABLE KEYS */;
INSERT INTO `substancia_extra` VALUES (2,'MOCK','MOCK','MOCK','MOCK',1);
/*!40000 ALTER TABLE `substancia_extra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `teste_clinico`
--

LOCK TABLES `teste_clinico` WRITE;
/*!40000 ALTER TABLE `teste_clinico` DISABLE KEYS */;
INSERT INTO `teste_clinico` VALUES (1,'2017-09-07 19:22:05','MOCK',12,1),(2,'2017-09-07 19:22:05','MOCK',12,1);
/*!40000 ALTER TABLE `teste_clinico` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-10 16:40:21
