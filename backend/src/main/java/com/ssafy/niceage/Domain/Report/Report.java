package com.ssafy.niceage.Domain.Report;

import java.util.Date;

import javax.persistence.*;

import com.ssafy.niceage.Controller.Request.ReportRequest;
import com.ssafy.niceage.Controller.Request.UserRequest;
import com.ssafy.niceage.Domain.User.User;

import lombok.Data;

@Entity
@Data
public class Report {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "report_id", nullable = false)
	private Long reportId;
	
	@Column (name = "reporter_id", nullable = false, length = 45)
	private String reporterId;
	
	@Column (name = "reporter_target_id", nullable = false, length = 45)
    private String reporterTargetId;
	
	@Column (name = "report_date")
    private String roportDate;
	
	public static Report receiptReport(ReportRequest request) {
		Report reportInput = new Report();
		reportInput.reporterId = request.getReporterId();
		reportInput.setReporterId(request.getReporterId());
		reportInput.setReporterTargetId(request.getReporterTargetId());
		reportInput.setRoportDate(request.getRoportDate());
        return reportInput;
	}
}
