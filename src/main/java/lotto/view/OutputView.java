package lotto.view;


import lotto.model.Lotto;
import lotto.model.LottoResult;
import lotto.model.Rank;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutputView {
    public void printLotto(List<Lotto> userLotto) {
        System.out.println();
        System.out.println(userLotto.size() +"개를 구매했습니다.");
        for (int i=0; i<userLotto.size(); i++) {
            System.out.println(userLotto.get(i).numbersToString());
        }
    }

    public void printWinning(LottoResult lottoResult) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        Map<Rank, Integer> rank = new HashMap<>(lottoResult.getResult());
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println(Rank.WIN5.getMatchCount() +"개 일치 (" +numberFormat.format(Rank.WIN5.getWinningMoney()) +"원) - " +rank.get(Rank.WIN5) +"개");
        System.out.println(Rank.WIN4.getMatchCount() +"개 일치 (" +numberFormat.format(Rank.WIN4.getWinningMoney()) +"원) - " +rank.get(Rank.WIN4) +"개");
        System.out.println(Rank.WIN3.getMatchCount() +"개 일치 (" +numberFormat.format(Rank.WIN3.getWinningMoney()) +"원) - " +rank.get(Rank.WIN3) +"개");
        System.out.println(Rank.WIN2.getMatchCount() +"개 일치, 보너스 볼 일치 (" +numberFormat.format(Rank.WIN2.getWinningMoney()) +"원) - " +rank.get(Rank.WIN2) +"개");
        System.out.println(Rank.WIN1.getMatchCount() +"개 일치 (" +numberFormat.format(Rank.WIN1.getWinningMoney()) +"원) - " +rank.get(Rank.WIN1) +"개");
    }

    public void printRate(double rate) {
        System.out.println("총 수익률은 " +rate +"%입니다.");
    }
}
