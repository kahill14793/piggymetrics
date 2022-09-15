package com.smac.pcs.notification.service;

import javax.mail.MessagingException;

import com.smac.pcs.notification.domain.NotificationType;
import com.smac.pcs.notification.domain.Recipient;

import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
