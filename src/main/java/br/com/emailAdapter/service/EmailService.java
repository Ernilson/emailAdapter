package br.com.emailAdapter.service;

import br.com.emailAdapter.dto.EmailAwsDTO;
import br.com.emailAdapter.dto.EmailDTO;
import br.com.emailAdapter.dto.EmailOciDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Value("${mail.integracao}")
    private String integracao;

    public void processEmail(EmailDTO emailDTO) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json;

        if ("AWS".equalsIgnoreCase(integracao)) {
            EmailAwsDTO awsDTO = new EmailAwsDTO();
            // Adaptar os dados de emailDTO para awsDTO
            json = mapper.writeValueAsString(awsDTO);
        } else if ("OCI".equalsIgnoreCase(integracao)) {
            EmailOciDTO ociDTO = new EmailOciDTO();
            // Adaptar os dados de emailDTO para ociDTO
            json = mapper.writeValueAsString(ociDTO);
        } else {
            throw new IllegalArgumentException("Integração não suportada");
        }

        System.out.println(json);
    }
}
