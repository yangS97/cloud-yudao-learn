package cn.iocoder.yudao.module.system.learn.stream;

import io.github.vampireachao.stream.core.collector.Collective;
import io.github.vampireachao.stream.core.stream.Steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author YS
 * @date 2022/11/12 22:21
 * @Description
 */

public class StreamTest {
    public static void main(String[] args) {
        //demo01();
        //demo02();
        //demo03();
        //demo04();
        //demo05();
        //demo06();
        //demo07();
        demo08();
    }

    private static void demo08() {
        List<Student> list = Arrays.asList(
                Student.builder().age(22).name("ys").build(),
                Student.builder().age(21).name("gsr").build(),
                Student.builder().age(22).name("gsr").build()
        );
        Map<Integer, List<Student>> group = Steam.of(list).group(Student::getAge);
        System.out.println("group = " + group);
        Map<Integer, Long> group2 = Steam.of(list).group(Student::getAge, Collective.counting());
        System.out.println("group2 = " + group2);
    }

    private static void demo07() {
        List<Student> oldData = Arrays.asList(
                Student.builder().age(22).name("ys").build(),
                Student.builder().age(21).name("gsr").build(),
                Student.builder().age(233).name("gsr").build()
        );
        //oldData.stream().collect(Collectors.toMap(Student::getName, Student::getAge));
        Steam.of(oldData)
                .toMap(Student::getName, Student::getAge)
                .forEach((k, v) -> System.out.println(k + " " + v));

    }

    private static void demo06() {
        List<Integer> valueList = Arrays.asList(
                25,
                24,
                22
        );
        String join = Steam.of(valueList).join(",","(",")");
        System.out.println("join = " + join);
    }

    private static void demo05() {
        List<String> keyList = Arrays.asList(
                "ys",
                "gsr",
                "zzy"
        );
        List<Integer> valueList = Arrays.asList(
                25,
                24,
                22
        );
        Steam.of(keyList)
                .toZip(valueList)
                .forEach((k, v) -> System.out.println(k + " : " + v));
    }

    private static void demo04() {
        List<Student> oldData = Arrays.asList(
                Student.builder().age(22).name("ys").build(),
                Student.builder().age(21).name("gsr").build()
        );
        List<Student> newData = Arrays.asList(
                Student.builder().age(23).name("ys").build(),
                Student.builder().age(21).name("gsr").build()
        );

        Steam.of(oldData).filterIter(Student::getName,newData).map(Student::getName).forEach(System.out::println);
    }

    private static void demo03() {
        List<Integer> integers = Steam.iterate(1, i -> i <= 5, i -> ++i).toList();
        integers.forEach(System.out::println);
    }

    private static void demo02() {
        String str = "1,2,3";
        List<Integer> list = Steam.split(str, ",").map(Integer::valueOf).toList();
        list.forEach(System.out::println);
    }

    private static void demo01() {
        ArrayList<Integer> integers = new ArrayList<>();
        //integers.stream()
        Steam<Integer> of = Steam.of(integers);
    }
}
