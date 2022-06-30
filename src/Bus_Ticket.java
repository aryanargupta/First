import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
public class Bus_Ticket extends Ticket_Booking_Bus
{
    public static void main(String args[])

    {
        Scanner in=new Scanner(System.in);
        SimpleDateFormat form= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date= new Date();
        String s, ch="Y", destin;
        int code;
        double amt;
        String firstname;
        String lastname;
        System.out.println("Welcome to the Book My Bus Main Page.");
        System.out.println("Would you like to continue for the booking?");
        System.out.println("If Yes, Type 'Y', otherwise type 'N' to exit.");
        s=in.next();
        
        if(s.equalsIgnoreCase(ch))
        {
            System.out.println("Welcome to the main hub.");
            System.out.println("----------------------------------------------------");
            System.out.println("Please enter first name of the passenger.");
            firstname=in.next();
            System.out.println("Please enter last name of the passenger.");
            lastname=in.next();
            System.out.println("Please choose your route for your journey.");
            System.out.println();
            System.out.println("They are enlisted as: ");
            System.out.println("1. Gandhinagar to Vadodara via Ahmedabad");
            System.out.println("2. Vadodara to Gandhinagar via Ahmedabad");
            System.out.println("3. Ahmedabad to Gandhinagar");
            System.out.println("4. Ahmedabad to Vadodara");
            System.out.println();
            System.out.println(" To exit insert '0'");
            System.out.println("Please choose your preferred route.");
            code=in.nextInt();
            switch(code)
            {
                case 1:
                System.out.println("Your opted route for the journey is from Gandhinagar to Vadodara via Ahmedabad.");
                System.out.println();
                System.out.println("You will be costed Rs.10 per KM including the GST with accessories.");
                System.out.println("Please choose your destination");
                destin=in.next();
                if(destin.equalsIgnoreCase("Ahmedabad"))
                {
                    System.out.println("Your route has been modified from Gandhinagar to Ahmedabad");
                    System.out.println("Total Distance: 27.1 KM");
                    amt=27.1*10.0;
                    System.out.println();
                    System.out.println(" Your Total Amount: Rs. "+amt);
                    System.out.println();
                    System.out.println("Please print this Entry Pass");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("               Entry Pass");
                    System.out.println();
                    System.out.println("Booked By: " +firstname +" "+ lastname);
                    System.out.println(" Date and Time of Booking: " +form.format(date));
                    System.out.println("From:           Gandhinagar");
                    System.out.println("To:             Ahmedabad");
                    System.out.println();
                    System.out.println("*** This Entry Pass is valid ONLY with Boarding Pass***");
                    System.out.println("--------------------------------------------------------------------------");
                    Ticket_Booking_Bus GviaA= new Ticket_Booking_Bus();
                    Ticket_Booking_Bus.Seatbooking();
                    System.out.println("Thank You for Visiting");

                }
                else
                {
                    System.out.println("Your route has been set from Gandhinagar to Vadodara");
                    System.out.println("Total Distance: 131.8 KM");
                    amt=131.8*10.0;
                    System.out.println();
                    System.out.println("Your Total Amount: Rs. "+amt);
                    System.out.println();
                    System.out.println("Please print this Entry Pass");
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("               Entry Pass");
                    System.out.println();
                    System.out.println("Booked By: " +firstname +" "+ lastname);
                    System.out.println("Date and Time of Booking: " +form.format(date));
                    System.out.println("From:           Gandhinagar");
                    System.out.println("To:             Vadodara");
                    System.out.println();
                    System.out.println("*** This Entry Pass is valid ONLY with Boarding Pass***");
                    System.out.println("--------------------------------------------------------------------------");
                    Ticket_Booking_Bus GviaV= new Ticket_Booking_Bus();
                    Ticket_Booking_Bus.Seatbooking();
                    System.out.println("Thank You for Visiting");

                }
                break;
                case 2:
                System.out.println("Your opted route for the journey is from Vadodara to Gandhinagar via Ahmedabad.");
                System.out.println();
                System.out.println("You will be costed Rs.10 per KM including the GST with accessories.");
                System.out.println("Please choose your destination");
                destin=in.next();
                if(destin.equalsIgnoreCase("Ahmedabad"))
                {
                    System.out.println("Your route has been modified from Vadodara to Ahmedabad");
                    System.out.println("Total Distance: 111.5 KM");
                    amt=111.5*10.0;
                    System.out.println();
                    System.out.println(" Your Total Amount: Rs. "+amt);
                    System.out.println();
                    System.out.println("Please print this Entry Pass");
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("               Entry Pass");
                    System.out.println();
                    System.out.println("Booked By: " +firstname +" "+ lastname);
                    System.out.println("Date and Time of Booking: " +form.format(date));
                    System.out.println("From:           Vadodara");
                    System.out.println("To:             Ahmedabad");
                    System.out.println();
                    System.out.println("*** This Entry Pass is valid ONLY with Boarding Pass***");
                    System.out.println("--------------------------------------------------------------------------");
                    Ticket_Booking_Bus GviaA= new Ticket_Booking_Bus();
                    Ticket_Booking_Bus.Seatbooking();
                    System.out.println("Thank You for Visiting");

                }
                else
                {
                    System.out.println("Your route has been set from Vadodara to Gandhinagar");
                    System.out.println("Total Distance: 131.8 KM");
                    amt=131.8*10.0;
                    System.out.println();
                    System.out.println("Your Total Amount: Rs. "+amt);
                    System.out.println();
                    System.out.println("Please print this Entry Pass");
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("               Entry Pass");
                    System.out.println();
                    System.out.println("Booked By: " +firstname +" "+ lastname);
                    System.out.println("Date and Time of Booking: " +form.format(date));
                    System.out.println("From:           Vadodara");
                    System.out.println("To:             Gandhinagar");
                    System.out.println();
                    System.out.println("*** This Entry Pass is valid ONLY with Boarding Pass***");
                    System.out.println("--------------------------------------------------------------------------");
                    Ticket_Booking_Bus VviaG= new Ticket_Booking_Bus();
                    Ticket_Booking_Bus.Seatbooking();
                    System.out.println("Thank You for Visiting");

                }
                break;
                case 3:
                System.out.println("Your opted route for the journey is from Ahmedabad to Gandhinagar.");
                System.out.println("You will be costed Rs.10 per KM including the GST with accessories.");
                System.out.println("Total Distance: 27.1 KM");
                amt=27.1*10.0;
                    System.out.println();
                    System.out.println(" Your Total Amount: Rs. "+amt);
                    System.out.println();
                    System.out.println("Please print this Entry Pass");
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("               Entry Pass");
                    System.out.println();
                    System.out.println("Booked By: " +firstname +" "+ lastname);
                    System.out.println("Date and Time of Booking: " +form.format(date));
                    System.out.println("From:           Ahmedabad");
                    System.out.println("To:             Gandhinagar");
                    System.out.println();
                    System.out.println("*** This Entry Pass is valid ONLY with Boarding Pass***");
                    System.out.println("--------------------------------------------------------------------------");
                    Ticket_Booking_Bus AviaG= new Ticket_Booking_Bus();
                    Ticket_Booking_Bus.Seatbooking();
                    System.out.println("Thank You for Visiting");

                    break;
                    case 4:
                    System.out.println("Your opted route for the journey is from Ahmedabad to Vadodara");
                    System.out.println("You will be costed Rs.10 per KM including the GST with accessories.");
                    System.out.println("Total Distance: 111.5 KM");
                    amt=111.5*10.0;
                    System.out.println();
                    System.out.println(" Your Total Amount: Rs. "+amt);
                    System.out.println();
                    System.out.println("Please print this Entry Pass");
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("               Entry Pass");
                    System.out.println();
                    System.out.println("Booked By: " +firstname +" "+ lastname);
                    System.out.println(" Date and Time of Booking: " +form.format(date));
                    System.out.println("From:           Ahmedabad");
                    System.out.println("To:             Vadodara");
                    System.out.println();
                    System.out.println("*** This Entry Pass is valid ONLY with Boarding Pass***");
                    System.out.println("--------------------------------------------------------------------------");
                    Ticket_Booking_Bus AviaV= new Ticket_Booking_Bus();
                    Ticket_Booking_Bus.Seatbooking();
                    System.out.println("Thank You for Visiting");

                    break;
                    case 0:
                    System.out.println("Thank you for your cooperation.");
                    System.out.println("Please visit again.");
                    break;
                    default:
                    System.out.println("You have entered the wrong value.");
                    System.out.println("Please exit and start again.");
                    break;
                }
            }
                else
                {
                System.out.println("Thank you for visiting.");
            }
}
}

