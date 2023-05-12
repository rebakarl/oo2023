package ee.karl.proovikt2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Toidukomponent {
    @Id
    private Long id;

    @ManyToOne
    private toiduaine toiduaine;
    private int kogus;
}