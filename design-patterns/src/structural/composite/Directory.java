package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    private String name;
    private List<FileSystem> files;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void addFile(FileSystem file) {
        files.add(file);
    }

    public void removeFile(FileSystem file) {
        files.remove(file);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystem file : files) {
            file.showDetails();
        }
    }
}
