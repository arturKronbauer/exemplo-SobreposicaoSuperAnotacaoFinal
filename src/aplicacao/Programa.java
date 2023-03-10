package aplicacao;

import entidades.Conta;
import entidades.ContaJuridica;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		Conta conta1 = new Conta(100,"Alex",1000.0);
		conta1.saque(500.0);
		System.out.println("Saldo da Conta de Alex = "+conta1.getSaldo());
		
		Conta conta2 = new ContaPoupanca(123,"Anna",1000.0, 0.1);
		conta2.saque(500.0);
		System.out.println("Saldo da Conta de Anna = "+conta2.getSaldo());
		
		Conta conta3 = new ContaJuridica(123,"Belissima Cosméticos",800.0, 5000.0);
		conta3.saque(300.0);
		System.out.println("Saldo da Belissima Cosméticos = "+conta3.getSaldo());
	}
}
