package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import w9.h;
import w9.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2687b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f2688c = new i(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f2689d = new h(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m.f(intent, "intent");
        return this.f2689d;
    }
}
