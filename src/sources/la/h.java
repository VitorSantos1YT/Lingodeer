package la;

import android.content.Context;
import hh.o;
import kotlin.jvm.internal.m;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements ka.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c7.f f39861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f39863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f39864f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f39865t;

    public h(Context context, String str, c7.f callback, boolean z11, boolean z12) {
        m.f(context, "context");
        m.f(callback, "callback");
        this.f39859a = context;
        this.f39860b = str;
        this.f39861c = callback;
        this.f39862d = z11;
        this.f39863e = z12;
        this.f39864f = com.bumptech.glide.d.v(new o(this, 28));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        q qVar = this.f39864f;
        if (qVar.a()) {
            ((g) qVar.getValue()).close();
        }
    }

    @Override // ka.d
    public final String getDatabaseName() {
        return this.f39860b;
    }

    @Override // ka.d
    public final ka.a n0() {
        return ((g) this.f39864f.getValue()).a(true);
    }

    @Override // ka.d
    public final void setWriteAheadLoggingEnabled(boolean z11) {
        q qVar = this.f39864f;
        if (qVar.a()) {
            ((g) qVar.getValue()).setWriteAheadLoggingEnabled(z11);
        }
        this.f39865t = z11;
    }
}
