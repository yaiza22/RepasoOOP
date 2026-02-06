public class NotificacionWhatsapp extends Notificacion{
    protected NotificacionWhatsapp(String receptorNotificacion){
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("BANCO YAIZA le informa: \'" + mensaje + "\' a " + receptorNotificacion );
    }
}
