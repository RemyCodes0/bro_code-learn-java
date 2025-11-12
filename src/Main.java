import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        //This is a comment
        /*
         * This is a multi-line comment
         */
        // System.out.print("I like manoushi\n");
        // System.out.print("I like also pizza\n");
        // System.out.print("This is another output of from the system\n");
        // System.out.println("This is created using sout");

        //variable declaration and assignment

        // int age = 21;
        // int year = 2025;

        // System.out.println(age);
        // System.out.println("The year is "+ year);

        // double price = 19.99;
        // double gpa = 4;
        // System.out.println("The price of this article is: "+ price);
        // System.out.println("My gpa is " + gpa);

        // char grade = 'A';
        // char symbol = '!';
        // char currency = '$';

        // System.out.println("My currency is the: "+ currency);


        // boolean isStudent = true;
        // boolean forSale = false;
        // boolean isOnline = false;
         
        // System.out.println(isStudent);

        // if(forSale){
        //     System.out.println("The sales are out guys");
        // }
        // else{
        //     System.out.println("There are no sales");
        // }

        // String name = "Remy Christophe Tuyishime Hirwa";
        // String food = "pizza";

        // System.out.println("Your favorite food is: "+ food);
        // System.out.println("Hello "+ name + " I hope you are find ");

        // Scanner scanner = new Scanner(System.in);


        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();

        // System.out.print("enter your age: ");
        // int age = scanner.nextInt();

        // System.out.print("Write down the price you want ot bargain for: ");
        // double price = scanner.nextDouble();

        // System.out.print("Are you a student? ");
        // boolean isStudent = scanner.nextBoolean();

        // // String name = scanner.next(); This will allow the code to read just the words written before any space on the user's input
        // System.out.println("Your name is "+ name);
        // System.out.println("Your age is: "+ age);
        // System.out.println("The price you tried to bargain this article for is: "+ price);
        // if(isStudent){
        //     System.out.println("I am a student");
        // }else{
        //     System.out.println("I am not a student");
        // }
        // System.out.println("Enter your age: ");
        // int age = scanner.nextInt();
        // scanner.nextLine();

        // System.out.println("Enter your favorite colour: ");
        // String colour = scanner.nextLine();

        // System.out.println("Your age is "+ age);
        // System.out.println("Your favorite colour is "+ colour);
        // scanner.close();

        // Area of a rectangle
        
        // double width = 0;
        // double height = 0;
        // double area = 0;

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("What is the width of the rectangle: ");
        // width = scanner.nextDouble();

        // System.out.print("What is the height of your rectangle: ");
        // height = scanner.nextDouble();


        // area = width * height;

        // System.out.println("The area of the rectangle is: "+ area);

        // scanner.close();

