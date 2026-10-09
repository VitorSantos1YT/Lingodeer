package h7;

import a0.b2;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import b7.f0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.firebase.database.android.d f31859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f31860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f31861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lf.e f31862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f31863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f31864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a5.j f31865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y6.d f31866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31867j;

    public f(Context context, com.google.firebase.database.android.d dVar, y6.d dVar2, a5.j jVar) {
        Context applicationContext = context.getApplicationContext();
        this.f31858a = applicationContext;
        this.f31859b = dVar;
        this.f31866i = dVar2;
        this.f31865h = jVar;
        String str = f0.f3975a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f31860c = handler;
        this.f31861d = new d(this);
        this.f31862e = new lf.e(this, 2);
        c cVar = c.f31829c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f31863f = uriFor != null ? new e(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(c cVar) {
        s7.q qVar;
        if (!this.f31867j || cVar.equals(this.f31864g)) {
            return;
        }
        this.f31864g = cVar;
        x xVar = (x) this.f31859b.f19021b;
        Looper looperMyLooper = Looper.myLooper();
        boolean z11 = xVar.f31978h0 == looperMyLooper;
        StringBuilder sb2 = new StringBuilder("Current looper (");
        sb2.append(looperMyLooper == null ? "null" : looperMyLooper.getThread().getName());
        sb2.append(") is not the playback looper (");
        Looper looper = xVar.f31978h0;
        sb2.append(looper == null ? "null" : looper.getThread().getName());
        sb2.append(")");
        b7.a.i(sb2.toString(), z11);
        c cVar2 = xVar.f31998x;
        if (cVar2 == null || cVar.equals(cVar2)) {
            return;
        }
        xVar.f31998x = cVar;
        b2 b2Var = xVar.f31993s;
        if (b2Var != null) {
            a0 a0Var = (a0) b2Var.f27b;
            synchronized (a0Var.f26699a) {
                qVar = a0Var.T;
            }
            if (qVar != null) {
                synchronized (qVar.f51451c) {
                    qVar.f51454f.getClass();
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        a5.j jVar = this.f31865h;
        if (Objects.equals(audioDeviceInfo, jVar == null ? null : (AudioDeviceInfo) jVar.f385b)) {
            return;
        }
        a5.j jVar2 = audioDeviceInfo != null ? new a5.j(audioDeviceInfo, 16) : null;
        this.f31865h = jVar2;
        a(c.c(this.f31858a, this.f31866i, jVar2));
    }
}
