package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzne implements zzbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbm f10765a;

    public zzne(String str) throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f10765a = new zznb(str, keyStore);
        } catch (IOException e8) {
            throw new GeneralSecurityException(e8);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws BadPaddingException {
        zzbm zzbmVar = this.f10765a;
        try {
            return ((zznb) zzbmVar).a(bArr, bArr2);
        } catch (BadPaddingException e8) {
            throw e8;
        } catch (GeneralSecurityException | ProviderException unused) {
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused2) {
            }
            return ((zznb) zzbmVar).a(bArr, bArr2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        zzbm zzbmVar = this.f10765a;
        try {
            return ((zznb) zzbmVar).b(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException unused) {
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused2) {
            }
            return ((zznb) zzbmVar).b(bArr, bArr2);
        }
    }
}
