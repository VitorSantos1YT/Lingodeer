package t7;

import android.os.Looper;
import android.os.SystemClock;
import b7.c0;
import b7.f0;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f9.e f52095d = new f9.e(2, -9223372036854775807L, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f9.e f52096e = new f9.e(3, -9223372036854775807L, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u7.a f52097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f52098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f52099c;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = f0.f3975a;
        this(new u7.a(Executors.newSingleThreadExecutor(new c0(strConcat, 0)), new se.n(15)));
    }

    public final boolean a() {
        return this.f52098b != null;
    }

    @Override // t7.o
    public final void b() {
        IOException iOException = this.f52099c;
        if (iOException != null) {
            throw iOException;
        }
        k kVar = this.f52098b;
        if (kVar != null) {
            int i11 = kVar.f52088a;
            IOException iOException2 = kVar.f52092e;
            if (iOException2 != null && kVar.f52093f > i11) {
                throw iOException2;
            }
        }
    }

    public final void c(m mVar) {
        k kVar = this.f52098b;
        if (kVar != null) {
            kVar.a(true);
        }
        u7.a aVar = this.f52097a;
        if (mVar != null) {
            aVar.execute(new py.b(mVar, 4));
        }
        aVar.f52813b.accept(aVar.f52812a);
    }

    public final void d(l lVar, j jVar, int i11) {
        Looper looperMyLooper = Looper.myLooper();
        b7.a.k(looperMyLooper);
        this.f52099c = null;
        k kVar = new k(this, looperMyLooper, lVar, jVar, i11, SystemClock.elapsedRealtime());
        b7.a.j(this.f52098b == null);
        this.f52098b = kVar;
        kVar.b();
    }

    public n(u7.a aVar) {
        this.f52097a = aVar;
    }
}
