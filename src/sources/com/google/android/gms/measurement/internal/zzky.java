package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzky implements Application.ActivityLifecycleCallbacks, zzkw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzlj f13304a;

    public zzky(zzlj zzljVar) {
        this.f13304a = zzljVar;
    }

    public final void a(com.google.android.gms.internal.measurement.zzdd zzddVar, Bundle bundle) {
        zzmb zzmbVar;
        zzic zzicVar;
        Uri uri;
        zzlj zzljVar = this.f13304a;
        try {
            try {
                zzic zzicVar2 = zzljVar.f13202a;
                zzgu zzguVar = zzicVar2.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12949n.a("onActivityCreated");
                Intent intent = zzddVar.f11504c;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        zzic.k(zzicVar2.f13102i);
                        String str = zzpp.j0(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter(Constants.REFERRER);
                        boolean z11 = bundle == null;
                        zzhz zzhzVar = zzicVar2.f13100g;
                        zzic.m(zzhzVar);
                        zzhzVar.p(new zzkx(this, z11, uri, str, queryParameter));
                        zzicVar = zzljVar.f13202a;
                    }
                    zzmbVar = zzicVar.f13105l;
                }
                zzicVar = zzljVar.f13202a;
            } catch (RuntimeException e8) {
                zzgu zzguVar2 = zzljVar.f13202a.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.b(e8, "Throwable caught in onActivityCreated");
            }
            zzmbVar = zzicVar.f13105l;
        } finally {
            zzmbVar = zzljVar.f13202a.f13105l;
            zzic.l(zzmbVar);
            zzmbVar.n(zzddVar, bundle);
        }
    }

    public final void b(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        zzmb zzmbVar = this.f13304a.f13202a.f13105l;
        zzic.l(zzmbVar);
        synchronized (zzmbVar.f13392l) {
            try {
                if (Objects.equals(zzmbVar.f13387g, zzddVar)) {
                    zzmbVar.f13387g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zzmbVar.f13202a.f13097d.v()) {
            zzmbVar.f13386f.remove(Integer.valueOf(zzddVar.f11502a));
        }
    }

    public final void c(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        zzic zzicVar = this.f13304a.f13202a;
        zzmb zzmbVar = zzicVar.f13105l;
        zzic.l(zzmbVar);
        synchronized (zzmbVar.f13392l) {
            zzmbVar.f13391k = false;
            zzmbVar.f13388h = true;
        }
        zzic zzicVar2 = zzmbVar.f13202a;
        zzicVar2.f13104k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzicVar2.f13097d.v()) {
            zzlu zzluVarQ = zzmbVar.q(zzddVar);
            zzmbVar.f13384d = zzmbVar.f13383c;
            zzmbVar.f13383c = null;
            zzhz zzhzVar = zzicVar2.f13100g;
            zzic.m(zzhzVar);
            zzhzVar.p(new zzlz(zzmbVar, zzluVarQ, jElapsedRealtime));
        } else {
            zzmbVar.f13383c = null;
            zzhz zzhzVar2 = zzicVar2.f13100g;
            zzic.m(zzhzVar2);
            zzhzVar2.p(new zzly(zzmbVar, jElapsedRealtime));
        }
        zzoc zzocVar = zzicVar.f13101h;
        zzic.l(zzocVar);
        zzic zzicVar3 = zzocVar.f13202a;
        zzicVar3.f13104k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        zzhz zzhzVar3 = zzicVar3.f13100g;
        zzic.m(zzhzVar3);
        zzhzVar3.p(new zznv(zzocVar, jElapsedRealtime2));
    }

    public final void d(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        zzic zzicVar = this.f13304a.f13202a;
        zzoc zzocVar = zzicVar.f13101h;
        zzic.l(zzocVar);
        zzic zzicVar2 = zzocVar.f13202a;
        zzicVar2.f13104k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        zzhz zzhzVar = zzicVar2.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zznu(zzocVar, jElapsedRealtime));
        zzmb zzmbVar = zzicVar.f13105l;
        zzic.l(zzmbVar);
        Object obj = zzmbVar.f13392l;
        synchronized (obj) {
            try {
                zzmbVar.f13391k = true;
                if (!Objects.equals(zzddVar, zzmbVar.f13387g)) {
                    synchronized (obj) {
                        zzmbVar.f13387g = zzddVar;
                        zzmbVar.f13388h = false;
                        zzic zzicVar3 = zzmbVar.f13202a;
                        if (zzicVar3.f13097d.v()) {
                            zzmbVar.f13389i = null;
                            zzhz zzhzVar2 = zzicVar3.f13100g;
                            zzic.m(zzhzVar2);
                            zzhzVar2.p(new zzma(zzmbVar));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzic zzicVar4 = zzmbVar.f13202a;
        if (!zzicVar4.f13097d.v()) {
            zzmbVar.f13383c = zzmbVar.f13389i;
            zzhz zzhzVar3 = zzicVar4.f13100g;
            zzic.m(zzhzVar3);
            zzhzVar3.p(new zzlx(zzmbVar));
            return;
        }
        zzmbVar.o(zzddVar.f11503b, zzmbVar.q(zzddVar), false);
        zzd zzdVar = zzmbVar.f13202a.f13106n;
        zzic.j(zzdVar);
        zzic zzicVar5 = zzdVar.f13202a;
        zzicVar5.f13104k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        zzhz zzhzVar4 = zzicVar5.f13100g;
        zzic.m(zzhzVar4);
        zzhzVar4.p(new zzc(zzdVar, jElapsedRealtime2));
    }

    public final void e(com.google.android.gms.internal.measurement.zzdd zzddVar, Bundle bundle) {
        zzlu zzluVar;
        zzmb zzmbVar = this.f13304a.f13202a.f13105l;
        zzic.l(zzmbVar);
        if (!zzmbVar.f13202a.f13097d.v() || bundle == null || (zzluVar = (zzlu) zzmbVar.f13386f.get(Integer.valueOf(zzddVar.f11502a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzluVar.f13357c);
        bundle2.putString("name", zzluVar.f13355a);
        bundle2.putString("referrer_name", zzluVar.f13356b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(com.google.android.gms.internal.measurement.zzdd.D1(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(com.google.android.gms.internal.measurement.zzdd.D1(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(com.google.android.gms.internal.measurement.zzdd.D1(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(com.google.android.gms.internal.measurement.zzdd.D1(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e(com.google.android.gms.internal.measurement.zzdd.D1(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
