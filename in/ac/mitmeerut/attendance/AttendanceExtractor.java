package in.ac.mitmeerut.attendance;

import in.ac.mitmeerut.student.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AttendanceExtractor implements IntfAttendanceExtractor {

    @Override
    public Student findStudentByRollNumber(String rollNumber) throws LowAttendanceException {

        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader("SubjectWiseSheet_CSV.csv"));

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                if (data.length < 5) continue;

                String name = data[0].trim();
                int totalLecture = Integer.parseInt(data[1].trim());
                int totalPresent = Integer.parseInt(data[2].trim());
                String fileRoll = data[4].trim();

                if (fileRoll.equals(rollNumber)) {

                    double percentage = (double) totalPresent / totalLecture * 100;

                    // Create student FIRST
                    Student student = new Student(name, rollNumber, totalLecture, totalPresent);

                    // If low attendance → print + throw
                    if (percentage < 75) {
                        System.out.println(student); // print details
                        br.close();
                        throw new LowAttendanceException(name, rollNumber);
                    }

                    br.close();
                    return student;
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }

        return null;
    }
}