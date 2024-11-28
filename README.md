Sistema de Transportes
Este repositório contém um sistema que simula diferentes tipos de transportes. Ele foi desenvolvido utilizando o padrão de projeto Abstract Factory, com o objetivo de criar instâncias de transportes movidos por eletricidade e por força humana, como bicicletas, patins, skateboards, e scooters elétricas.

O sistema é estruturado em torno de uma interface chamada Transport, que define métodos essenciais como move() e stop(). Esses métodos são implementados por diversas classes concretas que representam os diferentes tipos de transportes, como bicicletas elétricas, scooters, bicicletas tradicionais, patins e skateboards.

O projeto também inclui fábricas que são responsáveis por criar as instâncias desses transportes. A fábrica abstrata TransportFactory define o método createTransport(), e existem duas fábricas concretas:

ElectricTransportFactory: Cria transportes elétricos.
HumanPoweredTransportFactory: Cria transportes movidos pela força humana.
Estrutura do Projeto
O código está estruturado de forma a aplicar o padrão Abstract Factory para a criação dos transportes, permitindo flexibilidade na adição de novos tipos de transporte sem a necessidade de modificar a lógica principal do sistema. Abaixo está uma explicação das classes presentes no projeto:

1. Transport.java (Interface)
A interface Transport define os métodos move() e stop(), que são essenciais para todos os tipos de transporte no sistema. Cada classe concreta (como bicicletas e scooters) deve implementar esses métodos.

2. ElectricScooter.java (Classe Concreta)
A classe ElectricScooter implementa a interface Transport e define o comportamento dos métodos move() e stop() para um scooter elétrico.

3. ElectricBike.java (Classe Concreta)
A classe ElectricBike representa uma bicicleta elétrica e, assim como a ElectricScooter, implementa a interface Transport.

4. Bicycle.java (Classe Concreta)
A classe Bicycle implementa o transporte tradicional, a bicicleta, sem ser elétrica. A implementação dos métodos move() e stop() é similar às demais, mas com o comportamento de uma bicicleta comum.

5. RollerSkates.java (Classe Concreta)
A classe RollerSkates representa os patins, outro tipo de transporte movido por força humana. Novamente, a implementação dos métodos segue o padrão definido pela interface Transport.

6. Skateboard.java (Classe Concreta)
A classe Skateboard representa o skate, mais um exemplo de transporte movido pela força humana. Ela implementa os mesmos métodos da interface Transport, mas com o comportamento de um skate.

7. TransportFactory.java (Fábrica Abstrata)
A fábrica abstrata TransportFactory declara o método createTransport(), que deve ser implementado pelas fábricas concretas. Esse método é responsável por criar o transporte desejado, seja ele elétrico ou movido pela força humana.

8. ElectricTransportFactory.java (Fábrica Concreta)
A fábrica concreta ElectricTransportFactory cria transportes elétricos, como scooters e bicicletas elétricas. Ao implementar o método createTransport(), ela retorna o tipo de transporte elétrico desejado.

9. HumanPoweredTransportFactory.java (Fábrica Concreta)
A fábrica concreta HumanPoweredTransportFactory cria transportes que dependem da força humana, como bicicletas e patins. Ela implementa o método createTransport() retornando o transporte adequado.

10. Main.java (Classe Principal)
A classe Main.java é responsável por demonstrar o uso das fábricas para criar e utilizar os transportes. Ao executar o programa, a classe principal cria instâncias de transporte através das fábricas e utiliza os métodos move() e stop().
