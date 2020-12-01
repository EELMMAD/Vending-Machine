package se.lexicon.elmira;

public class MyMachine implements VendingMachine {
    protected Product[] all;
    protected int money;
    /* constructor */
    public MyMachine() {
        all = new Product[20];
        all[0] = food1;
        all[1] = food2;
        all[2] = food3;
        all[3] = food4;
        all[4] = food5;
        all[5] = salad1;
        all[6] = salad2;
        all[7] = salad3;
        all[8] = salad4;
        all[9] = salad5;
        all[10] = salad6;
        all[11] = drink1;
        all[12] = drink2;
        all[13] = drink3;
        all[14] = drink4;
        all[15] = drink5;
        all[16] = drink6;
        all[17] = drink7;
        all[18] = drink8;
        all[19] = drink9;
    }
    /* add currencty */
    @Override
    public void addCurrency(int amount) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            if (amount == deposits[i]) {
                money = money + amount;
                return;
            }
        }
    }
    /* request to buy */
    @Override
    public Product request(int productNumber) {
        int i = 0;
        for (i = 0; i < 20; i++) {
            if (all[i].number == productNumber && all[i].cost <= money) {
                money = money - all[i].cost;
                System.out.println(all[i].use());
                return all[i];
            }
        }
        return null;
    }
    /* end session */
    @Override
    public int endSession() {
        int firstValue = money;
        money = 0;
        return firstValue;
    }
    /* showing the description */
    @Override
    public String getDescription(int productNumber) {
        int i = 0;
        for (i = 0; i < 20; i++) {
            if (all[i].number == productNumber) {
                return all[i].examine();
            }
        }
        return null;
    }
    /* showing the balance */
    @Override
    public int getBalance() {
        return money;
    }
    /* showing the names */
    @Override
    public String[] getProducts() {
        String[] data = new String[20];
        int i = 0;
        for (i = 0; i < 20; i++) {
            data[i] = "number=<" + Integer.toString(all[i].number) + "> name=<" + all[i].name + ">";
        }
        return data;
    }
}
