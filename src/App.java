import java.util.ArrayList;
import java.util.Iterator;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Java");
        nomes.add("ruby");
        nomes.add("scala");


        /*A interface Iterator define uma maneira de percorrer coleções. Isso é necessário porque,
         em coleções diferentes de List, não possuímos métodos para pegar o enésimo elemento. Como,
          então, percorrer todos os elementos de uma coleção? */
        //iterator -- percorre por todos os elementos da coleçao
        // é uma forma padronizada de percorrer uma lista independente do seu tipo, seja ele array
        Iterator<String> it = nomes.iterator();

        //metodos do pacote iterator

        //hasNext() verifica se tem algum proximo elemento - ele é booleano, se tiver um elemento prox ele retorna true, senao retorna false
        //se tiver o metodo next() pega o proximo e mostra
        while(it.hasNext()){
            String atual = it.next();
            System.out.println(atual); //java ruby scala
            //o iterator tmb consegue remover os elementos que tem la dentro
            // it.remove(); // removeu todos os elementos
            // it.add("leandro"); nao consegue adicionar em contrapartida

        }
        System.out.println(nomes.size()); //0, o it.remove() removeu tudo

        //tambem conseguimos percorrer um arraylis da forma tradicional, sem importar pacotes como o iterator

        for(String mostraElementos : nomes){
            System.out.println(mostraElementos); //java ruby scal
        }

        Cliente leo = new Cliente();
        leo.nome = "leandro";

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(leo);
        System.out.println(leo.nome); //retorna Leandro
        System.out.println(clientes.get(0).nome); //retorna Leandro

        leo.nome = "Moura";
        System.out.println(leo.nome); //retorna moura
        System.out.println(clientes.get(0).nome); //tmb retorna moura, pois mudei o nome que fazia a referencia na raiz 

        


    
        // ArrayList<String> l = new ArrayList<String>();
        // l.add("a");
        // l.add("b");
        // l.add(1,"amor");
        // l.add(3,"baixinho");
        // System.out.println(l);
        // String[] array = l.toArray;
        // System.out.println(array[2]);
    
    }
    
}

class Cliente{
    String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}