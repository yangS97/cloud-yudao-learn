package cn.iocoder.yudao.module.system.learn.stream;

import cn.hutool.core.lang.Console;
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
        //demo08();
        //demo09();
        //demo10();
        //demo11();
        //demo12();
        //demo13();
        //demo14();
        //demo15();
        //demo16();
        //demo17();
        demo18();
    }

    private static void demo18() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<List<Integer>> lists = Steam.of(list).split(3).map(Steam::toList).toList();
        //List<Steam<Integer>> lists = Steam.of(list).split(3).toList();
        System.out.println("lists = " + lists);
    }

    private static void demo17() {
        List<String> keyList = Arrays.asList(
                "ys",
                "gsr",
                "zzy"
        );
        List<String> valueList = Arrays.asList(
                "25",
                "24",
                "33"
        );
        List<String> zipList = Steam.of(keyList)
                .zip(valueList, (k, v) -> k + "年龄为" + v)
                .toList();
        System.out.println(zipList);
        Console.log(zipList);
    }

    private static void demo16() {
        List<Integer> list = Arrays.asList(1, 2, 3,4,5);
        List<Integer> spliceList = Steam.of(list).splice(3, 2, 2,3,3).toList();
        System.out.println("spliceList = " + spliceList);

        //findFirst
        Integer integer = Steam.of(list).findFirst(e -> e > 5).orElse(1);
        System.out.println("integer = " + integer);
    }

    private static void demo15() {
        List<String> list = Arrays.asList("Zverify", "ys", "gsr",null);
        String orElse = Steam.of(list).at(3).orElse("null");
        System.out.println("orElse = " + orElse);
    }

    private static void demo14() {
        List<String> list = Arrays.asList("Zverify", "ys", "gsr",null);
        List<String> pushList = Steam.of(list).push("abc").nonNull().toList();
        System.out.println("pushList = " + pushList);
        Steam.of(list).nonNull().unshift("abc").forEach(System.out::println);
    }

    private static void demo13() {
        List<String> list = Arrays.asList("Zverify", "ys", "gsr",null);
        List<String> notnullList = Steam.of(list).nonNull().toList();
        System.out.println("notnullList = " + notnullList);
    }

    private static void demo12() {
        List<String> list = Arrays.asList("Zverify", "ys", "gsr");
        //过滤又名叫拿到
        List<String> filterList = Steam.of(list).filter(s -> s.length() < 3).toList();
        System.out.println("filterList = " + filterList);
        List<String> filterlist02 = Steam.of(list).filterIdx((e, i) -> i < 1).toList();
        System.out.println("filterlist02 = " + filterlist02);
    }

    private static void demo11() {
        List<String> list = Arrays.asList("Zverify", "ys", "gsr");
        List<String> toList = Steam.of(list).flatIdx((s, i) -> Steam.of(i + 1 + "." + s)).toList();
        System.out.println("toList = " + toList);
    }

    private static void demo10() {
        List<String> list = Arrays.asList("Zverify", "ys", "gsr");
        Steam.of(list).forEachIdx((s,i) -> System.out.println(i+1+","+s));
    }

    private static void demo09() {
        List<String> list = Arrays.asList("Zverify", "Zverify", "Zverify");
        List<String> list1 = Steam.of(list).distinct().toList();
        System.out.println(list1);
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
