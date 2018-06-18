package energia;

public class Residencial extends Conta {

    @Override

    public double calcularConta(int consumo) {
        if (consumo <= 200) {
            return consumo * 0.10 + getTaxa();

        } else {
            return 200 * 0.10 + getTaxa() + multa(consumo);
        }
    }

    @Override
    public double multa(int consumo) {
        if (consumo > 200) {
            return (consumo - 200) * 0.12;
        } else {
            return 0;
        }
    }
}
