package com.guowei.demo.controller;

import com.guowei.demo.entity.Boss;
import com.guowei.demo.service.SortTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    SortTitle sortTitle;

    @PostMapping("/hello")
    public List<Boss> hello() {
        List<Boss> bosses=new ArrayList<>();
        bosses.add(new Boss("黄秋华",new String[]{"副董事长","其他"}));
        bosses.add(new Boss("马化腾",new String[]{"董事长","其他"}));
        bosses.add(new Boss("卢山",new String[]{"监事","其他"}));
        sortTitle.getSort(bosses);
        Collections.reverse(bosses);
        return bosses;
    }
}
