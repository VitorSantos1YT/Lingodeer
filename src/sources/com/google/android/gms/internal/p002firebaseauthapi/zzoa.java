package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzoa extends zzbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzpx f10800a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zza extends zzcq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zzxl f10802b;

        public zza(String str, zzxl zzxlVar) {
            this.f10801a = str;
            this.f10802b = zzxlVar;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
        public final boolean a() {
            return this.f10802b != zzxl.RAW;
        }

        public final String toString() {
            String str;
            int i11 = zzoc.f10803a[this.f10802b.ordinal()];
            if (i11 == 1) {
                str = "TINK";
            } else if (i11 == 2) {
                str = "LEGACY";
            } else if (i11 != 3) {
                str = i11 != 4 ? "UNKNOWN" : "CRUNCHY";
            } else {
                str = "RAW";
            }
            return a.h("(typeUrl=", this.f10801a, ", outputPrefixType=", str, ")");
        }
    }

    public zzoa(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
        int i11 = zzoc.f10804b[zzpxVar.f10848d.ordinal()];
        if (i11 == 1 || i11 == 2) {
            zzcw.a(zzcwVar);
        }
        this.f10800a = zzpxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final zzcq a() {
        zzpx zzpxVar = this.f10800a;
        return new zza(zzpxVar.f10845a, zzpxVar.f10849e);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10800a.f10850f;
    }

    public final zzzv c() {
        zzpx zzpxVar = this.f10800a;
        zzxl zzxlVar = zzpxVar.f10849e;
        Integer num = zzpxVar.f10850f;
        zzxl zzxlVar2 = zzpxVar.f10849e;
        if (zzxlVar.equals(zzxl.RAW)) {
            return zzzv.a(new byte[0]);
        }
        if (zzxlVar2.equals(zzxl.TINK)) {
            return zzoz.b(num.intValue());
        }
        if (zzxlVar2.equals(zzxl.LEGACY) || zzxlVar2.equals(zzxl.CRUNCHY)) {
            return zzoz.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
