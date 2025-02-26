package test.lmssystem.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.lmssystem.component.MailComponent;
import test.lmssystem.member.entity.Member;
import test.lmssystem.member.model.MemberDto;
import test.lmssystem.member.repository.MemberRepository;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final MailComponent mailComponent;

    public void register(MemberDto memberDto){
        Member member = new Member();
        member.setUserId(memberDto.getUserId());
        member.setPassword(memberDto.getPassword());
        member.setPhone(memberDto.getPhone());
        member.setUsername(memberDto.getUsername());
        member.setRegDt(LocalDateTime.now());
        member.setEmailAuthYn(false);
        member.setEmailAuthKey(UUID.randomUUID().toString());
        memberRepository.save(member);

        String email = memberDto.getUserId();
        String subject = "가입";
        String text = "가입을 축하합니다";

        mailComponent.sendMail(email, subject, text);
    }
}
