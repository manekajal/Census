package com.bl;

import com.opencsv.bean.CsvBindByPosition;

public class IndianCensus {
    @CsvBindByPosition(position = 0)
    private String SrNo;
    @CsvBindByPosition(position = 1)
    private String StateName;
    @CsvBindByPosition(position = 2)
    private String TIN;
    @CsvBindByPosition(position = 3)
    private String StateCode;

    public IndianCensus(String srNo, String stateName, String TIN, String stateCode) {
        SrNo = srNo;
        StateName = stateName;
        this.TIN = TIN;
        StateCode = stateCode;
    }

    public IndianCensus() {
    }

    public String getSrNo() {
        return SrNo;
    }

    public void setSrNo(String srNo) {
        SrNo = srNo;
    }

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String stateName) {
        StateName = stateName;
    }

    public String getTIN() {
        return TIN;
    }

    public void setTIN(String TIN) {
        this.TIN = TIN;
    }

    public String getStateCode() {
        return StateCode;
    }

    public void setStateCode(String stateCode) {
        StateCode = stateCode;
    }
}
