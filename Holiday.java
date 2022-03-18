class Holiday {
    String nume;
    int ziua;
    String luna;
    
    Holiday(String nume, int ziua, String luna) {
        this.nume = nume;
        this.ziua = ziua;
        this.luna = luna;
    }
    
    Holiday() {
        this.nume = "Sf Maria";
        this.ziua = 8;
        this.luna = "martie";
    }
    
    boolean inSameDay(Holiday sarbatoare) {
        boolean inAceeasiZi = false;
        if(luna == sarbatoare.luna && ziua == sarbatoare.ziua) {
            inAceeasiZi = true;
        }
        return inAceeasiZi;
    }
}