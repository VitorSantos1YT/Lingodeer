package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zznd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10764a = new Object();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {
    }

    public zznd() {
        new zza();
    }

    public static zzne a(String str) throws GeneralSecurityException {
        zzne zzneVar;
        try {
            synchronized (f10764a) {
                try {
                    zzneVar = new zzne(zzzq.a(str));
                    byte[] bArrA = zzpz.a(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(bArrA, zzneVar.a(zzneVar.b(bArrA, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzneVar;
        } catch (IOException e8) {
            throw new GeneralSecurityException(e8);
        }
    }

    public static boolean b(String str) {
        synchronized (f10764a) {
            try {
                String strA = zzzq.a(str);
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (keyStore.containsAlias(strA)) {
                        return false;
                    }
                    KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strA, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpecBuild);
                    keyGenerator.generateKey();
                    return true;
                } catch (IOException e8) {
                    throw new GeneralSecurityException(e8);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
