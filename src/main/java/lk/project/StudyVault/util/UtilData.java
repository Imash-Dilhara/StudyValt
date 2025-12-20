package lk.project.StudyVault.util;

import java.util.UUID;

public class UtilData {
    public static String genarateAdminId(){
        return "A/"+ UUID.randomUUID() ;
    }
}
