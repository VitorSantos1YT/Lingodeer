package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzlk;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzd implements zzlk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzez f17798a;

    public zzd(zzez zzezVar) {
        this.f17798a = zzezVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void a(String str, String str2, Bundle bundle) {
        this.f17798a.h(str, str2, bundle, true);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void b(Bundle bundle) {
        this.f17798a.m(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void c(String str) {
        this.f17798a.s(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void d(String str) {
        this.f17798a.r(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void e(String str, String str2, Bundle bundle) {
        this.f17798a.n(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List f(String str, String str2) {
        return this.f17798a.o(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int g(String str) {
        return this.f17798a.d(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map h(String str, String str2, boolean z11) {
        return this.f17798a.c(str, str2, z11);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        return this.f17798a.a();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        return this.f17798a.b();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        return this.f17798a.v();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        return this.f17798a.u();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        return this.f17798a.w();
    }
}
