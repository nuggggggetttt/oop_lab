class Bank {
    int principal;
    int time;

    Bank(int a, int b) {
        principal = a;
        time = b;
    }

    Bank() {
        principal = 0;
        time = 0;
    }
}

class SBI extends Bank {
    int bank_intr = 8;

    int intrest() {
        int intrest = (principal * time * bank_intr) / 100;
        return intrest;
    }
}

class ICIC extends Bank {
    int bank_intr = 7;

    int intrest() {
        int intrest = (principal * time * bank_intr) / 100;
        return intrest;
    }
}

class AXIS extends Bank {
    int bank_intr = 8;

    int intrest() {
        int intrest = (principal * time * bank_intr) / 100;
        return intrest;
    }
}

class ques_3 {
    public static void main(String[] args) {

    }
}
