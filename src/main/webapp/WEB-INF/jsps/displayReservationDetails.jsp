<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details </title>
</head>
<body>
<h1>Flight Details</h1>

Airlines: ${reservation.flight.operationAirlines }<br/>
Flight Number: ${reservation.flight.flightNumber }<br/>
Departure City: ${reservation.flight.departureCity }<br/>
Arrival City: ${reservation.flight.arrivalCity }<br/>
Date Of Departure: ${reservation.flight.dateOfDeparture }<br/>
Estimate Departure Time: ${reservation.flight.estimateDepartureTime }<br/>

<h1>Passenger Details</h1>
First Name: ${reservation.passenger.firstName}<br/>
Last Name: ${reservation.passenger.lastName}<br/>
Middle Name: ${reservation.passenger.middleName}<br/>
Email : ${reservation.passenger.email}<br/>
Phone : ${reservation.passenger.phone}<br/>



<form action="completeCheckIn" method="post">
Enter the Number of Bags You want to check in:
 <input type="text" name="numberOfBags"/>
<input type="hidden" value="${reservation.id}" name="reservation.ID"/>
 <input type="submit" name="Check In"/>
</form>
</body>
</html> 