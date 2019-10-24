package com.company;

public class Function_Call_alphabet {
    public static void main(String[] args) {
        a();
        System.out.print(b());
        c(true);
        d();
        e(9);
        f("Frog ");
        System.out.print(g());
        h(1);
        System.out.println();
        i(32);
        System.out.print(j(1));
        k();
        l(true, true);
        m(true, false);
        n("Narxhal ");
        o();
        System.out.print(p());
        q();
        System.out.println();
        System.out.print(r(true));
        s(6);
        t("Thyme ");
        System.out.print(u());
        v(1);
        w(32);
        System.out.print(x(3));
        y();
        System.out.print(z(true, false));
    }

    public static void a() {
        System.out.print("Ant ");
    }

    public static String b() {
        return "Elephant ";
    }

    public static void c(boolean check) {//SOR
        if (check == true) {
            System.out.print("Crocodile ");
        }
    }

    public static void d() {
        System.out.print("DOggie ");
    }

    public static void e(int howmany) {
        String s = "Elephant ";
        int x = 0;
        while (x < howmany) {
            System.out.print(s);
            x = x + 1;
        }
    }

    public static void f(String word) {
        System.out.print(word + " ");
    }

    public static String g() {
        return "Gorilla ";
    }

    public static void h(int reps) {
        int x = 0;
        while (x < reps) {
            System.out.print("Horseradish ");
            x = x + 1;
        }
    }

    public static void i(int ignoreparameter) {
        ignoreparameter = 32;
        String spqace = Character.toString((char) ignoreparameter);
        System.out.print("Ice_Cream ");
    }

    public static String j(int whichone) {
        if (whichone == 1) {
            return "Jambalaya ";
        } else if (whichone == 2) {
            return "Jupiter ";
        } else {
            return "Jackrabbit ";
        }
    }

    public static void k() {
        System.out.print("Kiwi ");
    }

    public static void l(boolean a, boolean b) {
        if (a && b) {
            System.out.print("Lettuce ");
        } else {
            System.out.print("Lhasa_apso ");
        }
    }

    public static void m(boolean a, boolean b) {
        if (a || b) {
            System.out.print("Mango ");
        } else {
            System.out.print("Monkey ");
        }
    }

    public static void n(String word) {
        System.out.print(word + " ");
    }

    public static int o() {
        System.out.print("Orangutan ");
        return 1;
    }

    public static String p() {
        return "Parrot ";
    }

    public static void q() {
        System.out.print("Quail ");
    }

    public static String r(boolean first) {
        if (first) {
            return "Rabbit ";
        } else {
            return "Radish ";
        }
    }

    public static void s(int howmany) {
        String s;
        s = "Snake ";
        int x = 0;
        while (x < howmany) {
            System.out.print(s.charAt(x));
            x = x + 1;
        }
    }

    public static void t(String word) {
        System.out.print(word + " ");
    }

    public static String u() {
        return "Ugli_fruit ";
    }

    public static void v(int reps) {
        int x = 0;
        while (x < reps) {
            System.out.print("Valentine_candy ");
            x = x + 1;
        }
    }

    public static void w(int ignoredparameter) {
        ignoredparameter = 32;
        String space = Character.toString((char) ignoredparameter);
        System.out.print("Walrus" + space);
    }

    public static String x(int whichone) {
        if (whichone == 1) {
            return "X_files ";
        } else {
            return "X_men ";
        }
    }

    public static void y() {
        System.out.print("Yams ");
    }

    public static String z(boolean a, boolean b) {
        if (a || b) {
            return "Zanahorias";
        } else {
            return "Zebra";
        }
    }
}

