package t1;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import l1.f2;
import l1.g2;
import y.i0;
import y.j0;
import y.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f51993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y1.d f51994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1.e f51995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j0 f51996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n1.e f51997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1.e f51998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1.e f51999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0 f52000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i0 f52001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f52002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j0 f52003k;

    public j() {
        n1.e eVar = new n1.e(new g2[16]);
        this.f51995c = eVar;
        j0 j0Var = s0.f56760a;
        this.f51996d = new j0();
        this.f51997e = eVar;
        this.f51998f = new n1.e(new Object[16]);
        this.f51999g = new n1.e(new fz.a[16]);
    }

    public static final boolean f(g2 g2Var, n1.e eVar) {
        Object[] objArr = eVar.f43112a;
        int i11 = eVar.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            f2 f2Var = ((g2) objArr[i12]).f39309a;
            if (f2Var instanceof g) {
                n1.e eVar2 = ((g) f2Var).f51990b;
                if (eVar2.k(g2Var) || f(g2Var, eVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.f51993a = null;
        this.f51994b = null;
        n1.e eVar = this.f51995c;
        eVar.h();
        this.f51996d.b();
        this.f51997e = eVar;
        this.f51998f.h();
        this.f51999g.h();
        this.f52000h = null;
        this.f52001i = null;
        this.f52002j = null;
    }

    public final void b() {
        Set set = this.f51993a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                f2 f2Var = (f2) it.next();
                it.remove();
                f2Var.a();
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            java.util.Set r0 = r6.f51993a
            if (r0 != 0) goto L6
            goto La7
        L6:
            r1 = 0
            r6.f52003k = r1
            n1.e r1 = r6.f51998f
            int r2 = r1.f43114c
            if (r2 == 0) goto L68
            java.lang.String r2 = "Compose:onForgotten"
            android.os.Trace.beginSection(r2)
            y.j0 r2 = r6.f52000h     // Catch: java.lang.Throwable -> L5e
            int r3 = r1.f43114c     // Catch: java.lang.Throwable -> L5e
            int r3 = r3 + (-1)
        L1a:
            r4 = -1
            if (r4 >= r3) goto L60
            java.lang.Object[] r4 = r1.f43112a     // Catch: java.lang.Throwable -> L5e
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L5e
            boolean r5 = r4 instanceof l1.g2     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L33
            r5 = r4
            l1.g2 r5 = (l1.g2) r5     // Catch: java.lang.Throwable -> L31
            l1.f2 r5 = r5.f39309a     // Catch: java.lang.Throwable -> L31
            r0.remove(r5)     // Catch: java.lang.Throwable -> L31
            r5.d()     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r0 = move-exception
            goto L4f
        L33:
            boolean r5 = r4 instanceof l1.j     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L4c
            if (r2 == 0) goto L46
            boolean r5 = r2.c(r4)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L46
            r5 = r4
            l1.j r5 = (l1.j) r5     // Catch: java.lang.Throwable -> L31
            r5.a()     // Catch: java.lang.Throwable -> L31
            goto L4c
        L46:
            r5 = r4
            l1.j r5 = (l1.j) r5     // Catch: java.lang.Throwable -> L31
            r5.b()     // Catch: java.lang.Throwable -> L31
        L4c:
            int r3 = r3 + (-1)
            goto L1a
        L4f:
            y1.d r1 = r6.f51994b     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L5d
            pv.c r2 = new pv.c     // Catch: java.lang.Throwable -> L5e
            r3 = 25
            r2.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> L5e
            hz.b.T(r0, r2)     // Catch: java.lang.Throwable -> L5e
        L5d:
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            goto L64
        L60:
            android.os.Trace.endSection()
            goto L68
        L64:
            android.os.Trace.endSection()
            throw r0
        L68:
            n1.e r0 = r6.f51995c
            int r1 = r0.f43114c
            if (r1 == 0) goto La7
            java.lang.String r1 = "Compose:onRemembered"
            android.os.Trace.beginSection(r1)
            java.util.Set r1 = r6.f51993a     // Catch: java.lang.Throwable -> La2
            if (r1 != 0) goto L78
            goto L9e
        L78:
            java.lang.Object[] r2 = r0.f43112a     // Catch: java.lang.Throwable -> La2
            int r0 = r0.f43114c     // Catch: java.lang.Throwable -> La2
            r3 = 0
        L7d:
            if (r3 >= r0) goto L9e
            r4 = r2[r3]     // Catch: java.lang.Throwable -> La2
            l1.g2 r4 = (l1.g2) r4     // Catch: java.lang.Throwable -> La2
            l1.f2 r5 = r4.f39309a     // Catch: java.lang.Throwable -> La2
            r1.remove(r5)     // Catch: java.lang.Throwable -> La2
            r5.f()     // Catch: java.lang.Throwable -> L8e
            int r3 = r3 + 1
            goto L7d
        L8e:
            r0 = move-exception
            y1.d r1 = r6.f51994b     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L9d
            pv.c r2 = new pv.c     // Catch: java.lang.Throwable -> La2
            r3 = 25
            r2.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> La2
            hz.b.T(r0, r2)     // Catch: java.lang.Throwable -> La2
        L9d:
            throw r0     // Catch: java.lang.Throwable -> La2
        L9e:
            android.os.Trace.endSection()
            return
        La2:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.j.c():void");
    }

    public final void d() {
        n1.e eVar = this.f51999g;
        if (eVar.f43114c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eVar.f43112a;
                int i11 = eVar.f43114c;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((fz.a) objArr[i12]).invoke();
                }
                eVar.h();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(g2 g2Var) {
        if (!this.f51996d.c(g2Var)) {
            j0 j0Var = this.f52003k;
            if (j0Var == null || !j0Var.c(g2Var)) {
                this.f51998f.c(g2Var);
                return;
            }
            return;
        }
        this.f51996d.l(g2Var);
        if (!this.f51997e.k(g2Var)) {
            n1.e eVar = this.f51995c;
            if (!eVar.k(g2Var)) {
                f(g2Var, eVar);
            }
        }
        Set set = this.f51993a;
        if (set == null) {
            return;
        }
        set.add(g2Var.f39309a);
    }

    public final void g(Set set, y1.d dVar) {
        a();
        this.f51993a = set;
        this.f51994b = dVar;
    }
}
