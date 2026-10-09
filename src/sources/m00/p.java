package m00;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f40739c;

    public p(o delegate) {
        kotlin.jvm.internal.m.f(delegate, "delegate");
        this.f40739c = delegate;
    }

    @Override // m00.o
    public final h0 a(a0 file) {
        kotlin.jvm.internal.m.f(file, "file");
        return this.f40739c.a(file);
    }

    @Override // m00.o
    public final void b(a0 source, a0 target) {
        kotlin.jvm.internal.m.f(source, "source");
        kotlin.jvm.internal.m.f(target, "target");
        this.f40739c.b(source, target);
    }

    @Override // m00.o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f40739c.close();
    }

    @Override // m00.o
    public final void d(a0 dir) {
        kotlin.jvm.internal.m.f(dir, "dir");
        this.f40739c.d(dir);
    }

    @Override // m00.o
    public final void e(a0 path) {
        kotlin.jvm.internal.m.f(path, "path");
        this.f40739c.e(path);
    }

    @Override // m00.o
    public final List i(a0 dir) {
        kotlin.jvm.internal.m.f(dir, "dir");
        List<a0> listI = this.f40739c.i(dir);
        ArrayList arrayList = new ArrayList();
        for (a0 path : listI) {
            kotlin.jvm.internal.m.f(path, "path");
            arrayList.add(path);
        }
        ry.p.Y(arrayList);
        return arrayList;
    }

    @Override // m00.o
    public final e4.e q(a0 path) {
        kotlin.jvm.internal.m.f(path, "path");
        e4.e eVarQ = this.f40739c.q(path);
        if (eVarQ == null) {
            return null;
        }
        a0 a0Var = (a0) eVarQ.f24793d;
        if (a0Var == null) {
            return eVarQ;
        }
        boolean z11 = eVarQ.f24791b;
        boolean z12 = eVarQ.f24792c;
        Long l9 = (Long) eVarQ.f24794e;
        Long l11 = (Long) eVarQ.f24795f;
        Long l12 = (Long) eVarQ.f24796g;
        Long l13 = (Long) eVarQ.f24797h;
        Map extras = (Map) eVarQ.f24798i;
        kotlin.jvm.internal.m.f(extras, "extras");
        return new e4.e(z11, z12, a0Var, l9, l11, l12, l13, extras);
    }

    public final String toString() {
        return kotlin.jvm.internal.z.a(getClass()).g() + '(' + this.f40739c + ')';
    }

    @Override // m00.o
    public final w v(a0 a0Var) {
        return this.f40739c.v(a0Var);
    }

    @Override // m00.o
    public h0 x(a0 file) {
        kotlin.jvm.internal.m.f(file, "file");
        return this.f40739c.x(file);
    }

    @Override // m00.o
    public final i0 y(a0 file) {
        kotlin.jvm.internal.m.f(file, "file");
        return this.f40739c.y(file);
    }
}
