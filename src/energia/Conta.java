package energia;

public abstract class Conta {
    private String nome;
    private int consumo;
    private double taxa = 30;

    // metados abtratos são apenas assinados, para serem importados nas clases
    //Resitencial, Comecial e Indrustrial
    public abstract double calcularConta(int consumo);
    public abstract double multa(int consumo);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
