-- ====================================================================
-- Seed Script for Table: climb
-- Database: MariaDB
-- Description: Populates table with 5 diverse real-world climbing routes
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
    'Midnight Lightning', 
    'V8', 
    3, 
    'Yosemite Valley, California, USA', 
    '["boulder", "mantle", "granite", "historic", "famous-chalk-chalking"]', 
    'One of the most famous boulder problems in the world, located on the Columbia Boulder in Camp 4.', 
    'Ron Kauk'
),
(
    'Es Pontàs', 
    '9a+ (5.15a)', 
    3, 
    'Mallorca, Spain', 
    '["deep-water-solo", "dyno", "limestone", "overhang", "sea-cliff"]', 
    'Iconic offshore arch featuring a massive mid-route dyno over the Mediterranean Sea.', 
    'Chris Sharma'
),
(
    'The Nose', 
    '5.14a (8b+)', 
    3, 
    'El Capitan, Yosemite Valley, USA', 
    '["big-wall", "trad", "granite", "roof", "crack"]', 
    'The quintessential big wall route on El Capitan, stretching roughly 3,000 feet up the prow.', 
    'Warren Harding'
),
(
    'Silbergeier', 
    '8b+ (5.14a)', 
    2, 
    'Rätikon, Switzerland', 
    '["multi-pitch", "technical", "limestone", "alpine", "runout"]', 
    'Technical alpine multi-pitch famous for thin edges and delicate slab moves.', 
    'Beat Kammerlander'
),
(
    'Burden of Dreams', 
    'V17 (9A)', 
    0, 
    'Lappnor, Finland', 
    '["boulder", "crimpy", "granite", "overhang", "world-first"]', 
    'Relentless 4-move roof problem on ultra-sharp granite crimps; world\'s first confirmed V17.', 
    'Nalle Hukkataival'
);