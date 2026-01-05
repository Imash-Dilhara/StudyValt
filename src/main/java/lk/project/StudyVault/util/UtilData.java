package lk.project.StudyVault.util;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class UtilData {
    public static String genarateAdminId(){
        return "A/"+ UUID.randomUUID() ;
    }

    public static String genarateCourseId(){
        return "C/"+ UUID.randomUUID() ;
    }

    public static String genarateNOteId(){
        return "N/"+ UUID.randomUUID() ;
    }

    public static String genaratePaperId(){
        return "P/"+ UUID.randomUUID() ;
    }

    public static String genarateRepId(){
        return "R/"+ UUID.randomUUID() ;
    }

    public static String genarateStudentId(){
        return "S/"+ UUID.randomUUID() ;
    }

    public static String genarateUserId(){
        return "U/"+ UUID.randomUUID() ;
    }

    public static LocalDate genarateTodayDate(){
        return LocalDate.now();
    }

    public static Time genarateCurrentTime(){
        return Time.valueOf(LocalTime.now());
    }
}