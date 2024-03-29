package xyz.ielis.use_modular_phenol;

import picocli.CommandLine;

import java.nio.file.Path;
import java.util.concurrent.Callable;

import static picocli.CommandLine.Help.Ansi.Style.*;

@CommandLine.Command(name = "test-phenol",
        header = "Test modular phenol\n",
        mixinStandardHelpOptions = true,
        usageHelpWidth = 120,
        version = Main.VERSION,
        footer = Main.FOOTER)
public class Main implements Callable<Integer> {

    public static final String VERSION = "0.1.0-SNAPSHOT";
    public static final String FOOTER = "That's all folks";

    @CommandLine.Parameters(
            description = "Path to obographs JSON file (default: ${DEFAULT-VALUE})."
    )
    public Path path = null;

    private static final CommandLine.Help.ColorScheme COLOR_SCHEME = new CommandLine.Help.ColorScheme.Builder()
            .commands(bold, fg_blue, underline)
            .options(fg_yellow)
            .parameters(fg_yellow)
            .optionParams(italic)
            .build();

    public static void main(String[] args) {
        if (args.length == 0) {
            // if the user doesn't pass any command or option, add -h to show help
            args = new String[]{"-h"};
        }

        CommandLine cline = new CommandLine(new Main())
                .setColorScheme(COLOR_SCHEME);
        cline.setToggleBooleanFlags(false);
        System.exit(cline.execute(args));
    }

    @Override
    public Integer call() throws Exception {
        // work done in subcommands
        System.err.println("Hey!");
        return 0;
    }
}