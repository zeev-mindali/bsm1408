package cr2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LazyUser {
    private String userName = "admin";
    private String userPass = "password";
}
