package utils.tools;

import java.io.File;

public class JarFile {
  char filename;
  File jarfile = new File(System.getenv("DOWNLOADS") + filename + ".jar");
  void getJar() {
    if (jarfile.exists()) {
      System.out.println("got da jars!");
    } else if (!jarfile.exists()) {
      System.out.println("how??? this person didn't download any jar!");
    }
  }
}
