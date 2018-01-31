package wang.feiga.book.enums;

/**
 * 使用枚举表述常量数据字典
 */
public enum AppointStateEnum {
    SUCCESS(1, "预约成功"), NO_NUMBER(0, "库存不足"), REPEAT_APPOINT(-1, "重复预约"), INNER_ERROR(-2, "系统异常");

    private int state;
    private String stateInfo;

    private AppointStateEnum(int state,String stateInfo){
        this.state=state;
        this.stateInfo=stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static AppointStateEnum StateOf(int index){
        for (AppointStateEnum a:AppointStateEnum.values()){
            if (a.getState()==index){
                return a;
            }
        }
        return null;
    }
}
