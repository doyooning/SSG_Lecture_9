package java_advanced_01.day18.lambdaEx.lmd03;

public class Button {
    public static interface ClickListener {
        void onClick();

    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }

    public static void main(String[] args) {
        Button buttonOk = new Button();

        buttonOk.setClickListener(
            () -> {
                System.out.println("OK버튼 클릭");
            }
        );
        buttonOk.click();

        Button buttonCancel = new Button();
        buttonCancel.setClickListener(
                () -> {
                    System.out.println("취소버튼 클릭");
                }
        );

        for (int i = 0; i < 100; i++) {
            buttonCancel.click();
        }
    }

}
