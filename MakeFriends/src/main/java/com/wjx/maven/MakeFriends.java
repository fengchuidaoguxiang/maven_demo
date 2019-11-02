package com.wjx.maven;

import com.atguigu.maven.HelloFriend;

public class MakeFriends {

    public static String main(String[] args) {
        HelloFriend friend = new HelloFriend();
        friend.sayHelloToFriend("litingwei");
        String str = "Hey," + friend.getMyName() + " make a friend please.";
        System.out.println(str);
        return str;
    }
}
