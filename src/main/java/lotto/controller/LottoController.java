package lotto.controller;

import lotto.model.Lotto;
import lotto.model.User;
import lotto.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {
    private InputView inputView = new InputView();
    private List<Lotto> userLotto = new ArrayList<>();

    public void run() {
        buy();
    }

    public void buy() {
        int money = inputView.readLottoBuy();
        User user = new User();
        userLotto = user.lottoBuy(money);
    }
}
