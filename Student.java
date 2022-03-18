class Student {
    String nume;
    int grupa;
    char serie;
    int anDeStudiu;
    String facultate;
    double[] note;
    
    Student() {
        
    }
    
    Student(String nume, int grupa, String facultate, int anDeStudiu) {
        this.nume = nume;
        this.grupa = grupa;
        this.facultate = facultate;
        this.anDeStudiu = anDeStudiu;
    }
    
    Student(String nume, char serie, double note[]) {
        this.nume = nume;
        this.serie = serie;
        this.note = note;
    }
    
    void sePrezinta(){
        System.out.println(nume + ", facultatea " + facultate + ", grupa " + grupa);
    }
    
    boolean esteIntegralist() {
        boolean integralist = true;
        for(int i = 0; i < note.length; i++) {
            if(note[i] < 5) {
                integralist = false;
            }
        }
        return integralist;
    }
    
    double getMedie() {
        double suma = 0;
        for(int i = 0; i < note.length; i++) {
            suma += note[i];
        }
        return suma/note.length;
    }
    
    double getMin() {
        double minim = note[0];
        for(int i = 1; i < note.length; i++) {
            if(note[i] < minim) {
                minim = note[i];
            }
        }
        return minim;
    }
    
    double getMax() {
        double maxim = note[0];
        for(int i = 1; i < note.length; i++) {
            if(note[i] > maxim) {
                maxim = note[i];
            }
        }
        return maxim;
    }
    
    double sumaPare() {
        double suma = 0;
        for(int i = 0; i < note.length; i++) {
            if(note[i] % 2 == 0) {
                suma += note[i];
            }
        }
        return suma;
    }
    
    double produsDiv3() {
        double produs = 1;
        for(int i = 0; i < note.length; i++) {
            if(note[i] % 3 == 0) {
                produs *= note[i];
            }
        }
        return produs;
    }
}