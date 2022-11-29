package lotto.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LottoGame {
    private Map<Rank, Integer> result = new HashMap<>();

    public LottoResult play(List<Lotto> userLotto, WinningLotto winningLotto) {
        for (int i=0; i<userLotto.size(); i++) {
            int count = winningLotto.getLotto().matchCount(userLotto.get(i));
            winningCount(userLotto.get(i), winningLotto, count);
        }
        LottoResult lottoResult = new LottoResult(result);
        nullRank();
        return lottoResult;
    }

    private void nullRank() {
        result.put(Rank.WIN5, result.getOrDefault(Rank.WIN5, 0));
        result.put(Rank.WIN4, result.getOrDefault(Rank.WIN4, 0));
        result.put(Rank.WIN3, result.getOrDefault(Rank.WIN3, 0));
        result.put(Rank.WIN2, result.getOrDefault(Rank.WIN2, 0));
        result.put(Rank.WIN1, result.getOrDefault(Rank.WIN1, 0));
    }

    private void winningCount(Lotto userLotto, WinningLotto winningLotto, int count) {
        if (count == 3) {
            result.put(Rank.WIN5, result.getOrDefault(Rank.WIN5, 0)+1);
            return;
        }
        if (count == 4) {
            result.put(Rank.WIN4, result.getOrDefault(Rank.WIN4, 0)+1);
            return;
        }
        if (count == 5) {
            matchBonus(userLotto, winningLotto);
            return;
        }
        if (count == 6) {
            result.put(Rank.WIN1, result.getOrDefault(Rank.WIN1, 0)+1);
            return;
        }
    }

    private void matchBonus(Lotto userLotto, WinningLotto winningLotto) {
        boolean bonus = userLotto.bonusContain(winningLotto.getBonusNumber());
        if (bonus) {
            result.put(Rank.WIN2, result.getOrDefault(Rank.WIN2, 0)+1);
            return;
        }
        result.put(Rank.WIN3, result.getOrDefault(Rank.WIN3, 0)+1);
        return;
    }
}
