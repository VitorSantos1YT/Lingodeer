package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzof implements zzbl {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashMap f10806a = new HashMap();
    }

    static {
        zza zzaVar = new zza();
        HashMap map = zzaVar.f10806a;
        if (map == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Collections.unmodifiableMap(map);
        zzaVar.f10806a = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzof) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
