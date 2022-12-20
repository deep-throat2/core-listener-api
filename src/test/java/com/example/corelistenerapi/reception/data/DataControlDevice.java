package com.example.corelistenerapi.reception.data;

import com.example.corelistenerapi.reception.model.ControlDevice;

import java.util.List;

public class DataControlDevice {

    public static ControlDevice getControlDevice() {
        ControlDevice controlDevice = new ControlDevice();
        controlDevice.setAddr_akc("3500");
        controlDevice.setPercent_load(0D);
        controlDevice.setMean_current_capacity(0D);
        controlDevice.setMemory_size(0D);

        controlDevice.setDataLinks(List.of(DataDataLink.getDataLink()));

        return controlDevice;
    }
}
