package br.com.emailAdapter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailDTO {
    private String recipientEmail;
    private String recipientName;
    private String senderEmail;
    private String subject;
    private String content;
}
