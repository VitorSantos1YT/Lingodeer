package xb;

import java.io.Closeable;
import m00.a0;
import m00.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f55996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m00.o f55997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Closeable f55999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d0 f56001f;

    public n(a0 a0Var, m00.o oVar, String str, Closeable closeable) {
        this.f55996a = a0Var;
        this.f55997b = oVar;
        this.f55998c = str;
        this.f55999d = closeable;
    }

    @Override // xb.o
    public final com.bumptech.glide.e a() {
        return null;
    }

    @Override // xb.o
    public final synchronized m00.k b() {
        if (this.f56000e) {
            throw new IllegalStateException("closed");
        }
        d0 d0Var = this.f56001f;
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0VarC = m00.b.c(this.f55997b.y(this.f55996a));
        this.f56001f = d0VarC;
        return d0VarC;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f56000e = true;
            d0 d0Var = this.f56001f;
            if (d0Var != null) {
                kc.h.a(d0Var);
            }
            Closeable closeable = this.f55999d;
            if (closeable != null) {
                kc.h.a(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
