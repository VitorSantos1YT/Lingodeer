package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f13362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlu f13363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzlu f13364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzmb f13366e;

    public zzlv(zzmb zzmbVar, Bundle bundle, zzlu zzluVar, zzlu zzluVar2, long j11) {
        this.f13362a = bundle;
        this.f13363b = zzluVar;
        this.f13364c = zzluVar2;
        this.f13365d = j11;
        Objects.requireNonNull(zzmbVar);
        this.f13366e = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = this.f13362a;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzmb zzmbVar = this.f13366e;
        zzpp zzppVar = zzmbVar.f13202a.f13102i;
        zzic.k(zzppVar);
        Bundle bundleQ = zzppVar.q("screen_view", bundle, null, false);
        zzmbVar.m(this.f13363b, this.f13364c, this.f13365d, true, bundleQ);
    }
}