// MAD LIBS Game
        // Scanner scanner = new Scanner(System.in);
        // String adjective1;
        // String noun1;
        // String adjective2;
        // String verb1;
        // String adjective3;

        // System.out.print("Enter an adjective(description): ");
        // adjective1 = scanner.nextLine();
        // System.out.print("Enter a noun: ");
        // noun1 = scanner.nextLine();
        // System.out.print("Enter an adjective: ");
        // adjective2 = scanner.nextLine();
        // System.out.print("Enter a verb");
        // verb1 = scanner.nextLine();
        // System.out.print("Enter an adjective: ");
        // adjective3 = scanner.nextLine();

        // System.out.println("\nToday I went to a "+ adjective1 + " zoo");
        // System.out.println("In an exhibit, I saw a "+ noun1+ ".");
        // System.out.println(noun1 + " was "+ adjective2 + " and "+ verb1);
        // System.out.println("I was "+ adjective3+ "!");

        // // scanner.close(); 

        // int x = 10;
        // int y= 2;
        // int z;

        // // z = x+ y;
        // // z = x-y;
        // // z = x*y;
        // // z = x/y;
        // // z = x%y;
        // // z= x%3;

        // //Augmented Assignment Version
        // // x += y;
        // // x-=y;
        // // x*=y;
        // // x/=y;
        // // x%=y;

        // //Increment and Decrement

        // x++;
        // x--;

        // //Order of Operations [P-E-M-D-A-S]
        


        // System.out.println(x);

        // int age = 25;
        // String name;

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Please enter your name: ");
        // name = scanner.nextLine();
        // if(name.isEmpty()){
        //     System.out.println("You should provide a name");
        // }

        // scanner.close();

        // if(age >= 18){
        //     System.out.println("You are an adult");
        // }else if(age < 0){
        //     System.out.println("You haven't been born yet");
        // }
        // else{
        //     System.out.println("You are not an adult");
        // }

        // Random random = new Random();

        // int number;
        // double number1;
        // boolean isHead;
        
        // number1 = random.nextDouble();
        // number = random.nextInt(1, 6);
        // isHead = random.nextBoolean();

        // System.out.println(number);
        // System.out.println(number1);
        // System.out.println(isHead);

        // System.out.println(Math.PI);
        // System.out.println(Math.E);


        // double result;

        // result = Math.pow(2, 3);
        // result = Math.abs(-5);
        // result = Math.sqrt(9);

        // result = Math.round(2.14);
        // result = Math.ceil(4.5);
        // result = Math.floor(4.6);
        // result = Math.max(2, 10);
        // result = Math.min(2, 10);

        // System.out.println(result);


        // String name = "Remy";
        // char firstLetter = 'S';
        // int age = 30;
        // double height = 60.5;
        // boolean isEmployed = true;

        // System.out.printf("Hello %s\n", name);
        // System.out.printf("The character is %c\n", firstLetter);
        // System.out.printf("You are %d years old\n", age);
        // System.out.printf("You are %f inches tall\n", height);
        // System.out.printf("Employed? %b\n", isEmployed);


        // System.out.printf("%s is %d years old", name, age);

        // double price1 = 9000.99;
        // double price2 =100000.15;
        // double price3 = -54000.01;

        // System.out.printf("%+,.2f\n", price1);
        // System.out.printf("%,+.2f\n", price2);
        // System.out.printf("%+(,.1f\n", price3);

        // int id1 = 1;
        // int id2 = 23;
        // int id3 = 456;
        // int id4 = 7890;

        // System.out.printf("%04d\n", id1);
        // System.out.printf("%04d\n", id2);
        // System.out.printf("%04d\n", id3);
        // System.out.printf("%04d\n", id4);


        // String name = "  Remy Christophe Tuyishime Hirwa  ";

        // int length = name.length();
        // char letter = name.charAt(0);
        // int index = name.indexOf("i");
        // int lastIndex = name.lastIndexOf("i");
        // String upper = name.toUpperCase();
        // String lower = name.toLowerCase();
        // String trim = name.trim();
        // String replace = name.replace("i", "o");
        // boolean isEmpty = name.isEmpty();
        // boolean contain = name.contains("i");
        // boolean equal = name.equals("  Remy Christophe Tuyishime Hirwa  ");
        // boolean equalStrict = name.equalsIgnoreCase("  Remy Christophe Tuyishime Hirwa  ");


        // System.out.println(length);
        // System.out.println(letter);
        // System.out.println(index);
        // System.out.println(lastIndex);
        // System.out.println(upper);
        // System.out.println(lower);
        // System.out.println(trim);
        // System.out.println(replace);
        // System.out.println(isEmpty);
        // System.out.println(contain);
        // System.out.println(equal);



        // String email = "ret04@gmail.com";
        
        // String username = email.substring(0, 5);
        // String domain = email.substring(5, 15);
        // String before = email.substring(0, email.indexOf("@"));
        // String after = email.substring(email.indexOf("@"));

        // System.out.println(username);
        // System.out.println(domain);
        // System.out.println(before);
        // System.out.println(after);

        // int score = 55;
        
        // String passOrFail = (score>=60) ? "Pass": "Fail";

        // System.out.println(passOrFail);

        // String day ="Saturday";

        // switch(day){
        //     case "Monday" -> System.out.println("it is a weekday");
        //     case "Tuesday" -> System.out.println("This is weekday");
        //     case "Wednesday" -> System.out.println("This is weekday");
        //     case "Thursday" -> System.out.println("This is weekday");
        //     case "Friday" -> System.out.println("This is weekday");
        //     case "Saturday" -> System.out.println("This is Weekend");
        //     case "Sunday" -> System.out.println("This is Weekend");
        //     default -> System.out.println(day+ "is not a day");
        // }

        // double temp = -20;
        // boolean isSunny = false;



        // if(temp<=30 && temp>=0 && isSunny){
        //     System.out.println("The weather is good");
        //     System.out.println("It is sunny outside");
        // }else if(temp<=30 && temp>=0 && !isSunny){
        //     System.out.println("The weather is good");
        //     System.out.println("It is cloudy outside");
        // }else if(temp>30 || temp<0){
        //     System.out.println("The weather is bad");
        // }

        // Scanner scanner = new Scanner(System.in);

        // String name="";

        // while(name.isEmpty()){
        //     System.out.println("Enter your name");
        //     name = scanner.nextLine();
        // }


        // System.out.println("Hello " + name);






        // scanner.close();


        // while(1==1){
        //     System.out.println("I'm stock inn a while loop");
        // }


        // int age = 1;
        // do{
        //     System.out.println("Do this first");
        // }while(age<0);
    //     int number  = 0;

    //     Scanner scanner = new Scanner(System.in);
    //   do {
    //         System.out.println("Enter a number between 1 - 10");
    //         number = scanner.nextInt();
    //     } while(number < 1 || number>10);

    //     System.out.println("You picked "+ number);

    //     scanner.close();

    // for( int i = 0; i<10 ; i++ ){
    //     System.out.println(i);
    // }
    // for(int i = 0; i<10; i++){
    //     if(i ==3){
    //         break;
    //         // continue;
    //     }
    //     System.out.println(i);
    // }

    // for(int i =1; i<=3; i++){
    //     for(int j =1; j<=9; j++){
    //     System.out.print(j+ " ");
    // }
    // System.out.println();
    // }
    
