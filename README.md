# Striver_DSA
Learn DSA
--------------------------------------------------------
1)PassByValue & PassByReference concept 
What is Pass by Value?
When a variable is passed by value, a copy of the variable is made. The function works on that copy, and the original variable remains unchanged.
Imagine passing your Xeroxed mark sheet to a company. If they stamp or mark it, your original remains untouched. That’s pass-by-value.
Key Characteristics:
•	The function receives a separate copy
•	Changes inside the function don’t affect the original variable
•	Safe, but potentially less efficient for large objects


What is Pass by Reference?
When a variable is passed by reference, the function receives the actual variable (not a copy). Any changes made inside the function will reflect on the original.
You give your friend your actual debit card to withdraw money. Any changes made (like balance deduction) affect your real bank account. That’s pass-by-reference.
Key Characteristics:
•	The function receives the original memory address
•	Changes inside the function affect the original
•	Useful when you want to update multiple variables or return multiple values

Java is always pass-by-value, even for objects. But for objects, the value is a reference (confusing right?). So changes to object contents reflect.
Primitive (Pass by Value)

public class Main {
    static void modify(int a) {
        a = a + 10;
    }

    public static void main(String[] args) {
        int x = 5;
        modify(x);
        System.out.println(x); // Output: 5
    }
}
Objects (Pass reference by value)

class Wrapper {
    int value = 5;
}

public class Main {
    static void modify(Wrapper obj) {
        obj.value += 10;
    }

    public static void main(String[] args) {
        Wrapper w = new Wrapper();
        modify(w);
        System.out.println(w.value); // Output: 15
    }
}


-------------------------------------------------------
Patterns
--------
1) for the outer Loop , Count the number of lines .
2) for the inner loop , focus on the columns and connect them somehow to the rows.
3) Print any charactor like * inside the inner loop.
4) Observe the symmetry(optional).
-----------------
1.	* * * *    -> first row printing 4 starts
2.	* * * *    -> 2nd row printing 4 starts
3.	* * * *    -> 3rd row printing 4 starts
4.	* * * *
5.	* * * *

so Here we need to print 4 stars each line and that print line should be inside the inner for loop . 
in this we need to observe each pattern by following above four steps

