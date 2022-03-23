package com.example.crypto_web.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.Nullable;

import javax.validation.constraints.Null;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HoldingsResponse {

    private Long holdingsId;
    @Nullable
    private  Long holdingsUserId;
    @Nullable
    private Float holdingsAmount;

    @Nullable
    private String coinHistoryCoinId;
    @Nullable
    private Long coinHistoryPrice;
    @Nullable
    private Date coinHistoryDate;

    @Nullable
    private String coinName;

}
