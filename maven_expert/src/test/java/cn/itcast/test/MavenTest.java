package cn.itcast.test;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MavenTest {

    @Test
    public void findById(){
        ApplicationContext apc=new ClassPathXmlApplicationContext("applicationContext.xml");
        /*ItemsDao bean = apc.getBean(ItemsDao.class);
        Items byId = bean.findById(1);
        System.out.println(byId.getName()+"="+byId.getDetail());*/
        ItemsService bean = apc.getBean(ItemsService.class);
        Items byId = bean.findById(1);
        System.out.println(byId.getName()+"="+byId.getDetail());
    }
}
