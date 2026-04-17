abstract class CourseType {}
class ExamCourse extends CourseType {}

class Course<T extends CourseType> {
    T type;
    Course(T t) { type = t; }
}