package casestudymodule2.services;

import casestudymodule2.models.Booking;
import casestudymodule2.models.Promotion;

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class PromotionServiceImpl implements PromotionService {
    public static Set<Promotion> promotionSet = new TreeSet<>();
    public static Stack<Promotion> voucher = new Stack<>();
    public static Scanner scanner = new Scanner(System.in);


    @Override
    public void displayService() {
    
    }

    @Override
    public void displayVoucher() {

    }
}
