CREATE TABLE IF NOT EXISTS nissan (
    id SERIAL,
    modelo VARCHAR(100) NOT NULL,
    motor VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS mitsubishie (
    id SERIAL,
    modelo VARCHAR(100) NOT NULL,
    motor VARCHAR(100) NOT NULL,
    nissan_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (nissan_id ) REFERENCES nissan(id)
    );