//     int rows;
//     int columns;
//     char symbol;
//     Scanner scanner = new Scanner(System.in);

//     System.out.println("Enter the number of rows: ");
//     rows = scanner.nextInt();

//     System.out.println("Enter the number of columns: ");
//     columns = scanner.nextInt();

//     System.out.println("Enter the symbol to use: ");
//     symbol = scanner.next().charAt(0);


//     for(int i =0; i<rows; i++){
//  for(int j=0;  j< columns; j++){
//         System.out.print(symbol);
//     }
//     System.out.println();
//     }
   

//     scanner.close();

        // String name = "Remy";
        // int age = 25;


        // happyBirthday(name, age);
        // happyBirthday(name, age);
        // happyBirthday(name, age);
        // double result = square(3);
        // System.out.println(result);

        // System.out.println(cube(3));

// System.out.println(add(1,5, 3));


        // int x = 1;//Local

    //     doSomething();

    // }

    // static void doSomething(){
    //     int x = 2;
    //     System.out.println(x);




        // String[] fruits = {"appel", "orange", "banana", "coconut"};

        // fruits[0]= "pinappele";  
        
        // Arrays.sort(fruits);
        // Arrays.fill(fruits, "pinnapple");

        // int numOfFruits = fruits.length;
        // for(int i=0; i< fruits.length; i++){
        //     System.out.println(fruits[i]);
        // }
        // for(String fruit : fruits){
        //     System.out.println(fruit);
        // }
        // System.out.println(fruits[0]);
        // System.out.println(numOfFruits);

        // Scanner scanner = new Scanner(System.in);
        // int size;


        // String[] foods;
        // System.out.println("what number of food do you want?");
        // size = scanner.nextInt();

        // foods = new String[size];

        // foods[0] = "pizza";
        // foods[1]= "taco";
        // foods[2]= "hamburger";


        // for(int i=0; i < foods.length; i++){
        //     System.out.println("Enter your meal");
        //     foods[i] = scanner.nextLine();
        //     scanner.nextLine();
        // }

        // for(String food: foods){
        //     System.out.println(food);
        // }

        // for(int i = 0; i < foods.length; i++){
        //     System.out.println(foods[i]);
        // }

        // System.out.println(foods.length);

        // scanner.close();

        // Scanner scanner = new Scanner(System.in);
        // int[] numbers = {1,8,6,6,35,245,34,52,3542423,4,23523,5,2345,345,234,32,423,5423,5};
        // String[] fruits ={ "appel", "orange", "banana"};
        // boolean isFound = false;

        // System.out.println("Enter a fruit to search for: ");

        // String target = scanner.nextLine();
        

        // for(int i=0; i< fruits.length; i++){
        //     if(fruits[i].equals(target)){
        //         System.out.println("Element found at index"+i);
        //         isFound = true;
        //         break;
        //     }
        // }

        // if(!isFound){
        //     System.out.println("Element not found in the array");
        // }

        // scanner.close();







    //    System.out.println(add(1,2,3,4,5));


        // String[] fruits ={"apples", "orange", "banana"};
        // String[] vegetable = {"potato", "onions", "carrot"};
        // String[] meats = {"chicken", "pork", "beaf", "fish"};


        // String[][] groceries = {{"apples", "orange", "banana"},
        //                         {"potato", "onions", "carrot"},
        //                         {"chicken", "pork", "beaf", "fish"}};


        // groceries[0][0] = "pineapple";
        // groceries[1][0]= "celery";
        // groceries[1][2] = "onion";

        // for(String[] foods: groceries){
        //     for(String food: foods){
        //             System.out.print(food+ " ");
        //     }
        //     System.out.println();
    //     // }

  

    // Car car = new Car();

    // car.isRunning = true;
    // System.out.println(car.make);
    // System.out.println(car.year);
    // System.out.println(car.price);
    // System.out.println(car.isRunning);

    // System.out.println(car.model);
    // System.out.println(car.isRunning);
    // car.start();
    // System.out.println(car.isRunning);
    // car.stop();
    // System.out.println(car.isRunning);

    // Car car2 = new Car();
    // System.out.println(car.make + " "+ car.model);
    // System.out.println(car2.make + " "+ car2.model);

