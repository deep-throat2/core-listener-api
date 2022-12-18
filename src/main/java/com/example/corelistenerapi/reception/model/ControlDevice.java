package com.example.corelistenerapi.reception.model;

import lombok.Data;

import java.util.List;

// управляющее устройство
@Data
public class ControlDevice {
    private String addr_akc;                // Id
    private double percent_load;            // средняя загруженность УС
    private double memory_size;             // средний объем занимаемой памяти (байт)
    private double mean_current_capacity;   // средняя производительность УС (бит/с)
    private double number_refusals_kpd;     // количество отказов УС
    private double coeff_recovery_kpd;      // коэффициент готовности УС
    private double time_falure_kpd;         // среднее время нахождения УС в работоспособном состоянии
    private double time_recovery_kpd;       // среднее время восстановления УС после отказа
    private double serv_byte;               // общий объем обработанной информации (байт)

    private List<DataLink> dataLinks; /////////////// нужен список, в json там отдельные структуры - это не удобно
}