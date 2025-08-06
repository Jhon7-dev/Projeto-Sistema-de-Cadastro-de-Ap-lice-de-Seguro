public class Apolice {

     private int numero;
     private String nome;
     private int idade;
     private char sexo;
     private double valorAutomovel;

     public  Apolice(){
          
     }
     public  Apolice(int num,String no, int id,char se, double getValorAutomovel){
          this.numero = num;
          this.nome = no;
          this.idade = id;
          this.sexo = se;
          this.valorAutomovel = valorAutomovel;
     }
     public  double calcularValorApolice(){
          if(sexo == 'M' && idade <= 25){
               return valorAutomovel * 10/100;
          }else if(sexo == 'M' && idade > 25){
               return valorAutomovel * 5/100;
          }else if(sexo == 'F'){
               return valorAutomovel * 2/100;
          }else{
               System.out.println("erro!");
               return 0.0;
          }
     }
     public void imprimirDadosApolice(){
          System.out.println("====== Apólice ======");
          System.out.println("Número: " + getNumero());
          System.out.println("Nome: " + getNome());
          System.out.println("Idade: " + getIdade());
          System.out.println("Sexo: " + getSexo());
          System.out.println("Valor Automóvel: " + getValorAutomovel());
          System.out.println("Valor Apólice: " + calcularValorApolice());
     }
           
     public int getNumero(){
          return numero;
     }
     public void setNumero(int numero){
          this.numero = numero;
     }
     public String getNome(){
          return nome;
     }
     public void setNome(String nome){
          this.nome = nome;
     }
     public int getIdade(){
          return idade;
     }
     public void setIdade(int idade){
          this.idade = idade;
     }
     public char getSexo(){
          return sexo;
     }
     public void setSexo(char sexo){
          this.sexo = sexo;
     }
     public double getValorAutomovel(){
          return valorAutomovel;
     }
     public void setValorAutomovel(double valorAutomovel){
          this.valorAutomovel = valorAutomovel;
     }
}