# Documentation For Package

io.github.andeibuite.eraly.basic.iterm

---

## What's Directory

It is an iterm on hard disk... It is anything that be able to express with a path like "/root/file"
you could understand as the general name of "file" and "folder"  
About code, Class 「Iterm」 means a directory

**extends chain:**

basic:
```txt
Any
└── Iterm  
    ├── File  
    └── Folder  
```

full:
```txt
Any
├── Iterm
│   ├── File
│   │   ├── ExistFile(ExistIterm)
│   │   └── VirtualFile
│   └── Folder
│       ├── ExistFolder(ExistIterm)
│       └── VirtualFolder
└── io
    ├── Readable
    └── Writeable
    └── ExistIterm(Readable,Writeable)
```