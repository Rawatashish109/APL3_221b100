/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Application
{
	public static void main(String[] args) {
		Crow Crow = new IndianCrow();
		CrowAdapter CrowAdapter = new CrowAdapter(Crow); 
		Client(CrowAdapter);
	}
	public static void Client(Swan Swan){
	    Swan.Eat();
	    Swan.Swim();
	    Swan.Sing();
	}
}
