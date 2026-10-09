package y9;

import cf.x;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ja.a, a00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.a f57478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a00.a f57479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vy.i f57480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f57481d;

    public f(ja.a delegate) {
        a00.e eVar = new a00.e();
        kotlin.jvm.internal.m.f(delegate, "delegate");
        this.f57478a = delegate;
        this.f57479b = eVar;
    }

    @Override // ja.a
    public final ja.c B1(String sql) {
        kotlin.jvm.internal.m.f(sql, "sql");
        return this.f57478a.B1(sql);
    }

    @Override // a00.a
    public final void a(Object obj) {
        this.f57479b.a(null);
    }

    @Override // a00.a
    public final Object b(vy.d dVar) {
        return this.f57479b.b(dVar);
    }

    public final void c(StringBuilder sb2) {
        if (this.f57480c == null && this.f57481d == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
            return;
        }
        sb2.append("\t\tStatus: Acquired connection");
        sb2.append('\n');
        vy.i iVar = this.f57480c;
        if (iVar != null) {
            sb2.append("\t\tCoroutine: " + iVar);
            sb2.append('\n');
        }
        Throwable th2 = this.f57481d;
        if (th2 != null) {
            sb2.append("\t\tAcquired:");
            sb2.append('\n');
            Iterator it = ry.m.k0(nz.n.Z(new nz.o(x.O(th2), 2)), 1).iterator();
            while (it.hasNext()) {
                sb2.append("\t\t" + ((String) it.next()));
                sb2.append('\n');
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f57478a.close();
    }

    public final String toString() {
        return this.f57478a.toString();
    }
}
