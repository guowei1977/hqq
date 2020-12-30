package com.guowei.demo.service;

import com.guowei.demo.entity.Boss;
import com.guowei.demo.util.BossUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 *排序头衔
 */
@Service
public class SortTitle {
    protected static final Logger logger = LoggerFactory.getLogger(SortTitle.class);

    /**
     *  董事长、副董事长、执行董事、监事 排前面
     * @param list
     * @return
     */
    public void getSort(List<Boss> list){

        Collections.sort(list , (Boss b1, Boss b2) ->BossUtil.getFirst(b2.getTitles()).compareTo(BossUtil.getFirst(b1.getTitles())));



        return  ;
    }
}
