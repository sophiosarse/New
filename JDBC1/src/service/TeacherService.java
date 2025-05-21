package service;

import dao.SubjectDao;
import dao.TeacherDao;
import model.Subject;
import model.Teacher;

public class TeacherService {
    private TeacherDao teacherDao;
    private SubjectDao subjectDao;

    public TeacherService(TeacherDao teacherDao, SubjectDao subjectDao) {
        this.teacherDao = teacherDao;
        this.subjectDao = subjectDao;
    }

    public String getSubjectNameByTeacherId(int teacherId) throws Exception {
        Teacher teacher = teacherDao.readById(teacherId);
        if (teacher == null) {
            throw new Exception("Teacher not found");
        }
        Subject subject = subjectDao.readById(teacher.getSubjectId());
        return subject != null ? subject.getSubjectName() : null;
    }
}
