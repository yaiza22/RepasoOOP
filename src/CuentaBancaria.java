public class CuentaBancaria {
    private final String id;
    private int saldo;

    public CuentaBancaria(String id, int saldoInicial) {
        this.id = id;
        this.saldo = saldoInicial;
    }

    public String getId() {
        return id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void consignar(int valorAConsignar) {
        // Invariantes: validan que se cumpla con los aspectos de negocio
        if(valorAConsignar <= 0) {
            throw new IllegalArgumentException("El valor a consignar no es válido.");
        }
        this.saldo += valorAConsignar;
    }

    public void retirar(int valorARetirar) {
        if(valorARetirar <= 0) {
            throw new IllegalArgumentException("El valor a retirar no es válido.");
        }
        if(valorARetirar > this.saldo) {
            throw new IllegalStateException("El valor a retirar supera su saldo actual.");
        }
        this.saldo -= valorARetirar;
    }
}