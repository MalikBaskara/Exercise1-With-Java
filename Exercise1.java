//Player
class Player{
    String name;
    String role;
    double health;
    int level;
    //Object Member
    Weapon weapon;
    Armor armor;
    Vehicle vehicle;
    
    Player(String name,String role, double health, int level){
        this.name = name;
        this.role = role;
        this.health = health;
        this.level = level;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void equipVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    void showplayer(){
        System.out.println("Nama Player : " + this.name);
        System.out.println("Role Player : " + this.role);
        System.out.println("Health Player : " + this.health);
        System.out.println("Level Player : " + this.level);
        this.weapon.displayshow();
        this.armor.display();
        this.vehicle.Vdisplay();
    }
}


//Senjata
class Weapon{
    String name;
    double damage;

    Weapon(String name, double damage){
        this.name = name;
        this.damage = damage;
    }

    void displayshow(){
        System.out.println("Nama Senjata : " + this.name);
        System.out.println("Damage : " + this.damage);
    }
}



//Armor
class Armor{
    String name;
    double Defenseprotection;


    Armor(String name, double Defenseprotection){
        this.name = name;
        this.Defenseprotection = Defenseprotection;
    }

    void display(){
        System.out.println("Nama Armor : " + this.name);
        System.out.println("Defense Armor : " + this.Defenseprotection);
    }
}

//Vehicle
class Vehicle{
    String Vehicle_Name;
    double Defense;

    Vehicle(String Vehiclename, double Defense){
        this.Vehicle_Name = Vehiclename;
        this.Defense = Defense;
    }

    void Vdisplay(){
        System.out.println("Nama Vehicle : " + this.Vehicle_Name);
        System.out.println("Defense Vehicle : " + this.Defense);
    }
}




public class Latihan1{
    public static void main(String[] args){

        Player player1 = new Player("Udin","Police", 100, 15);
        Weapon Pistol = new Weapon("Pistol",15);
        Armor Jacket = new Armor("Jacket",16);
        Vehicle Avanza = new Vehicle("Avanza", 120);
        player1.equipWeapon(Pistol);
        player1.equipArmor(Jacket);
        player1.equipVehicle(Avanza);
        player1.showplayer();


        System.out.println("\n");
        Player player2 = new Player("Jack","FBI Agent", 175, 55);
        Weapon M16 = new Weapon("M16", 20);
        Armor RobotArmor = new Armor("RobotArmor", 190);
        Vehicle chevy = new Vehicle("Chevy Suburban", 250);
        player2.equipWeapon(M16);
        player2.equipArmor(RobotArmor);
        player2.equipVehicle(chevy);
        player2.showplayer(); 
    }
}
