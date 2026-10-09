package n5;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f43251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f43252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f43253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0.c0 f43254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f43255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a00.e f43256f;

    public c0(File file, s0 serializer, g0 coordinator, a0.c0 c0Var) {
        kotlin.jvm.internal.m.f(serializer, "serializer");
        kotlin.jvm.internal.m.f(coordinator, "coordinator");
        this.f43251a = file;
        this.f43252b = serializer;
        this.f43253c = coordinator;
        this.f43254d = c0Var;
        this.f43255e = new AtomicBoolean(false);
        this.f43256f = new a00.e();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:33:0x007a, B:42:0x008b, B:41:0x0088, B:38:0x0083), top: B:52:0x0020, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [n5.c0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [n5.c0] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, n5.a0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [n5.c0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [gq.b] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final Object a(gq.b bVar, xy.c cVar) throws Throwable {
        ?? a0Var;
        Throwable th2;
        x xVar;
        ?? r9;
        ?? r11;
        if (cVar instanceof a0) {
            a0 a0Var2 = (a0) cVar;
            int i11 = a0Var2.f43239f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a0Var2.f43239f = i11 - Integer.MIN_VALUE;
                a0Var = a0Var2;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object obj = a0Var.f43237d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = a0Var.f43239f;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = a0Var.f43236c;
                xVar = a0Var.f43235b;
                a0Var = a0Var.f43234a;
                try {
                    com.bumptech.glide.e.F(obj);
                    r11 = a0Var;
                    r9 = bVar;
                    try {
                        xVar.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        r11.f43256f.a(null);
                    }
                    return obj;
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        xVar.close();
                    } catch (Throwable th5) {
                        cf.x.b(th2, th5);
                    }
                    throw th2;
                }
            }
            com.bumptech.glide.e.F(obj);
            if (this.f43255e.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zG = this.f43256f.g();
            try {
                x xVar2 = new x(this.f43251a, this.f43252b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zG);
                    a0Var.f43234a = this;
                    a0Var.f43235b = xVar2;
                    a0Var.f43236c = zG;
                    a0Var.f43239f = 1;
                    Object objInvoke = bVar.invoke(xVar2, boolValueOf, a0Var);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    obj = objInvoke;
                    r9 = zG;
                    r11 = this;
                    xVar = xVar2;
                    xVar.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        r11.f43256f.a(null);
                    }
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    bVar = zG;
                    a0Var = this;
                    xVar = xVar2;
                    xVar.close();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                bVar = zG;
                a0Var = this;
                if (bVar != 0) {
                    a0Var.f43256f.a(null);
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (bVar != 0) {
                a0Var.f43256f.a(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e2 A[Catch: all -> 0x011d, IOException -> 0x011f, TRY_ENTER, TryCatch #3 {IOException -> 0x011f, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:51:0x00fc, B:52:0x011c, B:48:0x00f5, B:59:0x0128, B:66:0x0135, B:65:0x0132), top: B:82:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8 A[Catch: all -> 0x011d, IOException -> 0x011f, TryCatch #3 {IOException -> 0x011f, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:51:0x00fc, B:52:0x011c, B:48:0x00f5, B:59:0x0128, B:66:0x0135, B:65:0x0132), top: B:82:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0 A[Catch: all -> 0x011d, IOException -> 0x011f, TryCatch #3 {IOException -> 0x011f, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:51:0x00fc, B:52:0x011c, B:48:0x00f5, B:59:0x0128, B:66:0x0135, B:65:0x0132), top: B:82:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5 A[Catch: all -> 0x011d, IOException -> 0x011f, TryCatch #3 {IOException -> 0x011f, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:51:0x00fc, B:52:0x011c, B:48:0x00f5, B:59:0x0128, B:66:0x0135, B:65:0x0132), top: B:82:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc A[Catch: all -> 0x011d, IOException -> 0x011f, TryCatch #3 {IOException -> 0x011f, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:51:0x00fc, B:52:0x011c, B:48:0x00f5, B:59:0x0128, B:66:0x0135, B:65:0x0132), top: B:82:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0128 A[Catch: all -> 0x011d, IOException -> 0x011f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x011f, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:51:0x00fc, B:52:0x011c, B:48:0x00f5, B:59:0x0128, B:66:0x0135, B:65:0x0132), top: B:82:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00fc, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(ch.u uVar, xy.c cVar) throws IOException {
        b0 b0Var;
        File file;
        c0 c0Var;
        a00.a aVar;
        fz.e eVar;
        e0 e0Var;
        Throwable th2;
        e0 e0Var2;
        File file2;
        c0 c0Var2;
        File file3;
        boolean zRenameTo;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i11 = b0Var.f43248t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b0Var.f43248t = i11 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object obj = b0Var.f43246e;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = b0Var.f43248t;
        try {
            try {
                try {
                    try {
                        if (i12 == 0) {
                            com.bumptech.glide.e.F(obj);
                            if (this.f43255e.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            File file4 = this.f43251a;
                            File parentFile = file4.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException("Unable to create parent directories of " + file4);
                                }
                            }
                            b0Var.f43242a = this;
                            b0Var.f43243b = uVar;
                            a00.e eVar2 = this.f43256f;
                            b0Var.f43244c = eVar2;
                            b0Var.f43248t = 1;
                            if (eVar2.b(b0Var) != aVar2) {
                                c0Var = this;
                                aVar = eVar2;
                                eVar = uVar;
                            }
                            return aVar2;
                        }
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e0Var2 = b0Var.f43245d;
                            File file5 = (File) b0Var.f43244c;
                            aVar = (a00.a) b0Var.f43243b;
                            c0Var2 = b0Var.f43242a;
                            try {
                                com.bumptech.glide.e.F(obj);
                                file2 = file5;
                                try {
                                    e0Var2.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    file3 = c0Var2.f43251a;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = z6.c.l(file2, file3);
                                    } else {
                                        zRenameTo = file2.renameTo(file3);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + file2 + " to " + c0Var2.f43251a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                aVar.a(null);
                                return qy.b0.f48488a;
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    e0Var2.close();
                                } catch (Throwable th5) {
                                    cf.x.b(th2, th5);
                                }
                                throw th2;
                            }
                        }
                        a00.a aVar3 = (a00.a) b0Var.f43244c;
                        fz.e eVar3 = (fz.e) b0Var.f43243b;
                        c0Var = b0Var.f43242a;
                        com.bumptech.glide.e.F(obj);
                        aVar = aVar3;
                        eVar = eVar3;
                        b0Var.f43242a = c0Var;
                        b0Var.f43243b = aVar;
                        b0Var.f43244c = file;
                        b0Var.f43245d = e0Var;
                        b0Var.f43248t = 2;
                        if (eVar.invoke(e0Var, b0Var) != aVar2) {
                            file2 = file;
                            c0Var2 = c0Var;
                            e0Var2 = e0Var;
                            e0Var2.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                file3 = c0Var2.f43251a;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    zRenameTo = z6.c.l(file2, file3);
                                } else {
                                    zRenameTo = file2.renameTo(file3);
                                }
                                if (zRenameTo) {
                                    throw new IOException("Unable to rename " + file2 + " to " + c0Var2.f43251a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                            }
                            aVar.a(null);
                            return qy.b0.f48488a;
                        }
                        return aVar2;
                    } catch (Throwable th6) {
                        th2 = th6;
                        e0Var2 = e0Var;
                        e0Var2.close();
                        throw th2;
                    }
                    s0 serializer = c0Var.f43252b;
                    kotlin.jvm.internal.m.f(serializer, "serializer");
                    e0Var = new e0(file, serializer);
                } catch (IOException e8) {
                    e = e8;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(c0Var.f43251a.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                aVar.a(null);
                throw th7;
            }
        } catch (IOException e10) {
            e = e10;
            file = aVar2;
        }
    }

    @Override // n5.a
    public final void close() {
        this.f43255e.set(true);
        this.f43254d.invoke();
    }
}
