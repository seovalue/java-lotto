package lotto.domain.ticketfactory;

import java.util.Set;
import java.util.stream.Collectors;
import lotto.domain.LottoNumber;
import lotto.domain.LottoTicket;
import lotto.exception.LottoCustomException;

public class FixedTicketFactory {
    private static final int EXACT_SIZE = 6;

    public static LottoTicket makeTicket(Set<String> lottoNumbers) {
        if(!isProperSize(lottoNumbers)){
            throw new LottoCustomException("당첨번호는 중복되지 않은 숫자들로 총 6개이어야 합니다.");
        }
        return new LottoTicket(getFixedLottoNumbers(lottoNumbers));
    }

    public static Set<LottoNumber> getFixedLottoNumbers(Set<String> lottoNumbers) {
        return lottoNumbers
            .stream()
            .map(LottoNumber::new)
            .collect(Collectors.toSet());
    }

    private static boolean isProperSize(Set<String> lottoNumbers) {
        return lottoNumbers.size() == EXACT_SIZE;
    }
}
