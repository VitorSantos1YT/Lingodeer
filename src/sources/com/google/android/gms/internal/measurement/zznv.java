package com.google.android.gms.internal.measurement;

import com.google.android.material.datepicker.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zznv extends zzqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zznd f11764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzqr f11765b;

    public zznv(zznd zzndVar, zzqr zzqrVar) {
        this.f11764a = zzndVar;
        this.f11765b = zzqrVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzqo
    public final zznd a() {
        return this.f11764a;
    }

    @Override // com.google.android.gms.internal.measurement.zzqo
    public final zzqr b() {
        return this.f11765b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqo)) {
            return false;
        }
        zzqo zzqoVar = (zzqo) obj;
        zznd zzndVar = this.f11764a;
        if (zzndVar == null) {
            if (zzqoVar.a() != null) {
                return false;
            }
        } else if (!zzndVar.equals(zzqoVar.a())) {
            return false;
        }
        return this.f11765b.equals(zzqoVar.b());
    }

    public final int hashCode() {
        zznd zzndVar = this.f11764a;
        return (((zzndVar == null ? 0 : zzndVar.hashCode()) ^ 1000003) * 1000003) ^ this.f11765b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11764a);
        String string = this.f11765b.toString();
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        d.w(sb2, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb2.append("}");
        return sb2.toString();
    }
}
