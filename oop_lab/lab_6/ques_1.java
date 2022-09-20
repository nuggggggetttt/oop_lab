class account {
    String name;
    int account_num;
    char account_typ;
    int bal;

    account() {
        account_num = 0;
        account_typ = 'N';
    }

    account(String k, int num, char typ) {
        name = k;
        account_num = num;
        account_typ = typ;
    }
}

class savings extends account {
    int min_bal;
    int penalty;
    int intrest;

    savings(int a, int b, int c, int d) {
        bal = a;
        min_bal = b;
        penalty = c;
        intrest = d;
    }

    void check() {
        if (min_bal > bal) {
            System.out.println("penalty is imposed");
            bal -= penalty;
        }
    }

    void intrest() {
        bal += (bal * (intrest / 100));
    }

}

class curr_account extends account {
    int dep;

    void update() {
        bal = dep + bal;
    }

    void show() {
        System.out.println("The balance of the current account is " + bal);
    }

}