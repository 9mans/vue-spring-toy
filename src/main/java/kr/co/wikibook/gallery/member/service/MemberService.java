package kr.co.wikibook.gallery.member.service;

import kr.co.wikibook.gallery.member.entity.Member;

public interface MemberService {

    Member find(String loginId);

    void save(String name, String loginId, String loginPw);

    Member find(String loginId, String loginPw);
}
