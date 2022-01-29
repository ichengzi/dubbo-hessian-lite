package com.alibaba.com.caucho.hessian.io;

import com.alibaba.com.caucho.hessian.io.beans.BaseUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeanSerializerTest {
    @Test
    public void test(){
        final BeanSerializer beanSerializer = new BeanSerializer(BaseUser.class, BaseUser.class.getClassLoader());
        // urL, userId, userName
        // URL  -> urL, 前两个字母小写， 最后一个大写， 看着怪怪的， 这个代码估计有问题
    }
}