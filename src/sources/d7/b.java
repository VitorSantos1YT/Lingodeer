package d7;

import android.os.SystemClock;
import b7.f0;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23209b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f23211d;

    public b(boolean z11) {
        this.f23208a = z11;
    }

    public final void b(int i11) {
        h hVar = this.f23211d;
        String str = f0.f3975a;
        for (int i12 = 0; i12 < this.f23210c; i12++) {
            q qVar = (q) this.f23209b.get(i12);
            boolean z11 = this.f23208a;
            t7.i iVar = (t7.i) qVar;
            synchronized (iVar) {
                ImmutableList immutableList = t7.i.f52067p;
                if (z11 && (hVar.f23231h & 8) != 8) {
                    iVar.f52082i += (long) i11;
                }
            }
        }
    }

    @Override // d7.f
    public final void c(q qVar) {
        qVar.getClass();
        ArrayList arrayList = this.f23209b;
        if (arrayList.contains(qVar)) {
            return;
        }
        arrayList.add(qVar);
        this.f23210c++;
    }

    public final void e() {
        h hVar = this.f23211d;
        String str = f0.f3975a;
        for (int i11 = 0; i11 < this.f23210c; i11++) {
            q qVar = (q) this.f23209b.get(i11);
            boolean z11 = this.f23208a;
            t7.i iVar = (t7.i) qVar;
            synchronized (iVar) {
                try {
                    ImmutableList immutableList = t7.i.f52067p;
                    if (z11 && (hVar.f23231h & 8) != 8) {
                        b7.a.j(iVar.f52080g > 0);
                        iVar.f52077d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i12 = (int) (jElapsedRealtime - iVar.f52081h);
                        iVar.f52083j += (long) i12;
                        long j11 = iVar.f52084k;
                        long j12 = iVar.f52082i;
                        iVar.f52084k = j11 + j12;
                        if (i12 > 0) {
                            iVar.f52079f.a((int) Math.sqrt(j12), (j12 * 8000.0f) / i12);
                            if (iVar.f52083j >= 2000 || iVar.f52084k >= 524288) {
                                iVar.f52085l = (long) iVar.f52079f.b();
                            }
                            iVar.b(iVar.f52082i, i12, iVar.f52085l);
                            iVar.f52081h = jElapsedRealtime;
                            iVar.f52082i = 0L;
                        }
                        iVar.f52080g--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f23211d = null;
    }

    public final void g() {
        for (int i11 = 0; i11 < this.f23210c; i11++) {
            ((q) this.f23209b.get(i11)).getClass();
        }
    }

    public final void h(h hVar) {
        this.f23211d = hVar;
        for (int i11 = 0; i11 < this.f23210c; i11++) {
            q qVar = (q) this.f23209b.get(i11);
            boolean z11 = this.f23208a;
            t7.i iVar = (t7.i) qVar;
            synchronized (iVar) {
                try {
                    ImmutableList immutableList = t7.i.f52067p;
                    if (z11 && (hVar.f23231h & 8) != 8) {
                        if (iVar.f52080g == 0) {
                            iVar.f52077d.getClass();
                            iVar.f52081h = SystemClock.elapsedRealtime();
                        }
                        iVar.f52080g++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
