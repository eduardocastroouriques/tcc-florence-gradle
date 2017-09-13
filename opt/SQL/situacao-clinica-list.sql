-- MySQL dump 10.13  Distrib 5.7.13, for linux-glibc2.5 (x86_64)
--
-- Host: localhost    Database: sql10193843
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
/*!40000 ALTER TABLE `cirurgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `comunicacao_processo_doacao`
--

LOCK TABLES `comunicacao_processo_doacao` WRITE;
/*!40000 ALTER TABLE `comunicacao_processo_doacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `comunicacao_processo_doacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `doenca_atual`
--

LOCK TABLES `doenca_atual` WRITE;
/*!40000 ALTER TABLE `doenca_atual` DISABLE KEYS */;
/*!40000 ALTER TABLE `doenca_atual` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `doenca_previa`
--

LOCK TABLES `doenca_previa` WRITE;
/*!40000 ALTER TABLE `doenca_previa` DISABLE KEYS */;
/*!40000 ALTER TABLE `doenca_previa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dva`
--

LOCK TABLES `dva` WRITE;
/*!40000 ALTER TABLE `dva` DISABLE KEYS */;
/*!40000 ALTER TABLE `dva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `entrevista_familiar`
--

LOCK TABLES `entrevista_familiar` WRITE;
/*!40000 ALTER TABLE `entrevista_familiar` DISABLE KEYS */;
/*!40000 ALTER TABLE `entrevista_familiar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `exame_complementar`
--

LOCK TABLES `exame_complementar` WRITE;
/*!40000 ALTER TABLE `exame_complementar` DISABLE KEYS */;
/*!40000 ALTER TABLE `exame_complementar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `exame_doacao`
--

LOCK TABLES `exame_doacao` WRITE;
/*!40000 ALTER TABLE `exame_doacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `exame_doacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `hla`
--

LOCK TABLES `hla` WRITE;
/*!40000 ALTER TABLE `hla` DISABLE KEYS */;
/*!40000 ALTER TABLE `hla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `infeccao`
--

LOCK TABLES `infeccao` WRITE;
/*!40000 ALTER TABLE `infeccao` DISABLE KEYS */;
/*!40000 ALTER TABLE `infeccao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `informacao_cirurgia`
--

LOCK TABLES `informacao_cirurgia` WRITE;
/*!40000 ALTER TABLE `informacao_cirurgia` DISABLE KEYS */;
/*!40000 ALTER TABLE `informacao_cirurgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `obito`
--

LOCK TABLES `obito` WRITE;
/*!40000 ALTER TABLE `obito` DISABLE KEYS */;
/*!40000 ALTER TABLE `obito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `orgao`
--

LOCK TABLES `orgao` WRITE;
/*!40000 ALTER TABLE `orgao` DISABLE KEYS */;
/*!40000 ALTER TABLE `orgao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `processo_doacao`
--

LOCK TABLES `processo_doacao` WRITE;
/*!40000 ALTER TABLE `processo_doacao` DISABLE KEYS */;
INSERT INTO `processo_doacao` VALUES (1,1.00,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','2017-09-13 18:55:08','2017-09-13','MOCK','MOCK','MOCK','MOCK',1,'MOCK','MOCK','MOCK',1.00,'MOCK','2017-09-13 19:56:15','MOCK','MOCK',1,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,1.00,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','2017-09-13 18:55:08','2017-09-13','MOCK','MOCK','MOCK','MOCK',1,'MOCK','MOCK','MOCK',1.00,'MOCK','2017-09-13 19:56:15','MOCK','MOCK',1,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `processo_doacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `processo_doacao_situacao_clinica`
--

LOCK TABLES `processo_doacao_situacao_clinica` WRITE;
/*!40000 ALTER TABLE `processo_doacao_situacao_clinica` DISABLE KEYS */;
/*!40000 ALTER TABLE `processo_doacao_situacao_clinica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `situacao_clinica`
--

LOCK TABLES `situacao_clinica` WRITE;
/*!40000 ALTER TABLE `situacao_clinica` DISABLE KEYS */;
INSERT INTO `situacao_clinica` VALUES (2,'2017-09-13 18:54:43','S','S','S','S','S','S','S'),(3,'2017-09-13 18:54:43','S','S','S','S','S','S','S'),(4,'2017-09-13 18:54:43','S','S','S','S','S','S','S');
/*!40000 ALTER TABLE `situacao_clinica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `sorologia`
--

LOCK TABLES `sorologia` WRITE;
/*!40000 ALTER TABLE `sorologia` DISABLE KEYS */;
/*!40000 ALTER TABLE `sorologia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `substancia_extra`
--

LOCK TABLES `substancia_extra` WRITE;
/*!40000 ALTER TABLE `substancia_extra` DISABLE KEYS */;
/*!40000 ALTER TABLE `substancia_extra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `teste_clinico`
--

LOCK TABLES `teste_clinico` WRITE;
/*!40000 ALTER TABLE `teste_clinico` DISABLE KEYS */;
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

-- Dump completed on 2017-09-13 19:48:04
