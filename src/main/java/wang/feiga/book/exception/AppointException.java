package wang.feiga.book.exception;

/**
 * 内容概要：预约业务异常
 * 作 者： 姜昊
 * 版本号： V1.0
 * 完成时间： 2018-01-31 16:24
 **/

public class AppointException extends RuntimeException {
    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
