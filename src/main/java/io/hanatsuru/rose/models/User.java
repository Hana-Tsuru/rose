package io.hanatsuru.rose.models;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.util.UUID;

import static io.hanatsuru.rose.utils.Constants.MIN_PASSWORD_LENGTH;
import static io.hanatsuru.rose.utils.Constants.PASSWORD_NOT_LONG_ENOUGH;

@Document
@Builder
public record User (
    @Id
    UUID id,

    @Email
    String email,

    @Min(value = MIN_PASSWORD_LENGTH, message = PASSWORD_NOT_LONG_ENOUGH)
    String password,

    String accessToken,

    String refreshToken
) { }
