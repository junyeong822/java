package dao;

/*

    데이터베이스를 어떤것을 사용하게 될지 미정인 상태
    인터페이스를 만들고
    - mysql용 구현클래스
    - oracle용 구현클래스를 만들 예정

    그래서 상황에따라서 필요한 구현클래스로 연결해서 사용
    모든 구현클래스는 추가, 변경, 삭제 메서드를 갖고 있도록 한다.
    구현 클래스에서는 각 데이터베이스에 맞는 db 조회 구문을 작성해서 구현한다.

 */

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);

}
