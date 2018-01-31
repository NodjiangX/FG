package wang.feiga.book.exception;

/**
 * 内容概要：库存不足异常
 * 作 者： 姜昊
 * 版本号： V1.0
 * 完成时间： 2018-01-31 16:18
 **/

public class NoNumberException extends RuntimeException{
    public NoNumberException(String message){
        super(message);
    }
    public NoNumberException(String message,Throwable cause){
        super(message,cause);
    }
}
