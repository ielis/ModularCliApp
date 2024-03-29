package xyz.ielis.use_modular_phenol;

import org.monarchinitiative.phenol.io.MinimalOntologyLoader;
import org.monarchinitiative.phenol.ontology.data.MinimalOntology;
import picocli.CommandLine;

import java.nio.file.Path;
import java.util.concurrent.Callable;

@CommandLine.Command(name = "test-phenol",
        header = "Test modular phenol\n",
        mixinStandardHelpOptions = true,
        usageHelpWidth = 120)
public class Main implements Callable<Integer> {

    @CommandLine.Parameters(
            arity = "1",
            description = "Path to obographs JSON file (default: ${DEFAULT-VALUE})."
    )
    public Path path = null;

    public static void main(String[] args) {
        if (args.length == 0) {
            // if the user doesn't pass any command or option, add -h to show help
            args = new String[]{"-h"};
        }

        CommandLine cline = new CommandLine(new Main());
        cline.setToggleBooleanFlags(false);
        System.exit(cline.execute(args));
    }

    @Override
    public Integer call() {
        // work done in subcommands
        System.err.printf("Loading from %s%n", path);
        MinimalOntology hpo = MinimalOntologyLoader.loadOntology(path.toFile());

        System.err.printf("Loaded HPO %s%n", hpo.version().get());
        System.err.printf("There are %d terms%n", hpo.getTerms().size());

        return 0;
    }
}