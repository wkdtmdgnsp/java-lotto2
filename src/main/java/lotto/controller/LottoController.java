package lotto.controller;

import lotto.model.*;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LottoController {
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private Money money;
    private List<Lotto> userLotto = new ArrayList<>();
    private WinningLotto winningLotto;
    private LottoResult lottoResult;

    public void run() {
        buy();
        outputView.printLotto(userLotto);
        winningInput();
        lottoPlay();
        printResult();
    }

    public void buy() {
        money = new Money(inputView.readLottoBuy());
        User user = new User();
        userLotto = user.lottoBuy(money.getMoney());
    }

    public void winningInput() {
        List<Integer> winningNumber = inputView.readWinningLotto();
        Lotto winningNum = new Lotto(winningNumber);
        int bonusNum = inputView.readBonusNum(winningNumber);
        winningLotto = new WinningLotto(winningNum, bonusNum);
    }

    public void lottoPlay() {
        LottoGame lottoGame = new LottoGame();
        lottoResult = lottoGame.play(userLotto, winningLotto);
        long totalMoney = lottoResult.calculateTotalPrize();
        lottoResult.calculateProfitRate(totalMoney, money.getMoney());
    }

    public void printResult() {
        outputView.printWinning(lottoResult);
    }
}
