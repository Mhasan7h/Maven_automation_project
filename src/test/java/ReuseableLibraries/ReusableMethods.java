package ReuseableLibraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReusableMethods {

    //create a void method to add two numbers

    public static void addTwoNumbers(int num1, int num2){
        int result = num1+num2;
        System.out.println("The result of two numbers is " + result);

    }//end of add two number method


    // create return integer method to subtract two numbers
    public static int subtractTwoNumbers(int a , int b){
        int result = a - b;
        System.out.println("teh result of two numbers for subtraction "+ result);
        return result;
    }// end of subtract method



    public static void chromeOption(){

        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximise the screen for windows
//        options.addArguments("start-maximized");
        // for mac
          options.addArguments("start-fullscreen");
        // set your driver as headless(running in background)
         options.addArguments("headless");


    }// end of chromeOption




}//end of java class
