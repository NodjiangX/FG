package wang.feiga.book.exception;

/**
 * 内容概要：重复预约异常
 * 作 者： 姜昊
 * 版本号： V1.0
 * 完成时间： 2018-01-31 16:22
 **/

public class RepeatAppointException extends RuntimeException {
    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
