import java.util.Scanner;
public class Ticket_Booking_Bus
{
private static int[] seats = new int[12];
public static void Seatbooking()
    {
System.out.println();
for(int i = 0; i<12; i++)
        {
seats[i] = 0;
        }
        Scanner s = new Scanner(System.in);
int choice = 1;
System.out.print("Please enter 1 for window, 2 for side window: ");
choice = s.nextInt();
while (choice !=0)
        {
int seatnumber = 0;
if (choice == 1)
            {
seatnumber = bookWindow();
if(seatnumber == -1)
                {
seatnumber = bookAisle();
if(seatnumber != -1)
                    {
System.out.println("Sorry, we were not able to book a window seat, but do have a side window seat");
System.out.println();
printBoardingPass(seatnumber);
                    }
                }
else
                {
System.out.println("We have a window seat available!");
System.out.println();
System.out.println();
printBoardingPass(seatnumber);
                }
            }
else if (choice == 2)
            {
seatnumber = bookAisle();
if (seatnumber == -1)
                {
seatnumber = bookWindow();
if (seatnumber != -1)
                    {
System.out.println("Sorry, we were not able to book a side window seat, but do have a window seat");
System.out.println();
System.out.println();
printBoardingPass(seatnumber);
                    }
                }
else
                {
System.out.println("We have a side window seat available!");
System.out.println();
System.out.println();
printBoardingPass(seatnumber);
                }
            }
else
            {
System.out.println("Invalid choice made. Please try again!");
choice = 0;
            }
if(seatnumber == -1)
            {
System.out.println("We are sorry, there are no seats available.");
System.out.println();
System.out.println();
            }
System.out.print("Please enter 1 for window, 2 for side window, 0 to exit: ");
choice = s.nextInt();
        }
    }
private static int bookWindow()
    {
for (int i = 0; i<6; i++)
        {
if (seats[i] == 0)
            {
seats [i] = 1;
return i + 1;
            }
        }
return -1;
    }
private static int bookAisle()
    {
for(int i = 6; i<12; i++)
        {
if (seats [i] == 0)
            {
seats[i] = 1;
return i + 1;
            }
        }
return -1;
    }
private static void printBoardingPass(int seatnumber)
    {
System.out.println("Please print this Boarding Pass.");
System.out.println("--------------------------------------------------------------------------");
System.out.println("Your Seat Number Is " + seatnumber);
System.out.println();
System.out.println("This Boarding Pass is Non-Refundable and Non-Transferable");
System.out.println("Please be curteous.");
System.out.println("No Smoking during the journey");
System.out.println("Enjoy your trip.");
System.out.println();
System.out.println("--------------------------------------------------------------------------");
    }
}
