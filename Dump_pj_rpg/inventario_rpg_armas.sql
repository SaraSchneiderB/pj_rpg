CREATE DATABASE  IF NOT EXISTS `inventario_rpg` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `inventario_rpg`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: inventario_rpg
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `armas`
--

DROP TABLE IF EXISTS `armas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `armas` (
  `idarma` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  `Dano` varchar(30) DEFAULT NULL,
  `Peso` varchar(5) DEFAULT NULL,
  `valor` varchar(5) DEFAULT NULL,
  `Propriedades` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idarma`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `armas`
--

LOCK TABLES `armas` WRITE;
/*!40000 ALTER TABLE `armas` DISABLE KEYS */;
INSERT INTO `armas` VALUES (1,'Machado Grande','1d12 cortante','3.5kg','30 PO','Duas mãos, pesada'),(2,'Machadinhas','1d6 cortante','1kg','5 PO','Arremesso (alcance 6/18), leve'),(3,'Azagaias','1d6 perfurante','1kg','5 PO','Arremesso (alcance 9/36'),(4,'Rapieira','1d8 perfurante','1kg','25 PO','Acuidade'),(5,'Espada Longa','1d8 cortante','1.5kg','15 PO','Versátil(1d10)'),(6,'Espada Curta','1d6 perfurante','1kg','10 PO','Acuidade, leve'),(7,'Adaga','1d4 perfurante','500gr','2 PO','Acuidade, arremesso(alcance 6/18), leve'),(8,'Besta Leve','1d8 perfurante','2.5kg','25 PO','Duas mãos, munição(alcance 24/96), recarga'),(9,'Maça','1d6 contundente','2kg','5 PO','-'),(10,'Martelo de Guerra','1d8 contundente','1kg','15 PO','Versátil(1d10)'),(11,'Cimitarra','1d6 cortante','1.5kg','25 PO','Acuidade, leve'),(12,'Arco Longo','1d8 perfurante','1kg','50 PO','Duas mãos, munição(alcance 45/180), pesada'),(13,'Arco Curto','1d6 perfurante','1kg','25 PO','Duas mãos, munição (alcance 24/96'),(14,'Dardos','1d4 perfurante','150gr','5 PC','Acuidade, arremesso(alcance 6/18)'),(15,'Bastão','1d6 contundente','2kg','2 PP','Versátil (1d8)'),(16,'Clava Grande','1d8 contundente','5kg','2 PP','Duas mãos');
/*!40000 ALTER TABLE `armas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-29 19:50:48
