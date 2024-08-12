package member;

public class Member {

    private int memberId;
    private String name;

    public Member(int memberId, String name){
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode(){
        return memberId;
    }

    @Override
    public boolean equals(Object obj){
        if( obj instanceof Member){
            Member member = (Member)obj;
            if( this.memberId == member.memberId){
                return true;
            } else{
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return memberId + "/" + name ;
    }
}
