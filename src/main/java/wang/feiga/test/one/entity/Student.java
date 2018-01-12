package wang.feiga.test.one.entity;

/**
 * 内容概要：Student 实体类
 * 作者：姜 昊
 * 版本号： v1.0
 * 完成时间： 2018年1月12日  上午9:55:33
 */
public class Student {
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private String classes;

    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", classes=" + classes + ", phone=" + phone
				+ "]";
	}
    
}