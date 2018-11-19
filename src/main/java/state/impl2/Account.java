package state.impl2;

/**
 * @author ShenSha on 2018/10/21
 */
public class Account {
    /**
     * 抽象状态对象的引用
     */
    private AccountState state;

    /**
     * 账户名
     */
    private String owner;

    /**
     * 余额
     */
    private double balance = 0;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this);
        System.out.println(owner + " 开户,初始金额为:" + balance);
        System.out.println("------------------------------------");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);
        state.deposit(amount);
        System.out.println("当前余额:"+this.balance);
        System.out.println("现在帐户状态为"+ this.state.getClass().getName());
        System.out.println("------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);
        state.withdraw(amount);
        System.out.println("当前余额:"+this.balance);
        System.out.println("现在帐户状态为"+ this. state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void computeInterest() {
        state.computelnterest();
    }
}