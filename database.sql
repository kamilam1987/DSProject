create schema carhire;
use carhire;

CREATE TABLE IF NOT EXISTS Customer (
    id int auto_increment,
    lastname varchar(255) NOT NULL,
    firstname varchar(255) NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS Car (
    id varchar(12),
    make varchar(255) NOT NULL,
    model varchar(255) NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS Booking (
    id int auto_increment,
    time TIMESTAMP DEFAULT current_timestamp,
    carid varchar(12) NOT NULL,
	customerid int,
	bookingfrom TIMESTAMP,
	bookingto TIMESTAMP,
    PRIMARY KEY (id),
	FOREIGN KEY(customerid) REFERENCES Customer(id),
	FOREIGN KEY(carid) REFERENCES Car(id)

);

INSERT INTO Car VALUES ('182-D-1234','Any','Model');
INSERT INTO Car VALUES ('182-D-1235','Any1','Model1');
INSERT INTO Car VALUES ('182-D-1236','Any2','Model2');
INSERT INTO Car VALUES ('182-D-1237','Any3','Model3');
INSERT INTO Car VALUES ('182-D-1238','Any4','Model4');


