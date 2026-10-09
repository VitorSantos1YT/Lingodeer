package com.google.android.gms.measurement;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzpp;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zza extends zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzic f13687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzlj f13688b;

    public zza(zzic zzicVar) {
        Preconditions.g(zzicVar);
        this.f13687a = zzicVar;
        zzlj zzljVar = zzicVar.m;
        zzic.l(zzljVar);
        this.f13688b = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void a(String str, String str2, Bundle bundle) {
        this.f13688b.k(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void b(Bundle bundle) {
        this.f13688b.v(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void c(String str) {
        zzic zzicVar = this.f13687a;
        zzd zzdVar = zzicVar.f13106n;
        zzic.j(zzdVar);
        zzicVar.f13104k.getClass();
        zzdVar.i(SystemClock.elapsedRealtime(), str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void d(String str) {
        zzic zzicVar = this.f13687a;
        zzd zzdVar = zzicVar.f13106n;
        zzic.j(zzdVar);
        zzicVar.f13104k.getClass();
        zzdVar.h(SystemClock.elapsedRealtime(), str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void e(String str, String str2, Bundle bundle) {
        zzlj zzljVar = this.f13687a.m;
        zzic.l(zzljVar);
        zzljVar.x(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List f(String str, String str2) {
        return this.f13688b.y(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int g(String str) {
        this.f13688b.u(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map h(String str, String str2, boolean z11) {
        return this.f13688b.s(str, str2, z11);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        return this.f13688b.z();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        return this.f13688b.A();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        return (String) this.f13688b.f13328g.get();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        return this.f13688b.B();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        zzpp zzppVar = this.f13687a.f13102i;
        zzic.k(zzppVar);
        return zzppVar.f0();
    }
}
