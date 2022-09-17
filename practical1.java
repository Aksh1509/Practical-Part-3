//Aksh Surani 21ce140 CE2 C2

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cc {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int r, h = 0, t = 0, cnt = 0;
		for (int i = 0; i < test; i++) {
			r = sc.nextInt();
			String s = sc.next();
			int x;
			for (x = 0; x < r; x++) {
				if (s.charAt(x) == 'H' || s.charAt(x) == '.') {
					cnt++;
					if(s.charAt(x) == 'H' && r != cnt) {
						System.out.println("Invalid");
						break;
					}
				}
				
			}

			for (int j = 0; j < r; j++) {
				if (s.charAt(j) == 'H') {
					h++;
					for (int k = 0; k < r; k++) {
						if (s.charAt(k) == 'T') {
							t++;
							break;
						}
					}
				}
			}
			if (h == t) {
				System.out.println("Valid");
			}

		}

	}
}
