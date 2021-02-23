# java-lottoTicket 🎫
## 로또 미션 진행을 위한 저장소

### 기능 요구사항 - step1

- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.
    - [예외] 0원인 경우: 다시 입력
    - [옵션] 1000원 단위가 아닌 경우: 거스름돈을 자선단체에 기부한다는 메시지를 출력한다 😗
- 지난 주 당첨 번호 6개를 입력받는다.
    - [예외] 빈 칸이 들어오는 경우 -> 재입력
    - [중복] 중복된 숫자가 입력된 경우 -> 재입력
    - [예외] 로또 숫자 범위에서 벗어나는 경우 -> 재입력
    - [예외] 6개 미만 또는 초과한 번호 갯수를 입력한 경우 -> 재입력
    - [예외] 숫자 외의 문자가 입력된 경우 -> 재입력
- 보너스볼을 입력받는다.
    - [예외] 지난 주 당첨 번호랑 중복된 숫자가 있는 경우
    - [예외] 범위 밖 숫자, 또는 숫자가 아닌 문자가 있는 경우
- 로또별 당첨 번호와 일치한 갯수를 찾는다.
    - 5개가 일치하면 보너스 볼과 일치하는 지 여부를 검사한다.
- 당첨 통계를 보여준다.
    - 총 수익률(당첨금 / 구입금액)을 보여준다.
  
### 기능 요구사항 - step2

- 수동으로 구매할 로또 개수를 입력받는다.
  - [예외] 개수 * 1000 <= 구입 금액을 만족해야한다.
- 수동으로 구매할 로또 번호를 입력받는다.
  - [예외] 입력은 콤마로 구분된다.
  - [예외] 한 입력 당 6개로 구성되어야한다.
  - [예외] 빈 칸을 입력할 수 없다.
  - [예외] 로또 숫자 범위에서 벗어날 수 없다.
  - [예외] 숫자 외의 문자를 입력할 수 없다.



### 비기능 요구사항
- indent(인덴트, 들여쓰기) depth를 2단계에서 1단계로 줄여라.
- depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
- else를 사용하지 마라.
- 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
- method가 한 가지 일만 하도록 최대한 작게 만들어라.
- 배열 대신 ArrayList를 사용한다.
- java enum을 적용해 프로그래밍을 구현한다.
- 규칙 3: 모든 원시값과 문자열을 포장한다.
- 규칙 5: 줄여쓰지 않는다(축약 금지).
- 규칙 8: 일급 콜렉션을 쓴다.