package dao;

// DAO : Data Access Object
// 서버컴퓨터에서 데이터베이스에 자료를 요청 -> 데이터를 가져오거나 CRUD 역할하는 것
// CRUD : 생성(creat), 조회(read), 변경(update), 삭제(delete) = 기본적인 데이터 관리기능

/*
                   SQL문 (데이터베이스 조작하는 언어)
    생성(creat)  -> INSERT
    조회(read)   -> SELECT
    변경(update) -> UPDATE
    삭제(delete) -> DELETE
 */
public class UserInfo {

    private String userId;
    private String passwd;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
