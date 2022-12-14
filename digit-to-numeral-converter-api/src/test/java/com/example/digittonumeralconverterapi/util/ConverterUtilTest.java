package com.example.digittonumeralconverterapi.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.digitnumeralsconverterapi.util.ConverterUtil;

@SpringBootTest
public class ConverterUtilTest {

	@InjectMocks
    private ConverterUtil converterUtil;

    @Test
    public void testConvertToNumerals(){
        String numerals = converterUtil.convertToNumerals(9);
        Assertions.assertEquals("IX", numerals);
    }
    
    @Test
    public void testConvertToDigit(){
        int digit = converterUtil.convertToDigit("MCMXV");
        Assertions.assertEquals(1915, digit);
    }
}
