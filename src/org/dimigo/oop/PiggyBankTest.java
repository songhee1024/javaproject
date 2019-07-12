package org.dimigo.oop;

public class PiggyBankTest {
    public static void main(String[] args) {
        FamilyMember[] familymembers = {
                new FamilyMember("아빠"),
                new FamilyMember("엄마"),
                new FamilyMember("나"),
                new FamilyMember("남동생")
        };

        FamilyMember.printMemberCnt();
        PiggyBank.putMoney(familymembers[0],10000);
        PiggyBank.putMoney(familymembers[1],5000);
        PiggyBank.putMoney(familymembers[2],2000);
        PiggyBank.putMoney(familymembers[3],1000);
        PiggyBank.printBalance();
        PiggyBank.putMoney(familymembers[2],1000);
        PiggyBank.printBalance();


    }
}
