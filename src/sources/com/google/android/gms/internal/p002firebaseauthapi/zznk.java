package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zznk<E extends Enum<E>, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10778b;

    public zznk(Map map, Map map2) {
        this.f10777a = map;
        this.f10778b = map2;
    }

    public static zznn a() {
        return new zznn(0);
    }

    public final Enum b(Object obj) throws GeneralSecurityException {
        Enum r9 = (Enum) this.f10778b.get(obj);
        if (r9 != null) {
            return r9;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object c(Enum r9) throws GeneralSecurityException {
        Object obj = this.f10777a.get(r9);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r9)));
    }
}
