DROP TABLE IF EXISTS ITEMS;

CREATE TABLE ITEMS (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
  desc VARCHAR(250) NOT NULL,
  price DECIMAL NOT NULL
);