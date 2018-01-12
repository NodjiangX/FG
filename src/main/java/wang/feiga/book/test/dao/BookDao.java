package wang.feiga.book.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import wang.feiga.book.test.entity.Book;

/**
 * 内容概要：图书dao层接口
 * 作者：姜 昊
 * 版本号： v1.0
 * 完成时间： 2018年1月12日  下午4:57:10
 */
public interface BookDao {
	/**
	 * 按照id查询图书
	 * 
	 * @param id
	 * @return
	 */
	Book queryById(long id);

	/**
	 * 查询所有图书
	 * 
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset,@Param("limit") int limit);

	/**
	 * 减少馆藏数量
	 * 
	 * @param bookId
	 * @return
	 */
	int reduceNumber(long bookId);
}
