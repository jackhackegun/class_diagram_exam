package class_diagram_exam;

class Character {
    Potion mypotion;
    Weapon myweapon;

    Character() {
        mypotion = new Potion();
    }

    void getWeapon(Weapon weapon) {
        this.myweapon = weapon;
    }

    void attack(Monster m) {
        System.out.println("몬스터를 잡았다.");

    }
}

class Potion {

}

class Monster {

}

class Weapon {

}