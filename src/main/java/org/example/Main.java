package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String choice = "";
        LockerServiceImpl lockerService = new LockerServiceImpl();
        addLockers();




        while (flag){
            System.out.println("Select option: ");
            System.out.println("1 - Fetch locker");
            System.out.println("2 - Return locker");
            System.out.println("3 - Print all lockers status");
            System.out.println("4 - Print locker status");
            System.out.println("5 - Exit program");
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    System.out.println(lockerService.lockLocker());
                    break;
                case "2":
                    flag = false;
                    break;
                case "3":
                    flag = false;
                    break;
                case "4":
                    flag = false;
                    break;
                case "5":
                    flag = false;
                    break;
            }
        }
    }
    public static void addLockers(){
        List<Locker> upperLockers = new ArrayList<>();
        List<Locker> lowerLockers = new ArrayList<>();
        upperLockers.add(new Locker(101, 10, 2, 2));
        upperLockers.add(new Locker(102, 10, 2, 2));
        upperLockers.add(new Locker(103, 10, 3, 2));
        upperLockers.add(new Locker(104, 10, 3, 2));
        upperLockers.add(new Locker(105, 10, 3, 2));
        upperLockers.add(new Locker(106, 10, 3, 2));
        upperLockers.add(new Locker(107, 10, 3, 2));
        upperLockers.add(new Locker(108, 10, 3, 2));
        upperLockers.add(new Locker(109, 10, 3, 2));
        upperLockers.add(new Locker(110, 10, 3, 2));
        upperLockers.add(new Locker(111, 10, 3, 2));
        upperLockers.add(new Locker(112, 10, 3, 2));
        upperLockers.add(new Locker(113, 10, 3, 2));
        upperLockers.add(new Locker(114, 10, 3, 2));
        upperLockers.add(new Locker(115, 10, 3, 2));
        upperLockers.add(new Locker(116, 10, 3, 2));
        upperLockers.add(new Locker(117, 10, 3, 2));
        upperLockers.add(new Locker(118, 10, 2, 2));
        upperLockers.add(new Locker(119, 10, 1, 2));
        upperLockers.add(new Locker(120, 10, 1, 2));
        upperLockers.add(new Locker(121, 10, 2, 2));
        upperLockers.add(new Locker(122, 10, 3, 2));
        upperLockers.add(new Locker(123, 10, 3, 2));
        upperLockers.add(new Locker(124, 10, 3, 2));
        upperLockers.add(new Locker(125, 10, 3, 2));
        upperLockers.add(new Locker(126, 10, 3, 2));
        upperLockers.add(new Locker(127, 10, 3, 2));
        upperLockers.add(new Locker(128, 10, 3, 2));
        upperLockers.add(new Locker(129, 10, 3, 2));
        upperLockers.add(new Locker(130, 10, 3, 2));
        upperLockers.add(new Locker(131, 10, 3, 2));
        upperLockers.add(new Locker(132, 10, 3, 2));
        upperLockers.add(new Locker(133, 10, 3, 2));
        upperLockers.add(new Locker(134, 10, 3, 2));
        upperLockers.add(new Locker(135, 10, 3, 2));
        upperLockers.add(new Locker(136, 10, 3, 2));
        upperLockers.add(new Locker(137, 10, 3, 2));
        upperLockers.add(new Locker(138, 10, 2, 2));
        upperLockers.add(new Locker(139, 10, 2, 2));
        upperLockers.add(new Locker(140, 10, 1, 2));
        upperLockers.add(new Locker(141, 10, 1, 2));
        upperLockers.add(new Locker(142, 10, 2, 2));
        upperLockers.add(new Locker(143, 10, 2, 2));
        upperLockers.add(new Locker(144, 10, 3, 2));
        upperLockers.add(new Locker(145, 10, 3, 2));
        upperLockers.add(new Locker(146, 10, 3, 2));
        upperLockers.add(new Locker(147, 10, 3, 2));
        upperLockers.add(new Locker(148, 10, 3, 2));
        upperLockers.add(new Locker(149, 10, 2, 2));
        upperLockers.add(new Locker(150, 10, 2, 2));
        upperLockers.add(new Locker(151, 10, 1, 2));
        upperLockers.add(new Locker(152, 10, 1, 2));
        upperLockers.add(new Locker(153, 10, 2, 2));
        upperLockers.add(new Locker(154, 10, 2, 2));
        upperLockers.add(new Locker(155, 10, 3, 2));
        upperLockers.add(new Locker(156, 10, 3, 2));
        upperLockers.add(new Locker(157, 10, 3, 2));
        upperLockers.add(new Locker(158, 10, 3, 2));
        upperLockers.add(new Locker(159, 10, 2, 2));
        upperLockers.add(new Locker(160, 10, 2, 2));

        lowerLockers.add(new Locker(201, 10, 2, 1));
        lowerLockers.add(new Locker(202, 10, 2, 1));
        lowerLockers.add(new Locker(203, 10, 3, 1));
        lowerLockers.add(new Locker(204, 10, 3, 1));
        lowerLockers.add(new Locker(205, 10, 3, 1));
        lowerLockers.add(new Locker(206, 10, 3, 1));
        lowerLockers.add(new Locker(207, 10, 3, 1));
        lowerLockers.add(new Locker(208, 10, 3, 1));
        lowerLockers.add(new Locker(209, 10, 3, 1));
        lowerLockers.add(new Locker(210, 10, 3, 1));
        lowerLockers.add(new Locker(211, 10, 3, 1));
        lowerLockers.add(new Locker(212, 10, 3, 1));
        lowerLockers.add(new Locker(213, 10, 3, 1));
        lowerLockers.add(new Locker(214, 10, 3, 1));
        lowerLockers.add(new Locker(215, 10, 3, 1));
        lowerLockers.add(new Locker(216, 10, 3, 1));
        lowerLockers.add(new Locker(217, 10, 3, 1));
        lowerLockers.add(new Locker(218, 10, 2, 1));
        lowerLockers.add(new Locker(219, 10, 1, 1));
        lowerLockers.add(new Locker(220, 10, 1, 1));
        lowerLockers.add(new Locker(221, 10, 2, 1));
        lowerLockers.add(new Locker(222, 10, 3, 1));
        lowerLockers.add(new Locker(223, 10, 3, 1));
        lowerLockers.add(new Locker(224, 10, 3, 1));
        lowerLockers.add(new Locker(225, 10, 3, 1));
        lowerLockers.add(new Locker(226, 10, 3, 1));
        lowerLockers.add(new Locker(227, 10, 3, 1));
        lowerLockers.add(new Locker(228, 10, 3, 1));
        lowerLockers.add(new Locker(229, 10, 3, 1));
        lowerLockers.add(new Locker(230, 10, 3, 1));
        lowerLockers.add(new Locker(231, 10, 3, 1));
        lowerLockers.add(new Locker(232, 10, 3, 1));
        lowerLockers.add(new Locker(233, 10, 3, 1));
        lowerLockers.add(new Locker(234, 10, 3, 1));
        lowerLockers.add(new Locker(235, 10, 3, 1));
        lowerLockers.add(new Locker(236, 10, 3, 1));
        lowerLockers.add(new Locker(237, 10, 3, 1));
        lowerLockers.add(new Locker(238, 10, 2, 1));
        lowerLockers.add(new Locker(239, 10, 2, 1));
        lowerLockers.add(new Locker(240, 10, 1, 1));
        lowerLockers.add(new Locker(241, 10, 1, 1));
        lowerLockers.add(new Locker(242, 10, 2, 1));
        lowerLockers.add(new Locker(243, 10, 2, 1));
        lowerLockers.add(new Locker(244, 10, 3, 1));
        lowerLockers.add(new Locker(245, 10, 3, 1));
        lowerLockers.add(new Locker(246, 10, 3, 1));
        lowerLockers.add(new Locker(247, 10, 3, 1));
        lowerLockers.add(new Locker(248, 10, 3, 1));
        lowerLockers.add(new Locker(249, 10, 2, 1));
        lowerLockers.add(new Locker(250, 10, 2, 1));
        lowerLockers.add(new Locker(251, 10, 1, 1));
        lowerLockers.add(new Locker(252, 10, 1, 1));
        lowerLockers.add(new Locker(253, 10, 2, 1));
        lowerLockers.add(new Locker(254, 10, 2, 1));
        lowerLockers.add(new Locker(255, 10, 3, 1));
        lowerLockers.add(new Locker(256, 10, 3, 1));
        lowerLockers.add(new Locker(257, 10, 3, 1));
        lowerLockers.add(new Locker(258, 10, 3, 1));
        lowerLockers.add(new Locker(259, 10, 2, 1));
        lowerLockers.add(new Locker(260, 10, 2, 1));
        Locker.lockers.add(upperLockers);
        Locker.lockers.add(lowerLockers);
    }
}
