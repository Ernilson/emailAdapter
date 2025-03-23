# Email Adapter - Validação de DTOs

Este projeto tem como objetivo validar objetos de transferência de dados (DTOs) para envio de e-mails utilizando Jakarta Validation (Bean Validation) e JUnit para testes.

## Tecnologias Utilizadas

- **Java 17+**
- **Jakarta Validation (Hibernate Validator)**
- **JUnit 5**
- **Maven**
- **Lombok**

## Estrutura do Projeto

O projeto contém:

- **DTOs**: Classes que representam os dados de envio de e-mails.
  - `EmailOciDTO`: DTO utilizado para o envio de e-mails via Oracle Cloud Infrastructure (OCI).
- **Testes Unitários**: Testes para validar as restrições dos DTOs.
  - `EmailOciDTOTest`: Classe que verifica se as anotações de validação estão funcionando corretamente.

## Como Executar os Testes

1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/email-adapter.git
   cd email-adapter
   ```
2. Compile o projeto e execute os testes:
   ```sh
   mvn clean test
   ```

## Exemplos de Validação

O DTO `EmailOciDTO` possui as seguintes validações:

- `recipientEmail`: Não pode estar em branco e deve ser um e-mail válido.
- `recipientName`: Não pode estar em branco e deve ter no máximo 50 caracteres.
- `senderEmail`: Não pode estar em branco e deve ser um e-mail válido.
- `subject`: Não pode estar em branco e deve ter no máximo 100 caracteres.
- `body`: Não pode estar em branco.

Exemplo de uso do DTO:

```java
EmailOciDTO dto = new EmailOciDTO(
    "destinatario@email.com",
    "Nome Destinatário",
    "remetente@email.com",
    "Assunto",
    "Conteúdo do e-mail"
);
Set<ConstraintViolation<EmailOciDTO>> violations = validator.validate(dto);
System.out.println("Erros de validação: " + violations.size());
```

## Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Fork o repositório.
2. Crie uma branch com sua feature: `git checkout -b minha-feature`.
3. Commit suas alterações: `git commit -m 'Minha nova funcionalidade'`.
4. Push para sua branch: `git push origin minha-feature`.
5. Abra um Pull Request.

## Licença

Este projeto está sob a licença MIT. Para mais detalhes, consulte o arquivo [LICENSE](LICENSE).

