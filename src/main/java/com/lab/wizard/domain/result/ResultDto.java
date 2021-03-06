package com.lab.wizard.domain.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResultDto {
    private Long id;
    private Long undoneId;
    private String firstname;
    private String lastname;
    private String pesel;
    private String material;
    private LocalDate receiveDate;
    private String result;
    private String comment;
    private String employeeLicence;
    private LocalDate finishDate;
}
