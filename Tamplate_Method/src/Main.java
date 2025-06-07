// Classe abstrata com o Template Method
abstract class PreparadorBebida {
    public final void preparar() {
        ferverAgua();
        adicionarIngrediente();
        adicionarAcucar();
        servir();
    }

    protected void ferverAgua() {
        System.out.println("Fervendo a água...");
    }

    protected abstract void adicionarIngrediente();

    protected void adicionarAcucar() {
        System.out.println("Adicionando açúcar...");
    }

    protected void servir() {
        System.out.println("Servindo a bebida!\n");
    }
}

// Subclasse concreta para preparar café
class PreparadorCafe extends PreparadorBebida {
    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando o café solúvel...");
    }
}

// Subclasse concreta para preparar chá
class PreparadorCha extends PreparadorBebida {
    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando o saquinho de chá...");
    }
}

// Cliente
public class Main {
    public static void main(String[] args) {
        PreparadorBebida cafe = new PreparadorCafe();
        PreparadorBebida cha = new PreparadorCha();

        System.out.println("Preparando Café:");
        cafe.preparar();

        System.out.println("Preparando Chá:");
        cha.preparar();
    }
}

