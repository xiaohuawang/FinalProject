CREATE TABLE Operator (
 	operatorId			INTEGER 		REFERENCES XUsers(userId),
 	firstName 			VARCHAR(20) 	NOT NULL,
 	lastName 			VARCHAR(20) 	NOT NULL,
 	emailId 			VARCHAR(30) 	NOT NULL,
 	phoneNumber 		varchar(10)		NOT NULL,
 	--Shift Time Start
 	sts 				DATE 			NOT NULL,
 	--Shift Time End
 	ste 				DATE 			NOT NULL,
 	--Max.no.of Customer to be managed
 	mcm 				INTEGER 		NOT NULL,
 	creationDate		DATE			NOT NULL
);
