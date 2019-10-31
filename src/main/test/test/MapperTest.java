package test;

import com.study.crud.bean.Department;
import com.study.crud.bean.Employee;
import com.study.crud.dao.DepartmentMapper;
import com.study.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class MapperTest {
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    SqlSession sqlSession;

    @Test
    public void testCrud() {
        System.out.println(departmentMapper);
        //departmentMapper.insert(new Department(null, "开发部"));
        //departmentMapper.insertSelective(new Department(null, "测试部"));
        //employeeMapper.insertSelective(new Employee(null, "Jerry", "M", "Jerry@atguigu.com", 1));


        System.out.println("批量完成");

    }

}
