package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.LifecycleService;
import fb.l;
import ib.i;
import java.util.LinkedHashMap;
import java.util.Map;
import pb.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends LifecycleService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f2802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2803b;

    static {
        l.c("SystemAlarmService");
    }

    public final void a() {
        this.f2803b = true;
        l.b().getClass();
        int i11 = pb.l.f46748a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (m.f46749a) {
            linkedHashMap.putAll(m.f46750b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            if (wakeLock != null && wakeLock.isHeld()) {
                l.b().getClass();
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        i iVar = new i(this);
        this.f2802a = iVar;
        if (iVar.K != null) {
            l.b().getClass();
        } else {
            iVar.K = this;
        }
        this.f2803b = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2803b = true;
        i iVar = this.f2802a;
        iVar.getClass();
        l.b().getClass();
        iVar.f34323d.e(iVar);
        iVar.K = null;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        if (this.f2803b) {
            l.b().getClass();
            i iVar = this.f2802a;
            iVar.getClass();
            l.b().getClass();
            iVar.f34323d.e(iVar);
            iVar.K = null;
            i iVar2 = new i(this);
            this.f2802a = iVar2;
            if (iVar2.K != null) {
                l.b().getClass();
            } else {
                iVar2.K = this;
            }
            this.f2803b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f2802a.a(intent, i12);
        return 3;
    }
}
