package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzyw<JcePrimitiveT> implements zzyz<JcePrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzzb f11045a;

    public zzyw(zzzb zzzbVar) {
        this.f11045a = zzzbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyz
    public final Object zza(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        zzyv zzyvVar = zzyv.f11039b;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            Provider provider = Security.getProvider(strArr[i12]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            try {
                return this.f11045a.a(str, (Provider) obj);
            } catch (Exception e8) {
                if (exc == null) {
                    exc = e8;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
