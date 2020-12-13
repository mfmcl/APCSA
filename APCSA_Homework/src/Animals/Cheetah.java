package APCSA_Homework.src.Animals;

public class Cheetah extends ATerestrial {
    Cheetah() {
        super("South African Cheetah");
    }

    @Override
    String showYourself() {
        return super.showYourself()+", fastest land animal";
    }
}
