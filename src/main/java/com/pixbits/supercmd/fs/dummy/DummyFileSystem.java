package com.pixbits.supercmd.fs.dummy;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.pixbits.supercmd.fs.File;
import com.pixbits.supercmd.fs.FileSystem;
import com.pixbits.supercmd.fs.exception.FileSystemException;
import com.pixbits.supercmd.fs.exception.FileSystemException.*;

public class DummyFileSystem implements FileSystem
{
  private class TreeNode
  {
    DummyFile file;
    Set<DummyFile> children;
    
    TreeNode(DummyFile file)
    {
      this.file = file;
      this.children = new HashSet<>();
    }
  }
  
  TreeNode root;
  Map<DummyFile, TreeNode> map;
  
  DummyFileSystem()
  {
    DummyFile rootFile = new DummyFile();
    rootFile.name = "";
    rootFile.extension = "";
    rootFile.parent = null;
    
    root = new TreeNode(rootFile);
    map = new HashMap<>();
  }
  
  @Override public Set<File> directoryContents(File file)
  {
    TreeNode node = map.get(file);
    
    if (node == null)
      throw new FileSystemException.FileNotFound("Path "+file+" doesn't exist.");
    else if (!node.file.isDirectory())
      throw new FileSystemException.PathIsNotDirectory("Path "+file+" is not a directory.");
 
    Set<File> contents = Collections.unmodifiableSet(new TreeSet<File>(node.children));
    
    return contents;
   }
  
  @Override
  public void renameFile(File file, String newName)
  {
    DummyFile dfile = (DummyFile)file;
    dfile.name = newName;
  }

}
