package lotto.controller;

import lotto.model.Lotto;
import lotto.model.Rank;
import lotto.model.User;
import lotto.model.WinningLotto;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private List<Lotto> userLotto = new ArrayList<>();
    private WinningLotto winningLotto;

    public void run() {
        buy();
        outputView.printLotto(userLotto);
        winningInput();
    }

    public void buy() {
        int money = inputView.readLottoBuy();
        User user = new User();
        userLotto = user.lottoBuy(money);
    }

    public void winningInput() {
        List<Integer> winningNumber = inputView.readWinningLotto();
        Lotto winningNum = new Lotto(winningNumber);
        int bonusNum = inputView.readBonusNum(winningNumber);
        winningLotto = new WinningLotto(winningNum, bonusNum);
    }
}
