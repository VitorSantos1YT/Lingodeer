package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpg<P> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzzv f10828b = zzzv.a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10829a;

    public zzpg(HashMap map) {
        this.f10829a = map;
    }

    public final Iterable a(byte[] bArr) {
        List list;
        zzzv zzzvVar = f10828b;
        Map map = this.f10829a;
        List list2 = (List) map.get(zzzvVar);
        if (bArr.length >= 5) {
            list = (List) map.get(new zzzv(bArr, 5 > bArr.length ? bArr.length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new zzpj(this, list, list2);
    }
}
