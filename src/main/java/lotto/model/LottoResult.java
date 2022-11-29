package lotto.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LottoResult {
    private Map<Rank, Integer> result = new HashMap<>();

    public LottoResult(Map<Rank, Integer> result) {
        this.result = result;
    }

    public double calculateProfitRate(long sum, int money) {
        double rate = (sum / money) *100;
        return Math.round(rate * 100) / 100.0;
    }

    public long calculateTotalPrize() {
        long sum = 0;
        Set<Rank> keySet = result.keySet();
        for (Rank key : keySet) {
            sum += key.getWinningMoney() * result.get(key);
        }
        return sum;
    }

    public Map<Rank, Integer> getResult() {
        return result;
    }
}
