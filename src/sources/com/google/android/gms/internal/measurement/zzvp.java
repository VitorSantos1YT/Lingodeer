package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableList;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzvp extends zzww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f12085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList f12086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f12087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12088d;

    public /* synthetic */ zzvp(ImmutableList immutableList, ImmutableList immutableList2, UUID uuid, long j11) {
        this.f12085a = immutableList;
        this.f12086b = immutableList2;
        this.f12087c = uuid;
        this.f12088d = j11;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final ImmutableList a() {
        return this.f12085a;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final ImmutableList b() {
        return this.f12086b;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final UUID c() {
        return this.f12087c;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final long d() {
        return this.f12088d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzww)) {
            return false;
        }
        zzww zzwwVar = (zzww) obj;
        return this.f12085a.equals(zzwwVar.a()) && this.f12086b.equals(zzwwVar.b()) && this.f12087c.equals(zzwwVar.c()) && this.f12088d == zzwwVar.d();
    }

    public final int hashCode() {
        int iHashCode = ((((this.f12085a.hashCode() ^ 1000003) * 1000003) ^ this.f12086b.hashCode()) * 1000003) ^ this.f12087c.hashCode();
        long j11 = this.f12088d;
        return (iHashCode * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }
}
