package section02;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class Application02 {
    public static void main(String[] args) {
        String resources = "configuration.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resources);
            SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(false);
            Date date = sqlSession.selectOne("Mapper.select");
            System.out.println(date);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
