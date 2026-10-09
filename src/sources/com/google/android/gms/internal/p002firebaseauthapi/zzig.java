package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzig implements zzbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzid f10544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzpg f10545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzoi f10546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzoi f10547d;

    public zzig(zzid zzidVar, zzpg zzpgVar, zzoi zzoiVar, zzoi zzoiVar2) {
        this.f10544a = zzidVar;
        this.f10545b = zzpgVar;
        this.f10546c = zzoiVar;
        this.f10547d = zzoiVar2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f10545b.a(bArr).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            zzoi zzoiVar = this.f10547d;
            if (!zHasNext) {
                zzoiVar.getClass();
                throw new GeneralSecurityException("decryption failed");
            }
            try {
                byte[] bArrA = ((zzid) it.next()).f10543a.a(bArr, bArr2);
                zzoiVar.getClass();
                return bArrA;
            } catch (GeneralSecurityException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzoi zzoiVar = this.f10546c;
        try {
            byte[] bArrB = this.f10544a.f10543a.b(bArr, bArr2);
            int length = bArr.length;
            zzoiVar.getClass();
            return bArrB;
        } catch (GeneralSecurityException e8) {
            zzoiVar.getClass();
            throw e8;
        }
    }
}
