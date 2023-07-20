//*****************************************************************************************************
//
//  Name: Derek Gallardo
//  Date: June 25th, 2022
//  Version: 1.0.0
//  Programming Language: Java
//  Java Version: 17
//  Description: Display and change attributes from a list of defined Books. Add new books to the list.
//
//*****************************************************************************************************

import java.util.ArrayList;
import java.util.*;

public class ProjectTester {
public static void main (String[] args) throws Exception {

   ArrayList<Book> books = new ArrayList<Book>();
   Book bookOne = new Book("The Catch", "Science Fiction", "Blue", 0, 288, false);
   Book bookTwo = new Book("An Immense World", "Fiction", "Red", 0, 100, false);
   Book bookThree = new Book("The Final Strife", "Fiction", "Green", 0, 115, false);
   Book bookFour = new Book("Introduction to Information Technology", "Information Technology", "Yellow", 0, 432, false);
   Book bookFive = new Book("The Disappearing Act", "Fiction", "Black", 0, 104, false);
   Book bookSix = new Book("The Eagle's Claw", "Fiction", "Grey", 0, 323, true); 
   books.add(bookOne);
   books.add(bookTwo);
   books.add(bookThree);
   books.add(bookFour);
   books.add(bookFive);
   books.add(bookSix);
   Scanner input = new Scanner(System.in);
   int option;
   
   // Book List
   System.out.println("Here is the list of books in the classroom inventory.");
   System.out.println("=====================================================");
   
   do {
      for (Book i : books) {
      System.out.println(i.getName()+ ", " + i.getGenre());
      }
      
   System.out.println("=====================================================");
   System.out.println("Please wait 2 seconds for the main menu to display.");
   Thread.sleep(3000);
   
   // Main Menu
   System.out.println("=====================================================");
   System.out.println("Choose an option: ");
   System.out.println("=====================================================");
   System.out.println("Type 1 for: " + books.get(0).getName());
   System.out.println("Type 2 for: " + books.get(1).getName());
   System.out.println("Type 3 for: " + books.get(2).getName());
   System.out.println("Type 4 for: " + books.get(3).getName());
   System.out.println("Type 5 for: " + books.get(4).getName());
   System.out.println("Type 6 for: " + books.get(5).getName());
   System.out.println("Type 77 to add a new Book.");
   System.out.println("Type 0 to exit the program.");
   System.out.println("=====================================================");
   
   // Input
   option = input.nextInt();
   System.out.println("Option chosen is: " + option); 
      
        // Book 1
        switch (option) {
            case 1:  if (option == 1) {
                     System.out.println("What would you like to do?");
                     System.out.println("Type 1 to Display the Genre");
                     System.out.println("Type 2 to Change the Genre");
                     System.out.println("Type 3 to Display the Color");
                     System.out.println("Type 4 to Change the Color");
                     System.out.println("Type 5 to Display the Page Count");
                     System.out.println("Type 6 to Change the Page Count");
                     System.out.println("Type 7 to Display if the Book is a Best Seller");
                     System.out.println("Type 8 to Change the Book's Best Seller status");    
                     System.out.println("Type 9 to Display how many pages you have read so far");
                     System.out.println("Type 10 to Change the number of pages you want to read");     
                     System.out.println("Type 11 to return to the main menu.");                                            
                     option = input.nextInt();
                     input.nextLine();
                     // Inner switch for Book 1
                     switch (option) {
                     
 
                     case 1:  System.out.println("The genre for " + books.get(0).getName() + " is " + books.get(0).getGenre() + ".");
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                    
                     case 2:  System.out.println("Set your genre");
                              books.get(0).setGenre(input.nextLine());
                              System.out.println("Genre for " + books.get(0).getName() + " has changed to " + books.get(0).getGenre());
                              break;
                              
                     case 3:  System.out.println("The color for " + books.get(0).getName() + " is " + books.get(0).getColor() + ".");
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                     
                     case 4:  System.out.println("Set your color");
                              books.get(0).setColor(input.nextLine());
                              System.out.println("Color for " + books.get(0).getName() + " has changed to " + books.get(0).getColor());
                              break;
                     case 5:  System.out.println("The page count for " + books.get(0).getName() + " is " + books.get(0).getPageCount() + ".");
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                    
                     case 6:  System.out.println("Set your page count");
                              books.get(0).setPageCount(input.nextInt());
                              System.out.println("Page Count for " + books.get(0).getName() + " has changed to " + books.get(0).getPageCount());
                              break;
                     case 7:  System.out.println("Is " + books.get(0).getName() + " a best seller? " + books.get(0).getBestSeller());
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                    
                     case 8:  System.out.println("Set true OR false for the Book's bestseller status");
                              books.get(0).setBestSeller(input.nextBoolean());
                              System.out.println("Best Seller status for " + books.get(0).getName() + " has changed to " + books.get(0).getBestSeller());
                              break;    
                     case 9:  System.out.println("The number of pages read for " + books.get(0).getName() + " is " + books.get(0).getPagesRead() + " pages");
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                          
                     case 10: System.out.println("Set the number of pages you have read");
                              books.get(0).setPagesRead(input.nextInt());
                              System.out.println("Pages read for " + books.get(0).getName() + " has changed to " + books.get(0).getPagesRead() + " pages. " + "There are " + books.get(0).getPagesRemaining() + " pages remaining to be read.");
                              break;            
                              
                     case 11: if (option == 11) { 
                              System.out.println("Returning to main menu");
                              break;    
                              }       
                         } // end of inner switch block
                     } // End of case/book 1 if block
       
            // Book 2
            case 2:     if (option == 2) {
                        System.out.println("What would you like to do?");
                        System.out.println("Type 1 to Display the Genre");
                        System.out.println("Type 2 to Change the Genre");
                        System.out.println("Type 3 to Display the Color");
                        System.out.println("Type 4 to Change the Color");
                        System.out.println("Type 5 to Display the Page Count");
                        System.out.println("Type 6 to Change the Page Count");
                        System.out.println("Type 7 to Display if the Book is a Best Seller");
                        System.out.println("Type 8 to Change the Book's Best Seller status");    
                        System.out.println("Type 9 to Display how many pages you have read so far");
                        System.out.println("Type 10 to Change the number of pages you want to read");
                        System.out.println("Type 11 to return to the main menu.");                                                
                        option = input.nextInt();
                        input.nextLine();
                        
                        // Inner switch for Book 2
                        switch (option) {
                        
                        case 1:  System.out.println("The genre for " + books.get(1).getName() + " is " + books.get(1).getGenre() + ".");
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                    
                        case 2:  System.out.println("Set your genre");
                                 books.get(1).setGenre(input.nextLine());
                                 System.out.println("Genre for " + books.get(1).getName() + " has changed to " + books.get(1).getGenre());
                                 break;
                        case 3:  System.out.println("The color for " + books.get(1).getName() + " is " + books.get(1).getColor() + ".");
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                    
                        case 4:  System.out.println("Set your color");
                                 books.get(1).setColor(input.nextLine());
                                 System.out.println("Color for " + books.get(1).getName() + " has changed to " + books.get(1).getColor());
                                 break;
                        case 5:  System.out.println("The page count for " + books.get(1).getName() + " is " + books.get(1).getPageCount() + ".");
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                     
                        case 6:  System.out.println("Set your page count");
                                 books.get(1).setPageCount(input.nextInt());
                                 System.out.println("Page Count for " + books.get(1).getName() + " has changed to " + books.get(1).getPageCount());
                                 break;
                        case 7:  System.out.println("Is " + books.get(1).getName() + " a best seller? " + books.get(1).getBestSeller());
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                           
                        case 8:  System.out.println("Set true OR false for the Book's bestseller status");
                                 books.get(1).setBestSeller(input.nextBoolean());
                                 System.out.println("Best Seller status for " + books.get(1).getName() + " has changed to " + books.get(1).getBestSeller());
                                 break;    
                        case 9:  System.out.println("The number of pages read for " + books.get(1).getName() + " is " + books.get(1).getPagesRead() + " pages");
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                    
                        case 10: System.out.println("Set the number of pages you have read");
                                 books.get(1).setPagesRead(input.nextInt());
                                 System.out.println("Pages read for " + books.get(1).getName() + " has changed to " + books.get(1).getPagesRead() + " pages. " + "There are " + books.get(1).getPagesRemaining() + " pages remaining to be read.");
                                 break;
                        case 11: if (option == 11) { 
                                 System.out.println("Returning to main menu");
                                 break;    
                                 }                                                                
                           } // end inner switch block 2 
                        } // End of case/book 2 if block
            
            // Book 3
            case 3:     if (option == 3) {
                        System.out.println("What would you like to do?");
                        System.out.println("Type 1 to Display the Genre");
                        System.out.println("Type 2 to Change the Genre");
                        System.out.println("Type 3 to Display the Color");
                        System.out.println("Type 4 to Change the Color");
                        System.out.println("Type 5 to Display the Page Count");
                        System.out.println("Type 6 to Change the Page Count");
                        System.out.println("Type 7 to Display if the Book is a Best Seller");
                        System.out.println("Type 8 to Change the Book's Best Seller status");    
                        System.out.println("Type 9 to Display how many pages you have read so far");
                        System.out.println("Type 10 to Change the number of pages you want to read");
                        System.out.println("Type 11 to return to the main menu.");                                                
                        option = input.nextInt();
                        input.nextLine();
                        
                        // Inner switch for Book 3
                        switch (option) {
                        
                        case 1:  System.out.println("The genre for " + books.get(2).getName() + " is " + books.get(2).getGenre() + ".");
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                          
                        case 2:  System.out.println("Set your genre");
                                 books.get(2).setGenre(input.nextLine());
                                 System.out.println("Genre for " + books.get(2).getName() + " has changed to " + books.get(2).getGenre());
                                 break;
                        case 3:  System.out.println("The color for " + books.get(2).getName() + " is " + books.get(2).getColor() + ".");
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                   
                        case 4:  System.out.println("Set your color");
                                 books.get(2).setColor(input.nextLine());
                                 System.out.println("Color for " + books.get(2).getName() + " has changed to " + books.get(2).getColor());
                                 break;
                        case 5:  System.out.println("The page count for " + books.get(2).getName() + " is " + books.get(2).getPageCount() + ".");
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                     
                        case 6:  System.out.println("Set your page count");
                                 books.get(2).setPageCount(input.nextInt());
                                 System.out.println("Page Count for " + books.get(2).getName() + " has changed to " + books.get(2).getPageCount());
                                 break;
                        case 7:  System.out.println("Is " + books.get(2).getName() + " a best seller? " + books.get(2).getBestSeller());
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                           
                        case 8:  System.out.println("Set true OR false for the Book's bestseller status");
                                 books.get(2).setBestSeller(input.nextBoolean());
                                 System.out.println("Best Seller status for " + books.get(2).getName() + " has changed to " + books.get(2).getBestSeller());
                                 break;    
                        case 9:  System.out.println("The number of pages read for " + books.get(2).getName() + " is " + books.get(2).getPagesRead() + " pages");
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                    
                        case 10: System.out.println("Set the number of pages you have read");
                                 books.get(2).setPagesRead(input.nextInt());
                                 System.out.println("Pages read for " + books.get(2).getName() + " has changed to " + books.get(2).getPagesRead() + " pages. " + "There are " + books.get(2).getPagesRemaining() + " pages remaining to be read.");
                                 break;    
                        case 11: if (option == 11) { 
                                 System.out.println("Returning to main menu");
                                 break;    
                                 }                                                                     
                           } // end inner switch block 3
                        
                        } // End of case/book 3 if block
            
            // Book 4
            case 4:     if (option == 4) {
                        System.out.println("What would you like to do?");
                        System.out.println("Type 1 to Display the Genre");
                        System.out.println("Type 2 to Change the Genre");
                        System.out.println("Type 3 to Display the Color");
                        System.out.println("Type 4 to Change the Color");
                        System.out.println("Type 5 to Display the Page Count");
                        System.out.println("Type 6 to Change the Page Count");
                        System.out.println("Type 7 to Display if the Book is a Best Seller");
                        System.out.println("Type 8 to Change the Book's Best Seller status");    
                        System.out.println("Type 9 to Display how many pages you have read so far");
                        System.out.println("Type 10 to Change the number of pages you want to read");
                        System.out.println("Type 11 to return to the main menu.");                                                
                        option = input.nextInt();
                        input.nextLine();
                        
                        // Inner switch for Book 4
                        switch (option) {
                        case 1:  System.out.println("The genre for " + books.get(3).getName() + " is " + books.get(3).getGenre() + ".");
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                               
                        case 2:  System.out.println("Set your genre");
                                 books.get(3).setGenre(input.nextLine());
                                 System.out.println("Genre for " + books.get(3).getName() + " has changed to " + books.get(3).getGenre());
                                 break;
                        case 3:  System.out.println("The color for " + books.get(3).getName() + " is " + books.get(3).getColor() + ".");
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                   
                        case 4:  System.out.println("Set your color");
                                 books.get(3).setColor(input.nextLine());
                                 System.out.println("Color for " + books.get(3).getName() + " has changed to " + books.get(3).getColor());
                                 break;
                        case 5:  System.out.println("The page count for " + books.get(3).getName() + " is " + books.get(3).getPageCount() + ".");
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                   
                        case 6:  System.out.println("Set your page count");
                                 books.get(3).setPageCount(input.nextInt());
                                 System.out.println("Page Count for " + books.get(3).getName() + " has changed to " + books.get(3).getPageCount());
                                 break;
                        case 7:  System.out.println("Is " + books.get(3).getName() + " a best seller? " + books.get(3).getBestSeller());
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                           
                        case 8:  System.out.println("Set true OR false for the Book's bestseller status");
                                 books.get(3).setBestSeller(input.nextBoolean());
                                 System.out.println("Best Seller status for " + books.get(3).getName() + " has changed to " + books.get(3).getBestSeller());
                                 break;    
                        case 9:  System.out.println("The number of pages read for " + books.get(3).getName() + " is " + books.get(3).getPagesRead() + " pages");
                                 System.out.println("Please wait 3 seconds for the menu to reload.");
                                 System.out.println("=====================================================");
                                 Thread.sleep(3000);
                                 break;                
                        case 10: System.out.println("Set the number of pages you have read");
                                 books.get(3).setPagesRead(input.nextInt());
                                 System.out.println("Pages read for " + books.get(3).getName() + " has changed to " + books.get(3).getPagesRead() + " pages. " + "There are " + books.get(3).getPagesRemaining() + " pages remaining to be read.");
                                 break;
                        case 11: if (option == 11) { 
                                 System.out.println("Returning to main menu");
                                 break;    
                                 }                                                                         
                           } // end of inner switch block 4
                        } // End of case/book 4 if block
           
           // Book 5
           case 5:   if (option == 5) {
                     System.out.println("What would you like to do?");
                     System.out.println("Type 1 to Display the Genre");
                     System.out.println("Type 2 to Change the Genre");
                     System.out.println("Type 3 to Display the Color");
                     System.out.println("Type 4 to Change the Color");
                     System.out.println("Type 5 to Display the Page Count");
                     System.out.println("Type 6 to Change the Page Count");
                     System.out.println("Type 7 to Display if the Book is a Best Seller");
                     System.out.println("Type 8 to Change the Book's Best Seller status");    
                     System.out.println("Type 9 to Display how many pages you have read so far");
                     System.out.println("Type 10 to Change the number of pages you want to read");
                     System.out.println("Type 11 to return to the main menu.");                                               
                     option = input.nextInt();
                     input.nextLine();
                     
                     // Inner switch for Book 5
                     switch (option) {
                     case 1:  System.out.println("The genre for " + books.get(4).getName() + " is " + books.get(4).getGenre() + ".");
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                               
                     case 2:  System.out.println("Set your genre");
                              books.get(4).setGenre(input.nextLine());
                              System.out.println("Genre for " + books.get(4).getName() + " has changed to " + books.get(4).getGenre());
                              break;
                     case 3:  System.out.println("The color for " + books.get(4).getName() + " is " + books.get(4).getColor() + ".");
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                    
                     case 4:  System.out.println("Set your color");
                              books.get(4).setColor(input.nextLine());
                              System.out.println("Color for " + books.get(4).getName() + " has changed to " + books.get(4).getColor());
                              break;
                     case 5:  System.out.println("The page count for " + books.get(4).getName() + " is " + books.get(4).getPageCount() + ".");
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                    
                     case 6:  System.out.println("Set your page count");
                              books.get(4).setPageCount(input.nextInt());
                              System.out.println("Page Count for " + books.get(4).getName() + " has changed to " + books.get(4).getPageCount());
                              break;
                     case 7:  System.out.println("Is " + books.get(4).getName() + " a best seller? " + books.get(4).getBestSeller());
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                           
                     case 8:  System.out.println("Set true OR false for the Book's bestseller status");
                              books.get(4).setBestSeller(input.nextBoolean());
                              System.out.println("Best Seller status for " + books.get(4).getName() + " has changed to " + books.get(4).getBestSeller());
                              break;    
                     case 9:  System.out.println("The number of pages read for " + books.get(4).getName() + " is " + books.get(4).getPagesRead() + " pages");
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                    
                     case 10: System.out.println("Set the number of pages you have read");
                              books.get(4).setPagesRead(input.nextInt());
                              System.out.println("Pages read for " + books.get(4).getName() + " has changed to " + books.get(4).getPagesRead() + " pages. " + "There are " + books.get(4).getPagesRemaining() + " pages remaining to be read.");
                              break;
                     case 11: if (option == 11) { 
                              System.out.println("Returning to main menu");
                              break;    
                              }                                                                        
                        } // end of inner switch block 5
                     } // End of case/book 5 if block
            
           // Book 6
           case 6:   if (option == 6) {
                     System.out.println("What would you like to do?");
                     System.out.println("Type 1 to Display the Genre");
                     System.out.println("Type 2 to Change the Genre");
                     System.out.println("Type 3 to Display the Color");
                     System.out.println("Type 4 to Change the Color");
                     System.out.println("Type 5 to Display the Page Count");
                     System.out.println("Type 6 to Change the Page Count");
                     System.out.println("Type 7 to Display if the Book is a Best Seller");
                     System.out.println("Type 8 to Change the Book's Best Seller status");    
                     System.out.println("Type 9 to Display how many pages you have read so far");
                     System.out.println("Type 10 to Change the number of pages you want to read");
                     System.out.println("Type 11 to return to the main menu.");                                                
                     option = input.nextInt();
                     input.nextLine();
                     
                     // Inner switch for Book 6
                     switch (option) {
                     case 1:  System.out.println("The genre for " + books.get(5).getName() + " is " + books.get(5).getGenre() + ".");
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                              
                     case 2:  System.out.println("Set your genre");
                              books.get(5).setGenre(input.nextLine());
                              System.out.println("Genre for " + books.get(5).getName() + " has changed to " + books.get(5).getGenre());
                              break;
                     case 3:  System.out.println("The color for " + books.get(5).getName() + " is " + books.get(5).getColor() + ".");
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                    
                     case 4:  System.out.println("Set your color");
                              books.get(5).setColor(input.nextLine());
                              System.out.println("Color for " + books.get(5).getName() + " has changed to " + books.get(5).getColor());
                              break;
                     case 5:  System.out.println("The page count for " + books.get(5).getName() + " is " + books.get(5).getPageCount() + ".");
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                     
                     case 6:  System.out.println("Set your page count");
                              books.get(5).setPageCount(input.nextInt());
                              System.out.println("Page Count for " + books.get(5).getName() + " has changed to " + books.get(5).getPageCount());
                              break;
                     case 7:  System.out.println("Is " + books.get(5).getName() + " a best seller? " + books.get(5).getBestSeller());
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                          
                     case 8:  System.out.println("Set true OR false for the Book's bestseller status");
                              books.get(5).setBestSeller(input.nextBoolean());
                              System.out.println("Best Seller status for " + books.get(5).getName() + " has changed to " + books.get(5).getBestSeller());
                              break;    
                     case 9:  System.out.println("The number of pages read for " + books.get(5).getName() + " is " + books.get(5).getPagesRead() + " pages");
                              System.out.println("Please wait 3 seconds for the menu to reload.");
                              System.out.println("=====================================================");
                              Thread.sleep(3000);
                              break;                   
                     case 10: System.out.println("Set the number of pages you have read");
                              books.get(5).setPagesRead(input.nextInt());
                              System.out.println("Pages read for " + books.get(5).getName() + " has changed to " + books.get(5).getPagesRead() + " pages. " + "There are " + books.get(5).getPagesRemaining() + " pages remaining to be read.");
                              break;
                     case 11: if (option == 11) { 
                              System.out.println("Returning to main menu");
                              break;    
                              }                                                                       
                        }   // end of inner switch block 6   
                     } // End of case/book 6 if block
            
            
             // New Book Addition
            case 77: if (option == 77) {
                    input.nextLine();
                    System.out.println("Please enter the name of your book: " );
                    String bookName = input.nextLine();
                    System.out.print("Please enter the genre of your book: " );
                    String bookGenre = input.nextLine();
                    System.out.print("Please enter the color of your book: " );
                    String bookColor = input.nextLine();
                    System.out.print("Please enter how many pages you have read so far (numbers only): " );
                    int pagesRead = input.nextInt();
                    System.out.print("Please enter how many pages your book contains (numbers only): " );
                    int pageCount = input.nextInt();
                    System.out.print("Please enter true or false if your book is a best seller: " );
                    boolean bestSeller = input.nextBoolean();
                    Book bookSeven = new Book(bookName, bookGenre, bookColor, pagesRead, pageCount, bestSeller);
                    books.add(bookSeven);
                    System.out.println("====================================================="); 
                    System.out.println("A new book has been added to the inventory");   
                    System.out.println("=====================================================");  
                    Thread.sleep(1000);
                    }
                    
            // End the Program
            case 0: if (option == 0) {
                     System.out.println("You have chosen to exit the program. Goodbye.");
                     } 
                     
      } // End of outer switch block
      
    } while (option != 0);     // End of Do while loop     
      
      input.close(); // Scanner closes
      
   } // end of method
} // end of tester class
