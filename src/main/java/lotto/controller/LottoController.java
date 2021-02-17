package lotto.controller;

import java.util.Scanner;
import lotto.utils.ValidateUtils;
import lotto.domain.Money;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {

    final InputView inputView;

    public LottoController(final Scanner scanner){
        inputView = new InputView(scanner);
    }

    public void run() {
        OutputView.printMoneyMessage();
        Money money = new Money(ValidateUtils.parseInt(inputView.inputMoney()));
        OutputView.printTicketCountMessage(money.getTicketCount());
    }
}
