package keyWord;/**
 * @author csc
 * @date 2019/12/7 11:02
 * @version 1.0
 */

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @program: Java
 * @description: Stream API 参考 https://mp.weixin.qq.com/s/WXtyob92EMIz1gtbxgAGuw
 * @author: csc
 * @create: 2020/02/20 11:02
 */
public class StreamAPI {
    public static void main(String[] args) throws IOException {
//        createStream();
        midOperate();
//        finalOperate();
    }

    public static void createStream() throws IOException {
        Stream<Object> empty = Stream.empty();
        Stream<String> stringStream = Stream.of("1", "2", "3");
        String[] strings = {"1", "2", "3"};
        Stream<String> stringStream1 = Arrays.stream(strings);
        List<String> stringList = Arrays.asList("1", "2", "3");
        Stream<String> lines = Files.lines(Paths.get("/test.txt"));

        // 无限流，流从0开始，下面的每个元素依次加2
        Stream<Integer> iterate = Stream.iterate(0, num -> num + 2);
        // 无限流，流中每个元素都是 0~1 随机数
        Stream<Double> generate = Stream.generate(Math::random);

        // 生成0到10的int流
        IntStream intStream = IntStream.rangeClosed(0, 10);
        // 生成0到9的int流
        IntStream intStream1 = IntStream.range(0, 10);
        // 生成有字符串a和数字1的异构的流
        Stream.builder().add("a").add(1).build().forEach(System.out::print);
        Stream.concat(
                Stream.of("1", 22, "333"),
                Stream.of("1", 22, 333)
        ).forEach(System.out::print);
    }

    public static void midOperate(){
        // 过滤所有空字符串，注意是返回 true的留下
        Stream.of("1", null, "2", "", "3")
                .filter(StringUtils::isNotEmpty)
                .forEach(System.out::print);

        // 去掉重复的2
        Stream.of("1", "2", "2", "2", "3")
                .distinct()
                .forEach(System.out::print);

        System.out.println("skip:");
        // 与skip相反，只留下前2个
        Stream.of("1", "2", "3", "4", "5")
                .skip(2) // 跳过前 n 个元素
                .limit(2)
                .forEach(System.out::print);

        // 将流中每个字符串转为Person实例
        Stream.of("1", "2", "3")
                .map(User::new)
                .forEach(System.out::print);
        // 将流每个字符串变成其长度，为了避免自动拆箱，使用mapToInt转为IntStream
        Stream.of("123", "12345", "3")
                .mapToInt(String::length)
                .forEach(System.out::print);
        // 每个字符串按照逗号分隔合并成一个流
        Stream.of("1,2,3", "4,5,6", "7,8,9")
                .flatMap(a -> Stream.of(a.split(",")))
                .forEach(System.out::print);

        Stream.of("4", "3", "5")
                .sorted()
                .forEach(System.out::print);

        // 串行流转并行流
        Stream.of("1", "2", "3").parallel();
        // 并行流转串行流
        Arrays.asList("1", "2", "3").parallelStream().sequential();
    }

    public static void finalOperate(){
        // foreach

        // 总个数，返回true|false
        Stream.of("1", "2", "3").count();
        // 最大/最小元素，返回Optional
        Stream.of("1", "2", "3").max(Comparator.naturalOrder());
        // 累加求和sum ； 求平均数average ；
        Stream.of("1", "2", "3").mapToInt(Integer::valueOf).sum();
        // 总和，最大值，最小值，平均数，总个数，应有尽有
        System.out.println(Stream.of("1", "2", "3").mapToInt(Integer::valueOf).summaryStatistics());


        // 是否有长度大于 2 的字符串
        Stream.of("1", "22", "333").anyMatch(s -> s.length() > 2);
        // 是否一个长度大于 2 的字符串也没有
        Stream.of("1", "22", "333").noneMatch(s -> s.length() > 2);
        // 是否字符串长度全大于 2
        Stream.of("1", "22", "333").allMatch(s -> s.length() > 2);

        // 将结果汇总成一个list     ； toSet; toMap;
        Stream.of("1", "22", "333").collect(Collectors.toList());
        // 转指定类型集合
        ArrayList<String> arrayList = Stream.of("1", "2", "3")
                .collect(Collectors.toCollection(ArrayList::new));


        // 0作为起始的pre，流的结果等于pre乘以自身再加一，直到curr到达最后一个元素
        // (1) pre = 0 curr = 1 计算 pre = 0 * 1 + 1 = 1
        // (2) pre = 1 curr = 2 计算 pre = 1 * 2 + 1 = 3
        // (3) pre = 3 curr = 3 计算 pre = 3 * 3 + 1 = 10
        // (4) pre = 10 curr = null 返回结果 10
        IntStream.of(1, 2, 3).reduce(0, (pre, curr) -> pre * curr + 1);

        Stream.of("1", "22", "333").toArray();
        Stream.of("1", "2", "3").iterator();
        Stream.of("1", "2", "3").isParallel(); // 串行还是并行

        // 以字符串长度分成3组，map的key为长度，value为对应的元素个数
        Map<Integer, Long> collect = Stream.of("1", "22", "33", "4", "555")
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
    }
}
