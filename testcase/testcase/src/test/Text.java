package test;

public class Text {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    /**
     * 문자열을 숫자로 변환하며 문자열의 앞뒤 공백은 잘라낸다.
     * 문자열에 숫자가 아닌 문자가 포함된 경우 null을 반환한다.
     */
    public Integer toNumber(){
        if (content == null || content.isEmpty()){
            return null;
        }

        String trimContent = content.trim();

        boolean checkStr = true;
        for (int i=0; i<trimContent.length();i++){
            int asc = trimContent.charAt(i);

            if(asc < 48 || asc > 57){
                checkStr = false;
                break;
            }
        }

        if (checkStr) return Integer.parseInt(trimContent);
        else return null;
    }
}
