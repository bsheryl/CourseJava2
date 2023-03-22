package org.example.spring.user;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private int age;

}
