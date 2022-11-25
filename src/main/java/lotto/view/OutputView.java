package lotto.view;


import lotto.model.Lotto;

import java.util.List;

public class OutputView {
    public void printLotto(List<Lotto> userLotto) {
        System.out.println();
        System.out.println(userLotto.size() +"개를 구매했습니다.");
        for (int i=0; i<userLotto.size(); i++) {
            System.out.println(userLotto.get(i).numbersToString());
        }
    }

    public void printWinning() {

    }

    public void printRate() {

    }
}
