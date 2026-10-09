package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgx implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzgw f12955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f12957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f12958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f12960f;

    public /* synthetic */ zzgx(String str, zzgw zzgwVar, int i11, IOException iOException, byte[] bArr, Map map) {
        Preconditions.g(zzgwVar);
        this.f12955a = zzgwVar;
        this.f12956b = i11;
        this.f12957c = iOException;
        this.f12958d = bArr;
        this.f12959e = str;
        this.f12960f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12955a.a(this.f12959e, this.f12956b, this.f12957c, this.f12958d, this.f12960f);
    }
}
