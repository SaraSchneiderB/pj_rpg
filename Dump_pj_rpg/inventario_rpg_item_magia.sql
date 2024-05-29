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
-- Table structure for table `item_magia`
--

DROP TABLE IF EXISTS `item_magia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_magia` (
  `iditemmagia` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `peso` varchar(10) DEFAULT NULL,
  `valor` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`iditemmagia`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_magia`
--

LOCK TABLES `item_magia` WRITE;
/*!40000 ALTER TABLE `item_magia` DISABLE KEYS */;
INSERT INTO `item_magia` VALUES (1,'Bolsa de Componentes','','1kg','25 PO'),(2,'Foco Arcano','Cristal','500gr','10 PO'),(3,'Foco Arcano','Orbe','1.5kg','20 PO'),(4,'Foco Arcano','Vara','1kg','10 PO'),(5,'Foco Arcano','Cajado','2kg','5 PO'),(6,'Foco Arcano','Varinha','500gr','10 PO'),(7,'Foco Druídico','Ramo de Visco','','1 PO'),(8,'Foco Druídico','Totem','','1 PO'),(9,'Foco Druídico','Cajado de madeira','2kg','5 PO'),(10,'Foco Druídico','Varinha de teixo','500gr','10 PO'),(11,'Grimório','','1.5kg','50 PO'),(12,'Símbolo Sagrado','Amuleto','500gr','5 PO'),(13,'Símbolo Sagrado','Emblema','','5 PO'),(14,'Símbolo Sagrado','Relicário','1kg','5 PO');
/*!40000 ALTER TABLE `item_magia` ENABLE KEYS */;
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
