//

public class Name {
    //** Класс принимает значения в формате {@param secondName, @param name, @param patronymic} /*/
    private String secondName;
    private String name;
    private String patronymic;

    public Name() {
        this.secondName = null;
        this.name = null;
        this.patronymic = null;
    }

    public Name(Name name) {
        setSecondName(name.secondName);
        setName(name.name);
        setPatronymic(name.patronymic);
    }

    public Name(String secondName, String name, String patronymic) {
        setSecondName(secondName);
        setName(name);
        setPatronymic(patronymic);
    }

    public String getSecondName() {
        return secondName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder =  new StringBuilder();
        if (secondName != null && !secondName.isEmpty()) {
            stringBuilder.append(secondName).append(" ");
        }
        if (name != null && !name.isEmpty()) {
            stringBuilder.append(name).append(" ");
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            stringBuilder.append(patronymic).append(" ");
        }
        return stringBuilder.toString();
    }
}
