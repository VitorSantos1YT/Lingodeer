package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzao {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zzat f11445j = new zzat();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final zzam f11446k = new zzam();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final zzag f11447l = new zzag("continue");
    public static final zzag m = new zzag("break");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final zzag f11448n = new zzag("return");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final zzaf f11449o = new zzaf(Boolean.TRUE);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final zzaf f11450p = new zzaf(Boolean.FALSE);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final zzas f11451q = new zzas(BuildConfig.VERSION_NAME);

    zzao b();

    zzao g(String str, zzg zzgVar, ArrayList arrayList);

    String zzc();

    Double zzd();

    Boolean zze();

    Iterator zzf();
}
