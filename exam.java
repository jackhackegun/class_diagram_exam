package class_diagram_exam;

class Character {
    Potion mypotion;
    Weapon myweapon;

    Character() {
    }

    void getWeapon(Weapon weapon) {
        this.myweapon = weapon;
    }
}

class Potion {

}

class Monster {
    System.out.println("몬스터를 잡았다.");

}

class Weapon {

}