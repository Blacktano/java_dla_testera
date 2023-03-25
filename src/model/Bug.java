package model;

public class Bug {

    private String email;
    private int bugPriority;
    private boolean bugStatus;

    public Bug(String bugDescription, String email, int bugPriority, boolean bugStatus) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = bugStatus;
    }

    private String bugDescription;

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10)
            System.out.println("za krtoki opis");
        else
            this.bugDescription = bugDescription;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@"))
            System.out.println("zly email");
        else
            this.email = email;
    }

    public void setBugPriority(int bugPriority) {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:

                this.bugPriority = bugPriority;
                break;
            default:
                System.out.println("ty chuju");

        }

    }

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        this.bugStatus = bugStatus;
    }



    public void showAllBugInfo() {
        System.out.println("model.Bug description: " + bugDescription + " email: " + email + " bug priority: " + bugPriority
                + " bug status: " + bugStatus);
    }

    public void showEmail() {
        System.out.println("Email: " + email);
    }

    public void showBugStatus() {
        System.out.println("model.Bug status: " + bugStatus);
    }

    public int getBugPriority() {
        return bugPriority;
    }

}
