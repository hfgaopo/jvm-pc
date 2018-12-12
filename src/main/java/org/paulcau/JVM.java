package org.paulcau;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * @author gaopo
 * @date 2018/12/12.
 */
public class JVM {

    CommandLineParser commandLineParser = new CommandLineParser() {

        public CommandLine parse(Options options, String[] arguments) throws ParseException {
            return null;
        }

        public CommandLine parse(Options options, String[] arguments, boolean stopAtNonOption) throws ParseException {
            return null;
        }
    };

}
