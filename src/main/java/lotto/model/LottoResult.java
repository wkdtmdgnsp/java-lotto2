package lotto.model;

import java.util.HashMap;
import java.util.Map;

public class LottoResult {
    private Map<Rank, Integer> result = new HashMap<>();

    public LottoResult(Map<Rank, Integer> result) {
        this.result = result;
    }


}
