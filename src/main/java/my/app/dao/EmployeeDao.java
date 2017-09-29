package my.app.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import my.app.dao.config.InjectConfig;
import my.app.entity.Employee;

/**
 */
@Dao
@InjectConfig
public interface EmployeeDao {

    @Select
    Employee selectById(int id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Employee entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Employee entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Employee entity);
}