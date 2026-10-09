package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhh extends zzjf {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pair f13019z = new Pair(BuildConfig.VERSION_NAME, 0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f13020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f13021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzhf f13022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzhe f13023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzhg f13024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f13027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zzhe f13028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zzhc f13029l;
    public final zzhg m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zzhd f13030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final zzhc f13031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zzhe f13032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zzhe f13033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zzhc f13035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zzhc f13036t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final zzhe f13037u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final zzhg f13038v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zzhg f13039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zzhe f13040x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zzhd f13041y;

    public zzhh(zzic zzicVar) {
        super(zzicVar);
        this.f13028k = new zzhe(this, "session_timeout", 1800000L);
        this.f13029l = new zzhc(this, "start_new_session", true);
        this.f13032p = new zzhe(this, "last_pause_time", 0L);
        this.f13033q = new zzhe(this, "session_id", 0L);
        this.m = new zzhg(this, "non_personalized_ads");
        this.f13030n = new zzhd(this, "last_received_uri_timestamps_by_source");
        this.f13031o = new zzhc(this, "allow_remote_dynamite", false);
        this.f13023f = new zzhe(this, "first_open_time", 0L);
        new zzhe(this, "app_install_time", 0L);
        this.f13024g = new zzhg(this, "app_instance_id");
        this.f13035s = new zzhc(this, "app_backgrounded", false);
        this.f13036t = new zzhc(this, "deep_link_retrieval_complete", false);
        this.f13037u = new zzhe(this, "deep_link_retrieval_attempts", 0L);
        this.f13038v = new zzhg(this, "firebase_feature_rollouts");
        this.f13039w = new zzhg(this, "deferred_attribution_cache");
        this.f13040x = new zzhe(this, "deferred_attribution_cache_timestamp", 0L);
        this.f13041y = new zzhd(this, "default_event_parameters");
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean h() {
        return true;
    }

    public final SharedPreferences k() {
        g();
        i();
        Preconditions.g(this.f13020c);
        return this.f13020c;
    }

    public final SharedPreferences l() {
        g();
        i();
        if (this.f13021d == null) {
            zzic zzicVar = this.f13202a;
            String strValueOf = String.valueOf(zzicVar.f13094a.getPackageName());
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzgs zzgsVar = zzguVar.f12949n;
            String strConcat = strValueOf.concat("_preferences");
            zzgsVar.b(strConcat, "Default prefs file");
            this.f13021d = zzicVar.f13094a.getSharedPreferences(strConcat, 0);
        }
        return this.f13021d;
    }

    public final SparseArray m() {
        Bundle bundleA = this.f13030n.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i11 = 0; i11 < intArray.length; i11++) {
            sparseArray.put(intArray[i11], Long.valueOf(longArray[i11]));
        }
        return sparseArray;
    }

    public final zzjl n() {
        g();
        return zzjl.c(k().getInt("consent_source", 100), k().getString("consent_settings", "G1"));
    }

    public final void o(boolean z11) {
        g();
        zzgu zzguVar = this.f13202a.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12949n.b(Boolean.valueOf(z11), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = k().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z11);
        editorEdit.apply();
    }

    public final boolean p(long j11) {
        return j11 - this.f13028k.a() > this.f13032p.a();
    }
}
