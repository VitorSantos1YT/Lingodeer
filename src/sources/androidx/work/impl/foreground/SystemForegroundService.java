package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import aw.t;
import d2.c;
import fb.l;
import gb.p;
import java.util.Objects;
import java.util.UUID;
import jh.h;
import kotlin.jvm.internal.m;
import nb.a;
import pb.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2809d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f2811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NotificationManager f2812c;

    static {
        l.c("SystemFgService");
    }

    public final void a() {
        this.f2812c = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f2811b = aVar;
        if (aVar.K != null) {
            l.b().getClass();
        } else {
            aVar.K = this;
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2811b.d();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        if (this.f2810a) {
            l.b().getClass();
            this.f2811b.d();
            a();
            this.f2810a = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f2811b;
        aVar.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            l lVarB = l.b();
            Objects.toString(intent);
            lVarB.getClass();
            aVar.f43752b.a(new t(15, aVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
            aVar.c(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.c(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            l.b().getClass();
            SystemForegroundService systemForegroundService = aVar.K;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f2810a = true;
            l.b().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        l lVarB2 = l.b();
        Objects.toString(intent);
        lVarB2.getClass();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        p pVar = aVar.f43751a;
        UUID id2 = UUID.fromString(stringExtra);
        pVar.getClass();
        m.f(id2, "id");
        l lVar = pVar.f28954b.f27057l;
        j jVar = pVar.f28956d.f47694a;
        m.e(jVar, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        h.n(lVar, "CancelWorkById", jVar, new c(9, pVar, id2));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i11) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f2811b.f(2048);
    }

    public final void onTimeout(int i11, int i12) {
        this.f2811b.f(i12);
    }
}
