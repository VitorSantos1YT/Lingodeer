package com.google.android.gms.internal.fido;

import ep.a;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdp extends zzdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9704a;

    public zzdp(String str) {
        this.f9704a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzdr zzdrVar = (zzdr) obj;
        int iZza = zzdrVar.zza();
        int iA = zzdr.a((byte) 96);
        if (iA != iZza) {
            return iA - zzdrVar.zza();
        }
        String str = this.f9704a;
        int length = str.length();
        String str2 = ((zzdp) zzdrVar).f9704a;
        return length != str2.length() ? str.length() - str2.length() : str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdp.class == obj.getClass()) {
            return this.f9704a.equals(((zzdp) obj).f9704a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzdr.a((byte) 96)), this.f9704a});
    }

    public final String toString() {
        return a.g("\"", this.f9704a, "\"");
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    public final int zza() {
        return zzdr.a((byte) 96);
    }
}
