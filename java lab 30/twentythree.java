//interface

class student {
    int rollno;

    void getrollno(int n) {
        rollno = n;
    }

    void putrollno() {
        System.out.println("Roll number= " + rollno);
    }
}

class test extends student {
    int t1, t2;

    void getmark(int m1, int m2) {
        t1 = m1;
        t2 = m2;
    }

    void putmarks() {
        System.out.println("marks obtained");
        System.out.println("test1= " + t1);
        System.out.println("test2= " + t2);
    }
}

interface sports {
    final int sportwt = 5;

    void putwt();
}

class result extends test implements sports {
    int total;

    public void putwt() {
        System.out.println("sport wt = " + sportwt);
    };

    void display() {
        total = t1 + t2 + sportwt;
        putrollno();
        putmarks();
        putwt();
        System.out.println("total score = " + total);
    }
}

public class twentythree {
    public static void main(String[] args) {
        result obj = new result();
        obj.getrollno(420);
        obj.getmark(45, 56);
        obj.display();
    }
}
