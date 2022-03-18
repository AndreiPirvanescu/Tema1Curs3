public class ExStudent {
    public static void main(String[] args) {
        double[] noteStudent0 = {10, 5, 3, 8, 9, 10, 5, 9, 7, 4};
        Student s0 = new Student("Andrei", 'C', noteStudent0);
        double[] noteStudent1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Student s1 = new Student("Marin", 'C', noteStudent1);
        double[] noteStudent2 = {4, 5, 2, 7, 9, 9, 9, 9, 9, 9};
        Student s2 = new Student("Alex", 'C', noteStudent2);
        double suma = 0;
        s0.sePrezinta();
        System.out.println(s0.esteIntegralist() + " " +s0.getMedie() + " " + s0.getMin() + " " + s0.getMax() + " " + s0.sumaPare() + " " + s0.produsDiv3());
        s1.sePrezinta();
        System.out.println(s1.esteIntegralist() + " " +s1.getMedie() + " " + s1.getMin() + " " + s1.getMax() + " " + s1.sumaPare() + " " + s1.produsDiv3());
        s2.sePrezinta();
        System.out.println(s2.esteIntegralist() + " " +s2.getMedie() + " " + s2.getMin() + " " + s2.getMax() + " " + s2.sumaPare() + " " + s2.produsDiv3());
        Student[] arrayStudent = new Student[3];
        arrayStudent[0] = s0;
        arrayStudent[1] = s1;
        arrayStudent[2] = s2;
        for(int i = 0; i < arrayStudent.length; i++) {
            suma += arrayStudent[i].getMedie();
        }
        System.out.println(suma/arrayStudent.length);
    }
}