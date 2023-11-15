package com.example.sharedspacefinder.services.email;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailSender {

//    @Autowired
//    JavaMailSender mailSender;
//
//
//    @Autowired
//    ThymeleafService thymeleafService;

    @Value("${spring.mail.username}")
    private String email;


//    @Override
//    public void sendMailTest() {
//        try {
//            MimeMessage message = mailSender.createMimeMessage();
//
//            MimeMessageHelper helper = new MimeMessageHelper(
//                    message,
//                    MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                    StandardCharsets.UTF_8.name());
//
//            helper.setFrom(email);
//            helper.setText(
//                    thymeleafService.createContent("mail-sender-test.html", null), true);
//            helper.setCc("springbootselfcode@gmail.com");
//            helper.setTo("kayteecmc@gmail.com");
//            helper.setSubject("Mail Test With Template HTML");
//
//            mailSender.send(message);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

//    @Override
//    public void sendMailCreateCustomer(ContactForm contactForm) {
//        try {
//            MimeMessage message = mailSender.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(
//                    message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                    StandardCharsets.UTF_8.name()
//            );
//
//            helper.setTo(contactForm.getEmail());
//
//            Object[] bccObject = contactForm.getEmail().lines().toArray();
//            String[] bcc = Arrays.copyOf(bccObject, bccObject.length, String[].class);
//            helper.setBcc(bcc);
//
//            Map<String, Object> variables = new HashMap<>();
//            variables.put("first_name", contactForm.getFirstName());
//            variables.put("last_name", contactForm.getLastName());
//            variables.put("email", contactForm.getEmail());
//            variables.put("title", contactForm.getTitle());
//            variables.put("content", contactForm.getContent());
//            helper.setText(thymeleafService.createContent("Contact-Template.html", variables), true);
//            helper.setFrom(email);
//            mailSender.send(message);
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//    }
}
