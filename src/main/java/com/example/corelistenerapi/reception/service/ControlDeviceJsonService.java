package com.example.corelistenerapi.reception.service;

import com.example.corelistenerapi.reception.model.ControlDevice;
import com.example.corelistenerapi.reception.model.DataLink;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ControlDeviceJsonService {
    private static final String US = "US";
    private static final String KPDS = "KPDs";
    private final ObjectMapper objectMapper;

    @SneakyThrows
    public ControlDevice getControlDevice(String json) {
        JSONObject obj = new JSONObject(json);

        JSONObject obj_cd = (JSONObject) obj.get(US);
        ControlDevice controlDevice = objectMapper.readValue(obj_cd.toString(), ControlDevice.class);

        JSONArray obj_kpds = (JSONArray) obj.get(KPDS);
        List<DataLink> dataLinks = new ArrayList<>();
        for (int j = 0; j < obj_kpds.length(); ++j) {
            JSONObject kpd = (JSONObject) obj_kpds.get(j);

            DataLink dataLink = objectMapper.readValue(kpd.toString(), DataLink.class);
            dataLinks.add(dataLink);
        }

        controlDevice.setDataLinks(dataLinks);

        return controlDevice;
    }
}
