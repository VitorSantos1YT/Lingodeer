package m00;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f40737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n00.e f40738b;

    static {
        x xVar;
        try {
            Class.forName("java.nio.file.Files");
            xVar = new y();
        } catch (ClassNotFoundException unused) {
            xVar = new x();
        }
        f40737a = xVar;
        String str = a0.f40673b;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.m.e(property, "getProperty(...)");
        p20.c.m(property);
        ClassLoader classLoader = n00.e.class.getClassLoader();
        kotlin.jvm.internal.m.e(classLoader, "getClassLoader(...)");
        f40738b = new n00.e(classLoader);
    }

    public abstract h0 a(a0 a0Var);

    public abstract void b(a0 a0Var, a0 a0Var2);

    public final void c(a0 a0Var) {
        ry.k kVar = new ry.k();
        while (a0Var != null && !h(a0Var)) {
            kVar.addFirst(a0Var);
            a0Var = a0Var.b();
        }
        Iterator<E> it = kVar.iterator();
        while (it.hasNext()) {
            d((a0) it.next());
        }
    }

    public abstract void d(a0 a0Var);

    public abstract void e(a0 a0Var);

    public final void f(a0 path) {
        kotlin.jvm.internal.m.f(path, "path");
        e(path);
    }

    public final boolean h(a0 path) {
        kotlin.jvm.internal.m.f(path, "path");
        return q(path) != null;
    }

    public abstract List i(a0 a0Var);

    public final e4.e p(a0 path) throws FileNotFoundException {
        kotlin.jvm.internal.m.f(path, "path");
        e4.e eVarQ = q(path);
        if (eVarQ != null) {
            return eVarQ;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract e4.e q(a0 a0Var);

    public abstract w v(a0 a0Var);

    public abstract h0 x(a0 a0Var);

    public abstract i0 y(a0 a0Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
