package lotto.util;

import java.util.ArrayList;
import java.util.List;

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

    public List<Integer> winningNumberException(String winningLotto) {
        try {
            List<Integer> winningNumber = new ArrayList<>();
            String s[] = winningLotto.split(",");
            for (int i=0; i<s.length; i++) {
                winningNumber.add(Integer.parseInt(s[i]));
            }
            return winningNumber;
        } catch (NumberFormatException e) {
            System.out.println("콤바로 구분하여 숫자만 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }


}
