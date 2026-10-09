package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzadf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zzadf f11253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzadf f11254c = new zzadf(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f11255a;

    public zzadf() {
        this.f11255a = new HashMap();
    }

    public static zzadf a() {
        zzadf zzadfVar = f11253b;
        if (zzadfVar != null) {
            return zzadfVar;
        }
        synchronized (zzadf.class) {
            try {
                zzadf zzadfVar2 = f11253b;
                if (zzadfVar2 != null) {
                    return zzadfVar2;
                }
                int i11 = zzacf.f11197a;
                zzadf zzadfVarB = zzadn.b();
                f11253b = zzadfVarB;
                return zzadfVarB;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public zzadf(int i11) {
        this.f11255a = Collections.EMPTY_MAP;
    }
}
