package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.MailSendLog;

public interface MailSendLogMapper {
    int insert(MailSendLog record);

    List<MailSendLog> selectAll();
}