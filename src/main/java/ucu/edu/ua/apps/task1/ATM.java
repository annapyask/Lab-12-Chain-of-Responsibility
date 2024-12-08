package ucu.edu.ua.apps.task1;

public class ATM {

    Section first;

    public ATM() {
        this.first = new Section_500();

        Section_200 section_200 = new Section_200();
        first.setNext(section_200);
    }
    public void GetMeMoney(int amount){
        first.process(amount);
    }
}
