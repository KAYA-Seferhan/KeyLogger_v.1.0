//Gerekli kütüphanelerin projeye dahil edilmesi.
import java.io.IOException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.*;

public class Mailat {
    public void MailGonder() {
        Logger loggernesnem = new Logger();

        // Mail sunucusu ayarlarının tanımı.
        Properties kaynaklarnesnesi = new Properties();
        kaynaklarnesnesi.put("mail.smtp.host", "smtp.gmail.com");
        kaynaklarnesnesi.put("mail.smtp.port", "587");
        kaynaklarnesnesi.put("mail.smtp.auth", "true");
        kaynaklarnesnesi.put("mail.smtp.starttls.enable", "true");

        // Oturum nesnesi oluşturma.
        Session oturumnesnesi = Session.getInstance(kaynaklarnesnesi, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(GUI.Kayit.GONDEREN_MAIL, GUI.Kayit.TOKEN);
            }
        });


        //Mesaj oluşturma ve içeriğini ayarlama.
        try {
            Message mesaj = new MimeMessage(oturumnesnesi);
            mesaj.setRecipient(Message.RecipientType.TO, new InternetAddress(GUI.ALICI_MAIL));
            mesaj.setSubject("Log Dosyası");

            //Mail bölümlerini ayarlama.
            Multipart multipart = new MimeMultipart();

            //Mesaj kısmını ayarlama.
            MimeBodyPart mesajkismi = new MimeBodyPart();
            mesajkismi.setText("Log Dosyası Mail Ekinde Gönderilmiştir.");
            multipart.addBodyPart(mesajkismi);

            //Log dosyasını maile ekleme.
            MimeBodyPart ekkismi = new MimeBodyPart();
            ekkismi.attachFile(loggernesnem.getLOG_DOSYASI());
            multipart.addBodyPart(ekkismi);

            //Mail içeriğini çoklu bölüm olarak ayarlama.
            mesaj.setContent(multipart);

            //Maili gönderen method.
            Transport.send(mesaj);
        } catch (MessagingException | IOException e) {
            e.printStackTrace();
        }
        //Mailin gönderildiğine dair bilgilendirme penceresi.
        JOptionPane.showMessageDialog(null, "Log Dosyası İlgili Mail Adresine Gönderildi!");
    }
}