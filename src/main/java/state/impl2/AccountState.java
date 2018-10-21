package state.impl2;

/**
 * @author ShenSha on 2018/10/21
 */
public abstract class AccountState {
    protected Account acc;
    abstract public void deposit(double amount);
    abstract public void withdraw(double amount);
    abstract public void computelnterest();
    abstract public void stateCheck();
}
