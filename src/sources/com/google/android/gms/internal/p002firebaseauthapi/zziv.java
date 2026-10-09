package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zziv implements zzhg {
    public final Cipher a() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) zziw.f10565a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e8) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e8);
        }
    }
}
