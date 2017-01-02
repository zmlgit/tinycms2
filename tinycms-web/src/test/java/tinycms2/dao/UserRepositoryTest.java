package tinycms2.dao;

import cn.zmlio.tinycms2.ApplicationStarter;
import cn.zmlio.tinycms2.entity.User;
import cn.zmlio.tinycms2.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zml on 2017/1/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.NONE,classes = ApplicationStarter.class)
public class UserRepositoryTest {

    @Autowired
    private UserService userService;

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @Test
    public void test() throws Exception{

        User user=User.builder().userName("zmanliang").email("zmanliang@163.com").password("123456").build();
        ;
        System.out.println(userService.save(user));
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

}