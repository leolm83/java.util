package comparable_em_objetos;

public class Jogador {
    private String nome;
    private Integer numero;
    private String time;

    Jogador(String nome, Integer numero, String time ){
        this.nome=nome;
        this.numero=numero;
        this.time=time;
    }
    Jogador(String nome){
        this.nome=nome;
        this.numero=-1;
        this.time="Sem time!!!";
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString(){
        return "\n Nome : "+this.nome+"\n Numero : "+this.numero+"\n Time : "+this.time;
    }
}
