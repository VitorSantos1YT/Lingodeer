package vd;

import a.ar.MFeWs;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f53956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f53958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f53959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final td.g f53960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53961f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f53962t;

    public w(b0 b0Var, boolean z11, boolean z12, td.g gVar, v vVar) {
        pe.f.c(b0Var, "Argument must not be null");
        this.f53958c = b0Var;
        this.f53956a = z11;
        this.f53957b = z12;
        this.f53960e = gVar;
        pe.f.c(vVar, "Argument must not be null");
        this.f53959d = vVar;
    }

    public final synchronized void a() {
        if (this.f53962t) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f53961f++;
    }

    @Override // vd.b0
    public final synchronized void b() {
        if (this.f53961f > 0) {
            throw new IllegalStateException(OCBJEWZHh.GaQRmDIGG);
        }
        if (this.f53962t) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f53962t = true;
        if (this.f53957b) {
            this.f53958c.b();
        }
    }

    @Override // vd.b0
    public final int c() {
        return this.f53958c.c();
    }

    @Override // vd.b0
    public final Class d() {
        return this.f53958c.d();
    }

    public final void e() {
        boolean z11;
        synchronized (this) {
            int i11 = this.f53961f;
            if (i11 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z11 = true;
            int i12 = i11 - 1;
            this.f53961f = i12;
            if (i12 != 0) {
                z11 = false;
            }
        }
        if (z11) {
            ((o) this.f53959d).d(this.f53960e, this);
        }
    }

    @Override // vd.b0
    public final Object get() {
        return this.f53958c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f53956a + ", listener=" + this.f53959d + MFeWs.syDAydRyJBjkMa + this.f53960e + ", acquired=" + this.f53961f + ", isRecycled=" + this.f53962t + ", resource=" + this.f53958c + '}';
    }
}
