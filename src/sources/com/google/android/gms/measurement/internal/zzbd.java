package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f12696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f12697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f12698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f12699k;

    public zzbd(String str, String str2, long j11, long j12, long j13, long j14, long j15, Long l9, Long l11, Long l12, Boolean bool) {
        Preconditions.d(str);
        Preconditions.d(str2);
        Preconditions.b(j11 >= 0);
        Preconditions.b(j12 >= 0);
        Preconditions.b(j13 >= 0);
        Preconditions.b(j15 >= 0);
        this.f12689a = str;
        this.f12690b = str2;
        this.f12691c = j11;
        this.f12692d = j12;
        this.f12693e = j13;
        this.f12694f = j14;
        this.f12695g = j15;
        this.f12696h = l9;
        this.f12697i = l11;
        this.f12698j = l12;
        this.f12699k = bool;
    }

    public final zzbd a(long j11) {
        return new zzbd(this.f12689a, this.f12690b, this.f12691c, this.f12692d, this.f12693e, j11, this.f12695g, this.f12696h, this.f12697i, this.f12698j, this.f12699k);
    }

    public final zzbd b(Long l9, Long l11, Boolean bool) {
        return new zzbd(this.f12689a, this.f12690b, this.f12691c, this.f12692d, this.f12693e, this.f12694f, this.f12695g, this.f12696h, l9, l11, bool);
    }
}
