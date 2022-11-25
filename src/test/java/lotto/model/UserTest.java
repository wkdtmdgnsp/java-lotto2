package lotto.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void 로또_구입_테스트() {
        User user = new User();
        List<Lotto> userLotto = user.lottoBuy(8000);
        assertThat(userLotto.size()).isEqualTo(8);
    }
}