package com.company;

public class M_4_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        Set<String> s = new HashSet<>();
        while (!command.startsWith("#")) {
            String[] t = command.split(" ");
            if (t[0].equals("+")) s.add(t[1]);
            else if (s.contains(t[1])) System.out.println("YES");
            else System.out.println("NO");
            command = in.nextLine();
        }
    }
}
