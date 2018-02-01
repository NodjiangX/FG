package wang.feiga.book.dto;

/**
 * 内容概要：封装json对象，所有返回结果都使用他
 * 作 者： 姜昊
 * 版本号： V1.0
 * 完成时间： 2018-02-01 11:01
 **/

public class Result<T> {

    private boolean success; // 是否成功标志
    private T data;  //成功时的返回数据
    private String error;  //错误信息

    /*成功时构造器*/
    public Result(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    /*错误时构造器*/
    public Result(String error,T data ) {
        this.data = data;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", data=" + data +
                ", error='" + error + '\'' +
                '}';
    }
}
