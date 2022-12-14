package com.example.digittonumeralconverterapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.digitnumeralsconverterapi.util.ConverterUtil;
import com.example.digittonumeralconverterapi.exception.ConvertedNumberFormatException;

@RestController
public class ConverterController {
    @Autowired
    private ConverterUtil converterUtil;

    @RequestMapping(value = "/digitToNumerals", method = {RequestMethod.POST })
    public String digitConverter(@RequestParam(value = "digit", defaultValue = "-1") Integer digit) {

        if (digit < 1 || digit > 4000) {
            System.out.println("Invalid roman number value!");
            throw new ConvertedNumberFormatException();
        }

        String numeral = converterUtil.convertToNumerals(digit);
        return numeral;
    }

    @RequestMapping(value = "/numeralsToDigit", method = {RequestMethod.POST })
    public int numeralsConverter(@RequestParam(value = "numeral", defaultValue = "MCMXV") String numeral) {

        int digit = converterUtil.convertToDigit(numeral);
        if(digit < 1 || digit > 4000){
        	System.out.println("Invalid roman number value!");
            throw new ConvertedNumberFormatException();
        }
        return digit;
    }
}
