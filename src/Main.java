import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntConsumer;

import napoje.NapojAlkoholowy;
import napoje.NapojGazowany;
import napoje.Napoje;
import napoje.Sok;

public class Main {
    public static void main(String[] args) {
        List<Napoje> napoje = new ArrayList<>();

        Napoje cola = new NapojGazowany("Cocacola Zero", "Coca-Cola", 450);
        Napoje zubrowka = new NapojAlkoholowy("Soplica wiśniowa", "Soplica", 500, 36);
        Napoje tymbark = new Sok("Tymbark", "Jabłko-Wiśnia", 1000);

        napoje.add(cola);
        napoje.add(zubrowka);
        napoje.add(tymbark);

        for(Napoje napoj : napoje){
            napoj.pij(230);
        }

        KochajacyProgram program = new Implementuj();
        program.programuj();

        Function<String, Integer> dlugosc = s -> s.length();
        System.out.println(dlugosc.apply("Jezus Maryja"));

        IntConsumer ocena = o -> System.out.println("Dostajesz ocene: " + o);
        ocena.accept(12);

        BiFunction<Integer, Integer, Integer> iloczyn = (a, b) -> a*b;
        System.out.println(iloczyn.apply(7,8));




    }
}