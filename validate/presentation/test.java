package ss25.validate.presentation;

import ss25.validate.util.Validator;

import java.util.Scanner;

public class test {
    public static void main(String[] args) throws  Exception {
        Scanner sc = new Scanner(System.in);
        int a = Validator.ValidatorInt("Nhập số nguyên: ",sc);
        float b = Validator.ValidatorFloat("Nhập số float: ",sc);
        Double c = Validator.ValidatorDouble("Nhập số double: ",sc);
        String d = Validator.ValidatorString("Nhập chuỗi: ",sc,1,255);
        Boolean e = Validator.ValidatorBoolean("Nhập true/false: ",sc);
        String email=Validator.validatorInputEmail("Nhập email: ",sc);
        String phoneNuber = Validator.validatorInputPhoneNumber("Nhập số điện thoại: ",sc);
    }
}
