package lotto.util;

public class UserValidate {
    public int buyNumberException(String inputMoney) {
        try {
            int money = Integer.parseInt(inputMoney);
            return money;
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 숫자만 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }

    public void moneyRangeException(int money) {
        if (money % 1000 != 0) {
            System.out.println("[ERROR] 1000 단위로 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }
}
