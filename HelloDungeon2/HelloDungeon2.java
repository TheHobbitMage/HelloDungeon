//System.out.println("");
import java.util.*;
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
Scanner name = new Scanner(System.in);
	System.out.println("\n\n\n\n\n\n\n\nWhat is your name?");
String hero = name.nextLine();
		while(fighter == 0){//flag1
		System.out.println("Okay, " + hero + ", what class do you pick?");

		}//flag1
break;		
case 2:		
float load;
float temp;
System.out.println("Enter User-Data Code");
System.out.println("[ 1 ]-[ 2 ]-[ 3 ]-[ 4 ]-[ 5 ]-[ 6 ]-[ 7 ]");//[base1]-[base2]-[base3]-[gold]-[elixer]-[level]-[exp]
System.out.println("Input [1]");
load = input.nextFloat();
temp = sqrt(load);
basestat[0] = temp;
System.out.println("Input [2]");
load = input.nextFloat();
basestat[1] = load;
System.out.println("Input [3]");
load = input.nextFloat();
basestat[2] = load;
System.out.println("Input [4]");
load = input.nextFloat();
gold = load;
System.out.println("Input [5]");
load = input.nextFloat();
elixer = load;
System.out.println("Input [6]");
load = input.nextFloat();
level = load;
System.out.println("Input [7]");
load = input.nextFloat();
exp = load;
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
