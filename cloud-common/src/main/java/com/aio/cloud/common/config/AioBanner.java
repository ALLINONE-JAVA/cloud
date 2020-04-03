package com.aio.cloud.common.config;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author ChenHao
 * @title: AioBanner
 * @date 2020-04-03 17:30
 */
public class AioBanner implements Banner {

    private static final String [] version = {
            "                                                                                                                            " ,
            "                                                                                                                            " ,
            "                  lllllll lllllll        iiii                                                                               " ,
            "                  l:::::l l:::::l       i::::i                                                                              " ,
            "                  l:::::l l:::::l        iiii                                                                               " ,
            "                  l:::::l l:::::l                                                                                           " ,
            "  aaaaaaaaaaaaa    l::::l  l::::l      iiiiiiinnnn  nnnnnnnn            ooooooooooo   nnnn  nnnnnnnn        eeeeeeeeeeee    " ,
            "  a::::::::::::a   l::::l  l::::l      i:::::in:::nn::::::::nn        oo:::::::::::oo n:::nn::::::::nn    ee::::::::::::ee  " ,
            "  aaaaaaaaa:::::a  l::::l  l::::l       i::::in::::::::::::::nn      o:::::::::::::::on::::::::::::::nn  e::::::eeeee:::::ee" ,
            "           a::::a  l::::l  l::::l       i::::inn:::::::::::::::n     o:::::ooooo:::::onn:::::::::::::::ne::::::e     e:::::e" ,
            "    aaaaaaa:::::a  l::::l  l::::l       i::::i  n:::::nnnn:::::n     o::::o     o::::o  n:::::nnnn:::::ne:::::::eeeee::::::e" ,
            "  aa::::::::::::a  l::::l  l::::l       i::::i  n::::n    n::::n     o::::o     o::::o  n::::n    n::::ne:::::::::::::::::e " ,
            " a::::aaaa::::::a  l::::l  l::::l       i::::i  n::::n    n::::n     o::::o     o::::o  n::::n    n::::ne::::::eeeeeeeeeee  " ,
            "a::::a    a:::::a  l::::l  l::::l       i::::i  n::::n    n::::n     o::::o     o::::o  n::::n    n::::ne:::::::e           " ,
            "a::::a    a:::::a l::::::ll::::::l     i::::::i n::::n    n::::n     o:::::ooooo:::::o  n::::n    n::::ne::::::::e          " ,
            "a:::::aaaa::::::a l::::::ll::::::l     i::::::i n::::n    n::::n     o:::::::::::::::o  n::::n    n::::n e::::::::eeeeeeee  " ,
            " a::::::::::aa:::al::::::ll::::::l     i::::::i n::::n    n::::n      oo:::::::::::oo   n::::n    n::::n  ee:::::::::::::e  " ,
            "  aaaaaaaaaa  aaaallllllllllllllll     iiiiiiii nnnnnn    nnnnnn        ooooooooooo     nnnnnn    nnnnnn    eeeeeeeeeeeeee  " ,
            "                                                                                                                            " ,
            "         企业级一站式服务平台                                                                        @author:chenhao         " ,
            "         启动中.............                                                                        @version: 1.0.1         " ,
            "                                                                                                                            " ,
            "                                                                                                                            "
    };

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        Arrays.asList(version).stream().forEach(out::println);
    }
}
