package com.guowei.demo.util;

import java.util.HashMap;

public class BossUtil {
    /**
     * 级别定义
     * 董事长、副董事长、执行董事、监事
     */
    public static final HashMap<String,Integer> position=new HashMap<>();
    static{
        position.put("董事长",1);
        position.put("副董事长",2);
        position.put("执行董事",3);
        position.put("监事",4);
    }

    /**
     * 最低100级
     */
    public static final Integer minlevel=100;
    /**
     * 获取title中最高位置
     * @param titles
     * @return
     */
    public static Integer getFirst(String[] titles){
        Integer rtn=minlevel;
        for (String title : titles) {
            Integer tmp=position.getOrDefault(title,minlevel);
            if (rtn>tmp) {
                rtn = tmp;

            }
        }
        return rtn;
    }
}
