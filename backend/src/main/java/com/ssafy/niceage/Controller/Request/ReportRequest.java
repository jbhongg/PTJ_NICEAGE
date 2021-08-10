package com.ssafy.niceage.Controller.Request;

import javax.persistence.Column;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "신고 정보")
public class ReportRequest {
	@ApiModelProperty(value = "reporterId")
	private String reporterId;
	
	@ApiModelProperty(value = "reporterTargetId")
    private String reporterTargetId;
	
	@ApiModelProperty(value = "roportDate")
    private String roportDate;
}
