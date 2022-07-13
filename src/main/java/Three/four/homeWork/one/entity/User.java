package Three.four.homeWork.one.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {
    String login;
    String email;
    String password;
    int age;
}
