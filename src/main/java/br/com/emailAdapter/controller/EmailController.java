package br.com.emailAdapter.controller;


import br.com.emailAdapter.dto.EmailAwsDTO;
import br.com.emailAdapter.dto.EmailDTO;
import br.com.emailAdapter.dto.EmailOciDTO;
import br.com.emailAdapter.service.EmailService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@Tag(name = "Email Controller", description = "Endpoints para envio de e-mails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("emailDTO")
    public ResponseEntity<String> sendEmail(@Validated @RequestBody EmailDTO emailDTO) {
        System.out.println("Recebido: " + emailDTO);
        return ResponseEntity.ok("E-mail enviado!");
    }

    @PostMapping("emailOciDTO")
    public ResponseEntity<String> sendEmail(@Validated @RequestBody EmailOciDTO emailOciDTO) {
        System.out.println("Recebido: " + emailOciDTO);
        return ResponseEntity.ok("E-mail enviado!");
    }

    @PostMapping("emailAwsDTO")
    public ResponseEntity<String> sendEmail(@Validated @RequestBody EmailAwsDTO emailAwsDTO ) {
        System.out.println("Recebido: " + emailAwsDTO);
        return ResponseEntity.ok("E-mail enviado!");
    }
}
