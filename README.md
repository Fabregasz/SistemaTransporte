Sistema de Transportes
Este repositório contém um sistema que simula diferentes tipos de transportes. Ele foi desenvolvido utilizando o padrão de projeto Abstract Factory, com o objetivo de criar instâncias de transportes movidos por eletricidade e por força humana, como bicicletas, patins, skateboards, e scooters elétricas.

O sistema é estruturado em torno de uma interface chamada Transport, que define métodos essenciais como move() e stop(), os quais são implementados por diversas classes concretas. Essas classes representam diferentes tipos de transportes, como bicicletas elétricas, scooters, bicicletas tradicionais, patins e skateboards.

O projeto também inclui fábricas que são responsáveis por criar as instâncias desses transportes. A fábrica abstrata TransportFactory define o método createTransport(), e existem duas fábricas concretas: a ElectricTransportFactory, que cria transportes elétricos, e a HumanPoweredTransportFactory, que cria transportes movidos pela força humana.

Estrutura do Projeto
O código está organizado em classes que implementam o padrão Abstract Factory. A interface Transport define os métodos que todas as classes de transporte devem ter. As classes ElectricScooter, ElectricBike, Bicycle, RollerSkates e Skateboard são as implementações concretas dessa interface.

A classe TransportFactory é uma fábrica abstrata, enquanto ElectricTransportFactory e HumanPoweredTransportFactory são fábricas concretas que implementam o método createTransport(), retornando uma instância do transporte apropriado.

A classe principal, Main.java, demonstra como as fábricas são usadas para criar e utilizar os transportes. Ao executar o programa, ele cria uma instância de transporte, utiliza os métodos move() e stop(), e exibe a movimentação dos transportes no console.



