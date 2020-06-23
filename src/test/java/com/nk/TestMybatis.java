package com.nk;

import com.nk.dao.ILoginDao;
import com.nk.dao.IStudentDao;
import com.nk.model.Student;
import com.nk.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void test() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        ILoginDao dao = sqlSession.getMapper(ILoginDao.class);
        IStudentDao dao1 = sqlSession.getMapper(IStudentDao.class);
        List<Student> students = dao1.findAll();
        for(Student student : students) {
            System.out.println(student);
        }
        User user = new User();
        user.setPassword("233");
        user.setId("233");
        User user2 = dao.login(user);
        System.out.println(user2);
        sqlSession.close();
        in.close();

    }
}
