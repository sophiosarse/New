import dao.*;
import model.*;
import service.TeacherService;

public class Main {
    public static void main(String[] args) {
        try {
            SubjectDao subjectDao = new SubjectDao();
            TeacherDao teacherDao = new TeacherDao();
            StudentDao studentDao = new StudentDao();

            Subject math = new Subject();
            math.setSubjectName("Mathematics");
            subjectDao.create(math);

            Teacher teacher = new Teacher();
            teacher.setFirstName("John");
            teacher.setLastName("Doe");
            teacher.setSubjectId(1);
            teacher.setSalary(2500.00);
            teacherDao.create(teacher);

            TeacherService teacherService = new TeacherService(teacherDao, subjectDao);
            String subjectName = teacherService.getSubjectNameByTeacherId(1);
            System.out.println("Subject taught by teacher: " + subjectName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
