package com.lsang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author lsang
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MainApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(MainApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "             ___________    ____ \n" +
                "      ______/   \\__//   \\__/____\\ \n" +
                "    _/   \\_/  :           //____\\\\ \n" +
                "   /|      :  :  ..      /        \\ \n" +
                "  | |     ::     ::      \\        / \n" +
                "  | |     :|     ||     \\ \\______/ \n" +
                "  | |     ||     ||      |\\  /  | \n" +
                "   \\|     ||     ||      |   / | \\ \n" +
                "    |     ||     ||      |  / /_\\ \\ \n" +
                "    | ___ || ___ ||      | /  /    \\ \n" +
                "     \\_-_/  \\_-_/ | ____ |/__/      \\ \n" +
                "                  _\\_--_/    \\      / \n" +
                "                 /____             / \n" +
                "                /     \\           / \n" +
                "                \\______\\_________/");
    }
}
