package com.pixbits.supercmd.fs;

import java.util.Set;

public interface FileSystem
{

  
   public Set<File> directoryContents(File file);
   
   
   public void renameFile(File file, String newName); 
}
