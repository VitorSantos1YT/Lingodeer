package n5;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class x implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f43423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f43424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f43425c;

    public x(File file, s0 serializer) {
        kotlin.jvm.internal.m.f(serializer, "serializer");
        this.f43423a = file;
        this.f43424b = serializer;
        this.f43425c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [n5.x] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, n5.x] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [n5.x] */
    public static Object a(x xVar, xy.c cVar) {
        w wVar;
        Throwable th2;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th3;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i11 = wVar.f43419e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                wVar.f43419e = i11 - Integer.MIN_VALUE;
            } else {
                wVar = new w(xVar, cVar);
            }
        } else {
            wVar = new w(xVar, cVar);
        }
        Object obj = wVar.f43417c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        ?? r9 = wVar.f43419e;
        try {
            if (r9 != 0) {
                if (r9 == 1) {
                    fileInputStream = wVar.f43416b;
                    r9 = (x) wVar.f43415a;
                    try {
                        com.bumptech.glide.e.F(obj);
                        ns.o.m(fileInputStream, null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        try {
                            throw th3;
                        } catch (Throwable th5) {
                            ns.o.m(fileInputStream, th3);
                            throw th5;
                        }
                    }
                }
                if (r9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) wVar.f43415a;
                try {
                    com.bumptech.glide.e.F(obj);
                    ns.o.m(closeable, null);
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th2;
                    } catch (Throwable th7) {
                        ns.o.m(closeable, th2);
                        throw th7;
                    }
                }
            }
            com.bumptech.glide.e.F(obj);
            if (xVar.f43425c.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(xVar.f43423a);
                try {
                    s0 s0Var = xVar.f43424b;
                    wVar.f43415a = xVar;
                    wVar.f43416b = fileInputStream2;
                    wVar.f43419e = 1;
                    Object objB = s0Var.b(fileInputStream2);
                    if (objB != aVar) {
                        fileInputStream = fileInputStream2;
                        obj = objB;
                        ns.o.m(fileInputStream, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    r9 = xVar;
                    fileInputStream = fileInputStream2;
                    th3 = th8;
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                File file = xVar.f43423a;
                s0 s0Var2 = xVar.f43424b;
                if (!file.exists()) {
                    return s0Var2.a();
                }
                FileInputStream fileInputStream3 = new FileInputStream(xVar.f43423a);
                try {
                    wVar.f43415a = fileInputStream3;
                    wVar.f43416b = null;
                    wVar.f43419e = 2;
                    Object objB2 = s0Var2.b(fileInputStream3);
                    if (objB2 != aVar) {
                        obj = objB2;
                        closeable = fileInputStream3;
                        ns.o.m(closeable, null);
                        return obj;
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                    closeable = fileInputStream3;
                    throw th2;
                }
            }
            return aVar;
        } catch (FileNotFoundException unused2) {
            xVar = r9;
        }
    }

    @Override // n5.a
    public final void close() {
        this.f43425c.set(true);
    }
}
