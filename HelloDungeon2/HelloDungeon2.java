//System.out.println("");
import java.util.*;
import java.lang.*;
public class HelloDungeon2 {
	public static void main(String[] args) {
float loop = 0;
		// TODO Auto-generated method stub
	System.out.println("HelloDungeon2");
	System.out.println("By Andrew Park");
	try {
		  Thread.sleep(1000L);    // one second
		}
		catch (Exception e) {}
while(loop == 0){//flag2
int menuoption;
float stat[] = new float[3];//1:health 2:strength 3:magic
float basestat[] = new float[3];
float fighter = 0;
float gold = 0;
float elixer = 0;
float level = 0;
float exp = 0;
float menuloop = 0;
System.out.println("What is your name?");
Scanner name = new Scanner(System.in);
String hero = name.nextLine();	
while (menuloop == 0){//flag4
System.out.println("1: New Game");
System.out.println("2: Load Game");
Scanner input = new Scanner(System.in);
menuoption = input.nextInt();
switch(menuoption){//flag3
case 1:
System.out.println("The Dragon Slayer has been long gone\nA new hero has been born");
try {
		  Thread.sleep(1000L);    // one second
		}
		catch (Exception e) {}
		while(fighter == 0){//flag1
		System.out.println("Okay, " + hero + ", what class do you pick?");
		}//flag1
break;		
case 2:		
long load;
long random;
long temp;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Enter User-Data Code");
System.out.println("[ 1 ]-[ 2 ]-[ 3 ]-[ 4 ]-[ 5 ]-[ 6 ]-[ 7 ]-[ 8 ]");//[base1]-[base2]-[base3]-[gold]-[elixer]-[level]-[exp]
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 1 ]");
random = (long) input.nextLong();
random = (long) Math.sqrt(random - 9);
random = random - 5;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 2 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
basestat[0] = temp;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 3 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
basestat[1] = temp;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 4 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
basestat[2] = temp;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 5 ]");
load = input.nextLong();
temp = (long) Math.sqrt(load - random);
gold = temp;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 6 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
elixer = temp;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 7 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
level = temp;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 8 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
exp = temp;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
menuloop = 1;
break;
default:
	System.out.println("That is not an option");
break;
}//flag3
}//flag4
//actual game


}//flag2
}
}
