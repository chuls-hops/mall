package mall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="GetStatus_table")
@Data
public class GetStatus {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
