class Badge {
    public String print(Integer id, String name, String department) {
        if (department == null) {
            department = "OWNER";
        }

        department = department.toUpperCase();

        if (id == null){
            return String.format("%s - %s", name, department);
        }

        return String.format("[%s] - %s - %s", id, name, department);
    }
}
