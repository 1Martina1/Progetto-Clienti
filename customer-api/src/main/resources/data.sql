-- Insert customers
INSERT INTO CUSTOMER 
	(NAME, SURNAME, ADDRESS, FISCAL_CODE, BIRTH_DATE)
VALUES 
	('Maria', 'Rossi', 'Via Gluck 29', 'RSSMRAXXXXXXXXXX', '1960-12-01'),
	('Mariano', 'Verdi', 'Via Garibaldi 25/A', 'VRDMRNXXXXXXXXXX', '1945-08-02'),
	('Francesco', 'Bianchi', 'Via dei Lamponi 7', 'BNCFRNXXXXXXXXXX', '1994-02-22');

-- Insert contacts
INSERT INTO CONTACT 
	(CUSTOMER_ID, TYPE, VAL, CERTIFIED)
VALUES 
	(1, 'mail', 'm.rossi@example.it', true),
	(1, 'mobile', '339 9999999', false),
	(2, 'telephone', '051 0000000', true),
	(3, 'mail', 'f.bianchi@example.it', false);