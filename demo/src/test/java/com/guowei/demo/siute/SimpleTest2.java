package com.guowei.demo.siute;

import com.guowei.demo.entity.Boss;
import com.guowei.demo.service.SortTitle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest2 {
    @Autowired
    SortTitle sortTitle;
    @Test
    public void doTest() {
        List<Boss> bosses=new ArrayList<>();
        bosses.add(new Boss("黄秋华",new String[]{"副董事长","其他"}));
        bosses.add(new Boss("卢山",new String[]{"监事","其他"}));
        bosses.add(new Boss("马化腾",new String[]{"董事长","其他"}));
        sortTitle.getSort(bosses);
        Collections.reverse(bosses);

        Assert.assertEquals(bosses.get(0).getName(), "马化腾");
        Assert.assertEquals(bosses.get(2).getName(), "卢山");

    }
}