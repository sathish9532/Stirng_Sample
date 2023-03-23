public class String_pattern {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_pattern SP = new String_pattern();
		//SP.mobileNo_validator();
		SP.Password_validator();
		//SP.method1();
}

private void method7() {
		// Sathish kumar mandaveli[reverse]
		String s="sathish kumar mandaveli";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--) {
			s1= s1 + s.charAt(i);
		}
		int j=0;
		for(int k=0;k<s1.length();k++) {
			if(s1.charAt(k)==' ') {
				reverse(j,k-1,s1);
				j= k+1;
			}
		}
		reverse(j,s1.length()-1,s1);
	}

	private void reverse(int starting, int ending, String s1) {
		// method call reverse
		String s2="";
		for(int i=ending;i>=starting;i--) {
			s2= s2+ s1.charAt(i);
		}
		System.out.print(s2+" ");
	}
private void method6() {
		// find . files
		String name ="sathishkumar.jpeg";
		String extension="";
		int len = name.length()-1;
for(int i=4;i>=0;i--) {
			//System.out.println(name.charAt(len-i));
			extension = extension + name.charAt(len-i);
		}
		System.out.println(extension);
		if(extension.equals("jpeg")){
			System.out.println("Nice");
		}
		else
		{
			System.out.println("Not match");
		}
	private void method5() {
		// 
		String name = "sathish";
		String name1 = "KUMAR";
		System.out.println(name.toUpperCase());
		System.out.println(name);
		System.out.println(name1.toLowerCase());
		System.out.println(name1.indexOf('K'));
		System.out.println(name.substring(3,7));
		for(int i=0;i<name.length();i++) {
		char ch = name.charAt(i);
		if(ch>='A' && ch<='Z') {
			if(i%2==0)
				System.out.print((char)(ch-32));
			else
				System.out.println(ch);
		}
		else
		System.out.print(ch);
		}
	}

private void method9() {
		// Anagram Program
		String name1= "ACT";
		String name2= "CAT";
		int n1 = name1.length();
		int n2 = name2.length();
		int count =0;
		if(n1 !=n2) {
			System.out.println("Not Anagam");
		}
		else {
			for(int i=0;i<n1;i++) {
				for(int j=0;j<n2;j++) {
					if(name1.charAt(i)==name2.charAt(j)) {
						count ++;
						break;
					}
					else
					{
						
					}
				}
			}
		}
		if(count == n1) {
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

	private void Password_validator() {
		// User ID and Password validator
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User ID: ");
		String User = sc.nextLine();
		System.out.println("Enter Password: ");
		String password = sc.next();
		sc.close();
		char[] arr = password.toCharArray();
		int upper=0,special=0,number=0;
		boolean check = true,val = false;
		if(password.length()<8 || password.length()>15) {
			System.out.println("Please enter password range 8 to 15");
			val =true;
		}
		if(val == false) {
			for(int i=0;i<password.length();i++) {
				if(arr[i]>='A' && arr[i]<='Z') {
					upper++;
				}
				else if(arr[i]>='a' && arr[i]<='z') {
					continue;
				}
				else if(arr[i]>='0' && arr[i]<='9') {
					number++;
				}
				else if(arr[i]=='@' || arr[i]=='$' || arr[i]=='#') {
					special++;
				}
				else {
					check = false;
					break;
				}
			}
			if(check==true && upper>=1 && number >=1 && special >=1) {
				System.out.println("Valid Password");
			}
			else {
				System.out.println("Not Valid");
			}
		}
	}


private void method8() {
		// check condition "contains or not "
		String name = "sathishkumar";
		String name1= "kumar";
		int count =0;
		boolean check = false;
		//char ch = name1.charAt(0);
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==name1.charAt(0)) {
			for(int j=0;j<name1.length();j++) {
				if(name.charAt(i)==name1.charAt(j)) {
					i++;
					count++;
				}
			}
			}
			if(count == name1.length()) {
			check = true;
				System.out.println("Contains");
			break;
			}
				else
				{
					count =0;
					}
			//System.out.print(count);
	}
		if(check == false) {
			System.out.println("Not Contains");
		}
	}


	private void method4() {
		// Reverse Print on Character
		String name = "AMMA";
		String name2= "";
		for( int i= name.length()-1;i>=0;i--) {
			name2 = name2 + name.charAt(i); 
		}
		System.out.println(name2);
		if(name.equals(name2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		//System.out.println();
	}
