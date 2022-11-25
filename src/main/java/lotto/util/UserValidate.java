package lotto.util;

public class UserValidate {
    public int buyNumberException(String inputMoney) {
        int money = 0;
        try {
            money = Integer.parseInt(inputMoney);
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 숫자만 입력해주세요.");
        }
        return money;
    }

    public void moneyRangeException(int money) {
        if (money % 1000 != 0) {
            System.out.println("[ERROR] 1000 단위로 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }
}
