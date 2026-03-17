package Ex_Daniel.Classe_associacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("123", "fulano");
        System.out.println(pas1.toString());

        LocalDateTime data = LocalDateTime.of(2026, 10, 14, 10, 15);
        Voo vo1 = new Voo(999, "commeta", "Campinas", "Salvador", data);
        System.out.println(vo1.toString());

        Reserva r1 = new Reserva(55, LocalDateTime.now(), 12, pas1, vo1);
        System.out.println(r1.toString());
    }
}
