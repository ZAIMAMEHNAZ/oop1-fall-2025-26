package Lab;

public class Contact {
    private String phone;
    private String email;

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void showContactInfo() {
        System.out.println("Phone number:" + getPhone());
        System.out.println("Email:" + getEmail());
    }

    public class Student {
        private String name;
        private Contact contact;

        public Student(String name, Contact contact) {
            this.name = name;
            this.contact = contact;
        }

        public String getName() {
            return name;
        }

        public Contact getContact() {
            return contact;
        }

        public void showStudentInfo() {
            System.out.println("Name" + getName());
            System.out.println("Contact" + getContact());
        }

        public class School {
            private String schoolName;
            private Student[] students;
            private int studentcount = 0;

            public School(String schoolName, int size) {
                this.schoolName = schoolName;
                students = new Student[size];
            }

       public void addStudent (Student student){
        if (studentcount < students.length){
            students  
        }

       }

       public void showSchoolInfo(){


       }
