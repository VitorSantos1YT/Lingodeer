package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzgu f12937d;

    public zzgs(zzgu zzguVar, int i11, boolean z11, boolean z12) {
        this.f12937d = zzguVar;
        this.f12934a = i11;
        this.f12935b = z11;
        this.f12936c = z12;
    }

    public final void a(String str) {
        this.f12937d.p(this.f12934a, this.f12935b, this.f12936c, str, null, null, null);
    }

    public final void b(Object obj, String str) {
        this.f12937d.p(this.f12934a, this.f12935b, this.f12936c, str, obj, null, null);
    }

    public final void c(Object obj, Object obj2, String str) {
        this.f12937d.p(this.f12934a, this.f12935b, this.f12936c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f12937d.p(this.f12934a, this.f12935b, this.f12936c, str, obj, obj2, obj3);
    }
}
