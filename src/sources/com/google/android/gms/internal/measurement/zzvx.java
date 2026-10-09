package com.google.android.gms.internal.measurement;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzvx extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        zzrn.a(Thread.currentThread());
        zzwq zzwqVar = new zzwq();
        zzwqVar.f12134a = false;
        zzwqVar.f12135b = null;
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap = zzvy.f12094c;
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, zzwqVar);
        }
        return zzwqVar;
    }
}
