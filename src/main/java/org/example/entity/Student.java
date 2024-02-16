package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.dto.StudentDTO;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student extends StudentDTO {
    private String studentId;
    private String name;
    private String address;
}
