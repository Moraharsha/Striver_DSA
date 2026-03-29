package dsa;

public class patterns {
	public static void pattern1(int n) {

		/*
		 * 
		 * 
		 * * * * * * * * * * *
		 * 
		 */

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("--------------------------------------------");
		/*
		 * 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5
		 */

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		/*
		 * 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
		 */

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
	}

	public static void pattern2(int n) {

		/*
		 * 
		 * * * * * * * * * * * * * * * * * * * * *
		 * 
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------");
	}

	public static void pattern3(int n) {
		/*
		 * 
		 * * * * * * * * * * *
		 * 
		 */
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		/*
		 * 1 2 3 4 5 1 2 3 4 1 2 3 1 2 1
		 */

		for (int i = 0; i < n; i++) // -> n-i -> 5-0 ,5-1,5-2,5-3,5-4
		{
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");
	}

	public static void pattern4(int n) {
		/*
		 *
		 * * * * * * * * * * * * * * * * * * * * *
		 * 
		 * here [4,1,4]=> (n-i-1)={5-0-1}= 4 | (2*i+1)= {2*0+1}= 1 | (n-i-1)={5-0-1}= 4
		 */

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < n - i - 1; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void pattern5(int n) {
		/*
		 *********
		 *******
		 *****
		 ***
		 *
		 * [0,9,0]=> (n-t)-> starts from 0 | (t*2-1)-> j starts from 0 | (n-t)-> k
		 * starts from 0
		 * 
		 */

		for (int t = n; t > 0; t--) {
			for (int i = 0; i < n - t; i++) {
				System.out.print(" ");
			}
			for (int j = 0; j < t * 2 - 1; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < n - t; k++) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}

	public static void pattern6(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < n - i - 1; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int t = n; t > 0; t--) {
			for (int i = 0; i < n - t; i++) {
				System.out.print(" ");
			}
			for (int j = 0; j < t * 2 - 1; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < n - t; k++) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}

	public static void pattern7(int n) {
		/*
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		 * 
		 * 
		 * 1st loop -> i=0 | i>2n-1 | i++ 2nd loop -> j=0 | j<stars until i>n then
		 * stars=2n-i then decreases again from that point of time
		 * 
		 */

		for (int i = 0; i < 2 * n; i++) {
			int stars = i;
			if (stars > n)
				stars = 2 * n - i;
			for (int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	public static void pattern8(int n) {
		/*
		 * 1 0 1 1 0 1 0 1 0 1 1 0 1 0 1
		 * 
		 * i=0 , i<n ; i++ j=0 , j<i ; j++
		 * 
		 * j=0 , 0%2=0->1 , 1%2!=0-> 0,
		 * 
		 */
		int h;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				h = 1;
			else
				h = 0;
			for (int j = 0; j <= i; j++) {
				System.out.print(h);
				h = 1 - h;// important step to remember
			}
			System.out.println();
		}
//		System.out.println(0%2);
	}

	public static void pattern9(int n) {
		/*
		 * 1 1 12 21 123 321 12344321
		 * 
		 * n=4 i -> first row= [1,4,1] (natural from j,2n-,reverse from j) 2n-2i or
		 * 2*(n-1)
		 * 
		 * 
		 */

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = 0; k < 2 * n - 2 * i; k++) {
				System.out.print(" ");
			}
			for (int m = i; m >= 1; m--) {
				System.out.print(m);
			}
			System.out.println();
		}
	}

	public static void pattern10(int n) {
		/*
		 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		 * 
		 * outer loop -> 5 times n=5 inner loop -> based on i times just take int var
		 * and then define it with 1 & then increment it inside the inner loop
		 * 
		 */
		int inc = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(inc + " ");
				inc++;
			}
			System.out.println();
		}
	}

	public static void pattern11(int n) {
		/*
		 * A AB ABC ABCD ABCDE
		 * 
		 * here outer loop-> based on n times i inner loop based on i times use ascii
		 * char value
		 * 
		 * 
		 * ABCDE ABCD ABC AB A
		 * 
		 */

		for (int i = 0; i < n; i++) {

			for (char j = 'A'; j <= 'A' + i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
//		for(int i=0;i<n;i++)
//		{
//			char c=65;
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print(c);
//				c++;
//			}
//			System.out.println();
//		}

		for (int i = n - 1; i > 0; i--) {

			for (char j = 'A'; j <= 'A' + i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void pattern12(int n) {
		/*
		 * A BB CCC DDDD EEEEE
		 * 
		 * here outer loop n times inner loop based on i times with same type of value
		 * 
		 */
		for (int i = 0; i < n; i++) {
			int c = 'A' + i;
//			char ch=(char) c;

			for (int j = 0; j <= i; j++) {
				System.out.print((char) c);
			}
			System.out.println();

		}
	}

	public static void pattern13(int n) {
		/*
		 * ---A--- --ABA-- -ABCBA- ABCDCBA
		 * 
		 * outer loop is of 4 times based on n=4 pattern contains chars in btw spaces
		 * [3,1,3] [2,3,2] [1,5,1] [0,7,0]
		 * 
		 * so three loops inside the outer loop first inner loop-> condition -> based on
		 * n-1 condition i<n-1 //lry 3rd loop -> same like first loop 2nd loop ->
		 */
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - 1; j++) {
				System.out.print("-");
			}
//			for(char c='A';c<='A'+i;c++)
//			{
//				System.out.print(c);
//			}
//			for(int k=i;k>0;k--)
//			{
//				
//				char t=(char) (65+k-1);
//				char tt=(char) ('A'+ k-1);
//				System.out.print(tt);
//				
//			}
			// ------------------------------------------ above lines commented are my logic
			// ------------------
			// lets see below based on striver logic
			// for space loops formula is n-i-1
			// for character loop genral formula is 2*i+1
			// but symmetry here after exactly half point the characters are reversed so
			// (2*i+1)/2 if j is lesser than breakpoint naturl or else reverse
			char ch = 'A';
			int breakpoint = (2 * i + 1) / 2;
			for (int d = 0; d < 2 * i + 1; d++) {
				System.out.print(ch);
				if (d < breakpoint)// understand deep check by each iteration u will come to know easily
					ch++;
				else
					ch--;

			}
			for (int p = i; p < n - 1; p++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public static void pattern14(int n) {
		/*
		 * E D E C D E B C D E A B C D E
		 * 
		 * Outer loop is here n=5 five times inner loop is based on i times with some
		 * condition char ch='A' + n -i is the condition and then ch--
		 */
		for (int i = 0; i < n; i++) {
			char ch = (char) ('A' + n - 1 - i);// important to convert to casting observe always and try to remember
			for (int j = 0; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

	public static void pattern15(int n) {
		/*
		 **********
		 **** --**** ----*** ------** --------* --------* ------** ----*** --****
		 **********
		 * this is the pattern above - are spaces actually to get visibility i added
		 * dashes instead of spaces outer loop -> 2*n time if n=5 then 10 times inner
		 * loop based on stars and spaces [5,0,5] [4,2,4] [3,4,3] [2,6,2] [1,8,1] again
		 * from incrementing when j > n/2 then increment the stars and decrease the
		 * spaces 1st loop-> while j< breakpoint -> {n, 2*i, n}
		 */
		int b = 1;
		for (int d = 0; d < 2 * n; d++) {

			int i = 0;
			int breakpoint = (2 * n) / 2;
			if (d < breakpoint)
				i = d;
			else {
				i = d - b;// -> 5<5 false ->
				b = b + 2; // 5-1; 6-3,->7-5, // here i is c=incrementing by 1 and we are decreasing by 2
							// by adding 2 to b

			}
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < i * 2; k++) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// System.out.println(b);

	}

	public static void pattern16(int n) {
		/*
		 * n=5;
		 * 
		 * --------* ------** ----*** --****
		 **********
		 **** --**** ----*** ------** --------*
		 * 
		 * here the pattern is symmetry so we solve first half then we will get second
		 * half [1,8,1] [2,6,2] [3,4,3] [4,2,4] [5,0,5]
		 * 
		 * three loops first and last loop are same , middle is based on spaces ie
		 * 2*n-2(i+1)
		 * 
		 */

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int m = 0; m < (2 * n) - 2 * (i + 1); m++) {
				System.out.print("-");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int g = 2;
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 0; j <= n - i - 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < g; j++) {
				System.out.print("-");
			}
			for (int j = 0; j <= n - i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			g = g + 2;

		}
	}

	public static void pattern17(int n) {
		/*
		 * n=4
		 **** 
		 *  *
		 *  *
		 ****
		 * we need to print a square like above outer loop n times inner loop , only
		 * first and last row must be fully of stars other wise only first and last star
		 * should print
		 * 
		 * stars =n; spaces = if(i=1 or n then stars=n else
		 * 
		 */
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n)

					System.out.print("*");
				else

					System.out.print(" ");

				
			}
			System.out.println();
		}

	}
	public static void pattern18(int n)
	{
		/*
		  4444444
		  4333334
		  4322234
		  4321234
		  4322234
		  4333334
		  4444444
		  
		 */
		    // Function to print concentric square number pattern
		   
		        // Outer loop for rows
		        for (int i = 0; i < 2 * n - 1; i++) {
		            // Inner loop for columns
		            for (int j = 0; j < 2 * n - 1; j++) {
		                // Calculate distance from top
		                int top = i;
		                // Calculate distance from left
		                int left = j;
		                // Calculate distance from bottom
		                int bottom = (2 * n - 2) - i;
		                // Calculate distance from right
		                int right = (2 * n - 2) - j;

		                // Take the minimum of all four distances
		                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

		                // Print number (starts with n at border, decreases inside)
		                System.out.print((n - minDist) + " ");
		            }
		            // Move to the next row
		            System.out.println();
		        }
		    }


	public static void main(String[] args) {
		int n = 4;
//		 patterns.pattern1(n);
//		 patterns.pattern2(n);
//		 patterns.pattern3(n);
//		 patterns.pattern4(n);
//		 patterns.pattern5(n);
//		 patterns.pattern6(n);
//		 patterns.pattern7(n);
//		 patterns.pattern8n);
//		 patterns.pattern9(n);
//		 patterns.pattern10(n);
//		 char c='A'+ 1;
//		 System.out.println(c); // prints char value of ascii of 65 ie 'A'
		// int ch='A' + 1 ;
		// System.out.println(ch); // prints ascii of 'A' = 65
//		 patterns.pattern11(n);
		// patterns.pattern12(n);
//		 patterns.pattern13(n);
//		 patterns.pattern14(n);
//		 patterns.pattern15(n);
//		 patterns.pattern16(n);
		patterns.pattern18(n);

	}

}
