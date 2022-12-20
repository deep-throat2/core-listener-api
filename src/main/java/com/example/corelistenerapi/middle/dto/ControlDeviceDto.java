package com.example.corelistenerapi.middle.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class ControlDeviceDto {
    @Id
    @GeneratedValue
    private long id;                        // Id
    private String addr_akc;
    private Double percent_load;            // средняя загруженность УС
    private Double memory_size;             // средний объем занимаемой памяти (байт)
    private Double mean_current_capacity;   // средняя производительность УС (бит/с)
    private Double number_refusals_kpd;     // количество отказов УС
    private Double coeff_recovery_kpd;      // коэффициент готовности УС
    private Double time_falure_kpd;         // среднее время нахождения УС в работоспособном состоянии
    private Double time_recovery_kpd;       // среднее время восстановления УС после отказа
    private Double serv_byte;               // общий объем обработанной информации (байт)

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<DataLinkDto> dataLinks;
}
