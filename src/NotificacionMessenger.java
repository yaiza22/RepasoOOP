public class NotificacionMessenger extends Notificacion {
    public NotificacionMessenger(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envió el mensaje \'" + mensaje + "\' al usuario de messenger: " + receptorNotificacion);
    }
}
