package org.unrn.ejercicio4;

public class EmisorMail implements Observador {

    @Override
    public void actualizar(String nombre, String telefono, String region) {
        String st = String.format("REGISTRO EN CONCURSO \n" +
                "Nombre: %s, Teléfono:%s, región: %s", nombre, telefono, region);

        enviarMail(st);
    }

    public void enviarMail(String texto) {
//        String to = "jakartato@example.com";
//        String from = "jakartafrom@example.com";
//        final String username = "85cf7d8bdf10ef";
//        final String password = "5ec33b5a98b772";
//        String host = "smtp.mailtrap.io";
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.port", "587");
//        Session session = Session.getInstance(props,
//                new jakarta.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(from));
//            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message.setSubject("Envío de email");
//            message.setText(texto);
//            Transport.send(message);
//            System.out.println("Email enviado satisfactoriamente");
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Email enviado satisfactoriamente");
    }
}
