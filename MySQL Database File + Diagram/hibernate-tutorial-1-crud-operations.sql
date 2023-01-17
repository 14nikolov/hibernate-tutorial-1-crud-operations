CREATE DATABASE  IF NOT EXISTS `hibernate-tutorial-1-crud-operations` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hibernate-tutorial-1-crud-operations`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hibernate-tutorial-1-crud-operations
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` text,
  `last_name` text,
  `company` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'George','Baseman','GreatCompany'),(2,'Emily','Rowskey','TheAutoCompany'),(3,'Bob','Dow','T-Company'),(5,'Leuke','Smith','Apple'),(6,'Howard','Rowdy','Nike');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` text,
  `last_name` text,
  `email` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'George','Newman','george@emailfake.com'),(2,'Big','Baby','bigbaby@babymail.com'),(3,'Big','Baby','bigbaby@babymail.com'),(4,'Big','Baby','bigbaby@babymail.com'),(5,'Sam','Zimmern','lorem@dreamy.xyz'),(6,'Big','Baby','bigbaby@babymail.com'),(7,'Big','Baby','bigbaby@babymail.com'),(9,'Big','Baby','bigbaby@babymail.com'),(10,'Big','Baby','bigbaby@babymail.com'),(11,'Michael','Bowski','michael@fakemail.com'),(12,'Emma','Watson','fakeemma@fakemail.com'),(13,'Emma','Watson','fakeemma@fakemail.com'),(14,'Emma','Watson','fakeemma@fakemail.com'),(15,'Emma','Watson','fakeemma@fakemail.com'),(16,'Emma','Watson','fakeemma@fakemail.com'),(17,'Emma','Watson','fakeemma@fakemail.com'),(18,'Emma','Watson','fakeemma@fakemail.com'),(19,'Emma','Watson','fakeemma@fakemail.com'),(20,'Emma','Watson','fakeemma@fakemail.com'),(21,'Emma','Watson','fakeemma@fakemail.com'),(22,'Emma','Watson','fakeemma@fakemail.com'),(23,'Emma','Watson','fakeemma@fakemail.com'),(24,'Emma','Watson','fakeemma@fakemail.com'),(25,'Emma','Watson','fakeemma@fakemail.com'),(26,'Emma','Watson','fakeemma@fakemail.com'),(27,'Emma','Watson','fakeemma@fakemail.com'),(28,'Bobby','Smack','foobar@gmail.com'),(29,'Bobby','Smack','foobar@gmail.com'),(30,'Simmy','Wimmy','foobar@gmail.com'),(31,'Leu','Kom','foobar@gmail.com'),(32,'AZ','GE','foobar@gmail.com'),(33,'Emma','Watson','fakeemma@fakemail.com'),(34,'Emma','Watson','fakeemma@fakemail.com');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-17 23:33:42
