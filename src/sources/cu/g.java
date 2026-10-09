package cu;

import au.n0;
import com.lingodeer.database.model.DbFileVersionEntity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import qy.b0;
import rz.e0;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a00.e f22515b = new a00.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f22516a;

    public g(n0 dbFileVersionDao) {
        kotlin.jvm.internal.m.f(dbFileVersionDao, "dbFileVersionDao");
        this.f22516a = dbFileVersionDao;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(g gVar, String str, xy.c cVar) {
        b bVar;
        n0 n0Var = gVar.f22516a;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i11 = bVar.f22490c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f22490c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(gVar, cVar);
            }
        } else {
            bVar = new b(gVar, cVar);
        }
        Object obj = bVar.f22488a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = bVar.f22490c;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                DbFileVersionEntity dbFileVersionEntityC = n0Var.c(str);
                if (dbFileVersionEntityC == null) {
                    dbFileVersionEntityC = new DbFileVersionEntity(str, -1L, true);
                }
                DbFileVersionEntity dbFileVersionEntityCopy$default = DbFileVersionEntity.copy$default(dbFileVersionEntityC, null, 0L, false, 3, null);
                bVar.f22490c = 1;
                if (n0Var.a(dbFileVersionEntityCopy$default, bVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
        } catch (Exception unused) {
        }
        return b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x010c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static final Object b(g gVar, File file, File file2, String str, boolean z11, xy.c cVar) {
        f fVar;
        boolean z12;
        boolean z13;
        u uVar;
        File file3;
        File file4;
        String str2;
        String str3;
        boolean needUpdate;
        boolean zEquals;
        gVar.getClass();
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.f22514t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f22514t = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(gVar, cVar);
            }
        } else {
            fVar = new f(gVar, cVar);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f22512e;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = fVar2.f22514t;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            file.getName();
            file2.getAbsolutePath();
            File fileC = c(file);
            if (fileC.exists() && !file.exists()) {
                fileC.getAbsolutePath();
                j(file, fileC);
                if (fileC.exists()) {
                    fileC.getAbsolutePath();
                }
            }
            String strL = l(file2);
            File fileC2 = c(file);
            if (!fileC2.exists() || !file.exists()) {
                fileC2 = null;
            }
            File file5 = fileC2;
            if (!z11 && file5 != null) {
                File fileD = d(file);
                if (fileD.exists()) {
                    try {
                        zEquals = cz.k.T(fileD).equals(l(file2));
                    } catch (Exception unused) {
                        fileD.getAbsolutePath();
                        zEquals = false;
                    }
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    file.getAbsolutePath();
                    uVar = new u(file, file2, str, strL, file5, true, true);
                } else {
                    file.getAbsolutePath();
                    j(file, file5);
                    z12 = true;
                }
                return uVar;
            }
            z12 = false;
            if (z11 || z12 || !file.exists()) {
                z13 = true;
            } else {
                try {
                    DbFileVersionEntity dbFileVersionEntityC = gVar.f22516a.c(str);
                    needUpdate = dbFileVersionEntityC != null ? dbFileVersionEntityC.getNeedUpdate() : true;
                } catch (Exception unused2) {
                }
                if (needUpdate) {
                    z13 = true;
                } else {
                    if (file2.exists() && file.exists() && file2.lastModified() > file.lastModified()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
            }
            if (z13) {
                if (file2.exists()) {
                    try {
                        File fileE = e(file2, file);
                        if (strL != null) {
                            File fileD2 = d(file);
                            try {
                                cz.k.V(fileD2, strL);
                            } catch (Exception unused3) {
                                fileD2.getAbsolutePath();
                            }
                        }
                        try {
                            try {
                                return new u(file, file2, str, strL, fileE, true, true);
                            } catch (Exception e8) {
                                e = e8;
                                file2 = file2;
                                strL = strL;
                                e.getMessage();
                                fVar2.f22508a = file;
                                fVar2.f22509b = file2;
                                fVar2.f22510c = str;
                                fVar2.f22511d = strL;
                                fVar2.f22514t = 1;
                                if (gVar.g(str, fVar2) == obj2) {
                                    return obj2;
                                }
                                file3 = file2;
                                file4 = file;
                                str2 = strL;
                                str3 = str;
                                return new u(file4, file3, str3, str2, null, false, true);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            file2 = file2;
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                } else {
                    file2.getAbsolutePath();
                }
            }
            uVar = new u(file, file2, str, strL, null, false, z13);
            return uVar;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str4 = fVar2.f22511d;
        String str5 = fVar2.f22510c;
        File file6 = fVar2.f22509b;
        File file7 = fVar2.f22508a;
        com.bumptech.glide.e.F(obj);
        str2 = str4;
        str3 = str5;
        file3 = file6;
        file4 = file7;
        return new u(file4, file3, str3, str2, null, false, true);
    }

    public static File c(File file) {
        return new File(file.getParentFile(), defpackage.e.m(file.getName(), ".bak"));
    }

    public static File d(File file) {
        return new File(file.getParentFile(), defpackage.e.m(file.getName(), ".candidate"));
    }

    public static File e(File file, File file2) throws Exception {
        file.getAbsolutePath();
        file2.getAbsolutePath();
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        File file3 = new File(file2.getParentFile(), defpackage.e.m(file2.getName(), ".tmp"));
        k(file3);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ZipInputStream zipInputStream = null;
            try {
                try {
                    ZipInputStream zipInputStream2 = new ZipInputStream(fileInputStream);
                    ZipEntry nextEntry = zipInputStream2.getNextEntry();
                    if (nextEntry != null) {
                        nextEntry.getName();
                        zipInputStream = zipInputStream2;
                    }
                } catch (IOException unused) {
                }
                if (zipInputStream == null) {
                    throw new ZipException("Archive missing SQLite entry");
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i11 = zipInputStream.read(bArr);
                            if (i11 <= 0) {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                zipInputStream.close();
                                fileInputStream.close();
                                f(file2);
                                return i(file3, file2);
                            }
                            fileOutputStream.write(bArr, 0, i11);
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ns.o.m(zipInputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            ns.o.m(fileOutputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    ns.o.m(fileInputStream, th6);
                    throw th7;
                }
            }
        } catch (IOException e8) {
            e8.getMessage();
            k(file3);
            throw e8;
        } catch (Exception e10) {
            e10.getMessage();
            k(file3);
            throw e10;
        }
    }

    public static File i(File file, File file2) throws Exception {
        File fileC = c(file2);
        try {
            boolean zExists = fileC.exists();
            boolean zExists2 = file2.exists();
            if (zExists) {
                fileC.getAbsolutePath();
                k(file2);
            } else if (zExists2 && !file2.renameTo(fileC)) {
                throw new IOException("Failed to backup existing database: " + file2.getAbsolutePath());
            }
            if (file.renameTo(file2)) {
                if ((zExists2 || zExists) && fileC.exists()) {
                    return fileC;
                }
                return null;
            }
            j(file2, (zExists2 || zExists) ? fileC : null);
            throw new IOException("Failed to replace database: " + file2.getAbsolutePath());
        } catch (Exception e8) {
            if (!file2.exists()) {
                if (!fileC.exists()) {
                    fileC = null;
                }
                j(file2, fileC);
            }
            throw e8;
        }
    }

    public static boolean j(File file, File file2) {
        f(file);
        k(d(file));
        if (file2 == null || !file2.exists()) {
            k(file);
            return false;
        }
        k(file);
        if (file2.renameTo(file)) {
            return true;
        }
        file2.getAbsolutePath();
        return false;
    }

    public static void k(File file) {
        if (file == null) {
            return;
        }
        try {
            if (!file.exists() || file.delete()) {
                return;
            }
            file.getAbsolutePath();
        } catch (Exception unused) {
            file.getAbsolutePath();
        }
    }

    public static String l(File file) {
        if (!file.exists()) {
            return null;
        }
        return file.getAbsolutePath() + ":" + file.lastModified() + ":" + file.length();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r0.a(r13, r1) == r2) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r13, xy.c r14) {
        /*
            r12 = this;
            au.n0 r0 = r12.f22516a
            boolean r1 = r14 instanceof cu.a
            if (r1 == 0) goto L15
            r1 = r14
            cu.a r1 = (cu.a) r1
            int r2 = r1.f22487c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f22487c = r2
            goto L1a
        L15:
            cu.a r1 = new cu.a
            r1.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r1.f22485a
            wy.a r2 = wy.a.COROUTINE_SUSPENDED
            int r3 = r1.f22487c
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 == r5) goto L28
            if (r3 != r4) goto L2c
        L28:
            com.bumptech.glide.e.F(r14)     // Catch: java.lang.Exception -> L67
            goto L67
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            com.bumptech.glide.e.F(r14)
            r14 = r5
            com.lingodeer.database.model.DbFileVersionEntity r5 = r0.c(r13)     // Catch: java.lang.Exception -> L67
            if (r5 != 0) goto L4e
            com.lingodeer.database.model.DbFileVersionEntity r3 = new com.lingodeer.database.model.DbFileVersionEntity     // Catch: java.lang.Exception -> L67
            r4 = -1
            r3.<init>(r13, r4, r14)     // Catch: java.lang.Exception -> L67
            r1.f22487c = r14     // Catch: java.lang.Exception -> L67
            java.lang.Object r13 = r0.a(r3, r1)     // Catch: java.lang.Exception -> L67
            if (r13 != r2) goto L67
            goto L66
        L4e:
            boolean r13 = r5.getNeedUpdate()     // Catch: java.lang.Exception -> L67
            if (r13 != 0) goto L67
            r10 = 3
            r11 = 0
            r6 = 0
            r7 = 0
            r9 = 1
            com.lingodeer.database.model.DbFileVersionEntity r13 = com.lingodeer.database.model.DbFileVersionEntity.copy$default(r5, r6, r7, r9, r10, r11)     // Catch: java.lang.Exception -> L67
            r1.f22487c = r4     // Catch: java.lang.Exception -> L67
            java.lang.Object r13 = r0.a(r13, r1)     // Catch: java.lang.Exception -> L67
            if (r13 != r2) goto L67
        L66:
            return r2
        L67:
            qy.b0 r13 = qy.b0.f48488a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.g.g(java.lang.String, xy.c):java.lang.Object");
    }

    public final Object h(u uVar, xy.c cVar) {
        yz.f fVar = o0.f50940a;
        return e0.M(yz.e.f58387a, new c(uVar, this, (vy.d) null), cVar);
    }

    public static void f(File file) {
        k(new File(defpackage.e.m(file.getAbsolutePath(), "-shm")));
        k(new File(defpackage.e.m(file.getAbsolutePath(), OYAvlbfUyD.LlNTSXXL)));
    }
}
