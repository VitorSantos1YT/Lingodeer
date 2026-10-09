package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzco {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzic f12597a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f12598b = new e(0);

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void beginAdUnitExposure(String str, long j11) {
        h();
        zzd zzdVar = this.f12597a.f13106n;
        zzic.j(zzdVar);
        zzdVar.h(j11, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.x(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void clearMeasurementEnabled(long j11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.h();
        zzhz zzhzVar = zzljVar.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzks(zzljVar, null));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void endAdUnitExposure(String str, long j11) {
        h();
        zzd zzdVar = this.f12597a.f13106n;
        zzic.j(zzdVar);
        zzdVar.i(j11, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void generateEventId(com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        h();
        zzpp zzppVar = this.f12597a.f13102i;
        zzic.k(zzppVar);
        long jF0 = zzppVar.f0();
        h();
        zzpp zzppVar2 = this.f12597a.f13102i;
        zzic.k(zzppVar2);
        zzppVar2.V(zzcsVar, jF0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        h();
        zzhz zzhzVar = this.f12597a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzi(this, zzcsVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        j((String) zzljVar.f13328g.get(), zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        h();
        zzhz zzhzVar = this.f12597a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzm(this, zzcsVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        j(zzljVar.A(), zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        j(zzljVar.z(), zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        j(zzljVar.B(), zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.u(str);
        h();
        zzpp zzppVar = this.f12597a.f13102i;
        zzic.k(zzppVar);
        zzppVar.W(zzcsVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getSessionId(com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzhz zzhzVar = zzljVar.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzkm(zzljVar, zzcsVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcs zzcsVar, int i11) {
        h();
        if (i11 == 0) {
            zzpp zzppVar = this.f12597a.f13102i;
            zzic.k(zzppVar);
            zzlj zzljVar = this.f12597a.m;
            zzic.l(zzljVar);
            AtomicReference atomicReference = new AtomicReference();
            zzhz zzhzVar = zzljVar.f13202a.f13100g;
            zzic.m(zzhzVar);
            zzppVar.U((String) zzhzVar.q(atomicReference, 15000L, "String test flag value", new zzko(zzljVar, atomicReference)), zzcsVar);
            return;
        }
        if (i11 == 1) {
            zzpp zzppVar2 = this.f12597a.f13102i;
            zzic.k(zzppVar2);
            zzlj zzljVar2 = this.f12597a.m;
            zzic.l(zzljVar2);
            AtomicReference atomicReference2 = new AtomicReference();
            zzhz zzhzVar2 = zzljVar2.f13202a.f13100g;
            zzic.m(zzhzVar2);
            zzppVar2.V(zzcsVar, ((Long) zzhzVar2.q(atomicReference2, 15000L, "long test flag value", new zzkp(zzljVar2, atomicReference2))).longValue());
            return;
        }
        if (i11 == 2) {
            zzpp zzppVar3 = this.f12597a.f13102i;
            zzic.k(zzppVar3);
            zzlj zzljVar3 = this.f12597a.m;
            zzic.l(zzljVar3);
            AtomicReference atomicReference3 = new AtomicReference();
            zzhz zzhzVar3 = zzljVar3.f13202a.f13100g;
            zzic.m(zzhzVar3);
            double dDoubleValue = ((Double) zzhzVar3.q(atomicReference3, 15000L, "double test flag value", new zzkr(zzljVar3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                zzcsVar.A0(bundle);
                return;
            } catch (RemoteException e8) {
                zzgu zzguVar = zzppVar3.f13202a.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12945i.b(e8, "Error returning double value to wrapper");
                return;
            }
        }
        if (i11 == 3) {
            zzpp zzppVar4 = this.f12597a.f13102i;
            zzic.k(zzppVar4);
            zzlj zzljVar4 = this.f12597a.m;
            zzic.l(zzljVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            zzhz zzhzVar4 = zzljVar4.f13202a.f13100g;
            zzic.m(zzhzVar4);
            zzppVar4.W(zzcsVar, ((Integer) zzhzVar4.q(atomicReference4, 15000L, "int test flag value", new zzkq(zzljVar4, atomicReference4))).intValue());
            return;
        }
        if (i11 != 4) {
            return;
        }
        zzpp zzppVar5 = this.f12597a.f13102i;
        zzic.k(zzppVar5);
        zzlj zzljVar5 = this.f12597a.m;
        zzic.l(zzljVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        zzhz zzhzVar5 = zzljVar5.f13202a.f13100g;
        zzic.m(zzhzVar5);
        zzppVar5.Y(zzcsVar, ((Boolean) zzhzVar5.q(atomicReference5, 15000L, "boolean test flag value", new zzke(zzljVar5, atomicReference5))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getUserProperties(String str, String str2, boolean z11, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        h();
        zzhz zzhzVar = this.f12597a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzk(this, zzcsVar, str, str2, z11));
    }

    public final void h() {
        if (this.f12597a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void initForTests(Map map) {
        h();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdb zzdbVar, long j11) {
        zzic zzicVar = this.f12597a;
        if (zzicVar == null) {
            Context context = (Context) ObjectWrapper.j(iObjectWrapper);
            Preconditions.g(context);
            this.f12597a = zzic.s(context, zzdbVar, Long.valueOf(j11), null);
        } else {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void initializeWithElapsedTime(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdb zzdbVar, long j11, long j12) {
        zzic zzicVar = this.f12597a;
        if (zzicVar == null) {
            Context context = (Context) ObjectWrapper.j(iObjectWrapper);
            Preconditions.g(context);
            this.f12597a = zzic.s(context, zzdbVar, Long.valueOf(j11), Long.valueOf(j12));
        } else {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        h();
        zzhz zzhzVar = this.f12597a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzn(this, zzcsVar));
    }

    public final void j(String str, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        h();
        zzpp zzppVar = this.f12597a.f13102i;
        zzic.k(zzppVar);
        zzppVar.U(str, zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logEvent(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.l(str, str2, bundle, z11, z12, j11, 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcs zzcsVar, long j11) {
        h();
        Preconditions.d(str2);
        String str3 = true != this.f12597a.f13097d.r(null, zzfy.f1) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        zzbh zzbhVar = new zzbh(str2, new zzbf(bundle), str3, j11, 0L);
        zzhz zzhzVar = this.f12597a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzj(this, zzcsVar, zzbhVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11, long j12) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.l(str, str2, bundle, z11, z12, j11, j12);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logHealthData(int i11, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        h();
        Object objJ = iObjectWrapper == null ? null : ObjectWrapper.j(iObjectWrapper);
        Object objJ2 = iObjectWrapper2 == null ? null : ObjectWrapper.j(iObjectWrapper2);
        Object objJ3 = iObjectWrapper3 != null ? ObjectWrapper.j(iObjectWrapper3) : null;
        zzgu zzguVar = this.f12597a.f13099f;
        zzic.m(zzguVar);
        zzguVar.p(i11, true, false, str, objJ, objJ2, objJ3);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j11) {
        h();
        Activity activity = (Activity) ObjectWrapper.j(iObjectWrapper);
        Preconditions.g(activity);
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.D1(activity), bundle, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, Bundle bundle, long j11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzky zzkyVar = zzljVar.f13324c;
        if (zzkyVar != null) {
            zzlj zzljVar2 = this.f12597a.m;
            zzic.l(zzljVar2);
            zzljVar2.F();
            zzkyVar.a(zzddVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j11) {
        h();
        Activity activity = (Activity) ObjectWrapper.j(iObjectWrapper);
        Preconditions.g(activity);
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.D1(activity), j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, long j11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzky zzkyVar = zzljVar.f13324c;
        if (zzkyVar != null) {
            zzlj zzljVar2 = this.f12597a.m;
            zzic.l(zzljVar2);
            zzljVar2.F();
            zzkyVar.b(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j11) {
        h();
        Activity activity = (Activity) ObjectWrapper.j(iObjectWrapper);
        Preconditions.g(activity);
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.D1(activity), j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, long j11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzky zzkyVar = zzljVar.f13324c;
        if (zzkyVar != null) {
            zzlj zzljVar2 = this.f12597a.m;
            zzic.l(zzljVar2);
            zzljVar2.F();
            zzkyVar.c(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j11) {
        h();
        Activity activity = (Activity) ObjectWrapper.j(iObjectWrapper);
        Preconditions.g(activity);
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.D1(activity), j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, long j11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzky zzkyVar = zzljVar.f13324c;
        if (zzkyVar != null) {
            zzlj zzljVar2 = this.f12597a.m;
            zzic.l(zzljVar2);
            zzljVar2.F();
            zzkyVar.d(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcs zzcsVar, long j11) {
        h();
        Activity activity = (Activity) ObjectWrapper.j(iObjectWrapper);
        Preconditions.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.D1(activity), zzcsVar, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, com.google.android.gms.internal.measurement.zzcs zzcsVar, long j11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzky zzkyVar = zzljVar.f13324c;
        Bundle bundle = new Bundle();
        if (zzkyVar != null) {
            zzlj zzljVar2 = this.f12597a.m;
            zzic.l(zzljVar2);
            zzljVar2.F();
            zzkyVar.e(zzddVar, bundle);
        }
        try {
            zzcsVar.A0(bundle);
        } catch (RemoteException e8) {
            zzgu zzguVar = this.f12597a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.b(e8, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j11) {
        h();
        Activity activity = (Activity) ObjectWrapper.j(iObjectWrapper);
        Preconditions.g(activity);
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.D1(activity), j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, long j11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        if (zzljVar.f13324c != null) {
            zzlj zzljVar2 = this.f12597a.m;
            zzic.l(zzljVar2);
            zzljVar2.F();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j11) {
        h();
        Activity activity = (Activity) ObjectWrapper.j(iObjectWrapper);
        Preconditions.g(activity);
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.D1(activity), j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, long j11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        if (zzljVar.f13324c != null) {
            zzlj zzljVar2 = this.f12597a.m;
            zzic.l(zzljVar2);
            zzljVar2.F();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcs zzcsVar, long j11) {
        h();
        zzcsVar.A0(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        Object zzqVar;
        h();
        e eVar = this.f12598b;
        synchronized (eVar) {
            try {
                zzqVar = (zzjq) eVar.get(Integer.valueOf(zzcyVar.zzf()));
                if (zzqVar == null) {
                    zzqVar = new zzq(this, zzcyVar);
                    eVar.put(Integer.valueOf(zzcyVar.zzf()), zzqVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.h();
        if (zzljVar.f13326e.add(zzqVar)) {
            return;
        }
        zzgu zzguVar = zzljVar.f13202a.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12945i.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    @Deprecated
    public void resetAnalyticsData(long j11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.f13328g.set(null);
        zzhz zzhzVar = zzljVar.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzkh(zzljVar, j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void resetAnalyticsDataWithElapsedTime(long j11, long j12) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.f13328g.set(null);
        zzhz zzhzVar = zzljVar.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzkh(zzljVar, j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.zzcv zzcvVar) {
        int i11;
        zzlr zzlrVar;
        h();
        final zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.measurement.internal.zzo
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    zzcvVar.zze();
                } catch (RemoteException e8) {
                    zzic zzicVar = this.f13529a.f12597a;
                    Preconditions.g(zzicVar);
                    zzgu zzguVar = zzicVar.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12945i.b(e8, "Failed to call IDynamiteUploadBatchesCallback");
                }
            }
        };
        zzljVar.h();
        zzic zzicVar = zzljVar.f13202a;
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        if (zzhzVar.m()) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        zzhz zzhzVar2 = zzicVar.f13100g;
        zzic.m(zzhzVar2);
        if (Thread.currentThread() == zzhzVar2.f13082d) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (zzae.a()) {
            zzgu zzguVar3 = zzicVar.f13099f;
            zzic.m(zzguVar3);
            zzguVar3.f12942f.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        zzgu zzguVar4 = zzicVar.f13099f;
        zzic.m(zzguVar4);
        zzguVar4.f12949n.a("[sgtm] Started client-side batch upload work.");
        boolean z11 = false;
        int size = 0;
        int i12 = 0;
        while (!z11) {
            zzgu zzguVar5 = zzicVar.f13099f;
            zzic.m(zzguVar5);
            zzguVar5.f12949n.a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzhz zzhzVar3 = zzicVar.f13100g;
            zzic.m(zzhzVar3);
            zzhzVar3.q(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzli
                @Override // java.lang.Runnable
                public final void run() {
                    final zznl zznlVarP = zzljVar.f13202a.p();
                    final zzoo zzooVarD1 = zzoo.D1(zzls.SGTM_CLIENT);
                    zznlVarP.g();
                    zznlVarP.h();
                    final zzr zzrVarW = zznlVarP.w(false);
                    final AtomicReference atomicReference2 = atomicReference;
                    zznlVarP.u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzni
                        @Override // java.lang.Runnable
                        public final void run() {
                            zznl zznlVar = zznlVarP;
                            AtomicReference atomicReference3 = atomicReference2;
                            zzr zzrVar = zzrVarW;
                            zzoo zzooVar = zzooVarD1;
                            synchronized (atomicReference3) {
                                try {
                                    zzgb zzgbVar = zznlVar.f13489d;
                                    if (zzgbVar != null) {
                                        zzgbVar.n(zzrVar, zzooVar, new zzmf(zznlVar, atomicReference3));
                                        zznlVar.t();
                                    } else {
                                        zzgu zzguVar6 = zznlVar.f13202a.f13099f;
                                        zzic.m(zzguVar6);
                                        zzguVar6.f12942f.a("[sgtm] Failed to get upload batches; not connected to service");
                                    }
                                } catch (RemoteException e8) {
                                    zzgu zzguVar7 = zznlVar.f13202a.f13099f;
                                    zzic.m(zzguVar7);
                                    zzguVar7.f12942f.b(e8, "[sgtm] Failed to get upload batches; remote exception");
                                    atomicReference3.notifyAll();
                                }
                            }
                        }
                    });
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.f13561a;
            if (list.isEmpty()) {
                break;
            }
            zzgu zzguVar6 = zzicVar.f13099f;
            zzic.m(zzguVar6);
            zzguVar6.f12949n.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                final zzom zzomVar = (zzom) it.next();
                try {
                    URL url = new URI(zzomVar.f13555c).toURL();
                    final AtomicReference atomicReference2 = new AtomicReference();
                    zzgi zzgiVarR = zzljVar.f13202a.r();
                    zzgiVarR.h();
                    Preconditions.g(zzgiVarR.f12900g);
                    String str = zzgiVarR.f12900g;
                    zzic zzicVar2 = zzljVar.f13202a;
                    zzgu zzguVar7 = zzicVar2.f13099f;
                    zzic.m(zzguVar7);
                    zzgs zzgsVar = zzguVar7.f12949n;
                    i11 = size;
                    Long lValueOf = Long.valueOf(zzomVar.f13553a);
                    zzgsVar.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.f13555c, Integer.valueOf(zzomVar.f13554b.length));
                    if (!TextUtils.isEmpty(zzomVar.f13559t)) {
                        zzgu zzguVar8 = zzicVar2.f13099f;
                        zzic.m(zzguVar8);
                        zzguVar8.f12949n.c(lValueOf, zzomVar.f13559t, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = zzomVar.f13556d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    zzlo zzloVar = zzicVar2.f13107o;
                    zzic.m(zzloVar);
                    byte[] bArr = zzomVar.f13554b;
                    zzll zzllVar = new zzll() { // from class: com.google.android.gms.measurement.internal.zzkz
                        /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                        /* JADX WARN: Code duplicated, block: B:11:0x002d A[PHI: r8
                          0x002d: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:13:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0065  */
                        @Override // com.google.android.gms.measurement.internal.zzll
                        public final void a(String str3, int i13, Throwable th2, byte[] bArr2, Map map2) {
                            zzlr zzlrVar2;
                            zzlj zzljVar2 = zzljVar;
                            zzljVar2.g();
                            zzom zzomVar2 = zzomVar;
                            if (i13 == 200 || i13 == 204) {
                                if (th2 == null) {
                                    zzgu zzguVar9 = zzljVar2.f13202a.f13099f;
                                    zzic.m(zzguVar9);
                                    zzguVar9.f12949n.b(Long.valueOf(zzomVar2.f13553a), "[sgtm] Upload succeeded for row_id");
                                    zzlrVar2 = zzlr.SUCCESS;
                                } else {
                                    zzgu zzguVar10 = zzljVar2.f13202a.f13099f;
                                    zzic.m(zzguVar10);
                                    zzguVar10.f12945i.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f13553a), Integer.valueOf(i13), th2);
                                    if (Arrays.asList(((String) zzfy.f12883u.a(null)).split(",")).contains(String.valueOf(i13))) {
                                        zzlrVar2 = zzlr.BACKOFF;
                                    } else {
                                        zzlrVar2 = zzlr.FAILURE;
                                    }
                                }
                            } else if (i13 == 304) {
                                i13 = 304;
                                if (th2 == null) {
                                    zzgu zzguVar11 = zzljVar2.f13202a.f13099f;
                                    zzic.m(zzguVar11);
                                    zzguVar11.f12949n.b(Long.valueOf(zzomVar2.f13553a), "[sgtm] Upload succeeded for row_id");
                                    zzlrVar2 = zzlr.SUCCESS;
                                } else {
                                    zzgu zzguVar12 = zzljVar2.f13202a.f13099f;
                                    zzic.m(zzguVar12);
                                    zzguVar12.f12945i.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f13553a), Integer.valueOf(i13), th2);
                                    if (Arrays.asList(((String) zzfy.f12883u.a(null)).split(",")).contains(String.valueOf(i13))) {
                                        zzlrVar2 = zzlr.BACKOFF;
                                    } else {
                                        zzlrVar2 = zzlr.FAILURE;
                                    }
                                }
                            } else {
                                zzgu zzguVar13 = zzljVar2.f13202a.f13099f;
                                zzic.m(zzguVar13);
                                zzguVar13.f12945i.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f13553a), Integer.valueOf(i13), th2);
                                if (Arrays.asList(((String) zzfy.f12883u.a(null)).split(",")).contains(String.valueOf(i13))) {
                                    zzlrVar2 = zzlr.BACKOFF;
                                } else {
                                    zzlrVar2 = zzlr.FAILURE;
                                }
                            }
                            AtomicReference atomicReference3 = atomicReference2;
                            final zznl zznlVarP = zzljVar2.f13202a.p();
                            long j11 = zzomVar2.f13553a;
                            final zzaf zzafVar = new zzaf(j11, zzlrVar2.zza(), zzomVar2.f13558f);
                            zznlVarP.g();
                            zznlVarP.h();
                            final zzr zzrVarW = zznlVarP.w(true);
                            zznlVarP.u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzr zzrVar = zzrVarW;
                                    zzaf zzafVar2 = zzafVar;
                                    zznl zznlVar = zznlVarP;
                                    zzic zzicVar3 = zznlVar.f13202a;
                                    zzgb zzgbVar = zznlVar.f13489d;
                                    if (zzgbVar == null) {
                                        zzgu zzguVar14 = zzicVar3.f13099f;
                                        zzic.m(zzguVar14);
                                        zzguVar14.f12942f.a("[sgtm] Discarding data. Failed to update batch upload status.");
                                        return;
                                    }
                                    try {
                                        zzgbVar.t0(zzrVar, zzafVar2);
                                        zznlVar.t();
                                    } catch (RemoteException e8) {
                                        zzgu zzguVar15 = zzicVar3.f13099f;
                                        zzic.m(zzguVar15);
                                        zzguVar15.f12942f.c(Long.valueOf(zzafVar2.f12617a), e8, "[sgtm] Failed to update batch upload status, rowId, exception");
                                    }
                                }
                            });
                            zzgu zzguVar14 = zzljVar2.f13202a.f13099f;
                            zzic.m(zzguVar14);
                            zzguVar14.f12949n.c(Long.valueOf(j11), zzlrVar2, "[sgtm] Updated status for row_id");
                            synchronized (atomicReference3) {
                                atomicReference3.set(zzlrVar2);
                                atomicReference3.notifyAll();
                            }
                        }
                    };
                    zzloVar.i();
                    Preconditions.g(url);
                    Preconditions.g(bArr);
                    zzhz zzhzVar4 = zzloVar.f13202a.f13100g;
                    zzic.m(zzhzVar4);
                    zzhzVar4.s(new zzln(zzloVar, str, url, bArr, map, zzllVar));
                    try {
                        zzpp zzppVar = zzicVar2.f13102i;
                        zzic.k(zzppVar);
                        zzic zzicVar3 = zzppVar.f13202a;
                        zzicVar3.f13104k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    zzicVar3.f13104k.getClass();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        zzgu zzguVar9 = zzljVar.f13202a.f13099f;
                        zzic.m(zzguVar9);
                        zzguVar9.f12945i.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    zzlrVar = atomicReference2.get() == null ? zzlr.UNKNOWN : (zzlr) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e8) {
                    i11 = size;
                    zzgu zzguVar10 = zzljVar.f13202a.f13099f;
                    zzic.m(zzguVar10);
                    zzguVar10.f12942f.d("[sgtm] Bad upload url for row_id", zzomVar.f13555c, Long.valueOf(zzomVar.f13553a), e8);
                    zzlrVar = zzlr.FAILURE;
                }
                if (zzlrVar != zzlr.SUCCESS) {
                    if (zzlrVar == zzlr.BACKOFF) {
                        z11 = true;
                        size = i11;
                        break;
                    }
                } else {
                    i12++;
                }
                size = i11;
            }
        }
        zzgu zzguVar11 = zzicVar.f13099f;
        zzic.m(zzguVar11);
        zzguVar11.f12949n.c(Integer.valueOf(size), Integer.valueOf(i12), "[sgtm] Completed client-side batch upload work. total, success");
        runnable.run();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setConditionalUserProperty(Bundle bundle, long j11) {
        h();
        if (bundle == null) {
            zzgu zzguVar = this.f12597a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Conditional user property must not be null");
        } else {
            zzlj zzljVar = this.f12597a.m;
            zzic.l(zzljVar);
            zzljVar.w(bundle, j11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setConsentThirdParty(Bundle bundle, long j11) throws Throwable {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.G(bundle, -20, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j11) {
        h();
        Activity activity = (Activity) ObjectWrapper.j(iObjectWrapper);
        Preconditions.g(activity);
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.D1(activity), str, str2, j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r3 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r3 > 500) goto L34;
     */
    @Override // com.google.android.gms.internal.measurement.zzcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setDataCollectionEnabled(boolean z11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.h();
        zzhz zzhzVar = zzljVar.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzjy(zzljVar, z11));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setDefaultEventParameters(Bundle bundle) {
        h();
        final zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzhz zzhzVar = zzljVar.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlf
            @Override // java.lang.Runnable
            public final void run() {
                zzlj zzljVar2 = zzljVar;
                zzkn zzknVar = zzljVar2.f13342v;
                zzic zzicVar = zzljVar2.f13202a;
                Bundle bundle3 = bundle2;
                if (!bundle3.isEmpty()) {
                    zzhh zzhhVar = zzicVar.f13098e;
                    zzpp zzppVar = zzicVar.f13102i;
                    zzal zzalVar = zzicVar.f13097d;
                    zzgu zzguVar = zzicVar.f13099f;
                    zzic.k(zzhhVar);
                    Bundle bundle4 = new Bundle(zzhhVar.f13041y.a());
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            zzic.k(zzppVar);
                            if (zzpp.t0(obj)) {
                                zzpp.y(zzknVar, null, 27, null, null, 0);
                            }
                            zzic.m(zzguVar);
                            zzguVar.f12947k.c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (zzpp.L(str)) {
                            zzic.m(zzguVar);
                            zzguVar.f12947k.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle4.remove(str);
                        } else {
                            zzic.k(zzppVar);
                            zzalVar.getClass();
                            if (zzppVar.k(obj, 500, "param", str)) {
                                zzppVar.x(bundle4, str, obj);
                            }
                        }
                    }
                    zzic.k(zzppVar);
                    zzpp zzppVar2 = zzalVar.f13202a.f13102i;
                    zzic.k(zzppVar2);
                    int i11 = zzppVar2.R(201500000) ? 100 : 25;
                    if (bundle4.size() > i11) {
                        int i12 = 0;
                        for (String str2 : new TreeSet(bundle4.keySet())) {
                            i12++;
                            if (i12 > i11) {
                                bundle4.remove(str2);
                            }
                        }
                        zzic.k(zzppVar);
                        zzpp.y(zzknVar, null, 26, null, null, 0);
                        zzic.m(zzguVar);
                        zzguVar.f12947k.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle3 = bundle4;
                }
                zzhh zzhhVar2 = zzicVar.f13098e;
                zzic.k(zzhhVar2);
                zzhhVar2.f13041y.b(bundle3);
                zzicVar.p().l(bundle3);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        h();
        zzp zzpVar = new zzp(this, zzcyVar);
        zzhz zzhzVar = this.f12597a.f13100g;
        zzic.m(zzhzVar);
        if (!zzhzVar.m()) {
            zzhz zzhzVar2 = this.f12597a.f13100g;
            zzic.m(zzhzVar2);
            zzhzVar2.p(new zzl(this, zzpVar));
            return;
        }
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.g();
        zzljVar.h();
        zzjp zzjpVar = zzljVar.f13325d;
        if (zzpVar != zzjpVar) {
            Preconditions.i("EventInterceptor already set.", zzjpVar == null);
        }
        zzljVar.f13325d = zzpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzda zzdaVar) {
        h();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setMeasurementEnabled(boolean z11, long j11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        Boolean boolValueOf = Boolean.valueOf(z11);
        zzljVar.h();
        zzhz zzhzVar = zzljVar.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzks(zzljVar, boolValueOf));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setMinimumSessionDuration(long j11) {
        h();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setSessionTimeoutDuration(long j11) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzhz zzhzVar = zzljVar.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzka(zzljVar, j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setSgtmDebugInfo(Intent intent) {
        h();
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzic zzicVar = zzljVar.f13202a;
        Uri data = intent.getData();
        if (data == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12948l.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12948l.a("[sgtm] Preview Mode was not enabled.");
            zzicVar.f13097d.f12629c = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        zzgu zzguVar3 = zzicVar.f13099f;
        zzic.m(zzguVar3);
        zzguVar3.f12948l.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        zzicVar.f13097d.f12629c = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setUserId(final String str, long j11) {
        h();
        final zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzic zzicVar = zzljVar.f13202a;
        if (str != null && TextUtils.isEmpty(str)) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.a("User ID must be non-empty or null");
        } else {
            zzhz zzhzVar = zzicVar.f13100g;
            zzic.m(zzhzVar);
            zzhzVar.p(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlg
                @Override // java.lang.Runnable
                public final void run() {
                    zzic zzicVar2 = zzljVar.f13202a;
                    zzgi zzgiVarR = zzicVar2.r();
                    String str2 = zzgiVarR.f12910r;
                    String str3 = str;
                    boolean z11 = false;
                    if (str2 != null && !str2.equals(str3)) {
                        z11 = true;
                    }
                    zzgiVarR.f12910r = str3;
                    if (z11) {
                        zzicVar2.r().l();
                    }
                }
            });
            zzljVar.q(null, "_id", str, true, j11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z11, long j11) {
        h();
        Object objJ = ObjectWrapper.j(iObjectWrapper);
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.q(str, str2, objJ, z11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        Object zzqVar;
        h();
        e eVar = this.f12598b;
        synchronized (eVar) {
            zzqVar = (zzjq) eVar.remove(Integer.valueOf(zzcyVar.zzf()));
        }
        if (zzqVar == null) {
            zzqVar = new zzq(this, zzcyVar);
        }
        zzlj zzljVar = this.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.h();
        if (zzljVar.f13326e.remove(zzqVar)) {
            return;
        }
        zzgu zzguVar = zzljVar.f13202a.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12945i.a("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setConsent(Bundle bundle, long j11) {
    }
}
