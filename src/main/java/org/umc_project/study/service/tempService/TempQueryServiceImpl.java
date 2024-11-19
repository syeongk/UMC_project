package org.umc_project.study.service.tempService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.umc_project.study.api.code.status.ErrorStatus;
import org.umc_project.study.api.exception.handler.TempHandler;

@Service
@RequiredArgsConstructor
public class TempQueryServiceImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
    }
}