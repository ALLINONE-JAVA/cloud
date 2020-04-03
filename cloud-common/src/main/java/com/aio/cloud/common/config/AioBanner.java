package com.aio.cloud.common.config;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;
import sun.misc.Version;

import java.io.PrintStream;

/**
 * @author ChenHao
 * @title: AioBanner
 * @date 2020-04-03 17:30
 */
public class AioBanner implements Banner {

    private static final String [] version = {
            "             ____                    ___",
            "           /     \\                 (   )            ------",
            "          /       \\                \\ /          /         \\",
            "         /   /\\   \\                 -          /           \\",
            "       /   /    \\  \\               | |       |      (   )     |",
            "      /   /------\\  \\              | |        \\     ---     /",
            "     /   /________\\  \\             | |         \\           /",
            "    /   /          \\  \\            | |          \\         / ",
            "   /   /            \\  \\           | |             -------     ",
            "  /   /              \\  \\          | |       @author : ChenHao",
            " /   /                \\  \\      |||||||||    @version: 1.0.1",
            " ----                  ----       ---------"
    };

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {

    }
}
