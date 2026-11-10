-- ====================================================================
-- Seed Script for Table: climb
-- Database: MariaDB
-- Description: Populates table
-- ====================================================================

INSERT INTO `climb` (
    `name`, 
    `grade`, 
    `stars`, 
    `location`, 
    `tags`, 
    `description`, 
    `first_ascensionist`
) 
VALUES 
(
    'Beer', 
    '6a+', 
    2, 
    'Hallway', 
    '[]', 
    'Remove the 2 fire hydrants',
    'Jarvey'
),
(
    'Chefs Castration', 
    '6b', 
    1, 
    'Kitchen', 
    '["Squeeze"]',
    "",
    "Unknown"
);