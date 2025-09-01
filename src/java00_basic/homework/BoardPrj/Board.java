package java00_basic.homework.BoardPrj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private int bNo;
    private String bTitle;
    private String bContent;
    private String bWriter;
    private Date bDate;
}
