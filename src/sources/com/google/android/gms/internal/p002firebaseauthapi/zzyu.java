package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzyu<JcePrimitiveT> implements zzyz<JcePrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzzb f11038a;

    public zzyu(zzzb zzzbVar) {
        this.f11038a = zzzbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyz
    public final Object zza(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        zzyv zzyvVar = zzyv.f11039b;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            Provider provider = Security.getProvider(strArr[i12]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (true) {
            zzzb zzzbVar = this.f11038a;
            if (i11 >= size) {
                return zzzbVar.a(str, null);
            }
            Object obj = arrayList.get(i11);
            i11++;
            try {
                return zzzbVar.a(str, (Provider) obj);
            } catch (Exception e8) {
                if (exc == null) {
                    exc = e8;
                }
            }
        }
    }
}
