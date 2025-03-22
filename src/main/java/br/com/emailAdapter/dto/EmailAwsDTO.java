package br.com.emailAdapter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailAwsDTO {
    private String recipient;
    private String recipientName;
    private String sender;
    private String subject;
    private String content;
}
