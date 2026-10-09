package ib;

import a0.b2;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import b1.p;
import fb.l;
import java.util.ArrayList;
import java.util.Objects;
import ob.j;
import ob.u;
import pb.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements gb.b {
    public static final /* synthetic */ int M = 0;
    public Intent H;
    public SystemAlarmService K;
    public final p L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qb.a f34321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f34322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gb.d f34323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gb.p f34324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f34325f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f34326t;

    static {
        l.c("SystemAlarmDispatcher");
    }

    public i(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f34320a = applicationContext;
        u uVar = new u(new b2());
        gb.p pVarE = gb.p.E(systemAlarmService);
        this.f34324e = pVarE;
        this.f34325f = new b(applicationContext, pVarE.f28954b.f27049d, uVar);
        this.f34322c = new s(pVarE.f28954b.f27052g);
        gb.d dVar = pVarE.f28958f;
        this.f34323d = dVar;
        qb.a aVar = pVarE.f28956d;
        this.f34321b = aVar;
        this.L = new p(dVar, aVar);
        dVar.a(this);
        this.f34326t = new ArrayList();
        this.H = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i11) {
        l lVarB = l.b();
        Objects.toString(intent);
        lVarB.getClass();
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            l.b().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f34326t) {
                try {
                    ArrayList arrayList = this.f34326t;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i11);
        synchronized (this.f34326t) {
            try {
                boolean zIsEmpty = this.f34326t.isEmpty();
                this.f34326t.add(intent);
                if (zIsEmpty) {
                    c();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock wakeLockA = pb.l.a(this.f34320a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f34324e.f28956d.a(new g(this, 0));
        } finally {
            wakeLockA.release();
        }
    }

    @Override // gb.b
    public final void e(j jVar, boolean z11) {
        o20.a aVar = this.f34321b.f47697d;
        int i11 = b.f34295f;
        Intent intent = new Intent(this.f34320a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z11);
        b.c(intent, jVar);
        aVar.execute(new h(this, 0, 0, intent));
    }
}
