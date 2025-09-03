package java_advanced_01.day18.BoardProject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;
}

