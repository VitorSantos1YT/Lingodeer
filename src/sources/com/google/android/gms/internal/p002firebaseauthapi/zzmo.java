package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzmo implements zzbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzpg f10744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzoi f10745b;

    public zzmo(zzpg zzpgVar, zzoi zzoiVar) {
        this.f10744a = zzpgVar;
        this.f10745b = zzoiVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        Iterator it = this.f10744a.a(bArr).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            zzoi zzoiVar = this.f10745b;
            if (!zHasNext) {
                zzoiVar.getClass();
                throw new GeneralSecurityException("decryption failed");
            }
            try {
                byte[] bArrZza = ((zzmp) it.next()).f10746a.zza(bArr);
                zzoiVar.getClass();
                return bArrZza;
            } catch (GeneralSecurityException unused) {
            }
        }
    }
}
