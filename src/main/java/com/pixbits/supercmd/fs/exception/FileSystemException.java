package com.pixbits.supercmd.fs.exception;

import com.pixbits.supercmd.fs.File;

public class FileSystemException extends RuntimeException
{ 
  private FileSystemException(String message)
  {
    super(message);
  }
  
  public static class FileNotFound extends FileSystemException
  {
    public FileNotFound(String message)
    {
      super(message);
    }
  }

  public static class PathIsNotDirectory extends FileSystemException
  {
    public PathIsNotDirectory(String message)
    {
      super(message);
    }
  }
}
