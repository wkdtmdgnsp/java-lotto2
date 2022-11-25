package lotto.controller;

import lotto.view.InputView;

public class LottoController {
    private InputView inputView = new InputView();

    public void run() {
        int money = inputView.readLottoBuy();
    }
}
