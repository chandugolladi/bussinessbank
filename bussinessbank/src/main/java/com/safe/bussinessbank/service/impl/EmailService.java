package com.safe.bussinessbank.service.impl;

import com.safe.bussinessbank.dto.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);

}
