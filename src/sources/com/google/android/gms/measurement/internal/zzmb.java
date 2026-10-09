package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmb extends zzg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile zzlu f13383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile zzlu f13384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzlu f13385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f13386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.zzdd f13387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f13388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile zzlu f13389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zzlu f13390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13391k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f13392l;

    public zzmb(zzic zzicVar) {
        super(zzicVar);
        this.f13392l = new Object();
        this.f13386f = new ConcurrentHashMap();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean j() {
        return false;
    }

    public final zzlu k(boolean z11) {
        h();
        g();
        if (!z11) {
            return this.f13385e;
        }
        zzlu zzluVar = this.f13385e;
        return zzluVar != null ? zzluVar : this.f13390j;
    }

    public final String l(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : BuildConfig.VERSION_NAME;
        int length2 = str2.length();
        zzic zzicVar = this.f13202a;
        zzicVar.f13097d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        zzicVar.f13097d.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    public final void m(zzlu zzluVar, zzlu zzluVar2, long j11, boolean z11, Bundle bundle) {
        boolean z12;
        long j12;
        long jElapsedRealtime;
        Bundle bundle2;
        boolean z13 = zzluVar.f13359e;
        g();
        boolean z14 = false;
        if (zzluVar2 != null) {
            if (zzluVar2.f13357c == zzluVar.f13357c && Objects.equals(zzluVar2.f13356b, zzluVar.f13356b) && Objects.equals(zzluVar2.f13355a, zzluVar.f13355a)) {
                z12 = false;
            } else {
                z12 = true;
            }
        } else {
            z12 = true;
        }
        if (z11 && this.f13385e != null) {
            z14 = true;
        }
        zzic zzicVar = this.f13202a;
        if (z12) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzpp.d0(zzluVar, bundle3, true);
            if (zzluVar2 != null) {
                String str = zzluVar2.f13355a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = zzluVar2.f13356b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", zzluVar2.f13357c);
            }
            if (z14) {
                zzoc zzocVar = zzicVar.f13101h;
                zzic.l(zzocVar);
                zzoa zzoaVar = zzocVar.f13539f;
                long j13 = j11 - zzoaVar.f13532b;
                zzoaVar.f13532b = j11;
                if (j13 > 0) {
                    zzpp zzppVar = zzicVar.f13102i;
                    zzic.k(zzppVar);
                    zzppVar.T(bundle3, j13);
                }
            }
            zzal zzalVar = zzicVar.f13097d;
            DefaultClock defaultClock = zzicVar.f13104k;
            if (!zzalVar.v()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z13 ? "auto" : "app";
            defaultClock.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z13) {
                long j14 = zzluVar.f13360f;
                if (j14 != 0) {
                    j12 = j14;
                } else {
                    j12 = jCurrentTimeMillis;
                }
            } else {
                j12 = jCurrentTimeMillis;
            }
            if (zzicVar.f13097d.r(null, zzfy.e1)) {
                defaultClock.getClass();
                jElapsedRealtime = SystemClock.elapsedRealtime();
            } else {
                jElapsedRealtime = 0;
            }
            if (z13) {
                bundle2 = bundle3;
                long j15 = zzluVar.f13361g;
                if (j15 != 0) {
                    jElapsedRealtime = j15;
                }
            } else {
                bundle2 = bundle3;
            }
            zzlj zzljVar = zzicVar.m;
            zzic.l(zzljVar);
            zzljVar.o(j12, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z14) {
            p(this.f13385e, true, j11);
        }
        this.f13385e = zzluVar;
        if (z13) {
            this.f13390j = zzluVar;
        }
        zznl zznlVarP = zzicVar.p();
        zznlVarP.g();
        zznlVarP.h();
        zznlVarP.u(new zzmn(zznlVarP, zzluVar));
    }

    public final void n(com.google.android.gms.internal.measurement.zzdd zzddVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.f13202a.f13097d.v() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f13386f.put(Integer.valueOf(zzddVar.f11502a), new zzlu(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void o(String str, zzlu zzluVar, boolean z11) {
        zzlu zzluVar2;
        zzlu zzluVar3 = this.f13383c == null ? this.f13384d : this.f13383c;
        if (zzluVar.f13356b == null) {
            zzluVar2 = new zzlu(zzluVar.f13355a, str != null ? l(str) : null, zzluVar.f13357c, zzluVar.f13359e, zzluVar.f13360f, zzluVar.f13361g);
        } else {
            zzluVar2 = zzluVar;
        }
        this.f13384d = this.f13383c;
        this.f13383c = zzluVar2;
        zzic zzicVar = this.f13202a;
        zzicVar.f13104k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new zzlw(this, zzluVar2, zzluVar3, jElapsedRealtime, z11));
    }

    public final void p(zzlu zzluVar, boolean z11, long j11) {
        zzic zzicVar = this.f13202a;
        zzd zzdVar = zzicVar.f13106n;
        zzic.j(zzdVar);
        zzicVar.f13104k.getClass();
        zzdVar.j(SystemClock.elapsedRealtime());
        boolean z12 = zzluVar != null && zzluVar.f13358d;
        zzoc zzocVar = zzicVar.f13101h;
        zzic.l(zzocVar);
        if (!zzocVar.f13539f.a(j11, z12, z11) || zzluVar == null) {
            return;
        }
        zzluVar.f13358d = false;
    }

    public final zzlu q(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        Preconditions.g(zzddVar);
        Integer numValueOf = Integer.valueOf(zzddVar.f11502a);
        ConcurrentHashMap concurrentHashMap = this.f13386f;
        zzlu zzluVar = (zzlu) concurrentHashMap.get(numValueOf);
        if (zzluVar == null) {
            String strL = l(zzddVar.f11503b);
            zzpp zzppVar = this.f13202a.f13102i;
            zzic.k(zzppVar);
            zzlu zzluVar2 = new zzlu(null, strL, zzppVar.f0());
            concurrentHashMap.put(numValueOf, zzluVar2);
            zzluVar = zzluVar2;
        }
        return this.f13389i != null ? this.f13389i : zzluVar;
    }
}
