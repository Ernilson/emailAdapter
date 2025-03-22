package br.com.emailAdapter.controller;


import br.com.emailAdapter.dto.EmailDTO;
import br.com.emailAdapter.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

//    @PostMapping("/send")
//    public ResponseEntity<Void> sendEmail(@RequestBody EmailDTO emailDTO) {
//        try {
//            emailService.processEmail(emailDTO);
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    }

    @PostMapping("send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailDTO emailDTO) {
        System.out.println("Recebido: " + emailDTO);
        return ResponseEntity.ok("E-mail enviado!");
    }

}
