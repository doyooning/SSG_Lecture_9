package java_advanced_01.TeamMission1.common;

public enum ErrorCode {

    ALREADY_EXISTS("이미 존재하는 이름입니다. 다른 이름을 입력하세요."),
    FILE_NOT_FOUND("파일이 존재하지 않습니다. 새 파일을 생성합니다.");


    private String msg;

    ErrorCode(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
