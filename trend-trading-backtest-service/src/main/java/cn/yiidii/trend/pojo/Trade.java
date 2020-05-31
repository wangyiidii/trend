package cn.yiidii.trend.pojo;

import lombok.Data;

@Data
public class Trade {
    private String buyDate;
    private String sellDate;
    private float buyClosePoint;
    private float sellClosePoint;
    private float rate;
}
