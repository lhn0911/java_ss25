package ss25.validate.util;

import java.util.Scanner;

public class Validator {

    public static int ValidatorInt(String message, Scanner sc) {
        System.out.print(message);
        do {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu nhập vào không đúng,nhập lại: ");
            } catch (Exception e) {
                System.out.println("Lỗi Không xác định, nhập lại: ");
            }
        } while (true);
    }

    public static Float ValidatorFloat(String message, Scanner sc) {
        System.out.print(message);
        do {
            try {
                return Float.parseFloat(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu nhập vào không đúng,nhập lại: ");
            } catch (Exception e) {
                System.out.println("Lỗi Không xác định, nhập lại: ");
            }
        } while (true);
    }

    public static Double ValidatorDouble(String message, Scanner sc) {
        System.out.print(message);
        do {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu nhập vào không đúng,nhập lại: ");
            } catch (Exception e) {
                System.out.println("Lỗi Không xác định, nhập lại: ");
            }
        } while (true);
    }

    public static Boolean ValidatorBoolean(String message, Scanner sc) {
        System.out.print(message);
        do {
            try {
                return Boolean.parseBoolean(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu nhập vào không đúng,nhập lại: ");
            } catch (Exception e) {
                System.out.println("Lỗi Không xác định, nhập lại: ");
            }
        } while (true);
    }

    public static String ValidatorString(String message, Scanner sc, int min, int max) {
        System.out.print(message);
        do {
            try {
                String str = sc.nextLine().trim();
                if (str.length() >= min && str.length() <= max && !str.isEmpty()) {
                    return str;
                } else {
                    System.out.println("Dữ liệu nhập vào không đúng,nhập lại: ");
                }
            } catch (Exception e) {
                System.out.println("Lỗi Không xác định, nhập lại: ");
            }
        } while (true);
    }

    public static String validatorInputEmail(String message, Scanner sc) {
        System.out.print(message);
        do {
            try {
                String email = sc.nextLine().trim().toLowerCase();
                String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
                if (email.isEmpty()) {
                    System.out.println("Email không được để trống, Nhập: ");
                } else if (!email.matches(emailRegex)) {
                    System.out.println("Email không đúng định dạng(user@example.com), nhập lại: ");
                } else {
                    return email;
                }
            } catch (Exception e) {
                System.out.println("Lỗi Không xác định, nhập lại: ");
            }
        } while (true);
    }

    public static String validatorInputPhoneNumber(String message, Scanner sc) {
        System.out.print(message);
        do {
            try {
                String phoneNumber = sc.nextLine().trim().replaceAll("[^0-9]", "");
                if (phoneNumber.isEmpty()) {
                    System.out.println("Số điện thoại không được để trống.");
                } else if (!phoneNumber.matches("^(03|05|07|08|09)[0-9]{8}$")) {
                    System.out.println("Số điện thoại không hợp lệ, Nhập lại: ");
                } else {
                    return phoneNumber;
                }
            } catch (Exception e) {
                System.out.println("Lỗi Không xác định, nhập lại: ");
            }
        } while (true);
    }
}
