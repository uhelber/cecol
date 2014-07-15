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
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `idusuarios` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `sobrenome` varchar(45) DEFAULT NULL,
  `setor` int(11) DEFAULT NULL,
  `funcao` int(11) DEFAULT NULL,
  `datanascimento` date DEFAULT NULL,
  `datacadastro` datetime DEFAULT NULL,
  `cadastrador` int(11) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `matricula` varchar(45) DEFAULT NULL,
  `login` int(11) NOT NULL,
  `permissao` int(11) NOT NULL,
  `ativarconta` int(11) DEFAULT NULL,
  PRIMARY KEY (`idusuarios`),
  KEY `fk_idx` (`permissao`),
  KEY `fk_usuarios_usuarios_idx` (`cadastrador`),
  KEY `fk_usuarios_setor_idx` (`setor`),
  KEY `fk_usuarios_fncao_idx` (`funcao`),
  KEY `fk_usuarios_ativarconta_idx` (`ativarconta`),
  KEY `fk_usuario_login_idx` (`login`),
  CONSTRAINT `fk_usuarios_ativarconta` FOREIGN KEY (`ativarconta`) REFERENCES `ativarconta` (`idativarconta`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuarios_fncao` FOREIGN KEY (`funcao`) REFERENCES `funcao` (`idfuncao`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuarios_permissoes` FOREIGN KEY (`permissao`) REFERENCES `permissoes` (`idpermissao`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuarios_setor` FOREIGN KEY (`setor`) REFERENCES `setor` (`idsetor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuarios_usuarios` FOREIGN KEY (`cadastrador`) REFERENCES `usuarios` (`idusuarios`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_login` FOREIGN KEY (`login`) REFERENCES `login` (`idlogin`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Administrador',NULL,1,4,NULL,NULL,1,NULL,NULL,1,3,2),(2,'Uhelber','Lima da Costa',2,4,'1976-10-08',NULL,2,'(83)8878-4548','1234562',2,3,2),(3,'Giodano Bruno','Patrício Leal',2,4,'1991-01-21','2013-02-19 11:44:56',11,'(83)8759-7406','6384862',3,2,2),(4,'Fernando','Rodrigues dos Hino',2,4,'1974-03-23','2013-02-19 11:46:27',4,'(83)8859-4933','1765779',4,2,2),(5,'José Tarcisio','Batista Feitosa Júnior',2,5,'1976-10-07','2013-02-19 12:18:31',2,'(83)3218-4355','6782345',5,1,2),(6,'Maharishy Gleyderth','Teixeira Lima Barbosa',2,4,'1989-05-14','2013-02-19 15:23:30',6,'(83)9916-6240','1769324',6,2,2),(7,'Joana Darc','Marques do Nascimento',2,4,'1990-10-20','2013-02-19 15:34:17',7,'(83)8853-9224','6384854',7,2,2),(8,'Jamyle','Ferreira França Soares',2,5,'1983-01-05','2013-02-19 15:36:10',2,'(83)8780-6474','6418511',8,1,2),(9,'Tatiana','Ferreira de Oliveira',2,5,'1985-04-26','2013-02-19 15:38:13',9,'(83)8782-6766','6782345',9,1,2),(10,'Rivânia','Linhares da Silva',2,5,'1970-02-26','2013-02-19 15:39:32',10,'(83)8832-6115','6869297',10,1,2),(11,'Gilmar José','da Silva',2,3,'1965-06-16','2013-02-19 15:57:45',2,'(83)8863-2658','1303724',11,2,2),(12,'José Isidro','Alves',2,1,'1959-04-30','2013-02-19 15:59:05',2,'(83)8859-8334','1289047',12,3,2),(13,'Marcus Alberto','Batista Lacerda',5,4,'1961-10-31','2013-02-20 12:11:03',13,'(83)9977-0703','1460030',13,2,2),(14,'Rodrigo Rodrigues','Pinheiro de Sousa',5,4,'1986-03-25','2013-02-20 12:12:49',14,'(83)9142-5785','1764403',14,2,2),(15,'Severino','Soares Neto',3,4,'1959-12-19','2013-02-21 14:41:00',2,'(83)9935-5858','926931',15,2,2),(16,'José','Sousa de Lucena',4,4,'1958-08-05','2013-02-21 14:57:45',16,'(83)9961-0225','1291131',16,2,2),(17,'Rackson','Santos de Lima Renôr',2,4,'1985-06-03','2013-02-25 09:27:09',2,'(83)8633-6446','6004105',17,2,2),(18,'Kennya Maria','Vasques de Almeida',5,2,'1969-09-18','2013-02-25 16:55:53',2,'(83)9186-6822','1440969',18,2,2),(19,'Francisco','de Assis da Silva Vieira',4,4,'1982-05-30','2013-02-28 16:22:17',16,'(83)9802-3912','6418619',19,2,2),(20,'Rizoneide','Gomes de Almeida',6,2,'1964-04-17','2013-03-14 13:34:38',2,'(83)8836-8005','6952046',20,1,2),(21,'José','Bastista Gomes',2,3,'1951-08-22','2013-03-14 15:22:05',2,'(83)9949-2402','833991',21,1,2),(22,'Ingridy','Eunice Rodrigues Sobral',3,4,'1986-07-24','2013-03-19 08:49:53',15,'(83)9311-4508','1755471',22,1,2),(23,'Leonardo ','Vidal Barbosa',3,4,'1985-02-24','2013-03-19 08:52:15',15,'(83)8821-7781','175.773-3',23,1,2),(24,'Adrielly','Medeiros',3,4,'1988-05-20','2013-03-19 08:54:04',15,'(83)9971-3851','1759817',24,1,2);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-11 16:43:47
