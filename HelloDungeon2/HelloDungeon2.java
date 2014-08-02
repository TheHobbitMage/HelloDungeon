import java.util.*;
public class HelloDungeon2 {
	public static void main(String[] args) {
		float beatgame = 0;
		float gameloop = 0;
		System.out.println("HelloDungeon2\nBy Andrew Park\nSequel to HelloDungeon\n\n\n\n\n\n\n\n\n\n\n");
		while(gameloop == 0){
			float fchoice = 0;
			float gold = 0;
		double stat[] = new double[3];
		double basestat[] = new double[3];
		int difficulty;
		int lchoice = 0;
		double multdiff;
		int vstore;
		int astore;
			float dchoice = 0;
			Scanner finput = new Scanner(System.in);
			Scanner dinput = new Scanner(System.in);
			Scanner sinput = new Scanner(System.in);
			Scanner linput = new Scanner(System.in);
			Scanner vinput = new Scanner(System.in);
			Scanner ainput = new Scanner(System.in);
			System.out.println("It has been years since the Dragon Slayer defeated the last dragon of the realm\nHe has been long gone from this world\nNow new threats are emerging from the depths of Hell\nYou are the realm's last hope to defeating the new evil that emerges");
			//main
			//coded better this time
			int foption;
			Scanner name = new Scanner(System.in);
			System.out.println("What is your name, young hero?");
	        String hero = name.nextLine();
	        while(fchoice == 0){
	        System.out.println("Ok, " + hero + ", what class will you pick?");
	        System.out.println("<1> Wizard");
			System.out.println("<2> Necromancer");
			System.out.println("<3> Warrior");
			System.out.println("<4> Archer");
			System.out.println("<5> Brute");
			foption = finput.nextInt();
			switch (foption){
			case 1:
				System.out.println("You have chosen the wizard");
				System.out.println("Your character stats are:");
				System.out.println("Strength = 5");
				System.out.println("Health = 10");
				System.out.println("Magic = 20");
				fchoice = 1;
				stat[0] = 5;
				stat[1] = 10;
				stat[2] = 20;
				basestat[0] = 5;
				basestat[1] = 10;
				basestat[2] = 20;
			break;
			case 2:
				System.out.println("You have chosen the necromancer");
				System.out.println("Your character stats are:");
				System.out.println("Strength = 5");
				System.out.println("Health = 20");
				System.out.println("Magic = 10");
				fchoice = 2;
				stat[0] = 5;
				stat[1] = 20;
				stat[2] = 10;
				basestat[0] = 5;
				basestat[1] = 20;
				basestat[2] = 10;
			break;
			case 3:
				System.out.println("You have chosen the warrior");
				System.out.println("Your character stats are:");
				System.out.println("Strength = 20");
				System.out.println("health = 10");
				System.out.println("Magic = 5");
				fchoice = 3;
				stat[0] = 20;//strength
				stat[1] = 10;//health
				stat[2] = 5;//magic
				basestat[0] = 20;
				basestat[1] = 10;
				basestat[2] = 5;
			break;
			case 4:
				System.out.println("You have chosen the archer");
				System.out.println("Your character stats are:");
				System.out.println("Strength = 10");
				System.out.println("health = 20");
				System.out.println("Magic = 5");
				fchoice = 4;
				stat[0] = 10;
				stat[1] = 20;
				stat[2] = 5;
				basestat[0] = 10;
				basestat[1] = 20;
				basestat[2] = 5;
			break;
			case 5:
				System.out.println("You have chosen the brute");
				System.out.println("Your character stats are:");
				System.out.println("Strength = 20");
				System.out.println("health = 15");
				System.out.println("Magic = 0");
				fchoice = 5;
				stat[0] = 20;
				stat[1] = 15;
				stat[2] = 0;
				basestat[0] = 20;
				basestat[1] = 15;
				basestat[2] = 0;
			break;
			default:
				System.out.println("Sorry, that option is not avaliable");
			break;
			}
			}
			do{
				System.out.println("OK " + hero + ", what difficulty do you pick?");
				System.out.println("<1> Easy");
				System.out.println("Damage done by enemies is decreased by 25%\nFor the inexperienced");
				System.out.println("<2> Normal");
				System.out.println("No special conditions\nFor the average");
				System.out.println("<3> Hard");
				System.out.println("Damage done by enemies is increased by 50%\nFor those who want a challenge");
				System.out.println("<4> Hero");
				System.out.println("Damage done by enemies is DOUBLED\nFor the experienced\nNOT RECOMMENDED");
				System.out.println("<5> Dragon Slayer");
				System.out.println("Damage done by enemies is !!TRIPLED!!\nFor the experienced\nNOT RECOMMENDED");
			    	difficulty = dinput.nextInt();
			    	switch (difficulty){
			    		case 1:
			    			System.out.println("You chose easy as you difficulty");
			    			multdiff = .75;
			    			dchoice = 1;
			    			break;
			    		case 2:
			    			System.out.println("You chose normal as you difficulty");
			    			multdiff = 1;
			    			dchoice = 1;
			    			break;
			    		case 3:
			    			System.out.println("You chose hard as you difficulty");
			    			multdiff = 1.5;
			    			dchoice = 1;
			    			break;
			    		case 4:
			    			System.out.println("You chose hero as you difficulty");
			    			multdiff = 2;
			    			dchoice = 1;
			    			break;
			    		case 5:
			    			System.out.println("You think your so great? Well I guess we'll see");
			    			System.out.println("You chose Dragon Slayor as you difficulty");
			    			multdiff = 3;
			    			dchoice = 1;
			    			break;
			    			default:
			    				System.out.println("That is not an option");
			    				break;
				}
			    }while(dchoice == 0);
			while (lchoice == 0){
		stat[0] = basestat[0];
		stat[1] = basestat[1];
		stat[2] = basestat[2];
		System.out.println("Welcome to Dungeon-Town");
		System.out.println("Where would you like to go?");
		System.out.println("<1> Go to Dungeon-Town Blacksmith\n<2> Go to Dungeon-Town Alchemy Lab\n<3> Enter the Dungeon of the Slime Lord");
		int location;
        location = linput.nextInt();
        switch (location){
        case 1://stre
        	int storechoice;
        	System.out.println("Welcome to Dungeon-Town Blacksmith");
        	System.out.println("What would you like?");
        	System.out.println("Gold:" + gold);
        	System.out.println("<1> Swords\n<2> Staves\n<3> Leave");
        	vstore = vinput.nextInt();
        	switch(vstore){
        	case 1:
        	System.out.println("<1> Basic Swords");
        	System.out.println("+10 Damage");
        	System.out.println("10 Gold");
        	System.out.println("<2> Iron Sword");
        	System.out.println("+20 Damage");
        	System.out.println("20 Gold");
        	System.out.println("<3> Fire Sword");
        	System.out.println("+50 Damage");
        	System.out.println("50 Gold");
        	System.out.println("<4> Master Sword");
        	System.out.println("+100 Damage");
        	System.out.println("100 Gold");
        	System.out.println("<5> Leave");
        	storechoice = sinput.nextInt();
        	switch (storechoice){
        	case 1:
        		if (gold >= 10){
        			System.out.println("You have bought the Basic Sword");	
        			basestat[0] = basestat[0] + 10;
        			gold = gold - 10;
        		}
        		else{
        			System.out.println("You do not have enough gold for the Basic Sword");
        		}
        		break;
        	case 2:
        		if (gold >= 20){
        			System.out.println("You have bought the Iron Sword");	
        			basestat[0] = basestat[0] + 20;
        			gold = gold - 20;
        		}
        		else{
        			System.out.println("You do not have enough gold for the Iron Sword");
        		}
        	break;
        	case 3:
        		if (gold >= 50){
        			System.out.println("You have bought the Fire Sword");	
        			basestat[0] = basestat[0] + 50;
        			gold = gold - 50;
        		}
        		else{
        			System.out.println("You do not have enough gold for the Fire Sword");
        		}
        		break;
        	case 4:
        		if (gold >= 100){
        			System.out.println("You have bought the Master Sword");	
        			basestat[0] = basestat[0] + 100;
        			gold = gold - 100;
        		}
        		else{
        			System.out.println("You do not have enough gold for the Master Sword");
        		}
        		break;
        	case 5:
        		System.out.println("You left");
        		break;
        	default:
        		System.out.println("That is not an option");
        		break;
        	}
        	break;
        	case 2:
        		System.out.println("<1> Basic Staff");
            	System.out.println("+10 Magic");
            	System.out.println("10 Gold");
            	System.out.println("<2> Energy Staff");
            	System.out.println("+20 Magic");
            	System.out.println("20 Gold");
            	System.out.println("<3> Staff of Destruction");
            	System.out.println("+50 Magic");
            	System.out.println("50 Gold");
            	System.out.println("<4> Staff of Horror");
            	System.out.println("+100 Magic");
            	System.out.println("100 Gold");
            	System.out.println("<5> Leave");
            	storechoice = sinput.nextInt();
            	switch (storechoice){
            	case 1:
            		if (gold >= 10){
            			System.out.println("You have bought the Basic Staff");	
            			basestat[2] = basestat[2] + 10;
            			gold = gold - 10;
            		}
            		else{
            			System.out.println("You do not have enough gold for the Basic Staff");
            		}
            		break;
            	case 2:
            		if (gold >= 20){
            			System.out.println("You have bought the Energy Staff");	
            			basestat[2] = basestat[2] + 20;
            			gold = gold - 20;
            		}
            		else{
            			System.out.println("You do not have enough gold for the Energy Staff");
            		}
            	break;
            	case 3:
            		if (gold >= 50){
            			System.out.println("You have bought the Staff of Destruction");	
            			basestat[2] = basestat[2] + 50;
            			gold = gold - 50;
            		}
            		else{
            			System.out.println("You do not have enough gold for the Staff of Destruction");
            		}
            		break;
            	case 4:
            		if (gold >= 100){
            			System.out.println("You have bought the Staff of Horror");	
            			basestat[2] = basestat[2] + 100;
            			gold = gold - 100;
            		}
            		else{
            			System.out.println("You do not have enough gold for the Staff of Horror");
            		}
            		break;
            	case 5:           		
            		System.out.println("You left");
            		break;
            	default:
            		System.out.println("That is not an option");
            		break;
            	}
        		break;
        	case 3:
        		System.out.println("You left");
        		break;
        		default:
        			System.out.println("That is not an option");
        			break;
        	}//store end
        	break;
        case 2:
        	int astorechoice;
        	System.out.println("Welcome to Dungeon-Town Alchemy Lab");
        	System.out.println("What would you like?");
        	System.out.println("Gold:" + gold);
        	System.out.println("<1> Health Potions\n<2> Mana Potions\n<3> Leave");
        	astore = ainput.nextInt();
        	switch(astore){//alchemy
        case 1:
        	System.out.println("<1> Tiny Health Potion");
        	System.out.println("+10 Health");
        	System.out.println("10 Gold");
        	System.out.println("<2> Small Health Potion");
        	System.out.println("+20 Health");
        	System.out.println("20 Gold");
        	System.out.println("<3> Health Potion");
        	System.out.println("+50 Health");
        	System.out.println("50 Gold");
        	System.out.println("<4> Large Health Potion");
        	System.out.println("+100 Health");
        	System.out.println("100 Gold");
        	System.out.println("<5> Leave");
        	astorechoice = ainput.nextInt();
        	switch (astorechoice){
        	case 1:
        		if (gold >= 10){
        			System.out.println("You have bought a tiny health potion");	
        			basestat[1] = basestat[1] + 10;
        			gold = gold - 10;
        		}
        		else{
        			System.out.println("You do not have enough gold for a tiny health potion");
        		}
        		break;
        	case 2:
        		if (gold >= 20){
        			System.out.println("You have bought a small health potion");	
        			basestat[1] = basestat[1] + 20;
        			gold = gold - 20;
        		}
        		else{
        			System.out.println("You do not have enough gold for a small health potion");
        		}
        	break;
        	case 3:
        		if (gold >= 50){
        			System.out.println("You have bought a health potion");	
        			basestat[1] = basestat[1] + 50;
        			gold = gold - 50;
        		}
        		else{
        			System.out.println("You do not have enough gold for a health potion");
        		}
        		break;
        	case 4:
        		if (gold >= 100){
        			System.out.println("You have bought a large health potion");	
        			basestat[0] = basestat[0] + 100;
        			gold = gold - 100;
        		}
        		else{
        			System.out.println("You do not have enough gold for a large health potion");
        		}
        		break;
        	case 5:
        		System.out.println("You left");
        		break;
        	default:
        		System.out.println("That is not an option");
        		break;
        	}
        	break;
        case 2:
        		System.out.println("<1> Tiny Mana Potion");
            	System.out.println("+10 Magic");
            	System.out.println("10 Gold");
            	System.out.println("<2> Small Mana Potion");
            	System.out.println("+20 Magic");
            	System.out.println("20 Gold");
            	System.out.println("<3> Mana Potion");
            	System.out.println("+50 Magic");
            	System.out.println("50 Gold");
            	System.out.println("<4> Large Mana Potion");
            	System.out.println("+100 Magic");
            	System.out.println("100 Gold");
            	System.out.println("<5> Leave");
            	astorechoice = ainput.nextInt();
            	switch (astorechoice){
            	case 1:
            		if (gold >= 10){
            			System.out.println("You have bought a tiny mana potion");	
            			basestat[2] = basestat[2] + 10;
            			gold = gold - 10;
            		}
            		else{
            			System.out.println("You do not have enough gold for a tiny mana potion");
            		}
            		break;
            	case 2:
            		if (gold >= 20){
            			System.out.println("You have bought a small mana potion");	
            			basestat[2] = basestat[2] + 20;
            			gold = gold - 20;
            		}
            		else{
            			System.out.println("You do not have enough gold for a small mana potion");
            		}
            	break;
            	case 3:
            		if (gold >= 50){
            			System.out.println("You have bought a mana potion");	
            			basestat[2] = basestat[2] + 50;
            			gold = gold - 50;
            		}
            		else{
            			System.out.println("You do not have enough gold for a mana potion");
            		}
            		break;
            	case 4:
            		if (gold >= 100){
            			System.out.println("You have bought a large mana potion");	
            			basestat[2] = basestat[2] + 100;
            			gold = gold - 100;
            		}
            		else{
            			System.out.println("You do not have enough gold for a large mana potion");
            		}
            		break;
            	case 5:           		
            		System.out.println("You left");
            		break;
            	default:
            		System.out.println("That is not an option");
            		break;
            	}
        		break;
        	case 3:
        		System.out.println("You left");
        		break;
        		default:
        			System.out.println("That is not an option");
        	break;
        	}//lab end
        	break;
        case 3:
        	System.out.println("You entered the Dungeon of the Slime Lord");
        	break;
        	
        }
			}//entire game	
		}//gameloop
		}//end main
	public static void damage(){
	
}
}
