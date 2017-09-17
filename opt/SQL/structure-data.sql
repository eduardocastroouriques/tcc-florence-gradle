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
  `pd_id_aprovacao` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfckdr7qtk5de2bay1uf5ra7j8` (`pd_id_aprovacao`),
  CONSTRAINT `FKfckdr7qtk5de2bay1uf5ra7j8` FOREIGN KEY (`pd_id_aprovacao`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aprovacao`
--

LOCK TABLES `aprovacao` WRITE;
/*!40000 ALTER TABLE `aprovacao` DISABLE KEYS */;
INSERT INTO `aprovacao` VALUES (1,1,1,1,1,1,1,1,1,'2017-09-16 19:54:35',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),(2,1,1,1,1,1,1,1,1,'2017-09-16 19:54:35',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1),(3,1,1,1,1,1,1,1,1,'2017-09-16 19:54:35',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,1,1),(4,1,1,1,1,1,1,1,1,'2017-09-16 19:54:35',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2);
/*!40000 ALTER TABLE `aprovacao` ENABLE KEYS */;
UNLOCK TABLES;

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
  `informacao_cirurgia_id` bigint(20) DEFAULT NULL,
  `processo_doacao_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_bx1eqhguprcjg6gan9vhuvm4f` (`processo_doacao_id`),
  UNIQUE KEY `UK_4x7qkmae8usdykojod67yavxn` (`informacao_cirurgia_id`),
  CONSTRAINT `FK7bq5l4at5jbdbvj1ifpq39fjo` FOREIGN KEY (`processo_doacao_id`) REFERENCES `processo_doacao` (`id`),
  CONSTRAINT `FKd43kov4f1stxwnami4cqotpe8` FOREIGN KEY (`informacao_cirurgia_id`) REFERENCES `informacao_cirurgia` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cirurgia`
--

LOCK TABLES `cirurgia` WRITE;
/*!40000 ALTER TABLE `cirurgia` DISABLE KEYS */;
INSERT INTO `cirurgia` VALUES (1,'MOCK','MOCK','MOCK',NULL,1),(3,'MOCK','MOCK','MOCK',NULL,2);
/*!40000 ALTER TABLE `cirurgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comunicacao_processo_doacao`
--

DROP TABLE IF EXISTS `comunicacao_processo_doacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comunicacao_processo_doacao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_hora` datetime DEFAULT NULL,
  `rgct` varchar(255) DEFAULT NULL,
  `processo_doacao_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_sew3krv5d3s5fdg8pxcsuv713` (`processo_doacao_id`),
  CONSTRAINT `FKbjngv7ho8b4919o68qkc7i0ov` FOREIGN KEY (`processo_doacao_id`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comunicacao_processo_doacao`
--

