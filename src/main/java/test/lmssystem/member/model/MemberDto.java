package test.lmssystem.member.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemberDto {

    private String userId;
    private String username;
    private String password;
    private String phone;
    private LocalDateTime regDt;
}
