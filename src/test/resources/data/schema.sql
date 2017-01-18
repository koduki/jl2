CREATE TABLE IF NOT EXISTS genders (
    id INT IDENTITY PRIMARY KEY,
    gender_name VARCHAR,
);

CREATE TABLE IF NOT EXISTS persons (
    id INT IDENTITY PRIMARY KEY,
    first_name VARCHAR,
    last_name VARCHAR,
    age  INT,
    gender_id INT,
    FOREIGN KEY (gender_id) REFERENCES genders(id),
);
