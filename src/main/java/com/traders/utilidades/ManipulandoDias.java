/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.utilidades;

import com.traders.models.Ocorrencias;
import com.traders.utilidades.ConverterData;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Windows 7
 */
public class ManipulandoDias {

    public Set<Ocorrencias> umaSemana(Set<Ocorrencias> ocor) {
        Set<Ocorrencias> filtro = new LinkedHashSet<Ocorrencias>();
        filtro.clear();
        for (Ocorrencias oc : ocor) {

            String dd = oc.getData();

            String date = ConverterData.conversao(dd);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate data = LocalDate.parse(date, formatter);

            LocalDateTime atual = LocalDateTime.now();

            Duration diferenca = Duration.between(atual, data.atStartOfDay());

            long resultado = diferenca.toDays();

            Ocorrencias cor = new Ocorrencias(oc.get_Id(), oc.getNome(), oc.getAcertou(), oc.getRanger(), oc.getPonto(), oc.getHora(), oc.getData(), resultado);

            if (cor.getResultado() <= 0 && cor.getResultado() >= -7) {
                if (filtro.contains(cor) == true) {

                } else {
                    filtro.add(cor);
                }
            }
        }

        return filtro;
    }

    public Set<Ocorrencias> tresMeses(Set<Ocorrencias> ocor) {
        Set<Ocorrencias> filtro = new LinkedHashSet<Ocorrencias>();
        filtro.clear();
        for (Ocorrencias oc : ocor) {

            String dd = oc.getData();

            String date = ConverterData.conversao(dd);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate data = LocalDate.parse(date, formatter);

            LocalDateTime atual = LocalDateTime.now();

            Duration diferenca = Duration.between(atual, data.atStartOfDay());

            long resultado = diferenca.toDays();

            Ocorrencias cor = new Ocorrencias(oc.get_Id(), oc.getNome(), oc.getAcertou(), oc.getRanger(), oc.getPonto(), oc.getHora(), oc.getData(), resultado);

            if (cor.getResultado() <= 0 && cor.getResultado() >= -90) {
                if (filtro.contains(cor) == true) {

                } else {
                    filtro.add(cor);
                }
            }
        }

        return filtro;
    }

    public Set<Ocorrencias> umMes(Set<Ocorrencias> ocor) {
        Set<Ocorrencias> filtro = new LinkedHashSet<Ocorrencias>();
        filtro.clear();
        for (Ocorrencias oc : ocor) {

            String dd = oc.getData();

            String date = ConverterData.conversao(dd);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate data = LocalDate.parse(date, formatter);

            LocalDateTime atual = LocalDateTime.now();

            Duration diferenca = Duration.between(atual, data.atStartOfDay());

            long resultado = diferenca.toDays();

            Ocorrencias cor = new Ocorrencias(oc.get_Id(), oc.getNome(), oc.getAcertou(), oc.getRanger(), oc.getPonto(), oc.getHora(), oc.getData(), resultado);

            if (cor.getResultado() <= 0 && cor.getResultado() >= -30) {
                if (filtro.contains(cor) == true) {

                } else {
                    filtro.add(cor);
                }
            }
        }

        return filtro;
    }

    public Set<Ocorrencias> seisMeses(Set<Ocorrencias> ocor) {
        Set<Ocorrencias> filtro = new LinkedHashSet<Ocorrencias>();
        filtro.clear();
        for (Ocorrencias oc : ocor) {

            String dd = oc.getData();

            String date = ConverterData.conversao(dd);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate data = LocalDate.parse(date, formatter);

            LocalDateTime atual = LocalDateTime.now();

            Duration diferenca = Duration.between(atual, data.atStartOfDay());

            long resultado = diferenca.toDays();

            Ocorrencias cor = new Ocorrencias(oc.get_Id(), oc.getNome(), oc.getAcertou(), oc.getRanger(), oc.getPonto(), oc.getHora(), oc.getData(), resultado);

            if (cor.getResultado() <= 0 && cor.getResultado() >= -182) {
                if (filtro.contains(cor) == true) {

                } else {
                    filtro.add(cor);
                }
            }
        }

        return filtro;
    }

    public Set<Ocorrencias> umAno(Set<Ocorrencias> ocor) {
        Set<Ocorrencias> filtro = new LinkedHashSet<Ocorrencias>();
        filtro.clear();
        for (Ocorrencias oc : ocor) {

            String dd = oc.getData();

            String date = ConverterData.conversao(dd);

            System.out.println("chegou no  laço de iteração");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate data = LocalDate.parse(date, formatter);

            LocalDateTime atual = LocalDateTime.now();

            Duration diferenca = Duration.between(atual, data.atStartOfDay());

            long resultado = diferenca.toDays();

            Ocorrencias cor = new Ocorrencias(oc.get_Id(), oc.getNome(), oc.getAcertou(), oc.getRanger(), oc.getPonto(), oc.getHora(), oc.getData(), resultado);

            if (cor.getResultado() <= 0 && cor.getResultado() >= -365) {
                if (filtro.contains(cor) == true) {

                } else {
                    filtro.add(cor);
                }
            }
        }

        return filtro;
    }
}
