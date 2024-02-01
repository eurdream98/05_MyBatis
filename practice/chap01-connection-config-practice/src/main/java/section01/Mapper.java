package section01;

import org.apache.ibatis.annotations.Select;

import java.util.Date;

public interface Mapper {
    @Select("SELECT NOW()")
    Date select();
}
