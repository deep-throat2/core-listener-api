package com.example.corelistenerapi.reception.model;

import lombok.Data;

import java.util.List;

// управляющее устройство
@Data
public class ControlDevice {
    private String addr_akc;                // Id
    private Double percent_load;            // средняя загруженность УС
    private Double memory_size;             // средний объем занимаемой памяти (байт)
    private Double mean_current_capacity;   // средняя производительность УС (бит/с)
    private Double number_refusals_kpd;     // количество отказов УС
    private Double coeff_recovery_kpd;      // коэффициент готовности УС
    private Double time_falure_kpd;         // среднее время нахождения УС в работоспособном состоянии
    private Double time_recovery_kpd;       // среднее время восстановления УС после отказа
    private Double serv_byte;               // общий объем обработанной информации (байт)

    private List<DataLink> dataLinks; /////////////// нужен список, в json там отдельные структуры - это не удобно
}