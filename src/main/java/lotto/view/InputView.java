package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.util.UserValidate;

import java.util.List;

public class InputView {
    private UserValidate userValidate = new UserValidate();

    public int readLottoBuy() {
        System.out.println("구입금액을 입력해 주세요.");
        String inputMoney = Console.readLine();
        int money = userValidate.buyNumberException(inputMoney);
        userValidate.moneyRangeException(money);
        return money;
    }

    public List<Integer> readWinningLotto() {
        System.out.println("당첨 번호를 입력해 주세요.");
        String winningLotto = Console.readLine();
        List<Integer> winningNumber = userValidate.winningNumberException(winningLotto);
        userValidate.winningRangeException(winningNumber);
        return winningNumber;
    }

    public int readBonusNum() {
        return 0;
    }
}
