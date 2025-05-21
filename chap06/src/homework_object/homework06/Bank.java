package homework_object.homework06;

public class Bank {

	void transfer(Account sender, Account receiver, int amount) {
		sender.withdraw(amount);
		receiver.deposit(amount);
	}
	
	
}
