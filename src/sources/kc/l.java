package kc;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f38070a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static yb.h f38071b;

    @Override // kc.j
    public boolean a(hc.g gVar) {
        jh.h hVar = gVar.f32181a;
        if ((hVar instanceof hc.a ? ((hc.a) hVar).f32177a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        jh.h hVar2 = gVar.f32182b;
        return (hVar2 instanceof hc.a ? ((hc.a) hVar2).f32177a : Integer.MAX_VALUE) > 100;
    }

    @Override // kc.j
    public boolean b() {
        boolean z11;
        synchronized (i.f38060a) {
            try {
                int i11 = i.f38062c;
                i.f38062c = i11 + 1;
                if (i11 >= 30 || SystemClock.uptimeMillis() > i.f38063d + ((long) 30000)) {
                    i.f38062c = 0;
                    i.f38063d = SystemClock.uptimeMillis();
                    String[] list = i.f38061b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    i.f38064e = list.length < 800;
                }
                z11 = i.f38064e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }
}
