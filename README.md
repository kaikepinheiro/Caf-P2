Título: Avaliação P2 - Linguagem de Programação - Prof. Bruno Zolotareff

Kaike  Pinheiro Simplicio

Amanda Beatriz Tavares Batista

Aplicação dos Conceitos de POO na Máquina de Café

* Encapsulamento

O encapsulamento foi aplicado na classe abstrata Drink, onde os atributos sabor e valor foram declarados como private. Isso impede que outras classes alterem diretamente seus valores, garantindo maior segurança dos dados.

*Herança

A herança ocorre quando a classe Cafe herda os atributos e métodos da classe Drink.

public class Cafe extends Drink {

    public Cafe(String sabor, double valor) {
        super(sabor, valor);
    }

}

Dessa forma, Cafe recebe automaticamente os atributos sabor e valor, além dos métodos de acesso, evitando repetição de código.

*Abstração

A abstração foi utilizada através da criação da classe abstrata Drink.

public abstract class Drink {
    private String sabor;
    private double valor;
}

A classe Drink representa uma bebida de forma genérica, contendo apenas as características comuns que qualquer bebida da máquina pode possuir.

No sistema, o usuário não precisa conhecer como os dados são armazenados internamente. Ele apenas escolhe uma opção do menu e recebe o resultado da operação.


*Como o Polimorfismo Poderia Ser Aplicado

Atualmente, o seu código utiliza herança e abstração, mas ainda não implementa polimorfismo de forma completa.

O polimorfismo aconteceria se fossem criadas várias classes que herdam de Drink, cada uma com seu próprio comportamento.

Exemplo:

public class CafePuro extends Drink {

    public CafePuro() {
        super("Café Puro", 1.30);
    }

    public void preparar() {
        System.out.println("Preparando Café Puro");
    }
}
public class Cappuccino extends Drink {

    public Cappuccino() {
        super("Cappuccino", 2.30);
    }

    public void preparar() {
        System.out.println("Preparando Cappuccino");
    }
}

Na classe abstrata:

public abstract class Drink {

    private String sabor;
    private double valor;

    public Drink(String sabor, double valor) {
        this.sabor = sabor;
        this.valor = valor;
    }

    public abstract void preparar();
}

Então seria possível fazer:

Drink bebida = new Cappuccino();
bebida.preparar();

ou

Drink bebida = new CafePuro();
bebida.preparar();

A mesma referência (Drink) executaria comportamentos diferentes dependendo do objeto criado. Isso é polimorfismo.
