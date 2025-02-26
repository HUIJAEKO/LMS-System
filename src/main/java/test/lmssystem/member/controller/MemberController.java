package test.lmssystem.member.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import test.lmssystem.member.entity.Member;
import test.lmssystem.member.model.MemberDto;
import test.lmssystem.member.repository.MemberRepository;
import test.lmssystem.member.service.MemberService;

import java.time.LocalDateTime;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/member/register")
    public String register(HttpServletRequest request, MemberDto memberDto){
        Member member = new Member();

        member.setUserId(memberDto.getUserId());
        member.setPassword(memberDto.getPassword());
        member.setPhone(memberDto.getPhone());
        member.setUsername(memberDto.getUsername());
        member.setRegDt(LocalDateTime.now());
        memberService.register(memberDto);

        return "member/register";
    }
}
