-- ====================================================================
-- Table Name: climb
-- Database: MariaDB (10.5+ recommended for full JSON constraint support)
-- Description: Hardened schema for storing climbing routes with metadata
-- ====================================================================

-- Ensure safe sql mode and correct character set settings
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- Drop table if it already exists (useful for migration scripts/resets)
DROP TABLE IF EXISTS `climb`;

CREATE TABLE `climb` (
    `id` INT UNSIGNED AUTO_INCREMENT PRIMARY KEY COMMENT 'Primary surrogate key',
    `name` VARCHAR(255) NOT NULL COMMENT 'Name of the climbing route',
    `grade` VARCHAR(50) NOT NULL COMMENT 'Difficulty grade (e.g., V6, 5.12a, 7a+)',
    `stars` TINYINT UNSIGNED NOT NULL DEFAULT 0 COMMENT 'Quality rating from 0 to 3 stars',
    `location` VARCHAR(255) NOT NULL COMMENT 'Location in the hut',
    `tags` LONGTEXT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'Multiple tags stored as a JSON array (e.g., ["trad", "overhang", "sustained"])',
    `description` TEXT DEFAULT NULL COMMENT 'Detailed beta, protection notes, or description',
    `first_ascensionist` VARCHAR(150) DEFAULT NULL COMMENT 'Person who established or first climbed the route',
    `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Timestamp when record was created',
    `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Timestamp when record was last modified',

    -- Constraints for data hardening
    CONSTRAINT `chk_stars_range` CHECK (`stars` BETWEEN 0 AND 3),
    CONSTRAINT `chk_tags_valid_json` CHECK (`tags` IS NULL OR JSON_VALID(`tags`))
) 
ENGINE=InnoDB 
DEFAULT CHARSET=utf8mb4 
COLLATE=utf8mb4_unicode_ci 
COMMENT='Stores climbing routes and metadata';

-- Add indexes for common search and filter operations
CREATE INDEX `idx_climb_grade` ON `climb` (`grade`);
CREATE INDEX `idx_climb_location` ON `climb` (`location`);
CREATE INDEX `idx_climb_name` ON `climb` (`name`);

SET FOREIGN_KEY_CHECKS = 1;