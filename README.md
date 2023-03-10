# exemplo-SobreposicaoSuperAnotacaoFinal

Neste exemplo será resolvido o seguite problema:

Suponha que a operação de saque possui uma taxa no valor de R$ 5,0. Entretanto, se a conta for do tipo poupança, esta taxa não deve ser cobrada e se for conta jurídica deve ser cobrado mais R$ 2,0 adicionais.
Obs: A classe ContaPoupanca não deve permitir heranças derivadas dela e o método saque não deve permitir sobreposto.

Como resolver isso?

Respostas: 

Sobrescrevendo o método saque na subclasse ContaPoupanca

Sobrescrevendo o método saque na classe ContaJuridica chamando o método da classe Conta e acrescentado mais R$ 2.0 

Definir a classe ContaJuridica e o seu método saque como final.
