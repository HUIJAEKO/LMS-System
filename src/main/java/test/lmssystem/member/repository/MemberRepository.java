package test.lmssystem.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.lmssystem.member.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
}
