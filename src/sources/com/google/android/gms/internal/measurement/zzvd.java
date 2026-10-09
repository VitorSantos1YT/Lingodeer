package com.google.android.gms.internal.measurement;

import com.google.android.material.datepicker.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzvd extends zzve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzafc f12058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzadf f12059b;

    public zzvd(zzafc zzafcVar, zzadf zzadfVar) {
        this.f12058a = zzafcVar;
        if (zzadfVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.f12059b = zzadfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    public final zzafc a() {
        return this.f12058a;
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    public final zzadf b() {
        return this.f12059b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzve)) {
            return false;
        }
        zzve zzveVar = (zzve) obj;
        return this.f12058a.equals(zzveVar.a()) && this.f12059b.equals(zzveVar.b());
    }

    public final int hashCode() {
        return ((this.f12058a.hashCode() ^ 1000003) * 1000003) ^ this.f12059b.hashCode();
    }

    public final String toString() {
        String string = this.f12058a.toString();
        int length = string.length();
        String string2 = this.f12059b.toString();
        StringBuilder sb2 = new StringBuilder(length + 53 + string2.length() + 1);
        d.w(sb2, "ProtoSerializer{defaultValue=", string, ", extensionRegistryLite=", string2);
        sb2.append("}");
        return sb2.toString();
    }
}
