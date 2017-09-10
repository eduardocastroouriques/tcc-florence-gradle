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
  `aprovacao_id` bigint(20) DEFAULT NULL,
  `cirurgia_id` bigint(20) DEFAULT NULL,
  `comunicacao_processo_doacao_id` bigint(20) DEFAULT NULL,
  `entrevista_familiar_id` bigint(20) DEFAULT NULL,
  `hla_id` bigint(20) DEFAULT NULL,
  `obito_id` bigint(20) DEFAULT NULL,
  `situacao_clinica_id` bigint(20) DEFAULT NULL,
  `sorologia_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKei21f5rrwu1tcxx3qtyl6q04y` (`aprovacao_id`),
  KEY `FKslpfaxyduvkoygqumnfxkr54g` (`cirurgia_id`),
  KEY `FKbx282xft4y62yafban1oo8xgc` (`comunicacao_processo_doacao_id`),
  KEY `FKte6l6s1bbk54cu64vra3hoix6` (`entrevista_familiar_id`),
  KEY `FK4mcrcfh3x7hjyvk59n642wfg9` (`hla_id`),
  KEY `FKhuh28nxj7nc9l7uxtxep0418m` (`obito_id`),
  KEY `FKfhjso2xulgi94wqjr1j2xlegh` (`situacao_clinica_id`),
  KEY `FKq6yyenaam5qqiqdsxfjp4g0k7` (`sorologia_id`),
  CONSTRAINT `FK4mcrcfh3x7hjyvk59n642wfg9` FOREIGN KEY (`hla_id`) REFERENCES `hla` (`id`),
  CONSTRAINT `FKbx282xft4y62yafban1oo8xgc` FOREIGN KEY (`comunicacao_processo_doacao_id`) REFERENCES `comunicacao_processo_doacao` (`id`),
  CONSTRAINT `FKei21f5rrwu1tcxx3qtyl6q04y` FOREIGN KEY (`aprovacao_id`) REFERENCES `aprovacao` (`id`),
  CONSTRAINT `FKfhjso2xulgi94wqjr1j2xlegh` FOREIGN KEY (`situacao_clinica_id`) REFERENCES `situacao_clinica` (`id`),
  CONSTRAINT `FKhuh28nxj7nc9l7uxtxep0418m` FOREIGN KEY (`obito_id`) REFERENCES `obito` (`id`),
  CONSTRAINT `FKq6yyenaam5qqiqdsxfjp4g0k7` FOREIGN KEY (`sorologia_id`) REFERENCES `sorologia` (`id`),
  CONSTRAINT `FKslpfaxyduvkoygqumnfxkr54g` FOREIGN KEY (`cirurgia_id`) REFERENCES `cirurgia` (`id`),
  CONSTRAINT `FKte6l6s1bbk54cu64vra3hoix6` FOREIGN KEY (`entrevista_familiar_id`) REFERENCES `entrevista_familiar` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `processo_doacao`
--

LOCK TABLES `processo_doacao` WRITE;
/*!40000 ALTER TABLE `processo_doacao` DISABLE KEYS */;
INSERT INTO `processo_doacao` VALUES (1,1.00,'MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','MOCK','2017-09-07 19:46:47','2017-09-07','MOCK','MOCK','MOCK','MOCK',1,'MOCK','MOCK','MOCK',1.00,'MOCK','2017-09-07 19:47:11','MOCK','MOCK',1,'1','MOCK','MOCK','12','1212','MOCK',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `processo_doacao` ENABLE KEYS */;
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
