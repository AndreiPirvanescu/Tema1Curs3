public class Vreme {
    public static void main(String[] args){
        char initiala = 'z';
        switch(initiala) {
            case 'v' : System.out.println("Este cald");
                       break;
            case 'i' : System.out.println("Este frig");
                       break;
            case 'p' : 
            case 't' : System.out.println("Ploua");
                       break;
            default: System.out.println("Anotimp");
        }
    }
}