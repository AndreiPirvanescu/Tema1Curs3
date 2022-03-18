public class ExHoliday {
    public static void main(String[] args) {
        Holiday h1 = new Holiday();
        Holiday h2 = new Holiday("Craciun", 25, "decembrie");
        System.out.println(h1.inSameDay(h2));
    }
}