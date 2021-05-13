class Emp {
    String name = "Geo Thomas";
    int age = 23;

}

class Salary extends Emp {
    int Salary = 20000;

    void Display() {
        System.out.println("In Salary class");
    }
}

class Bonus extends Emp {
    int bonus = 5000;
}

class Hierarchical {
    public static void main(String[] args) {
        Bonus h = new Bonus();
        System.out.println(h.name);
        System.out.println(h.age);
        System.out.println(h.bonus);
    }

}
