class student {
    int reg_no;
    String name;
    int age;
}

class UG extends student {
    int sem;
    int fees;

    UG(int a, int b, int c, String k, int d) {
        reg_no = c;
        sem = a;
        fees = b;
        name = k;
        age = d;

    }
}

class PG extends student {
    int sem;
    int fees;

    PG(int a, int b, int c, String k, int d) {
        reg_no = c;
        sem = a;
        fees = b;
        name = k;
        age = d;

    }
}

class ques_2 {
    public static void main(String[] args) {

    }
}