package com.example.Project_Spring.models;

import com.example.Project_Spring.security.UserApp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProposalDto {
    private Long id;

    @Nullable
    private UserApp sender;
    @Nullable
    private String senderEmail;
    @Nullable
    private String nameAndSurname;
    private String textMessage;
    private String topic;
    private LocalDateTime creationDate;
    private boolean readed;



}
