package test.lmssystem.member.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    private String username;
    private String password;
    private String phone;
    private LocalDateTime regDt;

    private boolean emailAuthYn;
    private String emailAuthKey;
}
