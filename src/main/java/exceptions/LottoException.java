package exceptions;

public class LottoException extends IllegalArgumentException {
    private static final String FORMAT = "[ERROR] %s";
    private static final String DEFAULT_MESSAGE = "오류가 발생했습니다.";

    LottoException() {
        super(FORMAT.formatted(DEFAULT_MESSAGE));
    }

    LottoException(String msg) {
        super(FORMAT.formatted(msg));
    }
}
