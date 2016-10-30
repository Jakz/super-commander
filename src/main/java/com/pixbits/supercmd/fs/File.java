package com.pixbits.supercmd.fs;

public interface File
{
  public boolean isDirectory();
  public File parent();
  
  public String path();
  public String fileName();
  public String extension();
  public FileAttributes attributes();
}
