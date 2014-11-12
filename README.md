ClosestOfferFinder
==================

ClosestOfferFinder
Υλοποίηση Web Service (TomCat8.0.14) με RESTeasy.

9/11/2014. Υλοποίηση χωρίς βάση δεδομένων. Καταχώρηση stub για testing.
----------Με τιμή ID (1-10) επιστρέφει είτε json είτε xml ανάλογα με την μέθοδο.
           http://localhost:8080/WSoffrer/service/getOfferByIdXML/{id}
           http://localhost:8080/WSoffrer/service/getOfferByIdJSON/{id}
----------Επίσεις μπορεί να επιστρέψει όλες τις προσφορές (10).
           http://localhost:8080/WSoffrer/service/getAllOffersXML
           
12/11/2014. Υλοποίηση με βάση δεδομένων:

- Σύστημα: localhost
-- Χρόνος δημιουργίας: 12 Νοε 2014, στις 10:05 PM
-- Έκδοση Διακομιστή: 5.0.51
-- Έκδοση PHP: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Βάση: `offers`
-- 

-- --------------------------------------------------------

-- 
-- Δομή Πίνακα για τον Πίνακα `offer`
-- 

CREATE TABLE `offer` (
  `ID` int(11) NOT NULL auto_increment,
  `DESCR` varchar(255) NOT NULL,
  `AXIA` double NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

-- 
-- 'Αδειασμα δεδομένων του πίνακα `offer`
-- 

INSERT INTO `offer` VALUES (1, 'MASOUTIS1', 1);
INSERT INTO `offer` VALUES (2, 'AB VASILOPOULOS', 1);
INSERT INTO `offer` VALUES (3, 'KANTZAS', 15);

