// Java Mehtods 
// This will be java methods and fundementals for backend ready java developmentß
//----------------------------------------------------------
// Method 1 is printing out first item of an array
// O(n) 
// ----------------------------------------------------------
public class Main {
    public void log(int[] numbers) {
        // 0(1)
        system.out.printLn(numbers[0]);
    }
}
// ----------------------------------------------------------
// looping through an array
// ----------------------------------------------------------
public class Main {
    public void log(int[] numbers) {
        // 0(1)
        for (int i = 0; i < numbers.length; i++)
            system.out.printLn(numbers[0]);
    }
}
// ----------------------------------------------------------
// increasing linearly with two loops with parameters
// ----------------------------------------------------------
public class Main {
    public void log(int[] numbers, String[] names) {
        // 0(n+m)
        for (int numebr : numbers) // 0(n)
            System.out.prontLn(number);
        for (String name : names)
            System.out.println(names);
    }
}
// ----------------------------------------------------------
// runtime complexity run of big 0(n) with two inputs
// consisting of parameters numbers and names
// ----------------------------------------------------------
// ----------------------------------------------------------
// O(n^2)
// --------------------------------------------------------------

public class Main {
    public void log(int[] numbers) {
        // O(n ^ 2)
        for (int first : numbers) // O(n)
            for (int second : numbrs) // O(n)
                System.out.println(first + ", " + second);
    }
}
//----------------------------------------------------------
// algorithim run in quadratic time
// faster that linear than O(n)
//----------------------------------------------------------
public class Main {
    public void log(int[] numbers) {
        // O(n + n ^ 2)    <----------
        for (int first : numbers) // O(n)
            for (int second : numbrs) // O(n)
                System.out.println(first + ", " + second);

        for (int first : numbers) // O(n)
            for (int second : numbrs) // O(n)
                System.out.println(first + ", " + second);
    }
}
// When using this you can see (n^2 grows faster than (n)
public class Main {
    public void log(int[] numbers) {
        // O(n ^ 3) <------
        for (int first : numbers) // O(n)
            for (int second : numbrs) // O(n)
                for(int third : numners) 
                System.out.println(first + ", " + second);
    }
}
//----------------------------------------------------------
// space complexity
//----------------------------------------------------------
public class Main {
    public void greet (String[] names) {
        // O(1) space 
        String[] copy = new String[names.length];
        for (int i = 0; i <names.length; i++)
            System.out.println("Hi " + names[i]);
    }
}
//----------------------------------------------------------
// Arrays
//----------------------------------------------------------