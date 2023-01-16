package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private Long customerId;
    private String productName;
    private Long productId;
    private Long qty;
    private Long status;
}


