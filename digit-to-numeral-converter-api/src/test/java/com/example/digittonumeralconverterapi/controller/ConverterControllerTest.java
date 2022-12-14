package com.example.digittonumeralconverterapi.controller;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.digitnumeralsconverterapi.util.ConverterUtil;

@SpringBootTest
public class ConverterControllerTest {
	
	@InjectMocks
    private ConverterController converterController;
	
	@InjectMocks
    private ConverterUtil converterUtil;
	
	@Test
    public void testConvertToNumerals(){
        when(ConverterUtil.convertToNumerals(9)).thenReturn("IX");
        String numerals = converterController.digitConverter(9);
        Assertions.assertEquals("IX", numerals);
    }
	
	@Test
    public void testConvertToDigits(){
        when(converterUtil.convertToDigit("IX")).thenReturn(9);
        int digit = converterController.numeralsConverter("IX");
        Assertions.assertEquals(9, digit);
    }

}
