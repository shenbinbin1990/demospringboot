package com.example.demospringboot;

import com.example.demospringboot.entity.TbUser;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@EnableScheduling
@MapperScan("com.example.demospringboot.mapper")
@SpringBootApplication
public class DemospringbootApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemospringbootApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
//        List<Integer> list = stream.filter(num -> (num % 2) == 1).sorted((num1,num2) -> num2 - num1).collect(Collectors.toList());
//        list.stream().forEach(num -> System.out.println(num));
//        List<TbUser> userList = new ArrayList<>();
//        TbUser tbUser = null;
//        for(int i=0;i<7;i++){
//            tbUser = new TbUser();
//            tbUser.setId(i);
//            tbUser.setUsername("szzj"+i);
//            tbUser.setId(4);
//            tbUser.setUsername("szzj"+4);
//            userList.add(tbUser);
//        Stream<String> integerStream = Stream.of("1", "2", "3");
//        System.out.println(integerStream.collect(Collectors.joining(",", "t", "y")));
//        System.out.println(integerStream.collect(Collectors.counting()));
//        System.out.println(integerStream.max(String::compareTo).get());
//        List<TbUser> tbUserList = new ArrayList<>();
//        TbUser user = null;
//        user = new TbUser("wade","33","Miami");
//        tbUserList.add(user);
//        user = new TbUser("james","31","Miami");
//        tbUserList.add(user);
//        user = new TbUser("AD","31","Miami");
//        tbUserList.add(user);
//        user = new TbUser("kobe","33","LA");
//        tbUserList.add(user);
//        user = new TbUser("oneal","31","LA");
//        tbUserList.add(user);
//        user = new TbUser("rondo","31","LA");
//        tbUserList.add(user);
////        Map<String, List<TbUser>> myCollect = tbUserList.stream().collect(Collectors.groupingBy(TbUser::getPhone));
////        System.out.println(myCollect);
//        Map<String, Map<String, Long>> stringMapMap = tbUserList.stream().collect(Collectors.groupingBy(TbUser::getEmail, Collectors.groupingBy(TbUser::getPhone, Collectors.counting())));
////        System.out.println(stringMapMap);
//
//        Map<Object,Object> map = new HashMap<>();
//        map.put("username","shenbinbin");
//        map.put("phone","13819126424");
//        map.put("email","623565916@qq.com");
//        BeanUtils.copyProperties(map,user);
//        System.out.println(user)
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        List<Integer> list = stream.filter(num -> (num % 2) == 1).sorted((num1, num2) -> num2 - num1).collect(Collectors.toList());
        list.stream().forEach(num -> System.out.println(num));
        List<TbUser> userList = new ArrayList<>();
        //123456
        //25869
        //258369

    }
//        userList.stream().sorted((user1,user2) -> user2.getId() - user1.getId()).limit(3).forEach(user -> System.out.println(user));
//          userList.stream().skip(2).limit(3).forEach(user -> System.out.println(user));
//        userList.stream().forEach(user -> System.out.println(user));
//    }


}
