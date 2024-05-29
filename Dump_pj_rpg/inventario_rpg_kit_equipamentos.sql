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
-- Table structure for table `kit_equipamentos`
--

DROP TABLE IF EXISTS `kit_equipamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kit_equipamentos` (
  `idequipamento` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  `valor` varchar(5) DEFAULT NULL,
  `descricao` text,
  PRIMARY KEY (`idequipamento`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kit_equipamentos`
--

LOCK TABLES `kit_equipamentos` WRITE;
/*!40000 ALTER TABLE `kit_equipamentos` DISABLE KEYS */;
INSERT INTO `kit_equipamentos` VALUES (1,'Kit de Artista','40 PO','Inclui uma mochila, um saco de dormir, duas fantasias, 5 velas, \n5 dias de rações, um cantil e um kit de disfarce.'),(2,'Kit de Assaltante','16 PO','Inclui uma mochila, um saco com 1.000 esferas de metal, 3 metros de linha, um sino,\n 5 velas, um pé de cabra, um martelo, 10 pítons, uma lanterna coberta, 2 frascos de óleo, 5 dias de rações, uma caixa de fogo e um cantil. \nO kit também possui 15 metros de corda de cânhamo amarrada ao lado dele.'),(3,'Kit de Aventureiro','10 PO','Inclui uma mochila, um pé de cabra, um martelo, 10 pítons, 10 tochas, uma caixa de fogo,\n 10 dias de rações e um cantil. O kit também tem 15 metros de corda de cânhamo amarrada ao lado dele.'),(4,'Kit de Erudito','40 PO','Inclui uma mochila, um livro de estudo, um vidro de tinta, uma caneta tinteiro,\n 10 folhas de pergaminho, um saquinho de areia e uma pequena faca.'),(5,'Kit de Explorador de Masmorras','12 PO','Inclui uma mochila, um pé-de-cabra, um martelo, 10 pitões, 10 tochas, \n uma caixa para fogo, 10 dias de rações e um cantil. O conjunto também contém 15 metros de corda de cânhamo amarrados ao lado da mochila.'),(6,'Kit de Diplomata','39 PO','Inclui um baú, 2 estojos para mapas e pergaminhos, um conjunto de roupas finas, uma garrafa de tinta,\n uma caneta tinteiro, uma lâmpada, 2 frascos de óleo, 5 folhas de papel, um frasco de perfume, cera para lacre e sabão.'),(7,'Kit de Sacerdote','19 PO',' Inclui uma mochila, um cobertor, 10 velas, uma caixa de fogo, uma caixa de esmolas, 2 blocos de incenso,\n um incensário, vestimentas, 2 dias de rações e um cantil.');
/*!40000 ALTER TABLE `kit_equipamentos` ENABLE KEYS */;
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
