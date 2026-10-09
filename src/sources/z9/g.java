package z9;

import java.io.IOException;
import kotlin.jvm.internal.m;
import la.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f59046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ka.a db2, String sql) {
        super(db2, sql);
        m.f(db2, "db");
        m.f(sql, "sql");
        this.f59046d = db2.m(sql);
    }

    @Override // ja.c
    public final String B0(int i11) {
        a();
        com.bumptech.glide.f.H(21, "no row");
        throw null;
    }

    @Override // ja.c
    public final void b0(int i11, String value) {
        m.f(value, "value");
        a();
        this.f59046d.l(i11, value);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f59046d.close();
        this.f59049c = true;
    }

    @Override // ja.c
    public final void e0(double d5) {
        a();
        this.f59046d.L(14, d5);
    }

    @Override // ja.c
    public final void g(int i11, long j11) {
        a();
        this.f59046d.g(i11, j11);
    }

    @Override // ja.c
    public final int getColumnCount() {
        a();
        return 0;
    }

    @Override // ja.c
    public final String getColumnName(int i11) {
        a();
        com.bumptech.glide.f.H(21, "no row");
        throw null;
    }

    @Override // ja.c
    public final double getDouble(int i11) {
        a();
        com.bumptech.glide.f.H(21, "no row");
        throw null;
    }

    @Override // ja.c
    public final long getLong(int i11) {
        a();
        com.bumptech.glide.f.H(21, "no row");
        throw null;
    }

    @Override // ja.c
    public final boolean isNull(int i11) {
        a();
        com.bumptech.glide.f.H(21, "no row");
        throw null;
    }

    @Override // ja.c
    public final boolean r1() {
        a();
        this.f59046d.f39867b.execute();
        return false;
    }

    @Override // ja.c
    public final void s(int i11) {
        a();
        this.f59046d.s(i11);
    }

    @Override // ja.c
    public final void reset() {
    }
}
