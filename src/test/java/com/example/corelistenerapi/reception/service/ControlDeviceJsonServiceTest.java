package com.example.corelistenerapi.reception.service;

import com.example.corelistenerapi.reception.config.JsonConfig;
import com.example.corelistenerapi.reception.data.DataControlDevice;
import com.example.corelistenerapi.reception.model.ControlDevice;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(classes = {JsonConfig.class, ControlDeviceJsonService.class})
public class ControlDeviceJsonServiceTest {
    private static String requestJson;
    @Autowired
    private ControlDeviceJsonService controlDeviceJsonService;
    private static final ApplicationContext context = new AnnotationConfigApplicationContext();

    @BeforeAll
    static void getJson() {
        Resource resourceRequestJson = context.getResource("request.json");

        try (Reader reader = new InputStreamReader(resourceRequestJson.getInputStream(), UTF_8)) {
            requestJson = FileCopyUtils.copyToString(reader);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

    }

    @Test
    void getControlDevice() {
        ControlDevice actual = controlDeviceJsonService.getControlDevice(requestJson);
        ControlDevice expected = DataControlDevice.getControlDevice();

        assertThat(actual).isEqualTo(expected);
    }
}
