package dtn.fd.com.submission.dto.response;

import dtn.fd.com.submission.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubmissionResponse {

    private String serialNumber;
    private String name;
    private Integer rate;
    private String vendor;
    private String implementation;
    private String tech;
    private String lead;
    private String vendorEmail;
    private Status status;
}
