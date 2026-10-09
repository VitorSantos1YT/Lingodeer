package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpi<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10830a = new HashMap();

    public final void a(zzzv zzzvVar, Object obj) throws GeneralSecurityException {
        List list;
        byte[] bArr = zzzvVar.f11062a;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        HashMap map = this.f10830a;
        if (map.containsKey(zzzvVar)) {
            list = (List) map.get(zzzvVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzzvVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
    }
}
