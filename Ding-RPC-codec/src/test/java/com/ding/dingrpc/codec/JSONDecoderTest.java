package com.ding.dingrpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONDecoderTest {

    @Test
    public void decode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("Ding");
        bean.setAge(23);

        byte[] bytes = encoder.encode(bean);
        assertNotNull(bytes);

        Decoder decoder = new JSONDecoder();
        TestBean bean1 = decoder.decode(bytes, TestBean.class);

        assertEquals(bean.getName(), bean1.getName());
        assertEquals(bean.getAge(), bean1.getAge());
    }
}