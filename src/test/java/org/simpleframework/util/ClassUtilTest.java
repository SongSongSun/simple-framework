package org.simpleframework.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;


/**
 * @Author Song
 * @Date 2020/7/10 11:17
 * @Version 1.0
 * @Description
 */
class ClassUtilTest {

    @DisplayName("提取目标类方法")
    @Test
    public void extractPackageClassTest() {
        Set<Class<?>> classSet = ClassUtil.extractPackageClass("com.song.entity");
        System.out.println(classSet);
        Assertions.assertEquals(4, classSet.size());
    }
}