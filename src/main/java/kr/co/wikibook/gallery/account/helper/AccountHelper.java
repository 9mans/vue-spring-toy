package kr.co.wikibook.gallery.account.helper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.wikibook.gallery.account.dto.AccountJoinRequest;
import kr.co.wikibook.gallery.account.dto.AccountLoginRequest;

public interface AccountHelper {

    void join(AccountJoinRequest accountJoinRequest);

    String login(AccountLoginRequest loginReq, HttpServletRequest req, HttpServletResponse res);

    Integer getMemberId(HttpServletRequest req);

    boolean isLoggedIn(HttpServletRequest req);

    void logout(HttpServletRequest req, HttpServletResponse res);
}
