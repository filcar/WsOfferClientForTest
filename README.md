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
