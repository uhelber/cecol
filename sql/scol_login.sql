CREATE DATABASE  IF NOT EXISTS `scol` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `scol`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: scol
-- ------------------------------------------------------
-- Server version	5.1.67-community

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
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `idlogin` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) DEFAULT NULL,
  `senha` varchar(45) DEFAULT NULL,
  `ultimoacesso` datetime DEFAULT NULL,
  PRIMARY KEY (`idlogin`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'admin','admin',NULL),(2,'uhelber','lcosta',NULL),(3,'giordanol','amoDeus777',NULL),(4,'fernandoh','wakaitxv23031974',NULL),(5,'josej','proinfopb',NULL),(6,'maharishyb','m1g5t5l8b9',NULL),(7,'joanan','n45c1m3n70',NULL),(8,'jamyles','proinfopb',NULL),(9,'tatianao','27041985',NULL),(10,'rivanias','rivania1970',NULL),(11,'gilmars','gilmar17',NULL),(12,'josea','proinfopb',NULL),(13,'marcusl','Sucram#61',NULL),(14,'rodrigos','683052rod',NULL),(15,'severinon','proinfopb',NULL),(16,'SOUSA','s1ousa58',NULL),(17,'racksonr','proinfopb',NULL),(18,'kennyaa','proinfopb',NULL),(19,'Francisco','ichigo',NULL),(20,'rizoneidea','pb19640442',NULL),(21,'joseg','hugobate',NULL),(22,'ingridyl','kura1ma2',NULL),(23,'leonardovidal','vidal5446',NULL),(24,'adriellym','moskito21',NULL);
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-11 16:43:59
