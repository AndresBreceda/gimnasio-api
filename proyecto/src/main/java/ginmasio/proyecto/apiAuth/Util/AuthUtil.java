package ginmasio.proyecto.apiAuth.Util;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class AuthUtil {
    public static void checkToken(String header) {
        if (header == null || !header.equals("Bearer TOKEN123")) {
            throw new ResponseStatusException(
                HttpStatus.UNAUTHORIZED,
                "No autorizado"
            );
        }
    }
}