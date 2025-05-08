package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *@Description:
 *@Author: csc
 *@Create: 2025-05-08
 */
public class RepairGitPath {
    public static void main(String[] args) throws IOException {
        Path rootDir = Paths.get("D:\\project\\csc"); // 修改为你的目标根目录

        try (Stream<Path> walk = Files.walk(rootDir, 1)) {
//            walk.filter(Files::isDirectory).forEach(System.out::println);

            walk.filter(Files::isDirectory)
                    .forEach(directory -> {
                        try {
                            Path gitConfig = directory.resolve(".git/config");
                            if (Files.exists(gitConfig)) {
                                updateGitConfig(gitConfig);
//                                System.out.println(gitConfig);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
        }
    }


    private static void updateGitConfig(Path gitConfig) throws IOException {
        String content = new String(Files.readAllBytes(gitConfig));
        String updatedContent = content.replaceAll("old-path", "new-path");
//        System.out.println(content + "replace with " + updatedContent);
        Files.write(gitConfig, updatedContent.getBytes());
        System.out.println("Updated " + gitConfig);
    }

}

