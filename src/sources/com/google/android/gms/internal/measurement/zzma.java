package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import y.d;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f11732a = new e(0);

    public static synchronized void a() {
        e eVar = f11732a;
        Iterator it = ((d) eVar.values()).iterator();
        if (it.hasNext()) {
            ((zzma) it.next()).getClass();
            throw null;
        }
        eVar.clear();
    }
}
