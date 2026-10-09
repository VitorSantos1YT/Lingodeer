package n5;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vy.i f43331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f43332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz.e f43333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f43336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a00.e f43337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qy.q f43338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qy.q f43339i;

    public n0(vy.i context, File file) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(file, "file");
        this.f43331a = context;
        this.f43332b = file;
        Object obj = p0.f43354b;
        this.f43333c = new uz.e(new kr.w(file, (vy.d) null, 15), vy.j.f54321a, -2, tz.a.SUSPEND);
        this.f43334d = ".lock";
        this.f43335e = ".version";
        this.f43336f = "fcntl failed: EAGAIN";
        this.f43337g = new a00.e();
        this.f43338h = com.bumptech.glide.d.v(new k0(this, 2));
        this.f43339i = com.bumptech.glide.d.v(new k0(this, 1));
    }

    public static final void f(n0 n0Var, File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de A[Catch: all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f9 A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [fz.e] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, n5.m0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // n5.g0
    public final Object a(fz.e eVar, xy.c cVar) throws Throwable {
        ?? m0Var;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        a00.e eVar2;
        boolean z11;
        FileInputStream fileInputStream;
        a00.e eVar3;
        boolean z12;
        ?? r9 = eVar;
        if (cVar instanceof m0) {
            m0 m0Var2 = (m0) cVar;
            int i11 = m0Var2.f43325t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m0Var2.f43325t = i11 - Integer.MIN_VALUE;
                m0Var = m0Var2;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        Object objInvoke = m0Var.f43323e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        ?? r11 = m0Var.f43325t;
        try {
            try {
                if (r11 != 0) {
                    if (r11 == 1) {
                        z12 = m0Var.f43322d;
                        eVar3 = m0Var.f43319a;
                        com.bumptech.glide.e.F(objInvoke);
                        if (z12) {
                            eVar3.a(null);
                        }
                        return objInvoke;
                    }
                    if (r11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = m0Var.f43322d;
                    fileLock = m0Var.f43321c;
                    fileInputStream = m0Var.f43320b;
                    eVar2 = m0Var.f43319a;
                    try {
                        com.bumptech.glide.e.F(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        ns.o.m(fileInputStream, null);
                        if (z11) {
                            eVar2.a(null);
                        }
                        return objInvoke;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                com.bumptech.glide.e.F(objInvoke);
                a00.e eVar4 = this.f43337g;
                boolean zG = eVar4.g();
                try {
                    if (zG) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.f43338h.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (Throwable th3) {
                                th = th3;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (IOException e8) {
                            String message2 = e8.getMessage();
                            if ((message2 == null || !oz.x.s0(message2, this.f43336f, false)) && ((message = e8.getMessage()) == null || !oz.x.s0(message, "Resource deadlock would occur", false))) {
                                throw e8;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                            m0Var.f43319a = eVar4;
                            m0Var.f43320b = fileInputStream2;
                            m0Var.f43321c = fileLockTryLock;
                            m0Var.f43322d = zG;
                            m0Var.f43325t = 2;
                            objInvoke = r9.invoke(boolValueOf, m0Var);
                            if (objInvoke != aVar) {
                                eVar2 = eVar4;
                                z11 = zG;
                                fileInputStream = fileInputStream2;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                ns.o.m(fileInputStream, null);
                                if (z11) {
                                    eVar2.a(null);
                                }
                                return objInvoke;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        m0Var.f43319a = eVar4;
                        m0Var.f43322d = zG;
                        m0Var.f43325t = 1;
                        objInvoke = r9.invoke(bool, m0Var);
                        if (objInvoke != aVar) {
                            eVar3 = eVar4;
                            z12 = zG;
                            if (z12) {
                                eVar3.a(null);
                            }
                            return objInvoke;
                        }
                    }
                    return aVar;
                } catch (Throwable th5) {
                    th = th5;
                    m0Var = eVar4;
                    r9 = zG;
                    if (r9 != 0) {
                        m0Var.a(null);
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                ?? r12 = m0Var;
                try {
                    throw th6;
                } catch (Throwable th7) {
                    try {
                        ns.o.m(r11, th6);
                        throw th7;
                    } catch (Throwable th8) {
                        th = th8;
                        r9 = r9;
                        m0Var = r12;
                        if (r9 != 0) {
                            m0Var.a(null);
                        }
                        throw th;
                    }
                }
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0022, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0022, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object, wy.a] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [a00.a] */
    @Override // n5.g0
    public final Object b(fz.c cVar, xy.c cVar2) throws Throwable {
        l0 l0Var;
        n0 n0Var;
        FileOutputStream fileOutputStream;
        Throwable th2;
        fz.c cVar3;
        Closeable closeable;
        ?? r9;
        ?? r11;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Closeable closeable2;
        ?? r12;
        ?? r13;
        if (cVar2 instanceof l0) {
            l0Var = (l0) cVar2;
            int i11 = l0Var.f43315f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                l0Var.f43315f = i11 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(this, cVar2);
            }
        } else {
            l0Var = new l0(this, cVar2);
        }
        ?? r14 = l0Var.f43313d;
        ?? r15 = wy.a.COROUTINE_SUSPENDED;
        int i12 = l0Var.f43315f;
        try {
            try {
                try {
                    if (i12 == 0) {
                        com.bumptech.glide.e.F(r14);
                        l0Var.f43310a = this;
                        l0Var.f43311b = cVar;
                        a00.e eVar = this.f43337g;
                        l0Var.f43312c = eVar;
                        l0Var.f43315f = 1;
                        if (eVar.b(l0Var) != r15) {
                            n0Var = this;
                            r14 = eVar;
                        }
                        return r15;
                    }
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) l0Var.f43312c;
                            closeable2 = (Closeable) l0Var.f43311b;
                            a00.a aVar = (a00.a) l0Var.f43310a;
                            try {
                                com.bumptech.glide.e.F(r14);
                                r13 = aVar;
                                r12 = r14;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    ns.o.m(closeable2, null);
                                    r13.a(null);
                                    return r12;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r14 = r13;
                                    r14.a(null);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        }
                        closeable = (Closeable) l0Var.f43312c;
                        r9 = (a00.a) l0Var.f43311b;
                        cVar3 = (fz.c) l0Var.f43310a;
                        try {
                            com.bumptech.glide.e.F(r14);
                            r9 = r9;
                            r11 = r14;
                            fileLock2 = (FileLock) r11;
                            try {
                                l0Var.f43310a = r9;
                                l0Var.f43311b = closeable;
                                l0Var.f43312c = fileLock2;
                                l0Var.f43315f = 3;
                                objInvoke = cVar3.invoke(l0Var);
                                if (objInvoke != r15) {
                                    closeable2 = closeable;
                                    fileLock = fileLock2;
                                    r12 = objInvoke;
                                    r13 = r9;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    ns.o.m(closeable2, null);
                                    r13.a(null);
                                    return r12;
                                }
                                return r15;
                            } catch (Throwable th5) {
                                fileLock = fileLock2;
                                th2 = th5;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th2;
                        }
                    }
                    a00.a aVar2 = (a00.a) l0Var.f43312c;
                    fz.c cVar4 = (fz.c) l0Var.f43311b;
                    n0Var = (n0) l0Var.f43310a;
                    com.bumptech.glide.e.F(r14);
                    r14 = aVar2;
                    cVar = cVar4;
                    l0Var.f43310a = cVar;
                    l0Var.f43311b = r14;
                    l0Var.f43312c = fileOutputStream;
                    l0Var.f43315f = 2;
                    Object objA = z0.a(fileOutputStream, l0Var);
                    if (objA != r15) {
                        cVar3 = cVar;
                        closeable = fileOutputStream;
                        r9 = r14;
                        r11 = objA;
                        fileLock2 = (FileLock) r11;
                        l0Var.f43310a = r9;
                        l0Var.f43311b = closeable;
                        l0Var.f43312c = fileLock2;
                        l0Var.f43315f = 3;
                        objInvoke = cVar3.invoke(l0Var);
                        if (objInvoke != r15) {
                            closeable2 = closeable;
                            fileLock = fileLock2;
                            r12 = objInvoke;
                            r13 = r9;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            ns.o.m(closeable2, null);
                            r13.a(null);
                            return r12;
                        }
                    }
                    return r15;
                } catch (Throwable th7) {
                    th2 = th7;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th2;
                }
                fileOutputStream = new FileOutputStream((File) n0Var.f43338h.getValue());
            } catch (Throwable th8) {
                th = th8;
                r14.a(null);
                throw th;
            }
        } catch (Throwable th9) {
            r14 = l0Var;
            try {
                throw th9;
            } catch (Throwable th10) {
                ns.o.m(r15, th9);
                throw th10;
            }
        }
    }

    @Override // n5.g0
    public final uz.i c() {
        return this.f43333c;
    }

    @Override // n5.g0
    public final Object d(ch.u uVar) {
        qy.q qVar = this.f43339i;
        if (qVar.a()) {
            return new Integer(t0.f43387b.nativeIncrementAndGetCounterValue(((t0) qVar.getValue()).f43388a));
        }
        return rz.e0.M(this.f43331a, new j0(this, null, 1), uVar);
    }

    @Override // n5.g0
    public final Object e(xy.c cVar) {
        qy.q qVar = this.f43339i;
        if (qVar.a()) {
            return new Integer(t0.f43387b.nativeGetCounterValue(((t0) qVar.getValue()).f43388a));
        }
        return rz.e0.M(this.f43331a, new j0(this, null, 0), cVar);
    }
}
