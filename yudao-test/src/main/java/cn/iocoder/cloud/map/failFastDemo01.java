package cn.iocoder.cloud.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author YS
 * @date 2022/7/6 21:58
 * @Description 测试集合的快速失败
 */
public class failFastDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if ("2".equals(next)){
                //此时出现新增操作, 就会出现快速失败, 因为迭代器已经指向下一个元素了(并发修改异常)
                list.add("2");
            }
        }

    }
}
