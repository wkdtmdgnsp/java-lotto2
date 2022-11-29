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

    public void winningRangeException(List<Integer> winningNumber) {
        for (int i=0; i<winningNumber.size(); i++) {
            if (winningNumber.get(i) > 46 || winningNumber.get(i) < 0) {
                System.out.println("1이상 ~ 46이하의 숫자를 입력해주세요.");
                throw new IllegalArgumentException();
            }
        }
    }
    
    public int bonusNumberException(String bonusNum) {
        try {
            int bonusNumber = Integer.parseInt(bonusNum);
            return bonusNumber;
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }

    public void bonusNumOverlapException(int bonusNum, List<Integer> winningNumber) {
        if (winningNumber.contains(bonusNum)) {
            System.out.println("당첨 번호와 중복되지 않는 숫자를 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }
}
