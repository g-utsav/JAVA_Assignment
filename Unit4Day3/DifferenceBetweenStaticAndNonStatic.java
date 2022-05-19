package Unit4Day3;

public class DifferenceBetweenStaticAndNonStatic {
		/*
		* 
		*Difference Between Static And Non-Static :- 	Static members are the members which are loaded into the 
		*	memory when the program starts Execution where as Non-Static members are the members are not loaded into
		*	the memory when is program starts Execution.
		*
		*	In JAVA the Static members can be called directly without any use of object creation but Static members
		*	can only call the other Static and they cannot call the Non-Static members directly;
		*
		* 	In Java the Non-Static members can be call by a static member only after creating an instance of the object
		* 	in which the Non-Static member lies. But a Non-Static member can call a Non-Static member directly as they 
		* 	only starts executing once the object is created
		* 
		*   A class member is said to be Static in JAVA if it has Static signature in its defination else it is considered as 
		*   Non-Static
		*  
		*/
		
		int a = 50; // This is a Non Static Member as it doesn't have static signature
		
		static int b = 30 ; //This is a Static Member as it has Static keyword in its Signature
		
		void fun1() {  // This is a Non Static Member  
			System.out.println("This is a Non-Staic Function");
		}
		
		static void fun2() {  // This is a Static Member
			System.out.println("This is a Static Function");
		}

		public static void main(String[] args) {
			
			//Static members can be called directly as it is loaded into the Context area of the memory when the program 
			//starts execution
			fun2(); // This is a Static Member
			b = 100 ; //This is a Static Member 
			
			
			// Non-Static Members can't be called directly as it is not loaded into the memory when the program starts execution 
			// we need to load it manually into the heap memory or the Ram by creating an instance object 
			DifferenceBetweenStaticAndNonStatic ds = new DifferenceBetweenStaticAndNonStatic(); // Creating an instance object in the heap memory
			
			//Now the Non-Static members can be called via the Created instance object
			
			ds.a =500;  // This is a Non-Static Member
			ds.fun1();  // This is a Non-Static Member

		}

	}
