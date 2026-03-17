-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               12.2.2-MariaDB - MariaDB Server
-- Server OS:                    Win64
-- HeidiSQL Version:             12.14.0.7165
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for currencydb
DROP DATABASE IF EXISTS `currencydb2`;
CREATE DATABASE IF NOT EXISTS `currencydb2` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_uca1400_ai_ci */;
USE `currencydb2`;

-- Dumping structure for table currencydb.currency
DROP TABLE IF EXISTS `currency2`;
CREATE TABLE IF NOT EXISTS `currency2` (
                                           `id` int(11) NOT NULL AUTO_INCREMENT,
    `code` varchar(3) NOT NULL,
    `name` varchar(50) NOT NULL,
    `rate` decimal(10,4) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `code` (`code`)
    ) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_uca1400_ai_ci;

-- Dumping data for table currencydb.currency: ~20 rows (approximately)
DELETE FROM `currency2`;
INSERT INTO `currency2` (`id`, `code`, `name`, `rate`) VALUES
                                                           (1, 'EUR', 'Euro', 1.0000),
                                                           (2, 'USD', 'US Dollar', 1.1698),
                                                           (3, 'GBP', 'British Pound', 0.8732),
                                                           (4, 'JPY', 'Japanese Yen', 184.2000),
                                                           (5, 'SEK', 'Swedish Krona', 11.4500),
                                                           (6, 'NOK', 'Norwegian Krone', 11.8200),
                                                           (7, 'CHF', 'Swiss Franc', 0.9105),
                                                           (8, 'CAD', 'Canadian Dollar', 1.6030),
                                                           (9, 'AUD', 'Australian Dollar', 1.6520),
                                                           (10, 'CNY', 'Chinese Yuan', 8.0510),
                                                           (11, 'INR', 'Indian Rupee', 106.5500),
                                                           (12, 'RUB', 'Russian Ruble', 108.4500),
                                                           (13, 'BRL', 'Brazilian Real', 6.0650),
                                                           (14, 'ZAR', 'South African Rand', 22.4200),
                                                           (15, 'AED', 'UAE Dirham', 4.2960),
                                                           (16, 'SGD', 'Singapore Dollar', 1.5720),
                                                           (17, 'HKD', 'Hong Kong Dollar', 9.1550),
                                                           (18, 'NZD', 'New Zealand Dollar', 1.8840),
                                                           (19, 'TRY', 'Turkish Lira', 41.2500),
                                                           (20, 'MXN', 'Mexican Peso', 20.2800);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;