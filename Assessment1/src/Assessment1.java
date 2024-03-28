public class Assessment1 {

    public static void main(String[] args){

        Assessment1 a1 = new Assessment1();

        // Instruction: To run your respective task, uncomment below individually
//        a1.task1();
//        a1.task2();
//        a1.task3();
//        a1.task4();
//        a1.task5();

    }

    private void task1(){
        // code your task 1 here
        //first way without using variable
        System.out.println("Without using variable: ");

        //output
        System.out.println(5 + "\n" + 8 + "\n" + 4 + "\n" + 2);
        //sum of all numbers
        System.out.println(5 + 8 + 4 + 2);

        //second way using 4 independent variable and another variable for sum
        System.out.println("\nUsing 4 variables and another variable for sum: ");

        //declaration and initialization
        int num1, num2,num3,num4,sumOfNums;
        num1 = 5;
        num2 = 8;
        num3 = 4;
        num4 = 2;

        //sum of all variables
        sumOfNums = num1+ num2 + num3 + num4;
        //output
        System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4);
        System.out.println(sumOfNums);

        //third way reusing the same variable for numbers and another variable for sum
        System.out.println("\nThird way reusing the same variable and another variable for sum:");

        //declaration and initialisation
        int reusingInt = 5;
        int sumOfAll = 0;
        sumOfAll += reusingInt;

        //output
        System.out.println(reusingInt);

        //reassigning
        reusingInt = 8;
        //store the value to sumofall variable
        sumOfAll += reusingInt;
        System.out.println(reusingInt);

        reusingInt = 4;
        sumOfAll += reusingInt;
        System.out.println(reusingInt);

        reusingInt = 2;
        sumOfAll += reusingInt;
        System.out.println(reusingInt);

        System.out.println(sumOfAll);

    }

    private void task2(){
        // code your task 2 here
        //Question1
        double jogSpeed = 6.5;
        System.out.println("Jogging Speed: " + jogSpeed + "mph");

        //Question2
        final String FIT_WORKSHOP_LECTURER = "Moganavatsala";
        System.out.println("FIT1051 lecturer workshop: " + FIT_WORKSHOP_LECTURER);

        //Question3
        final int MAX_TRAIN_PASSENGERS = 200;
        System.out.println("The capacity of a passengers in a train wagon: " + MAX_TRAIN_PASSENGERS + " passengers");

        //Question4
        final double LENGTH_DESK= 1500;
        System.out.println("Length of a desk in millimetres: " + LENGTH_DESK + "mm");

        //Question5
        boolean switchState = true;
        System.out.println("The state of a light switch is: " + switchState);

        //Question6
        int booksAmount = 30;
        System.out.println("The number of books on a library shelf: " + booksAmount + " books");

        //Question7
        int personCovidVaccineShots = 4;
        System.out.println("The amount of Covid vaccinations a person can have so far are " + personCovidVaccineShots + " shots");

        //Question8
        double temperatureDay= 32.5;
        System.out.println("The current temperature of the day " + temperatureDay + " degree celcius");

        //Question9
        final int ACES_IN_DECK = 4;
        System.out.println("The number of Aces in a deck of cards are " + ACES_IN_DECK);

        //Question10
        int sizeCompChip = 128;
        System.out.println("The memory size of a computer chip: " + sizeCompChip + " Mbit");

        //Question11
        enum trafficLight {RED, YELLOW, GREEN};
        System.out.println("The state of a traffic light, which can either be " + "\"" + trafficLight.RED + "\", " +  "\"" + trafficLight.YELLOW + "\" " + "or" +  " \"" + trafficLight.GREEN + "\"" );
    }

    private void task3(){
        // code your task 3 here
        float floatType = 123.4f;
        int intType = 3;
        String StringType = "I am a String";
        double doubleType = 456.7;
        boolean booleanType = true;

        floatType = intType; //widening casting, java cast automatically
        floatType = (float)intType; // widening casting, java will cast automatically.Thus,(float) is unnecessary
//      floatType = doubleType; //narrowing casting, do manually
        floatType = (float) doubleType; //narrowing casting, need to do it manually
//      floatType = (float) StringType;//unable to cast String with float
//      floatType = StringType;//unable to cast String to float
//      floatType = (float) booleanType;//unable to cast booleanType as it only returns true or false even with (float)
//      floatType = booleanType;//unable to cast booleanType as it only returns true or false

//      intType = floatType;//narrowing casting, need to do it manually
        intType = (int)floatType;//narrowing casting, need to do it manually with (int)
//      intType = StringType; //unable to cast String
//      intType = (int)StringType;//unable to cast String
//      intType = doubleType; //narrowing casting need to do it manually
        intType = (int)doubleType;//narrowing casting, need to do it manually with (int)
//      intType = booleanType; //unable to cast booleanType as it only returns true or false
//      intType = (int)booleanType;//unable to cast booleanType as it only returns true or false

        doubleType = floatType; //widening casting, java cast automatically
        doubleType = (double)floatType;//(double) is unnecessary as widening casting java cast automatically
        doubleType = intType; //widening casting, java cast automatically
        doubleType = (double) intType;//(int)is unnecessary as widening casting java cast automatically
//      doubleType = StringType; //String unable cast to double
//      doubleType = (double)StringType; //String unable cast to double even with (double)
//      doubleType = booleanType; //boolean unable cast to double
//      doubleType = (double)booleanType; //boolean unable cast to double even with (double)

//      StringType = floatType; //unable cast float to string
//      StringType = (String)floatType; //unable cast float to string even with (string)
//      StringType = doubleType; //unable cast double to string
//      StringType = (String)doubleType;  //unable cast double to string even with (String)
//      StringType = booleanType; //unable to cast boolean to String
//      StringType = (String)booleanType;//unable to cast boolean to String even with (String)
//      StringType = intType; //unable to cast int to String
//      StringType = (String)intType; //unable to cast int to String even with (String)

//      booleanType = floatType; //unable to cast float to boolean
//      booleanType = (boolean)floatType; //unable to cast float to boolean even with (boolean)
//      booleanType = intType; //unable to cast int to boolean
//      booleanType = (boolean)intType; //unable to cast int to boolean even with (boolean)
//      booleanType = StringType; //unable to cast String to boolean
//      booleanType = (boolean)StringType; //unable to cast String to boolean even with (boolean)
//      booleanType = doubleType; //unable to cast double to boolean
//      booleanType = (boolean)doubleType; //unable to cast double to boolean even with (boolean)

        //java will automatically cast for us when it is widening casting which is convert from smaller units to larger units
        //java will not help us to cast when it is narrowing casting which is convert from larger units to smaller units
        //For Strings and boolean, cannot be cast to other types of variable
        //as String is a reference type variable thus, it cannot convert to primitive type
        //for boolean as it only returns true or false, thus it cannot convert to other types of variable
        //side effects for casting is there will be loss of information.
    }

    private void task4(){
        // code your task 4 here
        //declared all the variable at one time
        String line1,line2,line3,line4,line5,line6,line7,line8,line9,line10,line11,line12,line13,line14,line15;

        //initialise
         line1 = "            @@@@@@@@@@@@@@@@@@@            ";
         line2 = "         @@@@@@@@@@@@@@@@@@@@@@@@          ";
         line3 = "       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@       ";
         line4 = "    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@     ";
         line5 = "  @@@@@@@       @@@@@@@@@@@@      @@@@@@@    ";
         line6 = " @@@@@@@         @@@@@@@@@@        @@@@@@@@  ";
         line7 = "@@@@@@@@@       @@@@@@@@@@@       @@@@@@@@@@ ";
         line8 = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ";
         line9 = "  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  ";
         line10 ="   @@@@@@@@@@   @@@@@@@@@@@   @@@@@@@@@@   ";
         line11 ="    @@@@@@@@@@  @@@@@@@@@@@  @@@@@@@@@@    ";
         line12 ="     @@@@@@@@@@             @@@@@@@@@      ";
         line13 ="       @@@@@@@@@@@@@@@@@@@@@@@@@@@@        ";
         line14 ="          @@@@@@@@@@@@@@@@@@@@@@           ";
         line15 ="            @@@@@@@@@@@@@@@@@@             ";

        //output
        System.out.println(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n" + line6 + "\n" + line7 + "\n" + line8 + "\n" + line9 + "\n" + line10 + "\n" + line11 + "\n" + line12 + "\n" + line13 + "\n" + line14 + "\n" + line15);
    }

    private void task5(){
        // code your task 5 here
//        String s = null;
//        s.length();

        //The error is nullPointerException, it is a runtime error
        //variable s has been declared as string and initialised to null
        //Thus, variable s is not pointing to anything
        //Hence, when we asked for length of the value that has been stored in s.
        //java returned error as variable s is assigned to null
        //when java went to variable s and find the value, it points to null which means it is empty
        //hence java.lang.nullPointerException
    }
}