package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzex extends zzde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzez f10416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzv f10417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f10418c;

    public zzex(zzez zzezVar, zzzv zzzvVar, Integer num) {
        this.f10416a = zzezVar;
        this.f10417b = zzzvVar;
        this.f10418c = num;
    }

    public static zzex e(zzez zzezVar, Integer num) throws GeneralSecurityException {
        zzzv zzzvVarA;
        zzez.zza zzaVar = zzezVar.f10420b;
        if (zzaVar == zzez.zza.f10421b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzzvVarA = zzzv.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzaVar != zzez.zza.f10422c) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzaVar)));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzzvVarA = zzzv.a(new byte[0]);
        }
        return new zzex(zzezVar, zzzvVarA, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10416a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10418c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdg a() {
        return this.f10416a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    public final zzzv d() {
        return this.f10417b;
    }
}
