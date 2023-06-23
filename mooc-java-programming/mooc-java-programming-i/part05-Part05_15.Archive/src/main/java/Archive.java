import java.util.Arrays;

public class Archive {
    private final String identifier;
    private final String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive archive = (Archive) compared;

        return this.identifier.equals(archive.identifier);
    }
}