LOCK TABLES `comunicacao_processo_doacao` WRITE;
/*!40000 ALTER TABLE `comunicacao_processo_doacao` DISABLE KEYS */;
INSERT INTO `comunicacao_processo_doacao` VALUES (1,'2017-09-16 20:25:23','MOCK',1),(3,'2017-09-16 20:25:23','MOCK',2),(4,'2017-09-16 20:25:23','MOCK',3);
/*!40000 ALTER TABLE `comunicacao_processo_doacao` ENABLE KEYS */;
UNLOCK TABLES;

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
  `processo_doacao_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_655189p4f70w4n1qxehi0mc1i` (`processo_doacao_id`),
  CONSTRAINT `FKs37wawhuphmh11x9125dxdvv4` FOREIGN KEY (`processo_doacao_id`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doenca_atual`
--

LOCK TABLES `doenca_atual` WRITE;
/*!40000 ALTER TABLE `doenca_atual` DISABLE KEYS */;
INSERT INTO `doenca_atual` VALUES (1,'MOCK','MOCK','s','MOCK','MOCK','s','s','MOCK','MOCK','MOCK','MOCK','s',1,'MOCK','s','2017-09-16 20:09:39','MOCK','MOCK','MOCK','MOCK',1),(2,'MOCK','MOCK','s','MOCK','MOCK','s','s','MOCK','MOCK','MOCK','MOCK','s',1,'MOCK','s','2017-09-16 20:09:39','MOCK','MOCK','MOCK','MOCK',2);
/*!40000 ALTER TABLE `doenca_atual` ENABLE KEYS */;
UNLOCK TABLES;

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
  `processo_doacao_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_n8q0kmkwtir61d7okkemamekd` (`processo_doacao_id`),
  CONSTRAINT `FK5n4o6odvgkl5kp40gsj33y86o` FOREIGN KEY (`processo_doacao_id`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doenca_previa`
--

LOCK TABLES `doenca_previa` WRITE;
/*!40000 ALTER TABLE `doenca_previa` DISABLE KEYS */;
INSERT INTO `doenca_previa` VALUES (1,'S','S','S','S','S','S','S','2017-09-16 20:26:12','2017-09-16 20:26:13','2017-09-16 20:26:13','S','2017-09-16 20:26:14','S','S','S','S','2017-09-16 20:26:15','S','S','S','S','S','S','S','S','S','S','S','S','S','S','S','S','S','S',1),(3,'S','S','S','S','S','S','S','2017-09-16 20:26:12','2017-09-16 20:26:13','2017-09-16 20:26:13','S','2017-09-16 20:26:14','S','S','S','S','2017-09-16 20:26:15','S','S','S','S','S','S','S','S','S','S','S','S','S','S','S','S','S','S',2),(4,'S','S','S','S','S','S','S','2017-09-16 20:26:12','2017-09-16 20:26:13','2017-09-16 20:26:13','S','2017-09-16 20:26:14','S','S','S','S','2017-09-16 20:26:15','S','S','S','S','S','S','S','S','S','S','S','S','S','S','S','S','S','S',3);
/*!40000 ALTER TABLE `doenca_previa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dva`
--

DROP TABLE IF EXISTS `dva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dva` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `amp` varchar(255) DEFAULT NULL,
  `inicio` time DEFAULT NULL,
  `kg` double DEFAULT NULL,
  `ml_por_hora` float DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `pd_id_dva` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5gaekv262xqxm4h4cdj2rljr` (`pd_id_dva`),
  CONSTRAINT `FK5gaekv262xqxm4h4cdj2rljr` FOREIGN KEY (`pd_id_dva`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dva`
--

LOCK TABLES `dva` WRITE;
/*!40000 ALTER TABLE `dva` DISABLE KEYS */;
INSERT INTO `dva` VALUES (1,'MOCK','01:00:00',1,1,'MOCK',1),(2,'MOCK','01:00:00',1,1,'MOCK',1),(3,'MOCK','01:00:00',1,1,'MOCK',2);
/*!40000 ALTER TABLE `dva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrevista_familiar`
--

DROP TABLE IF EXISTS `entrevista_familiar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrevista_familiar` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_hora` datetime DEFAULT NULL,
  `entrevistador` varchar(255) DEFAULT NULL,
  `motivo_negativa` varchar(255) DEFAULT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  `resultado` int(11) DEFAULT NULL,
  `processo_doacao_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_bktfhuvdhse66fmkg5vmdxjn2` (`processo_doacao_id`),
  CONSTRAINT `FKr9bvx51who7573lvu1cpjjth9` FOREIGN KEY (`processo_doacao_id`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrevista_familiar`
--

LOCK TABLES `entrevista_familiar` WRITE;
/*!40000 ALTER TABLE `entrevista_familiar` DISABLE KEYS */;
INSERT INTO `entrevista_familiar` VALUES (1,'2017-09-16 20:28:09','MOCK','MOCK','MOCK',1,1),(3,'2017-09-16 20:28:09','MOCK','MOCK','MOCK',1,2),(4,'2017-09-16 20:28:09','MOCK','MOCK','MOCK',1,3);
/*!40000 ALTER TABLE `entrevista_familiar` ENABLE KEYS */;
UNLOCK TABLES;

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
  `pd_id_exame_complementar` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKledcusxcyyn3wcq71fdyonyqk` (`pd_id_exame_complementar`),
  CONSTRAINT `FKledcusxcyyn3wcq71fdyonyqk` FOREIGN KEY (`pd_id_exame_complementar`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exame_complementar`
--

LOCK TABLES `exame_complementar` WRITE;
/*!40000 ALTER TABLE `exame_complementar` DISABLE KEYS */;
INSERT INTO `exame_complementar` VALUES (1,'2017-09-16 20:57:09','MOCK','MOCK',1,'MOCK',1),(2,'2017-09-16 20:57:09','MOCK','MOCK',1,'MOCK',1),(3,'2017-09-16 20:57:09','MOCK','MOCK',1,'MOCK',2);
/*!40000 ALTER TABLE `exame_complementar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exame_doacao`
--

DROP TABLE IF EXISTS `exame_doacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exame_doacao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ecq` varchar(255) DEFAULT NULL,
  `eco_cardio` varchar(255) DEFAULT NULL,
  `gaso_pulmao` varchar(255) DEFAULT NULL,
  `rx` varchar(255) DEFAULT NULL,
  `tce_co_abd` varchar(255) DEFAULT NULL,
  `pd_id_exame_doacao` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKd6rbx21681jdnw3uvobt1k191` (`pd_id_exame_doacao`),
  CONSTRAINT `FKd6rbx21681jdnw3uvobt1k191` FOREIGN KEY (`pd_id_exame_doacao`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exame_doacao`
--

LOCK TABLES `exame_doacao` WRITE;
/*!40000 ALTER TABLE `exame_doacao` DISABLE KEYS */;
INSERT INTO `exame_doacao` VALUES (1,'MOCK','MOCK','MOCK','MOCK','MOCK',1),(2,'MOCK','MOCK','MOCK','MOCK','MOCK',1),(3,'MOCK','MOCK','MOCK','MOCK','MOCK',2);
/*!40000 ALTER TABLE `exame_doacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hla`
--

DROP TABLE IF EXISTS `hla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hla` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cross_hcpa_data_hora_inicio` datetime DEFAULT NULL,
  `cross_iscmpa_data_hora_inicio` datetime DEFAULT NULL,
  `data_inicio` date DEFAULT NULL,
  `hcpa_data_hora_fim` datetime DEFAULT NULL,
  `hora_inicio` time DEFAULT NULL,
  `hora_termino` time DEFAULT NULL,
  `iscmpa_data_hora_fim` datetime DEFAULT NULL,
  `laboratorio` varchar(255) DEFAULT NULL,
  `pd_id_hla` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKppriqg1yy5o6nir9qln60o807` (`pd_id_hla`),
  CONSTRAINT `FKppriqg1yy5o6nir9qln60o807` FOREIGN KEY (`pd_id_hla`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hla`
--

LOCK TABLES `hla` WRITE;
/*!40000 ALTER TABLE `hla` DISABLE KEYS */;
INSERT INTO `hla` VALUES (1,'2017-09-16 21:01:43','2017-09-16 21:01:45','2017-09-15','2017-09-16 21:01:48','01:00:00','01:00:00','2017-09-16 21:01:55','MOCK',1),(2,'2017-09-16 21:01:43','2017-09-16 21:01:45','2017-09-15','2017-09-16 21:01:48','01:00:00','01:00:00','2017-09-16 21:01:55','MOCK',1),(3,'2017-09-16 21:01:43','2017-09-16 21:01:45','2017-09-15','2017-09-16 21:01:48','01:00:00','01:00:00','2017-09-16 21:01:55','MOCK',2);
/*!40000 ALTER TABLE `hla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `infeccao`
--

DROP TABLE IF EXISTS `infeccao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `infeccao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cult_local` varchar(255) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `tto` varchar(255) DEFAULT NULL,
  `da_fk_inf` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKc58mjupu0scynaj2caevvctul` (`da_fk_inf`),
  CONSTRAINT `FKc58mjupu0scynaj2caevvctul` FOREIGN KEY (`da_fk_inf`) REFERENCES `doenca_atual` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `infeccao`
--

LOCK TABLES `infeccao` WRITE;
/*!40000 ALTER TABLE `infeccao` DISABLE KEYS */;
INSERT INTO `infeccao` VALUES (1,'MOCK','2017-09-16','MOCK',1),(2,'MOCK','2017-09-16','MOCK',1),(3,'MOCK','2017-09-16','MOCK',2);
/*!40000 ALTER TABLE `infeccao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `informacao_cirurgia`
--

DROP TABLE IF EXISTS `informacao_cirurgia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `informacao_cirurgia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dml_fim` time DEFAULT NULL,
  `dml_inicio` time DEFAULT NULL,
  `horario_fim` time DEFAULT NULL,
  `horario_inicio` time DEFAULT NULL,
  `horario_previsto` time DEFAULT NULL,
  `local_da_retirada` varchar(255) DEFAULT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  `cirurgia_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6p96dstdg3i56wirdoe4imb4a` (`cirurgia_id`),
  CONSTRAINT `FK6p96dstdg3i56wirdoe4imb4a` FOREIGN KEY (`cirurgia_id`) REFERENCES `cirurgia` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `informacao_cirurgia`
--

LOCK TABLES `informacao_cirurgia` WRITE;
/*!40000 ALTER TABLE `informacao_cirurgia` DISABLE KEYS */;
INSERT INTO `informacao_cirurgia` VALUES (1,'01:00:00','01:00:00','01:00:00','01:00:00','01:00:00','MOCK','MOCK',1),(2,'01:00:00','01:00:00','01:00:00','01:00:00','01:00:00','MOCK','MOCK',1),(3,'01:00:00','01:00:00','01:00:00','01:00:00','01:00:00','MOCK','MOCK',1);
/*!40000 ALTER TABLE `informacao_cirurgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `obito`
--

DROP TABLE IF EXISTS `obito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `obito` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_hora` datetime DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL,
  `processo_doacao_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_22yg5y253a4919t6pdesmd9d1` (`processo_doacao_id`),
  CONSTRAINT `FKlt1kpqtcqkw8gk4slh8suj4jw` FOREIGN KEY (`processo_doacao_id`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `obito`
--

LOCK TABLES `obito` WRITE;
/*!40000 ALTER TABLE `obito` DISABLE KEYS */;
INSERT INTO `obito` VALUES (3,'2017-09-16 20:33:05',1,1),(4,'2017-09-16 20:33:05',1,2);
/*!40000 ALTER TABLE `obito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orgao`
--

DROP TABLE IF EXISTS `orgao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orgao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `destino` varchar(255) DEFAULT NULL,
  `motivo_nao_implante` varchar(255) DEFAULT NULL,
  `motivo_nao_remocao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `cir_fk_org` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKpey9ux8gyygxr9fhkh36ybob8` (`cir_fk_org`),
  CONSTRAINT `FKpey9ux8gyygxr9fhkh36ybob8` FOREIGN KEY (`cir_fk_org`) REFERENCES `cirurgia` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orgao`
--

LOCK TABLES `orgao` WRITE;
/*!40000 ALTER TABLE `orgao` DISABLE KEYS */;
INSERT INTO `orgao` VALUES (1,'MOCK','MOCK','MOCK','MOCK',1),(2,'MOCK','MOCK','MOCK','MOCK',1),(4,'MOCK','MOCK','MOCK','MOCK',1);
/*!40000 ALTER TABLE `orgao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `processo_doacao`
--

DROP TABLE IF EXISTS `processo_doacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `processo_doacao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `altura` decimal(19,2) NOT NULL,
  `causa_da_morte` varchar(255) NOT NULL,
  `causa_da_morte_circunstancia` varchar(255) NOT NULL,
  `causa_da_morte_circunstancia_acidente` varchar(255) NOT NULL,
  `causa_da_morte_decorrente_de` varchar(255) NOT NULL,
  `causa_da_morte_outra` varchar(255) NOT NULL,
  `cns` varchar(255) NOT NULL,
  `cpf` varchar(13) NOT NULL,
  `data_internacao` datetime NOT NULL,
  `data_nascimento` date NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `estado_civil` varchar(255) NOT NULL,
  `filiacao` varchar(255) NOT NULL,
  `hospital` varchar(255) NOT NULL,
  `idade` int(11) NOT NULL,
  `informante` varchar(255) NOT NULL,
  `leito` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `peso` decimal(19,2) NOT NULL,
  `prontuario_hospital` varchar(255) NOT NULL,
  `protocolo_data_hora_suspensao` datetime NOT NULL,
  `protocolo_sedacao` varchar(255) NOT NULL,
  `protocolo_ta` varchar(255) NOT NULL,
  `protocolo_temperatura` float NOT NULL,
  `rg` varchar(255) NOT NULL,
  `setor` varchar(255) NOT NULL,
  `sexo` varchar(255) NOT NULL,
  `telefone` varchar(255) NOT NULL,
  `telefone_familiar` varchar(255) NOT NULL,
  `tipagem` varchar(255) NOT NULL,
  `cirurgia_id` bigint(20) DEFAULT NULL,
  `comunicacao_processo_doacao_id` bigint(20) DEFAULT NULL,
  `doenca_atual_id` bigint(20) DEFAULT NULL,
  `doenca_previa_id` bigint(20) DEFAULT NULL,
  `entrevista_familiar_id` bigint(20) DEFAULT NULL,
  `obito_id` bigint(20) DEFAULT NULL,
  `sorologia_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKslpfaxyduvkoygqumnfxkr54g` (`cirurgia_id`),
  KEY `FKbx282xft4y62yafban1oo8xgc` (`comunicacao_processo_doacao_id`),
  KEY `FKgpsiapp96hytd5431ufwgm7vo` (`doenca_atual_id`),
  KEY `FK9nsj4l13gm959l0kekuyf9b6x` (`doenca_previa_id`),
  KEY `FKte6l6s1bbk54cu64vra3hoix6` (`entrevista_familiar_id`),
  KEY `FKhuh28nxj7nc9l7uxtxep0418m` (`obito_id`),
  KEY `FKq6yyenaam5qqiqdsxfjp4g0k7` (`sorologia_id`),
  CONSTRAINT `FK9nsj4l13gm959l0kekuyf9b6x` FOREIGN KEY (`doenca_previa_id`) REFERENCES `doenca_previa` (`id`),
  CONSTRAINT `FKbx282xft4y62yafban1oo8xgc` FOREIGN KEY (`comunicacao_processo_doacao_id`) REFERENCES `comunicacao_processo_doacao` (`id`),
  CONSTRAINT `FKgpsiapp96hytd5431ufwgm7vo` FOREIGN KEY (`doenca_atual_id`) REFERENCES `doenca_atual` (`id`),
  CONSTRAINT `FKhuh28nxj7nc9l7uxtxep0418m` FOREIGN KEY (`obito_id`) REFERENCES `obito` (`id`),
  CONSTRAINT `FKq6yyenaam5qqiqdsxfjp4g0k7` FOREIGN KEY (`sorologia_id`) REFERENCES `sorologia` (`id`),
  CONSTRAINT `FKslpfaxyduvkoygqumnfxkr54g` FOREIGN KEY (`cirurgia_id`) REFERENCES `cirurgia` (`id`),
  CONSTRAINT `FKte6l6s1bbk54cu64vra3hoix6` FOREIGN KEY (`entrevista_familiar_id`) REFERENCES `entrevista_familiar` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `processo_doacao`
--

LOCK TABLES `processo_doacao` WRITE;
/*!40000 ALTER TABLE `processo_doacao` DISABLE KEYS */;
INSERT INTO `processo_doacao` VALUES (1,1.00,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','1','2017-09-16 19:53:15','2017-09-15','MOCK','MOCK','MOCK','MOCK',1,'MOCK','MOCK','MOCK',1.00,'MOCK','2017-09-16 19:53:33','MOCK','MOCK',1,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,1.00,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','1','2017-09-16 19:53:15','2017-09-15','MOCK','MOCK','MOCK','MOCK',1,'MOCK','MOCK','MOCK',1.00,'MOCK','2017-09-16 19:53:33','MOCK','MOCK',1,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,1.00,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','1','2017-09-16 19:53:15','2017-09-15','MOCK','MOCK','MOCK','MOCK',1,'MOCK','MOCK','MOCK',1.00,'MOCK','2017-09-16 19:53:33','MOCK','MOCK',1,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `processo_doacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `processo_doacao_situacao_clinica`
--

DROP TABLE IF EXISTS `processo_doacao_situacao_clinica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `processo_doacao_situacao_clinica` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `processo_doacao_id` bigint(20) DEFAULT NULL,
  `situacao_clinica_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_iusw217uuhlkqbyf4sm3bh1gg` (`situacao_clinica_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `processo_doacao_situacao_clinica`
--

LOCK TABLES `processo_doacao_situacao_clinica` WRITE;
/*!40000 ALTER TABLE `processo_doacao_situacao_clinica` DISABLE KEYS */;
/*!40000 ALTER TABLE `processo_doacao_situacao_clinica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `situacao_clinica`
--

DROP TABLE IF EXISTS `situacao_clinica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `situacao_clinica` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_hora` datetime DEFAULT NULL,
  `diurese` varchar(255) DEFAULT NULL,
  `fio_dois` varchar(255) DEFAULT NULL,
  `fr` varchar(255) DEFAULT NULL,
  `peep` varchar(255) DEFAULT NULL,
  `pins` varchar(255) DEFAULT NULL,
  `sat` varchar(255) DEFAULT NULL,
  `ta` varchar(255) DEFAULT NULL,
  `pd_id_situacao_clinica` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK63j3unfylkchehrgeskx8wigx` (`pd_id_situacao_clinica`),
  CONSTRAINT `FK63j3unfylkchehrgeskx8wigx` FOREIGN KEY (`pd_id_situacao_clinica`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `situacao_clinica`
--

LOCK TABLES `situacao_clinica` WRITE;
/*!40000 ALTER TABLE `situacao_clinica` DISABLE KEYS */;
INSERT INTO `situacao_clinica` VALUES (1,'2017-09-16 21:02:48','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',1),(2,'2017-09-16 21:02:48','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',1),(3,'2017-09-16 21:02:48','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK',2);
/*!40000 ALTER TABLE `situacao_clinica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sorologia`
--

DROP TABLE IF EXISTS `sorologia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sorologia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `anti_hiv` varchar(255) DEFAULT NULL,
  `anti_hbc` varchar(255) DEFAULT NULL,
  `anti_hbs` varchar(255) DEFAULT NULL,
  `anti_hcv` varchar(255) DEFAULT NULL,
  `calculo` double DEFAULT NULL,
  `chagas` varchar(255) DEFAULT NULL,
  `cmv_igc` varchar(255) DEFAULT NULL,
  `cmvigm` varchar(255) DEFAULT NULL,
  `hbs_ag` varchar(255) DEFAULT NULL,
  `hemodiluicao` varchar(255) DEFAULT NULL,
  `hora_inicio` time DEFAULT NULL,
  `hora_resultado` time DEFAULT NULL,
  `htlv_primeiro` varchar(255) DEFAULT NULL,
  `htlv_segundo` varchar(255) DEFAULT NULL,
  `local` varchar(255) DEFAULT NULL,
  `lues` varchar(255) DEFAULT NULL,
  `toxo_igg` varchar(255) DEFAULT NULL,
  `toxo_igm` varchar(255) DEFAULT NULL,
  `processo_doacao_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_t4307svi1sj34e19fg06omdn9` (`processo_doacao_id`),
  CONSTRAINT `FKn9knlbjrq0eok809xvon2k807` FOREIGN KEY (`processo_doacao_id`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sorologia`
--

LOCK TABLES `sorologia` WRITE;
/*!40000 ALTER TABLE `sorologia` DISABLE KEYS */;
INSERT INTO `sorologia` VALUES (1,'S','S','S','S',1,'S','S','S','S','S','01:00:00','01:00:00','S','S','S','S','S','S',1),(3,'S','S','S','S',1,'S','S','S','S','S','01:00:00','01:00:00','S','S','S','S','S','S',2),(4,'S','S','S','S',1,'S','S','S','S','S','01:00:00','01:00:00','S','S','S','S','S','S',3);
/*!40000 ALTER TABLE `sorologia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `substancia_extra`
--

DROP TABLE IF EXISTS `substancia_extra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `substancia_extra` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `resultado` varchar(255) DEFAULT NULL,
  `tempo` varchar(255) DEFAULT NULL,
  `tipo_quanto` varchar(255) DEFAULT NULL,
  `doenca_previa_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5sp1wr7jdvce27604gah630sx` (`doenca_previa_id`),
  CONSTRAINT `FK5sp1wr7jdvce27604gah630sx` FOREIGN KEY (`doenca_previa_id`) REFERENCES `doenca_previa` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `substancia_extra`
--

LOCK TABLES `substancia_extra` WRITE;
/*!40000 ALTER TABLE `substancia_extra` DISABLE KEYS */;
INSERT INTO `substancia_extra` VALUES (1,'MOCK','MOCK','MOCK','MOCK',1),(2,'MOCK','MOCK','MOCK','MOCK',1),(3,'MOCK','MOCK','MOCK','MOCK',1);
/*!40000 ALTER TABLE `substancia_extra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teste_clinico`
--

DROP TABLE IF EXISTS `teste_clinico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teste_clinico` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_hora` datetime DEFAULT NULL,
  `medico` varchar(255) DEFAULT NULL,
  `numero_teste` int(11) DEFAULT NULL,
  `pd_id_teste_clinico` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1y887ytltmvs9gmwxqm2in35v` (`pd_id_teste_clinico`),
  CONSTRAINT `FK1y887ytltmvs9gmwxqm2in35v` FOREIGN KEY (`pd_id_teste_clinico`) REFERENCES `processo_doacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teste_clinico`
--

LOCK TABLES `teste_clinico` WRITE;
/*!40000 ALTER TABLE `teste_clinico` DISABLE KEYS */;
INSERT INTO `teste_clinico` VALUES (1,'2017-09-16 21:03:21','MOCK',1,1),(2,'2017-09-16 21:03:21','MOCK',1,1),(3,'2017-09-16 21:03:21','MOCK',1,2);
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

-- Dump completed on 2017-09-16 21:10:13
