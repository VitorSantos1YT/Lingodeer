package y9;

import cf.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ja.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.c f57505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f57507c;

    public k(s sVar, ja.c delegate) {
        kotlin.jvm.internal.m.f(delegate, "delegate");
        this.f57507c = sVar;
        this.f57505a = delegate;
        this.f57506b = x.f();
    }

    @Override // ja.c
    public final String B0(int i11) {
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            return this.f57505a.B0(i11);
        }
        com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ja.c
    public final void b0(int i11, String value) {
        kotlin.jvm.internal.m.f(value, "value");
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            this.f57505a.b0(i11, value);
        } else {
            com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            this.f57505a.close();
        } else {
            com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // ja.c
    public final void e0(double d5) {
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            this.f57505a.e0(d5);
        } else {
            com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // ja.c
    public final void g(int i11, long j11) {
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            this.f57505a.g(i11, j11);
        } else {
            com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // ja.c
    public final int getColumnCount() {
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            return this.f57505a.getColumnCount();
        }
        com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ja.c
    public final String getColumnName(int i11) {
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            return this.f57505a.getColumnName(i11);
        }
        com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ja.c
    public final double getDouble(int i11) {
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            return this.f57505a.getDouble(i11);
        }
        com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ja.c
    public final long getLong(int i11) {
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            return this.f57505a.getLong(i11);
        }
        com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ja.c
    public final boolean isNull(int i11) {
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            return this.f57505a.isNull(i11);
        }
        com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ja.c
    public final boolean r1() {
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            return this.f57505a.r1();
        }
        com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ja.c
    public final void reset() {
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            this.f57505a.reset();
        } else {
            com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // ja.c
    public final void s(int i11) {
        if (this.f57507c.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Statement is recycled");
            throw null;
        }
        if (this.f57506b == x.f()) {
            this.f57505a.s(i11);
        } else {
            com.bumptech.glide.f.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
