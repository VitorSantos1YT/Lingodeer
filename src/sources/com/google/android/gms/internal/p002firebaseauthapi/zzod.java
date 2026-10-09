package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzod extends zzcq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzpw f10805a;

    public zzod(zzpw zzpwVar) {
        this.f10805a = zzpwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10805a.f10844b.C() != zzxl.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzod)) {
            return false;
        }
        zzpw zzpwVar = ((zzod) obj).f10805a;
        zzpw zzpwVar2 = this.f10805a;
        zzxl zzxlVarC = zzpwVar2.f10844b.C();
        zzwn zzwnVar = zzpwVar.f10844b;
        zzwn zzwnVar2 = zzpwVar.f10844b;
        return zzxlVarC.equals(zzwnVar.C()) && zzpwVar2.f10844b.E().equals(zzwnVar2.E()) && zzpwVar2.f10844b.D().equals(zzwnVar2.D());
    }

    public final int hashCode() {
        zzpw zzpwVar = this.f10805a;
        return Objects.hash(zzpwVar.f10844b, zzpwVar.f10843a);
    }

    public final String toString() {
        String str;
        zzpw zzpwVar = this.f10805a;
        String strE = zzpwVar.f10844b.E();
        int i11 = zzog.f10807a[zzpwVar.f10844b.C().ordinal()];
        if (i11 == 1) {
            str = "TINK";
        } else if (i11 == 2) {
            str = "LEGACY";
        } else if (i11 != 3) {
            str = i11 != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return a.h("(typeUrl=", strE, ", outputPrefixType=", str, ")");
    }
}
