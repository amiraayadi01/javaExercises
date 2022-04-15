public class cashRegister {
    private double money;

    public cashRegister(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money < 0.00) throw new IllegalArgumentException("No Neg Values");
        this.money = money;
    }
    public String toString() {return "$" + money;}
    public double add(double d) {
        double sum = 0;
        if (d > 0) {
            sum = money + d;
        }
        return sum;
    }
    public double remove(double d) {
        double sum = 0;
        if (d > 0) {
            sum = money - d;
        }
        else throw new IllegalArgumentException("No Neg Values");
        return sum;
    }

    public static void main(String[] args) {
        cashRegister cash = new cashRegister(3);
        System.out.println(cash.toString());
        System.out.println(cash.add(4));
        System.out.println(cash.remove(1));

    }
}
