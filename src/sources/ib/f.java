package ib;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import fb.l;
import java.util.Objects;
import kb.k;
import ob.p;
import pb.j;
import pb.q;
import pb.r;
import pb.s;
import rz.y;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements kb.h, q {
    public final j H;
    public final o20.a K;
    public PowerManager.WakeLock L;
    public boolean M;
    public final gb.i N;
    public final y O;
    public volatile z1 P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ob.j f34309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f34310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ed.c f34311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f34312f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f34313t;

    static {
        l.c("DelayMetCommandHandler");
    }

    public f(Context context, int i11, i iVar, gb.i iVar2) {
        this.f34307a = context;
        this.f34308b = i11;
        this.f34310d = iVar;
        this.f34309c = iVar2.f28935a;
        this.N = iVar2;
        mb.i iVar3 = iVar.f34324e.f28962j;
        qb.a aVar = iVar.f34321b;
        this.H = aVar.f47694a;
        this.K = aVar.f47697d;
        this.O = aVar.f47695b;
        this.f34311e = new ed.c(iVar3);
        this.M = false;
        this.f34313t = 0;
        this.f34312f = new Object();
    }

    public static void b(f fVar) {
        boolean z11;
        int i11 = fVar.f34308b;
        o20.a aVar = fVar.K;
        Context context = fVar.f34307a;
        i iVar = fVar.f34310d;
        ob.j jVar = fVar.f34309c;
        String str = jVar.f44817a;
        if (fVar.f34313t >= 2) {
            l.b().getClass();
            return;
        }
        fVar.f34313t = 2;
        l.b().getClass();
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        b.c(intent, jVar);
        aVar.execute(new h(iVar, i11, 0, intent));
        gb.d dVar = iVar.f34323d;
        String str2 = jVar.f44817a;
        synchronized (dVar.f28927k) {
            z11 = dVar.c(str2) != null;
        }
        if (!z11) {
            l.b().getClass();
            return;
        }
        l.b().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        b.c(intent2, jVar);
        aVar.execute(new h(iVar, i11, 0, intent2));
    }

    public static void c(f fVar) {
        if (fVar.f34313t != 0) {
            l lVarB = l.b();
            Objects.toString(fVar.f34309c);
            lVarB.getClass();
            return;
        }
        fVar.f34313t = 1;
        l lVarB2 = l.b();
        Objects.toString(fVar.f34309c);
        lVarB2.getClass();
        if (!fVar.f34310d.f34323d.f(fVar.N, null)) {
            fVar.d();
            return;
        }
        s sVar = fVar.f34310d.f34322c;
        ob.j jVar = fVar.f34309c;
        synchronized (sVar.f46760d) {
            l lVarB3 = l.b();
            Objects.toString(jVar);
            lVarB3.getClass();
            sVar.a(jVar);
            r rVar = new r(sVar, jVar);
            sVar.f46758b.put(jVar, rVar);
            sVar.f46759c.put(jVar, fVar);
            ((Handler) sVar.f46757a.f23485b).postDelayed(rVar, 600000L);
        }
    }

    @Override // kb.h
    public final void a(p pVar, kb.c cVar) {
        boolean z11 = cVar instanceof kb.a;
        j jVar = this.H;
        if (z11) {
            jVar.execute(new e(this, 1));
        } else {
            jVar.execute(new e(this, 0));
        }
    }

    public final void d() {
        synchronized (this.f34312f) {
            try {
                if (this.P != null) {
                    this.P.cancel(null);
                }
                this.f34310d.f34322c.a(this.f34309c);
                PowerManager.WakeLock wakeLock = this.L;
                if (wakeLock != null && wakeLock.isHeld()) {
                    l lVarB = l.b();
                    Objects.toString(this.L);
                    Objects.toString(this.f34309c);
                    lVarB.getClass();
                    this.L.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() throws Throwable {
        String str = this.f34309c.f44817a;
        Context context = this.f34307a;
        StringBuilder sbR = defpackage.e.r(str, " (");
        sbR.append(this.f34308b);
        sbR.append(")");
        this.L = pb.l.a(context, sbR.toString());
        l lVarB = l.b();
        Objects.toString(this.L);
        lVarB.getClass();
        this.L.acquire();
        p pVarN = this.f34310d.f34324e.f28955c.E().n(str);
        if (pVarN == null) {
            this.H.execute(new e(this, 0));
            return;
        }
        boolean zC = pVarN.c();
        this.M = zC;
        if (zC) {
            this.P = k.a(this.f34311e, pVarN, this.O, this);
        } else {
            l.b().getClass();
            this.H.execute(new e(this, 1));
        }
    }

    public final void f(boolean z11) {
        l lVarB = l.b();
        ob.j jVar = this.f34309c;
        Objects.toString(jVar);
        lVarB.getClass();
        d();
        int i11 = this.f34308b;
        i iVar = this.f34310d;
        o20.a aVar = this.K;
        Context context = this.f34307a;
        if (z11) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            b.c(intent, jVar);
            aVar.execute(new h(iVar, i11, 0, intent));
        }
        if (this.M) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            aVar.execute(new h(iVar, i11, 0, intent2));
        }
    }
}
