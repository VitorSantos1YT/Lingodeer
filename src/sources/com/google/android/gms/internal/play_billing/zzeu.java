package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zzeu f12365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzeu f12366c = new zzeu(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f12367a;

    public zzeu() {
        this.f12367a = new HashMap();
    }

    public static zzeu a() {
        zzeu zzeuVar = f12365b;
        if (zzeuVar != null) {
            return zzeuVar;
        }
        synchronized (zzeu.class) {
            try {
                zzeu zzeuVar2 = f12365b;
                if (zzeuVar2 != null) {
                    return zzeuVar2;
                }
                zzgs zzgsVar = zzgs.f12418c;
                zzeu zzeuVarB = zzfc.b();
                f12365b = zzeuVarB;
                return zzeuVarB;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public zzeu(int i11) {
        this.f12367a = Collections.EMPTY_MAP;
    }
}
