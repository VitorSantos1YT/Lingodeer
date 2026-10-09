package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.material.datepicker.d;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f12954e;

    public zzgv(long j11, long j12, Bundle bundle, String str, String str2) {
        this.f12950a = str;
        this.f12951b = str2;
        this.f12954e = bundle;
        this.f12952c = j11;
        this.f12953d = j12;
    }

    public static zzgv a(zzbh zzbhVar) {
        String str = zzbhVar.f12702a;
        String str2 = zzbhVar.f12704c;
        return new zzgv(zzbhVar.f12705d, zzbhVar.f12706e, zzbhVar.f12703b.G1(), str, str2);
    }

    public final zzbh b() {
        zzbf zzbfVar = new zzbf(new Bundle(this.f12954e));
        return new zzbh(this.f12950a, zzbfVar, this.f12951b, this.f12952c, this.f12953d);
    }

    public final String toString() {
        String string = this.f12954e.toString();
        String str = this.f12951b;
        int length = String.valueOf(str).length();
        String str2 = this.f12950a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        d.w(sb2, "origin=", str, ",name=", str2);
        return a.k(sb2, ",params=", string);
    }
}
