package energia;

public class Industrial extends Conta{
 @Override

    public double calcularConta(int consumo) {
        if (consumo <= 1000) {
            return consumo * 0.30 + getTaxa();

        } else {
            return 1000 * 0.30 + getTaxa() + multa(consumo);
        }
    }

    @Override
    public double multa(int consumo) {
        if (consumo > 1000) {
            return (consumo - 1000) * 0.40;
        } else {
            return 0;
        }
    }
}
