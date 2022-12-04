package com.example.corelistenerapi.middle.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class DataLinkDto {
    @Id
    @GeneratedValue
    private long id;
    public long current_metrix_kpd;                 // текущая метрика КПД
    public int initial_capacity_kpd;                // исходная (заявленная) пропускная способность КПД (бит/с)
    public int current_capacity_kpd;                // реальная пропускная способность (бит/с)
    public double coeff_real_capacity_kpd;          // коэффициент реальной пропускной способности КПД
    // (current_capacity_kpd / initial_capacity_kpd)
    public int max_type_traffic;                    // максимальный тип трафика переданный по каналу
    public double mean_data_vol_type_1;             // средний объем типа трафика 1 приоритета
    public double mean_data_vol_type_2;             // средний объем типа трафика 2 приоритета
    public double mean_data_vol_type_3;             // средний объем типа трафика 3 приоритета
    public double mean_data_vol_type_4;             // средний объем типа трафика 4 приоритета
    public double mean_data_vol_type_5;             // средний объем типа трафика 5 приоритета
    public double mean_data_vol_type_6;             // средний объем типа трафика IP-данные
    public double mean_data_vol_type_7;             // средний объем типа трафика IP-аудио
    public double mean_data_vol_type_8;             // средний объем типа трафика IP-видео
    public double mean_time_snd_pack_type_1;        // среднее время доведения пакетов 1 приоритета
    public double mean_time_snd_pack_type_2;        // среднее время доведения пакетов 2 приоритета
    public double mean_time_snd_pack_type_3;        // среднее время доведения пакетов 3 приоритета
    public double mean_time_snd_pack_type_4;        // среднее время доведения пакетов 4 приоритета
    public double mean_time_snd_pack_type_5;        // среднее время доведения пакетов КДГ в IP
    public double mean_time_snd_pack_type_6;        // среднее время доведения пакетов IP-данные
    public double mean_time_snd_pack_type_7;        // среднее время доведения пакетов IP-аудио
    public double mean_time_snd_pack_type_8;        // среднее время доведения пакетов IP-видео
    public double mean_queue_size_type_1;           // средняя длина очереди к КПД пакетов 1 приоритета
    public double mean_queue_size_type_2;           // средняя длина очереди к КПД пакетов 2 приоритета
    public double mean_queue_size_type_3;           // средняя длина очереди к КПД пакетов 3 приоритета
    public double mean_queue_size_type_4;           // средняя длина очереди к КПД пакетов 4 приоритета
    public double mean_queue_size_type_5;           // средняя длина очереди к КПД пакетов 5 приоритета
    public double mean_queue_size_type_6;           // средняя длина очереди к КПД пакетов IP-данные
    public double mean_queue_size_type_7;           // средняя длина очереди к КПД пакетов IP-аудио
    public double mean_queue_size_type_8;           // средняя длина очереди к КПД пакетов IP-видео
    public int num_pack_type_1;                     // количество переданных по КПД пакетов 1 приоритета
    public int num_pack_type_2;                     // количество переданных по КПД пакетов 2 приоритета
    public int num_pack_type_3;                     // количество переданных по КПД пакетов 3 приоритета
    public int num_pack_type_4;                     // количество переданных по КПД пакетов 4 приоритета
    public int num_pack_type_5;                     // количество переданных по КПД пакетов 5 приоритета
    public int num_pack_type_6;                     // количество переданных по КПД пакетов IP-данные
    public int num_pack_type_7;                     // количество переданных по КПД пакетов IP-аудио
    public int num_pack_type_8;                     // количество переданных по КПД пакетов IP-видео
    public int repeat_num_pack_type_1;              // количество повторов пакетов 1 приоритета
    public int repeat_num_pack_type_2;              // количество повторов пакетов 2 приоритета
    public int repeat_num_pack_type_3;              // количество повторов пакетов 3 приоритета
    public int repeat_num_pack_type_4;              // количество повторов пакетов 4 приоритета
    public int repeat_num_pack_type_5;              // количество повторов пакетов 5 приоритета
    public int repeat_num_pack_type_6;              // количество повторов пакетов IP-данные
    public int repeat_num_pack_type_7;              // количество повторов пакетов IP-аудио
    public int repeat_num_pack_type_8;              // количество повторов пакетов IP-видео
    public int los_num_pack_type_1;                 // количество потерь пакетов 1 приоритета
    public int los_num_pack_type_2;                 // количество потерь пакетов 2 приоритета
    public int los_num_pack_type_3;                 // количество потерь пакетов 3 приоритета
    public int los_num_pack_type_4;                 // количество потерь пакетов 4 приоритета
    public int los_num_pack_type_5;                 // количество потерь пакетов 5 приоритета
    public int los_num_pack_type_6;                 // количество потерь пакетов IP-данные
    public int los_num_pack_type_7;                 // количество потерь пакетов IP-аудио
    public int los_num_pack_type_8;                 // количество потерь пакетов IP-видео
    public int number_refusals_kpd;                 // количество отказов КПД
    public double coeff_recovery_kpd;               // коэффициент готовности КПД
    public double coeff_los_pack_kpd;               // коэффициент потерь пакетов
    public double coeff_repeat_pack_kpd;            // коэффициент повторов пакетов
    // (сумма повторов / количество переданных)
    public int sum_num_pack;                        // общее количество обработанных пакетов
    public double sum_size_data;                    // суммарный объем переданных данных
    public double mean_size_package;                // средний размер передаваемых пакетов
}
