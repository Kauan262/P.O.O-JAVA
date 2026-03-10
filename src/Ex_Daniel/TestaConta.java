package Ex_Daniel;

public class TestaConta {

    public static void main(String[] args) {

        // 1. Criar conta João
        Conta c1 = new Conta(1, 100, "João Silva");

        // 2. Depositar 500
        c1.depositar(500);

        // 3. Sacar 200
        c1.sacar(200);

        // mostrar estado
        System.out.println(c1);

        // 4. Criar conta Maria
        Conta c2 = new Conta(2, 100, "Maria Souza");

        // 5. Tentar sacar sem saldo
        c2.sacar(50);

        // 6. Tentar encerrar conta com saldo
        c1.encerrarConta();

        // 7. Sacar restante e encerrar
        c1.sacar(300);
        c1.encerrarConta();

        System.out.println(c1);

    }
}