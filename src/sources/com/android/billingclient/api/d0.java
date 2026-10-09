package com.android.billingclient.api;

import android.os.HandlerThread;
import b0.s2;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcs;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements zzcs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7500d;

    public d0(g0 g0Var, int i11, y4.a aVar, Runnable runnable) {
        this.f7497a = i11;
        this.f7498b = aVar;
        this.f7499c = runnable;
        this.f7500d = g0Var;
    }

    public void a(boolean z11, nw.z zVar, m00.i iVar, boolean z12) {
        Preconditions.k(iVar, "source");
        int iMin = Math.min(zVar.f44284c, ((nw.z) zVar.f44288g.f7500d).f44284c);
        m00.i iVar2 = zVar.f44282a;
        boolean z13 = iVar2.f40718b > 0;
        int i11 = (int) iVar.f40718b;
        if (z13 || iMin < i11) {
            if (!z13 && iMin > 0) {
                zVar.b(iMin, iVar, false);
            }
            iVar2.K0(iVar, (int) iVar.f40718b);
            zVar.f44287f = z11 | zVar.f44287f;
        } else {
            zVar.b(i11, iVar, z11);
        }
        if (z12) {
            try {
                ((nw.d) this.f7499c).flush();
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f7498b) {
            try {
                b7.a.j(this.f7497a > 0);
                int i11 = this.f7497a - 1;
                this.f7497a = i11;
                if (i11 == 0 && (handlerThread = (HandlerThread) this.f7500d) != null) {
                    handlerThread.quit();
                    this.f7500d = null;
                    this.f7499c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(nw.z zVar, int i11) {
        if (zVar == null) {
            ((nw.z) this.f7500d).a(i11);
            d();
            return;
        }
        zVar.a(i11);
        s2 s2Var = new s2();
        zVar.c(Math.min(zVar.f44284c, ((nw.z) zVar.f44288g.f7500d).f44284c), s2Var);
        if (s2Var.f3677a > 0) {
            try {
                ((nw.d) this.f7499c).flush();
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void d() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f7498b
            nw.p r0 = (nw.p) r0
            nw.z[] r1 = r0.i()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.f7500d
            nw.z r2 = (nw.z) r2
            int r2 = r2.f44284c
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.f44284c
            m00.i r10 = r8.f44282a
            long r11 = r10.f40718b
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f44285d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.f44285d
            int r11 = r11 + r9
            r8.f44285d = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.f44284c
            long r10 = r10.f40718b
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f44285d
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L26
        L68:
            r3 = r6
            goto L16
        L6a:
            b0.s2 r1 = new b0.s2
            r1.<init>()
            nw.z[] r0 = r0.i()
            int r2 = r0.length
            r3 = r4
        L75:
            if (r3 >= r2) goto L83
            r5 = r0[r3]
            int r6 = r5.f44285d
            r5.c(r6, r1)
            r5.f44285d = r4
            int r3 = r3 + 1
            goto L75
        L83:
            int r0 = r1.f3677a
            if (r0 <= 0) goto L96
            java.lang.Object r0 = r13.f7499c     // Catch: java.io.IOException -> L8f
            nw.d r0 = (nw.d) r0     // Catch: java.io.IOException -> L8f
            r0.flush()     // Catch: java.io.IOException -> L8f
            return
        L8f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.d0.d():void");
    }

    public void e(Throwable th2) {
        g0 g0Var = (g0) this.f7500d;
        if (th2 instanceof TimeoutException) {
            g0Var.H(zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, j0.f7538r);
            int i11 = zzc.f12272a;
        } else {
            g0Var.H(zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, j0.f7538r);
            int i12 = zzc.f12272a;
        }
        ((Runnable) this.f7499c).run();
    }

    public d0(nw.p pVar, nw.d dVar) {
        this.f7498b = pVar;
        this.f7499c = dVar;
        this.f7497a = 65535;
        this.f7500d = new nw.z(this, 0, 65535, null);
    }

    public d0() {
        this.f7498b = new Object();
        this.f7499c = null;
        this.f7500d = null;
        this.f7497a = 0;
    }

    public d0(int i11, tz.a aVar, uz.i iVar, vy.i iVar2) {
        this.f7498b = iVar;
        this.f7497a = i11;
        this.f7499c = aVar;
        this.f7500d = iVar2;
    }
}