//     Student  student1 = new Student("Spongebob", 30, 3.2);
//     Student student2 = new Student("Patrick", 34, 1.5);

// System.out.println(student1.name);
// System.out.println(student1.age);
// System.out.println(student1.gpa);
// System.out.println(student1.isEnrolled);

// System.out.println(student2.name);
// System.out.println(student2.age);
// System.out.println(student2.gpa);
// System.out.println(student1.isEnrolled);

// student1.study();

// User user1 = new User("spongebob");
// User user2 = new User("Patrick", "Pstart@aol.com");
// User user3 = new User("Sandy", "Scheeks", 27);
// User user4 = new User();


// System.out.println(user1.username);
// System.out.println(user1.email);
// System.out.println(user1.age);

// System.out.println(user2.username);
// System.out.println(user2.email);
// System.out.println(user2.age);

// System.out.println(user3.username);
// System.out.println(user3.email);
// System.out.println(user3.age);

// System.out.println(user4.username);
// System.out.println(user4.email);
// System.out.println(user4.age);


// Cars car1 = new Cars("Mustang", "Red");
// Cars car2 = new Cars("Corvette", "Blue");
// Cars car3 = new Cars("Charger", "Yellow");



//         Cars[] cars = {new Cars("Mustang", "Red"),new Cars("Corvette", "Blue"),
//     new Cars("Charger", "Yellow"),};

//         for(Cars car: cars){
//             car.color = "black";
//         }
//         for(Cars car: cars){
//             car.drive();
// //         }


//         friend friend1 = new friend("spongebob");
//         friend friend2 = new friend("patrick");
//         friend friend3 = new friend("squidward");
//         friend friend4 = new friend("sandy");
//         friend friend5 = new friend("gary");

//         System.out.println(friend.numOfFriends);
//         // System.out.println(friend2.numOfFriends);
//         // System.out.println(friend3.numOfFriends);
//         friend.showFriends();






    }




    // static int add(int... numbers){
    //     int sum = 0;
    //     for(int number: numbers){
    //         sum+=number;
    //     }
    //     return sum;
    // }






    
    // static double add(double a, double b){
    //     return a+b;
    // }
    
    // static double add(double a, double b, double c){
    //     return a+b+c;
    // }

    // static void happyBirthday(String name, int age){
    //     System.out.println("Happy birthday to you");
    //     System.out.printf("Happy birthday dear you %s", name);
    //     System.out.printf("You are %d years old", age);
    //     System.out.println("Happy birthday to you\n");
    // }
    // static double square(double number){

    //     return number* number;
    // }
    // static double cube(double number){
    //     return number*number*number;
    
}