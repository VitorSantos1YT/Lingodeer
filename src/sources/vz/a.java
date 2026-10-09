package vz;

import java.util.Arrays;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c[] f54324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f54327d;

    public final c e() {
        c cVarF;
        t tVar;
        synchronized (this) {
            try {
                c[] cVarArrG = this.f54324a;
                if (cVarArrG == null) {
                    cVarArrG = g();
                    this.f54324a = cVarArrG;
                } else if (this.f54325b >= cVarArrG.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(cVarArrG, cVarArrG.length * 2);
                    kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
                    this.f54324a = (c[]) objArrCopyOf;
                    cVarArrG = (c[]) objArrCopyOf;
                }
                int i11 = this.f54326c;
                do {
                    cVarF = cVarArrG[i11];
                    if (cVarF == null) {
                        cVarF = f();
                        cVarArrG[i11] = cVarF;
                    }
                    i11++;
                    if (i11 >= cVarArrG.length) {
                        i11 = 0;
                    }
                } while (!cVarF.a(this));
                this.f54326c = i11;
                this.f54325b++;
                tVar = this.f54327d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (tVar != null) {
            tVar.w(1);
        }
        return cVarF;
    }

    public abstract c f();

    public abstract c[] g();

    public final void h(c cVar) {
        t tVar;
        int i11;
        vy.d[] dVarArrB;
        synchronized (this) {
            try {
                int i12 = this.f54325b - 1;
                this.f54325b = i12;
                tVar = this.f54327d;
                if (i12 == 0) {
                    this.f54326c = 0;
                }
                kotlin.jvm.internal.m.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                dVarArrB = cVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (vy.d dVar : dVarArrB) {
            if (dVar != null) {
                dVar.resumeWith(b0.f48488a);
            }
        }
        if (tVar != null) {
            tVar.w(-1);
        }
    }

    public final t i() {
        t tVar;
        synchronized (this) {
            tVar = this.f54327d;
            if (tVar == null) {
                int i11 = this.f54325b;
                tVar = new t(1, Integer.MAX_VALUE, tz.a.DROP_OLDEST);
                tVar.d(Integer.valueOf(i11));
                this.f54327d = tVar;
            }
        }
        return tVar;
    }
}
