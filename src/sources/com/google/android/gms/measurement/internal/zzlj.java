package com.google.android.gms.measurement.internal;

import am.rVFB.LwKl;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import dt.Xk.wuoM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import qy.b0;
import s9.a;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlj extends zzg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzky f13324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzjp f13325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f13326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f13328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f13329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public zzjx f13332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public zzju f13333l;
    public PriorityQueue m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zzjl f13334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicLong f13335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f13336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zzx f13337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zzkg f13339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SharedPreferences.OnSharedPreferenceChangeListener f13340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public zzkb f13341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final zzkn f13342v;

    public zzlj(zzic zzicVar) {
        super(zzicVar);
        this.f13326e = new CopyOnWriteArraySet();
        this.f13329h = new Object();
        this.f13330i = false;
        this.f13331j = 1;
        this.f13338r = true;
        this.f13342v = new zzkn(this);
        this.f13328g = new AtomicReference();
        this.f13334n = zzjl.f13204c;
        this.f13336p = -1L;
        this.f13335o = new AtomicLong(0L);
        this.f13337q = new zzx(zzicVar);
    }

    public final String A() {
        zzmb zzmbVar = this.f13202a.f13105l;
        zzic.l(zzmbVar);
        zzlu zzluVar = zzmbVar.f13383c;
        if (zzluVar != null) {
            return zzluVar.f13356b;
        }
        return null;
    }

    public final String B() {
        zzic zzicVar = this.f13202a;
        try {
            return zzlt.a(zzicVar.f13094a, zzicVar.f13108p);
        } catch (IllegalStateException e8) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.b(e8, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void C(zzjl zzjlVar, long j11, boolean z11) {
        int i11 = zzjlVar.f13206b;
        g();
        h();
        zzic zzicVar = this.f13202a;
        zzhh zzhhVar = zzicVar.f13098e;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.k(zzhhVar);
        zzjl zzjlVarN = zzhhVar.n();
        if (j11 <= this.f13336p && zzjl.l(zzjlVarN.f13206b, i11)) {
            zzic.m(zzguVar);
            zzguVar.f12948l.b(zzjlVar, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        zzhh zzhhVar2 = zzicVar.f13098e;
        zzic.k(zzhhVar2);
        zzhhVar2.g();
        if (!zzjl.l(i11, zzhhVar2.k().getInt("consent_source", 100))) {
            zzic.m(zzguVar);
            zzguVar.f12948l.b(Integer.valueOf(i11), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = zzhhVar2.k().edit();
        editorEdit.putString("consent_settings", zzjlVar.g());
        editorEdit.putInt("consent_source", i11);
        editorEdit.apply();
        zzic.m(zzguVar);
        zzguVar.f12949n.b(zzjlVar, "Setting storage consent(FE)");
        this.f13336p = j11;
        if (zzicVar.p().q()) {
            final zznl zznlVarP = zzicVar.p();
            zznlVarP.g();
            zznlVarP.h();
            zznlVarP.u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznk
                @Override // java.lang.Runnable
                public final void run() {
                    zznl zznlVar = zznlVarP;
                    zzic zzicVar2 = zznlVar.f13202a;
                    zzgb zzgbVar = zznlVar.f13489d;
                    if (zzgbVar == null) {
                        zzgu zzguVar2 = zzicVar2.f13099f;
                        zzic.m(zzguVar2);
                        zzguVar2.f12942f.a("Failed to send storage consent settings to service");
                        return;
                    }
                    try {
                        zzgbVar.e0(zznlVar.w(false));
                        zznlVar.t();
                    } catch (RemoteException e8) {
                        zzgu zzguVar3 = zzicVar2.f13099f;
                        zzic.m(zzguVar3);
                        zzguVar3.f12942f.b(e8, "Failed to send storage consent settings to the service");
                    }
                }
            });
        } else {
            zznl zznlVarP2 = zzicVar.p();
            zznlVarP2.g();
            zznlVarP2.h();
            if (zznlVarP2.p()) {
                zznlVarP2.u(new zzms(zznlVarP2, zznlVarP2.w(false)));
            }
        }
        if (z11) {
            zzicVar.p().k(new AtomicReference());
        }
    }

    public final void D(Boolean bool, boolean z11) {
        g();
        h();
        zzic zzicVar = this.f13202a;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzguVar.m.b(bool, "Setting app measurement enabled (FE)");
        zzhh zzhhVar = zzicVar.f13098e;
        zzic.k(zzhhVar);
        zzhhVar.g();
        SharedPreferences.Editor editorEdit = zzhhVar.k().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z11) {
            zzhhVar.g();
            SharedPreferences.Editor editorEdit2 = zzhhVar.k().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        if (zzicVar.f13118z || !(bool == null || bool.booleanValue())) {
            E();
        }
    }

    public final void E() {
        g();
        zzic zzicVar = this.f13202a;
        zzhh zzhhVar = zzicVar.f13098e;
        zzgu zzguVar = zzicVar.f13099f;
        DefaultClock defaultClock = zzicVar.f13104k;
        zzic.k(zzhhVar);
        String strA = zzhhVar.m.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                defaultClock.getClass();
                r(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strA) ? 0L : 1L);
                defaultClock.getClass();
                r(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!zzicVar.d() || !this.f13338r) {
            zzic.m(zzguVar);
            zzguVar.m.a("Updating Scion state (FE)");
            zznl zznlVarP = zzicVar.p();
            zznlVarP.g();
            zznlVarP.h();
            zznlVarP.u(new zzmr(zznlVarP, zznlVarP.w(true)));
            return;
        }
        zzic.m(zzguVar);
        zzguVar.m.a("Recording app launch after enabling measurement for the first time (FE)");
        t();
        zzoc zzocVar = zzicVar.f13101h;
        zzic.l(zzocVar);
        zzocVar.f13538e.a();
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzjz(this));
    }

    public final void F() {
        zzic zzicVar = this.f13202a;
        if (!(zzicVar.f13094a.getApplicationContext() instanceof Application) || this.f13324c == null) {
            return;
        }
        ((Application) zzicVar.f13094a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f13324c);
    }

    public final void H(zzba zzbaVar, boolean z11) {
        zzkt zzktVar = new zzkt(this, zzbaVar);
        if (z11) {
            g();
            zzktVar.run();
        } else {
            zzhz zzhzVar = this.f13202a.f13100g;
            zzic.m(zzhzVar);
            zzhzVar.p(zzktVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:69:0x0109
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void I(com.google.android.gms.measurement.internal.zzjl r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.I(com.google.android.gms.measurement.internal.zzjl, boolean):void");
    }

    public final void J() {
        zzaif.a();
        zzic zzicVar = this.f13202a;
        zzal zzalVar = zzicVar.f13097d;
        zzhz zzhzVar = zzicVar.f13100g;
        zzgu zzguVar = zzicVar.f13099f;
        if (zzalVar.r(null, zzfy.P0)) {
            zzic.m(zzhzVar);
            if (zzhzVar.m()) {
                zzic.m(zzguVar);
                zzguVar.f12942f.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (zzae.a()) {
                zzic.m(zzguVar);
                zzguVar.f12942f.a("Cannot get trigger URIs from main thread");
                return;
            }
            h();
            zzic.m(zzguVar);
            zzguVar.f12949n.a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzic.m(zzhzVar);
            zzhzVar.q(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzla
                @Override // java.lang.Runnable
                public final void run() {
                    zzlj zzljVar = this.f13310a;
                    zzhh zzhhVar = zzljVar.f13202a.f13098e;
                    zzic.k(zzhhVar);
                    final Bundle bundleA = zzhhVar.f13030n.a();
                    final zznl zznlVarP = zzljVar.f13202a.p();
                    zznlVarP.g();
                    zznlVarP.h();
                    final zzr zzrVarW = zznlVarP.w(false);
                    final AtomicReference atomicReference2 = atomicReference;
                    zznlVarP.u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznh
                        @Override // java.lang.Runnable
                        public final void run() {
                            zznl zznlVar = zznlVarP;
                            AtomicReference atomicReference3 = atomicReference2;
                            zzr zzrVar = zzrVarW;
                            Bundle bundle = bundleA;
                            synchronized (atomicReference3) {
                                try {
                                    zzgb zzgbVar = zznlVar.f13489d;
                                    if (zzgbVar != null) {
                                        zzgbVar.m0(zzrVar, bundle, new zzme(zznlVar, atomicReference3));
                                        zznlVar.t();
                                    } else {
                                        zzgu zzguVar2 = zznlVar.f13202a.f13099f;
                                        zzic.m(zzguVar2);
                                        zzguVar2.f12942f.a("Failed to request trigger URIs; not connected to service");
                                    }
                                } catch (RemoteException e8) {
                                    zzgu zzguVar3 = zznlVar.f13202a.f13099f;
                                    zzic.m(zzguVar3);
                                    zzguVar3.f12942f.b(e8, "Failed to request trigger URIs; remote exception");
                                    atomicReference3.notifyAll();
                                }
                            }
                        }
                    });
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzic.m(zzguVar);
                zzguVar.f12944h.a("Timed out waiting for get trigger URIs");
            } else {
                zzic.m(zzhzVar);
                zzhzVar.p(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzlj zzljVar = this.f13312a;
                        zzljVar.g();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        zzhh zzhhVar = zzljVar.f13202a.f13098e;
                        zzic.k(zzhhVar);
                        SparseArray sparseArrayM = zzhhVar.m();
                        for (zzoh zzohVar : list) {
                            int i11 = zzohVar.f13547c;
                            if (!sparseArrayM.contains(i11) || ((Long) sparseArrayM.get(i11)).longValue() < zzohVar.f13546b) {
                                zzljVar.K().add(zzohVar);
                            }
                        }
                        zzljVar.L();
                    }
                });
            }
        }
    }

    public final PriorityQueue K() {
        if (this.m == null) {
            this.m = new PriorityQueue(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.zzlc
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return Long.valueOf(((zzoh) obj).f13546b);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.zzld
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.m;
    }

    public final void L() {
        zzoh zzohVar;
        g();
        if (K().isEmpty() || this.f13330i || (zzohVar = (zzoh) K().poll()) == null) {
            return;
        }
        zzic zzicVar = this.f13202a;
        zzpp zzppVar = zzicVar.f13102i;
        zzic.k(zzppVar);
        a aVarC = zzppVar.C();
        if (aVarC != null) {
            this.f13330i = true;
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzgs zzgsVar = zzguVar.f12949n;
            String str = zzohVar.f13545a;
            zzgsVar.b(str, "Registering trigger URI");
            ListenableFuture<b0> listenableFutureE = aVarC.e(Uri.parse(str));
            if (listenableFutureE != null) {
                Futures.a(listenableFutureE, new zzjw(this, zzohVar), new zzjv(this));
            } else {
                this.f13330i = false;
                K().add(zzohVar);
            }
        }
    }

    public final void M(zzjl zzjlVar) {
        g();
        boolean z11 = (zzjlVar.i(zzjk.ANALYTICS_STORAGE) && zzjlVar.i(zzjk.AD_STORAGE)) || this.f13202a.p().p();
        zzic zzicVar = this.f13202a;
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        if (z11 != zzicVar.f13118z) {
            zzhz zzhzVar2 = zzicVar.f13100g;
            zzic.m(zzhzVar2);
            zzhzVar2.g();
            zzicVar.f13118z = z11;
            zzhh zzhhVar = this.f13202a.f13098e;
            zzic.k(zzhhVar);
            zzhhVar.g();
            Boolean boolValueOf = zzhhVar.k().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzhhVar.k().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z11 || boolValueOf == null || boolValueOf.booleanValue()) {
                D(Boolean.valueOf(z11), false);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean j() {
        return false;
    }

    public final void k(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        zzic zzicVar = this.f13202a;
        zzicVar.f13104k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzicVar.f13097d.r(null, zzfy.e1)) {
            zzicVar.f13104k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        l(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final void m() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.m():void");
    }

    public final void n(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        g();
        zzic zzicVar = this.f13202a;
        zzicVar.f13104k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzicVar.f13097d.r(null, zzfy.e1)) {
            zzicVar.f13104k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        o(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    public final void o(long j11, long j12, Bundle bundle, String str, String str2) {
        g();
        boolean z11 = true;
        if (this.f13325d != null && !zzpp.L(str2)) {
            z11 = false;
        }
        p(str, str2, j11, j12, bundle, true, z11, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final void q(String str, String str2, Object obj, boolean z11, long j11) {
        int iQ0;
        int length;
        zzic zzicVar = this.f13202a;
        if (z11) {
            zzpp zzppVar = zzicVar.f13102i;
            zzic.k(zzppVar);
            iQ0 = zzppVar.q0(str2);
        } else {
            zzpp zzppVar2 = zzicVar.f13102i;
            zzic.k(zzppVar2);
            if (!zzppVar2.k0("user property", str2)) {
                iQ0 = 6;
            } else if (zzppVar2.m0("user property", zzjo.f13218a, null, str2)) {
                zzppVar2.f13202a.getClass();
                if (zzppVar2.n0(24, "user property", str2)) {
                    iQ0 = 0;
                } else {
                    iQ0 = 6;
                }
            } else {
                iQ0 = 15;
            }
        }
        zzkn zzknVar = this.f13342v;
        if (iQ0 != 0) {
            zzic.k(zzicVar.f13102i);
            String strN = zzpp.n(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            zzic.k(zzicVar.f13102i);
            zzpp.y(zzknVar, null, iQ0, "_ev", strN, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            String str4 = str3;
            zzhz zzhzVar = zzicVar.f13100g;
            zzic.m(zzhzVar);
            zzhzVar.p(new zzkd(this, str4, str2, null, j11));
            return;
        }
        zzpp zzppVar3 = zzicVar.f13102i;
        zzic.k(zzppVar3);
        int iV = zzppVar3.v(obj, str2);
        if (iV != 0) {
            zzic.k(zzppVar3);
            String strN2 = zzpp.n(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            zzic.k(zzicVar.f13102i);
            zzpp.y(zzknVar, null, iV, "_ev", strN2, length);
            return;
        }
        zzic.k(zzppVar3);
        Object objW = zzppVar3.w(obj, str2);
        if (objW != null) {
            zzhz zzhzVar2 = zzicVar.f13100g;
            zzic.m(zzhzVar2);
            zzhzVar2.p(new zzkd(this, str3, str2, objW, j11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    public final void r(long j11, Object obj, String str, String str2) {
        String str3;
        boolean zN;
        Object objValueOf = obj;
        Preconditions.d(str);
        Preconditions.d(str2);
        g();
        h();
        boolean zEquals = "allow_personalized_ads".equals(str2);
        zzic zzicVar = this.f13202a;
        if (zEquals) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j12 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j12);
                    zzhh zzhhVar = zzicVar.f13098e;
                    zzic.k(zzhhVar);
                    zzhhVar.m.b(j12 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    zzhh zzhhVar2 = zzicVar.f13098e;
                    zzic.k(zzhhVar2);
                    zzhhVar2.m.b("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                zzhh zzhhVar3 = zzicVar.f13098e;
                zzic.k(zzhhVar3);
                zzhhVar3.m.b("unset");
            } else {
                str4 = str2;
            }
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.c("non_personalized_ads(_npa)", objValueOf, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!zzicVar.d()) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12949n.a("User property not set since app measurement is disabled");
            return;
        }
        if (zzicVar.h()) {
            zzpl zzplVar = new zzpl(j11, obj2, str3, str);
            zznl zznlVarP = zzicVar.p();
            zznlVarP.g();
            zznlVarP.h();
            zznlVarP.s();
            zzgl zzglVarO = zznlVarP.f13202a.o();
            zzglVarO.getClass();
            Parcel parcelObtain = Parcel.obtain();
            zzpm.a(zzplVar, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                zzgu zzguVar3 = zzglVarO.f13202a.f13099f;
                zzic.m(zzguVar3);
                zzguVar3.f12943g.a("User property too long for local database. Sending directly to service");
                zN = false;
            } else {
                zN = zzglVarO.n(bArrMarshall, 1);
            }
            zznlVarP.u(new zzmg(zznlVarP, zznlVarP.w(true), zN, zzplVar));
        }
    }

    public final Map s(String str, String str2, boolean z11) {
        zzic zzicVar = this.f13202a;
        zzhz zzhzVar = zzicVar.f13100g;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzhzVar);
        if (zzhzVar.m()) {
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (zzae.a()) {
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        zzhz zzhzVar2 = zzicVar.f13100g;
        zzic.m(zzhzVar2);
        zzhzVar2.q(atomicReference, 5000L, "get user properties", new zzkl(this, atomicReference, str, str2, z11));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            zzic.m(zzguVar);
            zzguVar.f12942f.b(Boolean.valueOf(z11), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        e eVar = new e(list.size());
        for (zzpl zzplVar : list) {
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                eVar.put(zzplVar.f13634b, objZza);
            }
        }
        return eVar;
    }

    public final void u(String str) {
        Preconditions.d(str);
        this.f13202a.getClass();
    }

    public final void v(Bundle bundle) {
        this.f13202a.f13104k.getClass();
        w(bundle, System.currentTimeMillis());
    }

    public final void w(Bundle bundle, long j11) {
        Preconditions.g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean zIsEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        zzic zzicVar = this.f13202a;
        if (!zIsEmpty) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        zzjh.b(bundle2, "app_id", String.class, null);
        zzjh.b(bundle2, OSSHeaders.ORIGIN, String.class, null);
        zzjh.b(bundle2, "name", String.class, null);
        zzjh.b(bundle2, "value", Object.class, null);
        zzjh.b(bundle2, "trigger_event_name", String.class, null);
        zzjh.b(bundle2, "trigger_timeout", Long.class, 0L);
        zzjh.b(bundle2, "timed_out_event_name", String.class, null);
        zzjh.b(bundle2, "timed_out_event_params", Bundle.class, null);
        zzjh.b(bundle2, "triggered_event_name", String.class, null);
        zzjh.b(bundle2, "triggered_event_params", Bundle.class, null);
        zzjh.b(bundle2, "time_to_live", Long.class, 0L);
        zzjh.b(bundle2, "expired_event_name", String.class, null);
        zzjh.b(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.d(bundle2.getString("name"));
        Preconditions.d(bundle2.getString(OSSHeaders.ORIGIN));
        Preconditions.g(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j11);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        zzpp zzppVar = zzicVar.f13102i;
        zzgn zzgnVar = zzicVar.f13103j;
        zzgu zzguVar2 = zzicVar.f13099f;
        zzic.k(zzppVar);
        if (zzppVar.q0(string) != 0) {
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(zzgnVar.c(string), "Invalid conditional user property name");
            return;
        }
        zzic.k(zzppVar);
        if (zzppVar.v(obj, string) != 0) {
            zzic.m(zzguVar2);
            zzguVar2.f12942f.c(zzgnVar.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objW = zzppVar.w(obj, string);
        if (objW == null) {
            zzic.m(zzguVar2);
            zzguVar2.f12942f.c(zzgnVar.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        zzjh.a(bundle2, objW);
        long j12 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j12 > 15552000000L || j12 < 1)) {
            zzic.m(zzguVar2);
            zzguVar2.f12942f.c(zzgnVar.c(string), Long.valueOf(j12), "Invalid conditional user property timeout");
            return;
        }
        long j13 = bundle2.getLong("time_to_live");
        if (j13 > 15552000000L || j13 < 1) {
            zzic.m(zzguVar2);
            zzguVar2.f12942f.c(zzgnVar.c(string), Long.valueOf(j13), "Invalid conditional user property time to live");
        } else {
            zzhz zzhzVar = zzicVar.f13100g;
            zzic.m(zzhzVar);
            zzhzVar.p(new zzki(this, bundle2));
        }
    }

    public final void x(String str, String str2, Bundle bundle) {
        zzic zzicVar = this.f13202a;
        zzicVar.f13104k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Preconditions.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzkj(this, bundle2));
    }

    public final ArrayList y(String str, String str2) {
        zzic zzicVar = this.f13202a;
        zzhz zzhzVar = zzicVar.f13100g;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzhzVar);
        if (zzhzVar.m()) {
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (zzae.a()) {
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        zzhz zzhzVar2 = zzicVar.f13100g;
        zzic.m(zzhzVar2);
        zzhzVar2.q(atomicReference, 5000L, "get conditional user properties", new zzkk(this, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzpp.b0(list);
        }
        zzic.m(zzguVar);
        zzguVar.f12942f.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    public final String z() {
        zzmb zzmbVar = this.f13202a.f13105l;
        zzic.l(zzmbVar);
        zzlu zzluVar = zzmbVar.f13383c;
        if (zzluVar != null) {
            return zzluVar.f13355a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r6 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        if (r7 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.l(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025d  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:121:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:138:0x0390  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:146:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:147:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:149:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:153:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:156:0x0403  */
    /* JADX WARN: Code duplicated, block: B:161:0x0410  */
    /* JADX WARN: Code duplicated, block: B:163:0x041a  */
    /* JADX WARN: Code duplicated, block: B:165:0x041f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0427  */
    /* JADX WARN: Code duplicated, block: B:171:0x046e  */
    /* JADX WARN: Code duplicated, block: B:172:0x047e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0491  */
    /* JADX WARN: Code duplicated, block: B:178:0x049d A[LOOP:2: B:176:0x0497->B:178:0x049d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:94:0x020a  */
    public final void p(String str, String str2, long j11, long j12, Bundle bundle, boolean z11, boolean z12, boolean z13) {
        String str3;
        zzhh zzhhVar;
        zzkn zzknVar;
        boolean z14;
        zzic zzicVar;
        int iO0;
        String str4;
        Bundle bundleQ;
        zzhh zzhhVar2;
        zzmb zzmbVar;
        long j13;
        String strA;
        ArrayList arrayList;
        zzhh zzhhVar3;
        boolean zA;
        Bundle[] bundleArr;
        int i11;
        long j14;
        long j15;
        ArrayList arrayList2;
        int size;
        int i12;
        int i13;
        Bundle bundleN;
        String str5;
        Bundle bundle2;
        zzgl zzglVarO;
        byte[] bArrMarshall;
        boolean zN;
        Iterator it;
        String str6;
        Object obj;
        Bundle[] bundleArr2;
        int length;
        int i14;
        String str7 = str;
        Preconditions.d(str7);
        Preconditions.g(bundle);
        g();
        h();
        zzic zzicVar2 = this.f13202a;
        boolean zD = zzicVar2.d();
        zzoc zzocVar = zzicVar2.f13101h;
        zzal zzalVar = zzicVar2.f13097d;
        Context context = zzicVar2.f13094a;
        zzpp zzppVar = zzicVar2.f13102i;
        zzgu zzguVar = zzicVar2.f13099f;
        if (!zD) {
            zzic.m(zzguVar);
            zzguVar.m.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = zzicVar2.r().f12904k;
        if (list != null && !list.contains(str2)) {
            zzic.m(zzguVar);
            zzguVar.m.c(str2, str7, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.f13327f) {
            this.f13327f = true;
            try {
                try {
                    (!zzicVar2.f13095b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e8) {
                    zzic.m(zzguVar);
                    zzguVar.f12945i.b(e8, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                zzic.m(zzguVar);
                zzguVar.f12948l.a("Tag Manager is not found and thus will not be used");
            }
        }
        zzgn zzgnVar = zzicVar2.f13103j;
        zzhh zzhhVar4 = zzicVar2.f13098e;
        DefaultClock defaultClock = zzicVar2.f13104k;
        if (!zzalVar.r(null, zzfy.Z0) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            defaultClock.getClass();
            str3 = null;
            r(System.currentTimeMillis(), string, ypOOxsaJG.zNZQtzOD, "_lgclid");
        } else {
            str3 = null;
        }
        if (!z11 || zzpp.f13646j[0].equals(str2)) {
            zzhhVar = zzhhVar4;
        } else {
            zzic.k(zzppVar);
            zzic.k(zzhhVar4);
            zzhhVar = zzhhVar4;
            zzppVar.t(bundle, zzhhVar.f13041y.a());
        }
        zzkn zzknVar2 = this.f13342v;
        if (!z13 && !"_iap".equals(str2)) {
            zzic.k(zzppVar);
            int i15 = 2;
            if (!zzppVar.k0("event", str2)) {
                i14 = 40;
            } else if (zzppVar.m0("event", zzjm.f13207a, zzppVar.f13202a.f13097d.r(str3, zzfy.f1) ? zzjm.f13209c : zzjm.f13208b, str2)) {
                i14 = 40;
                if (zzppVar.n0(40, "event", str2)) {
                    i15 = 0;
                }
            } else {
                i15 = 13;
                i14 = 40;
            }
            if (i15 != 0) {
                zzic.m(zzguVar);
                zzguVar.f12944h.b(zzgnVar.a(str2), "Invalid public event name. Event will not be logged (FE)");
                zzic.k(zzppVar);
                zzpp.y(zzknVar2, null, i15, "_ev", zzpp.n(i14, str2, true), str2 != null ? str2.length() : 0);
                return;
            }
        }
        zzmb zzmbVar2 = zzicVar2.f13105l;
        zzic.l(zzmbVar2);
        zzlu zzluVarK = zzmbVar2.k(false);
        if (zzluVarK != null && !bundle.containsKey("_sc")) {
            zzluVarK.f13358d = true;
        }
        zzpp.d0(zzluVarK, bundle, z11 && !z13);
        boolean zEquals = "am".equals(str7);
        boolean zL = zzpp.L(str2);
        if (z11) {
            zzknVar = zzknVar2;
            if (this.f13325d != null && !zL) {
                if (!zEquals) {
                    zzic.m(zzguVar);
                    zzguVar.m.c(zzgnVar.a(str2), zzgnVar.e(bundle), "Passing event to registered event handler (FE)");
                    Preconditions.g(this.f13325d);
                    this.f13325d.a(j11, bundle, str7, str2);
                    return;
                }
                z14 = true;
            }
            if (zzicVar2.h()) {
                zzic.k(zzppVar);
                zzicVar = zzppVar.f13202a;
                iO0 = zzppVar.o0(str2);
                if (iO0 != 0) {
                    zzic.m(zzguVar);
                    zzguVar.f12944h.b(zzgnVar.a(str2), "Invalid event name. Event will not be logged (FE)");
                    String strN = zzpp.n(40, str2, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    zzic.k(zzppVar);
                    zzpp.y(zzknVar, null, iO0, "_ev", strN, length);
                    return;
                }
                str4 = "_o";
                bundleQ = zzppVar.q(str2, bundle, CollectionUtils.a("_o", "_sn", "_sc", "_si"), z13);
                Preconditions.g(bundleQ);
                zzic.l(zzmbVar2);
                if (zzmbVar2.k(false) == null && "_ae".equals(str2)) {
                    zzic.l(zzocVar);
                    zzoa zzoaVar = zzocVar.f13539f;
                    j13 = 0;
                    zzoaVar.f13534d.f13202a.f13104k.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    zzhhVar2 = zzhhVar;
                    zzmbVar = zzmbVar2;
                    long j16 = jElapsedRealtime - zzoaVar.f13532b;
                    zzoaVar.f13532b = jElapsedRealtime;
                    if (j16 > 0) {
                        zzppVar.T(bundleQ, j16);
                    }
                } else {
                    zzhhVar2 = zzhhVar;
                    zzmbVar = zzmbVar2;
                    j13 = 0;
                }
                if ("auto".equals(str7) && "_ssr".equals(str2)) {
                    String string2 = bundleQ.getString("_ffr");
                    int i16 = Strings.f9128a;
                    if (string2 == null || string2.trim().isEmpty()) {
                        string2 = null;
                    } else if (string2 != null) {
                        string2 = string2.trim();
                    }
                    zzhh zzhhVar5 = zzicVar.f13098e;
                    zzic.k(zzhhVar5);
                    if (Objects.equals(string2, zzhhVar5.f13038v.a())) {
                        zzgu zzguVar2 = zzicVar.f13099f;
                        zzic.m(zzguVar2);
                        zzguVar2.m.a("Not logging duplicate session_start_with_rollout event");
                        return;
                    } else {
                        zzhh zzhhVar6 = zzicVar.f13098e;
                        zzic.k(zzhhVar6);
                        zzhhVar6.f13038v.b(string2);
                    }
                } else if ("_ae".equals(str2)) {
                    zzhh zzhhVar7 = zzicVar.f13098e;
                    zzic.k(zzhhVar7);
                    strA = zzhhVar7.f13038v.a();
                    if (!TextUtils.isEmpty(strA)) {
                        bundleQ.putString("_ffr", strA);
                    }
                }
                arrayList = new ArrayList();
                arrayList.add(bundleQ);
                if (zzalVar.r(null, zzfy.S0)) {
                    zzic.l(zzocVar);
                    zzocVar.g();
                    zA = zzocVar.f13537d;
                    zzhhVar3 = zzhhVar2;
                } else {
                    zzic.k(zzhhVar2);
                    zzhhVar3 = zzhhVar2;
                    zA = zzhhVar3.f13035s.a();
                }
                zzic.k(zzhhVar3);
                if (zzhhVar3.f13032p.a() <= j13 && zzhhVar3.p(j11) && zA) {
                    zzic.m(zzguVar);
                    zzguVar.f12949n.a("Current session is expired, remove the session number, ID, and engagement time");
                    defaultClock.getClass();
                    i11 = 0;
                    bundleArr = null;
                    j14 = j13;
                    j15 = j11;
                    r(System.currentTimeMillis(), null, "auto", "_sid");
                    defaultClock.getClass();
                    r(System.currentTimeMillis(), null, "auto", "_sno");
                    defaultClock.getClass();
                    r(System.currentTimeMillis(), null, "auto", "_se");
                    zzhhVar3.f13033q.b(j14);
                } else {
                    bundleArr = null;
                    i11 = 0;
                    j14 = j13;
                    j15 = j11;
                }
                if (bundleQ.getLong("extend_session", j14) == 1) {
                    zzic.m(zzguVar);
                    zzguVar.f12949n.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    zzic.l(zzocVar);
                    zzocVar.f13538e.b(j15, j12);
                }
                arrayList2 = new ArrayList(bundleQ.keySet());
                Collections.sort(arrayList2);
                size = arrayList2.size();
                for (i12 = i11; i12 < size; i12++) {
                    str6 = (String) arrayList2.get(i12);
                    if (str6 != null) {
                        zzic.k(zzppVar);
                        obj = bundleQ.get(str6);
                        if (obj instanceof Bundle) {
                            Bundle[] bundleArr3 = new Bundle[1];
                            bundleArr3[i11] = (Bundle) obj;
                            bundleArr2 = bundleArr3;
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr2 = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr2 = bundleArr;
                        }
                        if (bundleArr2 != null) {
                            bundleQ.putParcelableArray(str6, bundleArr2);
                        }
                    }
                }
                i13 = i11;
                while (i13 < arrayList.size()) {
                    ArrayList arrayList4 = arrayList;
                    bundleN = (Bundle) arrayList4.get(i13);
                    if (i13 != 0) {
                        str5 = "_ep";
                    } else {
                        str5 = str2;
                    }
                    String str8 = str4;
                    bundleN.putString(str8, str7);
                    if (z12) {
                        bundleN = zzppVar.N(bundleN);
                    }
                    bundle2 = bundleN;
                    zzbh zzbhVar = new zzbh(str5, new zzbf(bundleN), str7, j15, j12);
                    zznl zznlVarP = zzicVar2.p();
                    zznlVarP.getClass();
                    zznlVarP.g();
                    zznlVarP.h();
                    zznlVarP.s();
                    zzglVarO = zznlVarP.f13202a.o();
                    zzglVarO.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    zzbi.a(zzbhVar, parcelObtain, i11);
                    bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    if (bArrMarshall.length > 131072) {
                        zzgu zzguVar3 = zzglVarO.f13202a.f13099f;
                        zzic.m(zzguVar3);
                        zzguVar3.f12943g.a("Event is too long for local database. Sending event directly to service");
                        zN = false;
                    } else {
                        zN = zzglVarO.n(bArrMarshall, 0);
                    }
                    zznlVarP.u(new zzmt(zznlVarP, zznlVarP.w(true), zN, zzbhVar));
                    if (!z14) {
                        it = this.f13326e.iterator();
                        while (it.hasNext()) {
                            ((zzjq) it.next()).a(j11, new Bundle(bundle2), str, str2);
                        }
                    }
                    i13++;
                    str7 = str;
                    j15 = j11;
                    arrayList = arrayList4;
                    str4 = str8;
                    i11 = 0;
                }
                zzic.l(zzmbVar);
                if (zzmbVar.k(false) == null && "_ae".equals(str2)) {
                    zzic.l(zzocVar);
                    defaultClock.getClass();
                    zzocVar.f13539f.a(SystemClock.elapsedRealtime(), true, true);
                    return;
                }
            }
            return;
        }
        zzknVar = zzknVar2;
        z14 = zEquals;
        if (zzicVar2.h()) {
            return;
        }
        zzic.k(zzppVar);
        zzicVar = zzppVar.f13202a;
        iO0 = zzppVar.o0(str2);
        if (iO0 != 0) {
            zzic.m(zzguVar);
            zzguVar.f12944h.b(zzgnVar.a(str2), "Invalid event name. Event will not be logged (FE)");
            String strN2 = zzpp.n(40, str2, true);
            if (str2 != null) {
                length = str2.length();
            } else {
                length = 0;
            }
            zzic.k(zzppVar);
            zzpp.y(zzknVar, null, iO0, "_ev", strN2, length);
            return;
        }
        str4 = "_o";
        bundleQ = zzppVar.q(str2, bundle, CollectionUtils.a("_o", "_sn", "_sc", "_si"), z13);
        Preconditions.g(bundleQ);
        zzic.l(zzmbVar2);
        if (zzmbVar2.k(false) == null) {
            zzhhVar2 = zzhhVar;
            zzmbVar = zzmbVar2;
            j13 = 0;
        } else {
            zzhhVar2 = zzhhVar;
            zzmbVar = zzmbVar2;
            j13 = 0;
        }
        if ("auto".equals(str7)) {
            if ("_ae".equals(str2)) {
                zzhh zzhhVar8 = zzicVar.f13098e;
                zzic.k(zzhhVar8);
                strA = zzhhVar8.f13038v.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleQ.putString("_ffr", strA);
                }
            }
        } else if ("_ae".equals(str2)) {
            zzhh zzhhVar9 = zzicVar.f13098e;
            zzic.k(zzhhVar9);
            strA = zzhhVar9.f13038v.a();
            if (!TextUtils.isEmpty(strA)) {
                bundleQ.putString("_ffr", strA);
            }
        }
        arrayList = new ArrayList();
        arrayList.add(bundleQ);
        if (zzalVar.r(null, zzfy.S0)) {
            zzic.l(zzocVar);
            zzocVar.g();
            zA = zzocVar.f13537d;
            zzhhVar3 = zzhhVar2;
        } else {
            zzic.k(zzhhVar2);
            zzhhVar3 = zzhhVar2;
            zA = zzhhVar3.f13035s.a();
        }
        zzic.k(zzhhVar3);
        if (zzhhVar3.f13032p.a() <= j13) {
            bundleArr = null;
            i11 = 0;
            j14 = j13;
            j15 = j11;
        } else {
            bundleArr = null;
            i11 = 0;
            j14 = j13;
            j15 = j11;
        }
        if (bundleQ.getLong("extend_session", j14) == 1) {
            zzic.m(zzguVar);
            zzguVar.f12949n.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
            zzic.l(zzocVar);
            zzocVar.f13538e.b(j15, j12);
        }
        arrayList2 = new ArrayList(bundleQ.keySet());
        Collections.sort(arrayList2);
        size = arrayList2.size();
        while (i12 < size) {
            str6 = (String) arrayList2.get(i12);
            if (str6 != null) {
                zzic.k(zzppVar);
                obj = bundleQ.get(str6);
                if (obj instanceof Bundle) {
                    Bundle[] bundleArr4 = new Bundle[1];
                    bundleArr4[i11] = (Bundle) obj;
                    bundleArr2 = bundleArr4;
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                    bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArr2, parcelableArr2.length, Bundle[].class);
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList5 = (ArrayList) obj;
                    bundleArr2 = (Bundle[]) arrayList5.toArray(new Bundle[arrayList5.size()]);
                } else {
                    bundleArr2 = bundleArr;
                }
                if (bundleArr2 != null) {
                    bundleQ.putParcelableArray(str6, bundleArr2);
                }
            }
        }
        i13 = i11;
        while (i13 < arrayList.size()) {
            ArrayList arrayList6 = arrayList;
            bundleN = (Bundle) arrayList6.get(i13);
            if (i13 != 0) {
                str5 = "_ep";
            } else {
                str5 = str2;
            }
            String str9 = str4;
            bundleN.putString(str9, str7);
            if (z12) {
                bundleN = zzppVar.N(bundleN);
            }
            bundle2 = bundleN;
            zzbh zzbhVar2 = new zzbh(str5, new zzbf(bundleN), str7, j15, j12);
            zznl zznlVarP2 = zzicVar2.p();
            zznlVarP2.getClass();
            zznlVarP2.g();
            zznlVarP2.h();
            zznlVarP2.s();
            zzglVarO = zznlVarP2.f13202a.o();
            zzglVarO.getClass();
            Parcel parcelObtain2 = Parcel.obtain();
            zzbi.a(zzbhVar2, parcelObtain2, i11);
            bArrMarshall = parcelObtain2.marshall();
            parcelObtain2.recycle();
            if (bArrMarshall.length > 131072) {
                zzgu zzguVar4 = zzglVarO.f13202a.f13099f;
                zzic.m(zzguVar4);
                zzguVar4.f12943g.a("Event is too long for local database. Sending event directly to service");
                zN = false;
            } else {
                zN = zzglVarO.n(bArrMarshall, 0);
            }
            zznlVarP2.u(new zzmt(zznlVarP2, zznlVarP2.w(true), zN, zzbhVar2));
            if (!z14) {
                it = this.f13326e.iterator();
                while (it.hasNext()) {
                    ((zzjq) it.next()).a(j11, new Bundle(bundle2), str, str2);
                }
            }
            i13++;
            str7 = str;
            j15 = j11;
            arrayList = arrayList6;
            str4 = str9;
            i11 = 0;
        }
        zzic.l(zzmbVar);
        if (zzmbVar.k(false) == null) {
        }
    }

    public final void G(Bundle bundle, int i11, long j11) throws Throwable {
        Object obj;
        String string;
        h();
        zzjl zzjlVar = zzjl.f13204c;
        zzjk[] zzjkVarArrB = zzjj.STORAGE.b();
        int length = zzjkVarArrB.length;
        int i12 = 0;
        while (true) {
            obj = null;
            if (i12 >= length) {
                break;
            }
            String str = zzjkVarArrB[i12].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i12++;
        }
        zzic zzicVar = this.f13202a;
        if (obj != null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12947k.b(obj, "Ignoring invalid consent setting");
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12947k.a("Valid consent values are 'granted', 'denied'");
        }
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        boolean zM = zzhzVar.m();
        zzjl zzjlVarB = zzjl.b(i11, bundle);
        Iterator it = zzjlVarB.f13205a.values().iterator();
        while (it.hasNext()) {
            if (((zzji) it.next()) != zzji.UNINITIALIZED) {
                I(zzjlVarB, zM);
                break;
            }
        }
        zzba zzbaVarC = zzba.c(i11, bundle);
        Iterator it2 = zzbaVarC.f12679e.values().iterator();
        while (it2.hasNext()) {
            if (((zzji) it2.next()) != zzji.UNINITIALIZED) {
                H(zzbaVarC, zM);
                break;
            }
        }
        Boolean boolD = zzba.d(bundle);
        if (boolD != null) {
            String str2 = i11 == -30 ? "tcf" : LwKl.KYfsWzPDAlizPd;
            if (zM) {
                r(j11, boolD.toString(), str2, "allow_personalized_ads");
            } else {
                q(str2, bjXGJ.ngcCmxKXo, boolD.toString(), false, j11);
            }
        }
    }

    public final void t() {
        g();
        h();
        zzic zzicVar = this.f13202a;
        if (zzicVar.h()) {
            zzal zzalVar = zzicVar.f13097d;
            zzalVar.f13202a.getClass();
            Boolean boolT = zzalVar.t("google_analytics_deferred_deep_link_enabled");
            if (boolT != null && boolT.booleanValue()) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.m.a("Deferred Deep Link feature enabled.");
                zzhz zzhzVar = zzicVar.f13100g;
                zzic.m(zzhzVar);
                zzhzVar.p(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzlj zzljVar = this.f13321a;
                        zzljVar.g();
                        zzic zzicVar2 = zzljVar.f13202a;
                        zzhh zzhhVar = zzicVar2.f13098e;
                        zzgu zzguVar2 = zzicVar2.f13099f;
                        zzic.k(zzhhVar);
                        zzhc zzhcVar = zzhhVar.f13036t;
                        if (zzhcVar.a()) {
                            zzic.m(zzguVar2);
                            zzguVar2.m.a("Deferred Deep Link already retrieved. Not fetching again.");
                            return;
                        }
                        zzhe zzheVar = zzhhVar.f13037u;
                        long jA = zzheVar.a();
                        zzheVar.b(1 + jA);
                        if (jA >= 5) {
                            zzic.m(zzguVar2);
                            zzguVar2.f12945i.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                            zzhcVar.b(true);
                        } else {
                            if (zzljVar.f13339s == null) {
                                zzljVar.f13339s = new zzkg(zzljVar, zzicVar2);
                            }
                            zzljVar.f13339s.b(0L);
                        }
                    }
                });
            }
            zznl zznlVarP = zzicVar.p();
            zznlVarP.g();
            zznlVarP.h();
            zzr zzrVarW = zznlVarP.w(true);
            zznlVarP.s();
            zzic zzicVar2 = zznlVarP.f13202a;
            zzicVar2.f13097d.r(null, zzfy.W0);
            zzicVar2.o().n(new byte[0], 3);
            zznlVarP.u(new zzmk(zznlVarP, zzrVarW));
            this.f13338r = false;
            zzhh zzhhVar = zzicVar.f13098e;
            zzic.k(zzhhVar);
            zzhhVar.g();
            String string = zzhhVar.k().getString("previous_os_version", null);
            zzhhVar.f13202a.q().i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzhhVar.k().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                zzicVar.q().i();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString(wuoM.UDgQJRmikVUHPoG, string);
                    n("auto", "_ou", bundle);
                }
            }
        }
    }
}
