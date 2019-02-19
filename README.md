# Booking Program
java practice for beginner

Presentation-Ready Date: December 8, 2018

This project works in Netbeans Program's console. It's an imaginary reservation program. When the program starts firstly admin enters login informations. After login six options appear on the console screen. 

-What can we do these options?
We can make or cancel reservations. 
We can list received reservations.
We can look at the booking position prepared with the visual information position of matrices.
And finally administrator can get an appeal at the request of the passenger for go to abroad.

information.java : In this class for the purpose of making, cancelling and viewing the booking which necessary methods were written. I've created two variables in memory with static keyword.When a variable id declare as static, then a single copy of variable is created and shared among all objects at class level. We used these variables as total reservations and capacity counter.
I collected passenger informations in a arraylist. Then with this method(addBooking()) I received passenger information into arraylist.
ViewList(): The credentials entered from the admin when the program runs displayed with this method.
quotaInfo(): This method for make the counter update

CancelBooking(): We call this method for want to cancel transactions in arraylist. Because we put passenger information in arraylist.

Administrator.java: In this class, I’ve created two variables called username and password to enter login information of admin in memory. I have created a constructor. It’s called when created instance of the object and at the same time allocates space in memory for the object.

Login.java: In this method we have tested information entered by the admin with information in memory

Abroad.java: In this class, I wrote rules of going abroad with the Interfaces class. The Interfaces define which steps and what to do while the class working.

Main.java: We produced objects from the classes we wrote. And we wrote our program with the loops needed.
