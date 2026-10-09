package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzyf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f12178a = new ConcurrentHashMap();

    public abstract Object a();

    public final Object b(zzyd zzydVar, zzzj zzzjVar) {
        ConcurrentHashMap concurrentHashMap = this.f12178a;
        Object obj = concurrentHashMap.get(zzydVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(zzydVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iA = zzzjVar.a();
        zzye zzyeVar = null;
        for (int i11 = 0; i11 < iA; i11++) {
            if (zzxx.f12157f.equals(zzzjVar.b(i11))) {
                Object objC = zzzjVar.c(i11);
                if (objC instanceof zzyj) {
                    if (zzyeVar == null) {
                        zzyeVar = new zzye(this, zzydVar);
                    }
                    ((zzyj) objC).a();
                }
            }
        }
        return objA;
    }
}
