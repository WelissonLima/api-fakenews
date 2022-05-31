package br.com.fakenews.service;

import br.com.fakenews.model.MapModel;
import br.com.fakenews.model.entity.EstadosEnum;
import br.com.fakenews.model.entity.NewsEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MapService {
    private final NewsService newsService;
    private EstadosEnum estadosEnum;

    public MapService(NewsService newsService) {
        this.newsService = newsService;
    }

    public Map<String,Integer> getMap(){
        List<NewsEntity> list = newsService.findAllNews();
        Map<String,Integer> count = new HashMap<String,Integer>();
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q= 0, r = 0, s = 0, t = 0, u = 0, v = 0 , w = 0, y = 0, z = 0, a1 = 0, b1 = 0 ;

        for(NewsEntity estados : list){
            if(estados.getBody().toUpperCase().contains(estadosEnum.ACRE.getDescricao().toUpperCase())){
               a++;
                count.put("ACRE", a);
            }
            if(estados.getBody().toUpperCase().contains(estadosEnum.ALAGOAS.getDescricao().toUpperCase())){
                b++;
                count.put("ALAGOAS", b);
            }
            if(estados.getBody().toUpperCase().contains(estadosEnum.AMAPA.getDescricao().toUpperCase())){
                c++;
                count.put("AMAPA", c);
            }
            if(estados.getBody().toUpperCase().contains(estadosEnum.AMAZONAS.getDescricao().toUpperCase())){
                d++;
                count.put("AMAZONAS", d);
            }
            if(estados.getBody().toUpperCase().contains(estadosEnum.BAHIA.getDescricao().toUpperCase())){
                e++;
                count.put("BAHIA", e);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.CEARA.getDescricao().toUpperCase())){
                f++;
                count.put("CEARA", f);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.DISTRITO_FEDERAL.getDescricao().toUpperCase())){
                g++;
                count.put("DISTRITO_FEDERAL", g);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.ESPIRITO_SANTO.getDescricao().toUpperCase())){
                h++;
                count.put("ESPIRITO_SANRO", h);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.GOIAS.getDescricao().toUpperCase())){
                i++;
                count.put("GOIAS", i);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.MARANHAO.getDescricao().toUpperCase())){
                j++;
                count.put("MARANHAO", j);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.MATO_GROSSO.getDescricao().toUpperCase())){
                k++;
                count.put("MATO_GROSSO", k);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.MATO_GROSSO_DO_SUL.getDescricao().toUpperCase())){
                l++;
                count.put("MATO_GROSSO_DO_SUL", l);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.MINAS_GERAIS.getDescricao().toUpperCase())){
                m++;
                count.put("MINAS_GERAIS", m);
            }


            if(estados.getBody().toUpperCase().contains(estadosEnum.PARA.getDescricao().toUpperCase())){
                n++;
                count.put("PARA", n);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.PARAIBA.getDescricao().toUpperCase())){
                o++;
                count.put("PARAIBA", o);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.PARANA.getDescricao().toUpperCase())){
                p++;
                count.put("PARANA", p);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.PERNAMBUCO.getDescricao().toUpperCase())){
                q++;
                count.put("PERNAMBUCO", q);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.PIAUI.getDescricao().toUpperCase())){
                r++;
                count.put("PIAUI", r);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.RIO_DE_JANEIRO.getDescricao().toUpperCase())){
                s++;
                count.put("RIO_DE_JANEIRO", s);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.RIO_GRANDE_DO_NORTE.getDescricao().toUpperCase())){
                t++;
                count.put("RIO_GRANDE_DO_NORTE", t);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.RIO_GRANDE_DO_SUL.getDescricao().toUpperCase())){
                u++;
                count.put("RIO_GRANDE_DO_SUL", u);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.RONDONIA.getDescricao().toUpperCase())){
                v++;
                count.put("RONDONIA", v);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.RORAIMA.getDescricao().toUpperCase())){
                w++;
                count.put("RORAIMA", w);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.SANTA_CATARINA.getDescricao().toUpperCase())){
                y++;
                count.put("SANTA_CATARINA", y);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.SAO_PAULO.getDescricao().toUpperCase())){
                z++;
                count.put("SAO_PAULO", z);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.SERGIPE.getDescricao().toUpperCase())){
                a1++;
                count.put("SERGIPE", a1);
            }

            if(estados.getBody().toUpperCase().contains(estadosEnum.TOCANTINS.getDescricao().toUpperCase())){
                b1++;
                count.put("TOCANTINS", b1);
            }

        }
        return count;
    }
}
