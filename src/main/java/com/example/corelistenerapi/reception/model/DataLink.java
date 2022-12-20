package com.example.corelistenerapi.reception.model;

import lombok.Data;

// канал передачи данных (кпд)
@Data
public class DataLink {

    private String num_kpd;
    private Long current_metrix_kpd;                 // текущая метрика КПД
    private Integer initial_capacity_kpd;                // исходная (заявленная) пропускная способность КПД (бит/с)
    private Integer current_capacity_kpd;                // реальная пропускная способность (бит/с)
    private Double coeff_real_capacity_kpd;          // коэффициент реальной пропускной способности КПД
                                                    // (current_capacity_kpd / initial_capacity_kpd)
    private Integer max_type_traffic;                    // максимальный тип трафика переданный по каналу
    private Double mean_data_vol_type_1;             // средний объем типа трафика 1 приоритета
    private Double mean_data_vol_type_2;             // средний объем типа трафика 2 приоритета
    private Double mean_data_vol_type_3;             // средний объем типа трафика 3 приоритета
    private Double mean_data_vol_type_4;             // средний объем типа трафика 4 приоритета
    private Double mean_data_vol_type_5;             // средний объем типа трафика 5 приоритета
    private Double mean_data_vol_type_6;             // средний объем типа трафика IP-данные
    private Double mean_data_vol_type_7;             // средний объем типа трафика IP-аудио
    private Double mean_data_vol_type_8;             // средний объем типа трафика IP-видео
    private Double mean_time_snd_pack_type_1;        // среднее время доведения пакетов 1 приоритета
    private Double mean_time_snd_pack_type_2;        // среднее время доведения пакетов 2 приоритета
    private Double mean_time_snd_pack_type_3;        // среднее время доведения пакетов 3 приоритета
    private Double mean_time_snd_pack_type_4;        // среднее время доведения пакетов 4 приоритета
    private Double mean_time_snd_pack_type_5;        // среднее время доведения пакетов КДГ в IP
    private Double mean_time_snd_pack_type_6;        // среднее время доведения пакетов IP-данные
    private Double mean_time_snd_pack_type_7;        // среднее время доведения пакетов IP-аудио
    private Double mean_time_snd_pack_type_8;        // среднее время доведения пакетов IP-видео
    private Double mean_queue_size_type_1;           // средняя длина очереди к КПД пакетов 1 приоритета
    private Double mean_queue_size_type_2;           // средняя длина очереди к КПД пакетов 2 приоритета
    private Double mean_queue_size_type_3;           // средняя длина очереди к КПД пакетов 3 приоритета
    private Double mean_queue_size_type_4;           // средняя длина очереди к КПД пакетов 4 приоритета
    private Double mean_queue_size_type_5;           // средняя длина очереди к КПД пакетов 5 приоритета
    private Double mean_queue_size_type_6;           // средняя длина очереди к КПД пакетов IP-данные
    private Double mean_queue_size_type_7;           // средняя длина очереди к КПД пакетов IP-аудио
    private Double mean_queue_size_type_8;           // средняя длина очереди к КПД пакетов IP-видео
    private Integer num_pack_type_1;                     // количество переданных по КПД пакетов 1 приоритета
    private Integer num_pack_type_2;                     // количество переданных по КПД пакетов 2 приоритета
    private Integer num_pack_type_3;                     // количество переданных по КПД пакетов 3 приоритета
    private Integer num_pack_type_4;                     // количество переданных по КПД пакетов 4 приоритета
    private Integer num_pack_type_5;                     // количество переданных по КПД пакетов 5 приоритета
    private Integer num_pack_type_6;                     // количество переданных по КПД пакетов IP-данные
    private Integer num_pack_type_7;                     // количество переданных по КПД пакетов IP-аудио
    private Integer num_pack_type_8;                     // количество переданных по КПД пакетов IP-видео
    private Integer repeat_num_pack_type_1;              // количество повторов пакетов 1 приоритета
    private Integer repeat_num_pack_type_2;              // количество повторов пакетов 2 приоритета
    private Integer repeat_num_pack_type_3;              // количество повторов пакетов 3 приоритета
    private Integer repeat_num_pack_type_4;              // количество повторов пакетов 4 приоритета
    private Integer repeat_num_pack_type_5;              // количество повторов пакетов 5 приоритета
    private Integer repeat_num_pack_type_6;              // количество повторов пакетов IP-данные
    private Integer repeat_num_pack_type_7;              // количество повторов пакетов IP-аудио
    private Integer repeat_num_pack_type_8;              // количество повторов пакетов IP-видео
    private Integer los_num_pack_type_1;                 // количество потерь пакетов 1 приоритета
    private Integer los_num_pack_type_2;                 // количество потерь пакетов 2 приоритета
    private Integer los_num_pack_type_3;                 // количество потерь пакетов 3 приоритета
    private Integer los_num_pack_type_4;                 // количество потерь пакетов 4 приоритета
    private Integer los_num_pack_type_5;                 // количество потерь пакетов 5 приоритета
    private Integer los_num_pack_type_6;                 // количество потерь пакетов IP-данные
    private Integer los_num_pack_type_7;                 // количество потерь пакетов IP-аудио
    private Integer los_num_pack_type_8;                 // количество потерь пакетов IP-видео
    private Integer number_refusals_kpd;                 // количество отказов КПД
    private Double coeff_recovery_kpd;               // коэффициент готовности КПД
    private Double coeff_los_pack_kpd;               // коэффициент потерь пакетов
    private Double coeff_repeat_pack_kpd;            // коэффициент повторов пакетов
                                                    // (сумма повторов / количество переданных)
    private Integer sum_num_pack;                        // общее количество обработанных пакетов
    private Double sum_size_data;                    // суммарный объем переданных данных
    private Double mean_size_package;                // средний размер передаваемых пакетов
}

