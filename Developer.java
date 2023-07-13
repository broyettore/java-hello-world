public class Developer {

    String lang;
    String education;
    int experience;
    String location;

    Developer(String lang, String education, int experience, String location) {
        this.lang = lang;
        this.education = education;
        this.experience = experience;
        this.location = location;
    }
    Developer(String lang) {
        this.lang = lang;
    }
    Developer(String lang, String education) {
        this.lang = lang;
        this.education = education;
    }
    Developer(String lang, String education, int experience) {
        this.lang = lang;
        this.education = education;
        this.experience = experience;
    }
}
