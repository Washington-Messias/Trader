/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.utilidades.metematicaDO;

import java.util.Set;
import com.traders.models.Ocorrencias;

/**
 *
 * @author Windows 7
 */

/*
*classe responsável por fazer a matématica das estatisticas
 */
public class mateDO {

    public static Integer acertos(Set<Ocorrencias> ocor) {
        int acertos = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getAcertou().contains("sim") == true) {
                acertos++;
            }
        }

        return acertos;
    }

    public static Integer erros(Set<Ocorrencias> ocor) {
        
        int erros = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getAcertou().contains("nao") == true) {
                erros++;
            }
        }

       

        return erros;
    }

    public static Integer pontos(Set<Ocorrencias> ocor) {
        int pontos = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getPonto().contains("sim") == true) {
                pontos++;
            }
        }

        return pontos;

    }

    public static Integer semPontos(Set<Ocorrencias> ocor) {
        int pontos = 0;

        for (Ocorrencias oc : ocor) {
            if (!oc.getPonto().contains("sim") == true) {
                pontos++;
            }
        }

        return pontos;
    }

    public static Integer todosPontos(Set<Ocorrencias> ocor) {
        int pontos = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getPonto().contains("sim") == true || !oc.getPonto().contains("sim") == true || oc.getPonto().equals(null) == true) {
                pontos++;
            }
        }

        return pontos;
    }

    public static Integer ranger4(Set<Ocorrencias> ocor) {
        int ranger = 0;
        for (Ocorrencias oc : ocor) {
            if (oc.getRanger().contains("4pts") == true) {
                ranger++;
            }
        }

        return ranger;
    }

    public static Integer ranger6(Set<Ocorrencias> ocor) {
        int ranger6 = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getRanger().contains("6pts") == true) {
                ranger6++;
            }

        }

        return ranger6;
    }

    public static Integer rangerNulo(Set<Ocorrencias> ocor) {
        int ranger = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getRanger().contains("0") == true) {
                ranger++;
            }
        }

        return ranger;
    }

    public static Integer todosRanger(Set<Ocorrencias> ocor) {
        int ranger = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getRanger().contains("4pts") || oc.getRanger().contains("6pts") || oc.getRanger().contains("0")) {
                ranger++;
            }
        }

        return ranger;
    }

    public static Double porcentagemAcertos(Set<Ocorrencias> ocor) {
        double percento = 0;
        int acertos = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getAcertou().contains("sim") == true) {
                acertos++;
            }
        }

        if (acertos > 0) {

            percento = (acertos * 100) / ocor.size();

            return percento;
        } else {
            return percento;
        }

    }

    public static Double porcentagemErros(Set<Ocorrencias> ocor) {
       
        int erros = 0;
        double percento = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getAcertou().contains("nao") == true) {
                erros++;
            }

        }

        if (erros > 0) {

            percento = (erros * 100) / ocor.size();

            return percento;
        } else {
            
            return percento;
        }

    }

    public static Double porcentoPontos(Set<Ocorrencias> ocor) {
        int pontos = 0;
        double porcento = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getPonto().contains("sim") == true) {
                pontos++;
            }
        }

        if (pontos > 0) {
            porcento = (pontos * 100) / ocor.size();
            return porcento;
        } else {

            return porcento;
        }

    }

    public static Double porcentoSemPonto(Set<Ocorrencias> ocor) {
        int pontos = 0;
        double porcento = 0;

        for (Ocorrencias oc : ocor) {
            if (!oc.getPonto().contains("sim") == true) {
                pontos++;
            }
        }

        if (pontos > 0) {
            porcento = (pontos * 100) / ocor.size();
            return porcento;
        } else {

            return porcento;
        }

    }

    public static Double percentoRanger4(Set<Ocorrencias> ocor) {
        int ranger = 0;
        double percento = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getRanger().contains("4pts") == true) {
                ranger++;
            }
        }
        if (ranger > 0) {
            percento = (ranger * 100) / ocor.size();

        } else {
            percento = 0;
        }

        return percento;
    }

    public static Double percentoRanger6(Set<Ocorrencias> ocor) {
        
        int ranger6 = 0;
        double percento = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getRanger().contains("6pts") == true) {
                ranger6++;
            }
        }

        if (ranger6 > 0) {

            

            percento = (ranger6 * 100) / ocor.size();
        } else {
            percento = 0;
        }

        return percento;
    }

    public static Double percentoRangerNulo(Set<Ocorrencias> ocor) {
        int ranger = 0;
        double percento = 0;

        for (Ocorrencias oc : ocor) {
            if (oc.getRanger().contains("0") == true) {
                ranger++;
            }
        }

        if (ranger > 0) {
            percento = (ranger * 100) / ocor.size();
            return percento;
        } else {

            return percento;
        }

    }

}
