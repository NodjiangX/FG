package wang.feiga.book.test.dao;

import org.apache.ibatis.annotations.Param;
import wang.feiga.book.test.entity.Appointment;

/**
 * 内容概要：预约图书Dao层
 * 作 者： 姜昊
 * 版本号： V1.0
 * 完成时间： 2018-01-29 16:24
 **/

public interface AppointmentDao {
    /**
     * 插入预约图书记录
     *
     * @param bookId
     * @param StudentId
     * @return 插入的行数
     */
    int insertAppiontment(@Param("bookId") long bookId, @Param("studentId") long StudentId);

    /**
     * 根据主键查询预约图书记录，携带图书实体
     *
     * @param bookId
     * @param studentId
     * @return
     */
    Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);


}
