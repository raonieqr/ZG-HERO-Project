package linketinder.model.entities

class Candidate extends Person {

    //TODO criar a classe skill
    ArrayList<String> skills
    ArrayList<MatchVacancy> matchVacancies = new ArrayList<>();
    int id
    int age
    int cep
    String state
    String description
    String cpf

    Candidate() {
        super()
    }

    Candidate(int id, String name, String email, ArrayList<String> skills =
            ["Python", "Java", "Spring Framework", "Angular", "C"],
              int age, String state, String description, String cpf, int cep) {

        super(name, email)
        this.id = id
        this.skills = skills
        this.age = age
        this.state = state
        this.description = description
        this.cpf = cpf
        this.cep = cep
    }

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
    }

    ArrayList<String> getSkills() {
        return skills
    }

    int getAge() {
        return age
    }

    void setAge(int age) {
        this.age = age
    }

    String getState() {
        return state
    }

    void setState(String state) {
        this.state = state
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }

    String getCpf() {
        return cpf
    }

    void setCpf(String cpf) {
        this.cpf = cpf
    }

    int getCep() {
        return cep
    }

    void setCep(int cep) {
        this.cep = cep
    }

    ArrayList<MatchVacancy> getMatchVacancies() {
        return matchVacancies
    }

    @Override
    void showInfo() {

        String skill = skills.join(", ")

        println("Nome: $name")
        println("Email: $super.email")
        println("CPF: $cpf")
        println("Estado: $state")
        println("CEP: $cep")
        println("Descrição: $description")
        println("Competências: $skill")
    }
}