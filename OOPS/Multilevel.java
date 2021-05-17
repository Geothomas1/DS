
class Emp {
    String name = "Geo Thomas";
    int age = 23;

}

class Salary extends Emp {
    int Salary = 20000;
}

class Multilevel extends Salary {
    public static void main(String[] args) {
        Multilevel m = new Multilevel();
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.Salary);

    }

}
