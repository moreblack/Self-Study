package minki;

import java.util.Scanner;

public class BanckApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {

			System.out.println("-------------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램종료");
	}

	private static void createAccount() {

		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");

		System.out.println("계좌를 입력하세요");
		String ano = scanner.nextLine();

		System.out.print("이름을 입력하세요");
		String owner = scanner.nextLine();

		System.out.print("예금을 입력하세요");
		int balance = scanner.nextInt();

		Account act = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = act;
				break;
			}

		}

	}

	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println("계좌번호:" + accountArray[i].getAno() + "\t" + "계좌주:" + accountArray[i].getOwner()
						+ "\t" + "예금액:" + accountArray[i].getBalance());

			}
		}

	}

	private static void deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호:");

		String ano = scanner.nextLine();

		System.out.print("예금액:");
		int balance = scanner.nextInt();

		Account account = findAccount(ano);

		if (account == null) {
			System.out.println("계좌가 없습니다");
			return;
		}
		account.setBalance(account.getBalance() + balance);
		System.out.println("결과:예금이 성공하였습니다");
	}

	private static void withdraw() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		System.out.print("계좌번호:");
		String ano = scanner.nextLine();
		System.out.print("예금액:");
		int balance = scanner.nextInt();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌가 없습니다");
			return;
		}
		account.setBalance(account.getBalance() - balance);
		System.out.println("결과:출금이공하였습니다");

	}

	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) { // 계좌에 널값이 아니면  계좌랑 동등한 것과 찾아서 account에 넣는다
				if (accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}
