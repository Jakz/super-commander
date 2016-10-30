package com.pixbits.supercmd.fs.dummy;

import com.pixbits.supercmd.fs.File;
import com.pixbits.supercmd.fs.FileAttributes;

class DummyFile implements File
{
  private final static String S = "/";
  
  File parent;
  String name;
  String extension;
  boolean isDirectory;
  
  public boolean isDirectory() { return isDirectory; }
  public File parent() { return parent; }
  public String path() { return (parent != null ? (parent.path() + S) : "") + fileName(); }
  public String fileName() { return name + "." + extension; }
  public String extension() { return extension; }

  public FileAttributes attributes() { return null; }
  
  @Override public boolean equals(Object o)
  { 
    return o instanceof DummyFile &&
        ((DummyFile)o).path().equals(path());
  }
  
  @Override public int hashCode() { return path().hashCode(); }

}
