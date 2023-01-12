package com.assignment1;

public class BlanaceCheck {

	public static void main(String[] args) {

		Account account = new Account(12345, "Siva", 100000);
		double accounbbalance = account.getBalance();
		double withdrawAmount = 7000;
		double depositAmount = 50000;
		System.out.println("Account details before oeration" + account);
		depositAmount(accounbbalance, depositAmount, account);

		withdrawnAmount(accounbbalance, withdrawAmount, account);

	}

	private static double withdrawnAmount(double accounbbalance, double withdrawAmount, Account account) {

		if (accounbbalance <= withdrawAmount) {
			System.out.println("Sorry! Insufficient Funds");
			System.out.println();

		} else {
			accounbbalance = accounbbalance - withdrawAmount;

			System.out.println("withdraw amount of " + withdrawAmount + "Remaining balance:" + accounbbalance);
		}
		return accounbbalance;

	}

	private static void depositAmount(double accounbbalance, double depositAmount, Account account) {
		accounbbalance = accounbbalance + depositAmount;
		account.setBalance(accounbbalance);
		System.out.println("Account balance after deposit amount:" + account.getBalance());

	}

}
