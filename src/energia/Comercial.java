package energia;


// java

public class Comercial extends Conta {

    @Override

    public double calcularConta(int consumo) {
        if (consumo <= 500) {
            return consumo * 0.20+ getTaxa();

        } else {
            return 200 * 0.20 + getTaxa() + multa(consumo);
        }
    }

    @Override
    public double multa(int consumo) {
        if (consumo > 500) {
            return (consumo - 200) * 0.25;
        } else {
            return 0;
        }
    }
}
