public class NotificacionCorreo extends Notificacion {
    protected NotificacionCorreo(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envió el mensaje \'" + mensaje + "\' a: " + receptorNotificacion);
    }
}
