package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.util.UserValidate;

import java.util.List;

public class InputView {
    private UserValidate userValidate = new UserValidate();

    public int readLottoBuy() {
        try {
            System.out.println("구입금액을 입력해 주세요.");
            String inputMoney = Console.readLine();
            int money = userValidate.buyNumberException(inputMoney);
            userValidate.moneyRangeException(money);
            return money;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> readWinningLotto() {
        return null;
    }

    public int readBonusNum() {
        return 0;
    }
}
