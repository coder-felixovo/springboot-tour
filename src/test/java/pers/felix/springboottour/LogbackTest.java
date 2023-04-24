package pers.felix.springboottour;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Felix Lee
 * @date 2023/4/24 9:38
 */
public class LogbackTest {
    @Test
    public void test01() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        logger.debug("logback");

        // 没有配置文件时，使用下面代码可以打印logback内部状态信息
        // LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        // StatusPrinter.print(lc);
    }
}
