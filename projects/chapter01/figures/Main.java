
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main
{
    public static void main(String[] args) {
        
        int x;  // int é um tipo
        String nome = "Ola Mundo";
        System.out.println(nome);
        
        x = 0;
        
        Circle circulo1;  // declarando a variavel da classe Circle
        circulo1 = new Circle();
        
        Square quadrado1 = new Square();
        
        Triangle triangulo1 = new Triangle();
        
        Person pessoa1 = new Person();
        
        circulo1.makeVisible();
        quadrado1.makeVisible();
        triangulo1.makeVisible();
        pessoa1.makeVisible();
        
        circulo1.slowMoveHorizontal(100);
        
        
        
        
        
        
    }
}
