package ee.karl.proovikt2;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Id

public class toiduaine {
    private Long id;
    private String nimetus;
    private int valk;
    private int rasv;
    private int sysivesik;

}
