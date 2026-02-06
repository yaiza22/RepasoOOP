public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("1", 100);
        cuenta1.retirar(100);
        cuenta1.consignar(150);
        System.out.println("El saldo de la cuenta es: " + cuenta1.getSaldo());

        Notificacion[] notificaciones = new Notificacion[4];
        notificaciones[0] = new NotificacionCorreo("yaiza.sanchez@unibague.edu.co");
        notificaciones[1] = new NotificacionSMS("3209623204");
        notificaciones[3] = new NotificacionMessenger("@CamiloMurcia56");
        notificaciones[0].enviarMensaje("Hola, estimado estudiante.");
        notificaciones[1].enviarMensaje("¿Sin novia?, en Tigo tenemos los mejores planes de amor y amistad, pasate ya!");
        notificaciones[3].enviarMensaje("Hola camilo, como estas? :)");
    }
}