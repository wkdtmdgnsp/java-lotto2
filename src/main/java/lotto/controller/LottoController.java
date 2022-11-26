package lotto.controller;

import lotto.model.Lotto;
import lotto.model.User;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private List<Lotto> userLotto = new ArrayList<>();
    private Lotto winningLotto;

    public void run() {
        buy();
        outputView.printLotto(userLotto);
        winningLotto = new Lotto(inputView.readWinningLotto());
        int bonusNum = 0;
    }

    public void buy() {
        int money = inputView.readLottoBuy();
        User user = new User();
        userLotto = user.lottoBuy(money);
    }
}
