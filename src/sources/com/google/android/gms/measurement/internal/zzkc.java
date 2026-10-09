package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkc implements Runnable {
    public final /* synthetic */ boolean H;
    public final /* synthetic */ zzlj K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f13250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13251f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f13252t;

    public zzkc(zzlj zzljVar, String str, String str2, long j11, long j12, Bundle bundle, boolean z11, boolean z12, boolean z13) {
        this.f13246a = str;
        this.f13247b = str2;
        this.f13248c = j11;
        this.f13249d = j12;
        this.f13250e = bundle;
        this.f13251f = z11;
        this.f13252t = z12;
        this.H = z13;
        this.K = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.K.p(this.f13246a, this.f13247b, this.f13248c, this.f13249d, this.f13250e, this.f13251f, this.f13252t, this.H);
    }
}
