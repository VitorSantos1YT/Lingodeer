package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzvu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f12090a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f12091b = new WeakHashMap();

    public static void a(Throwable th2) {
        Throwable cause;
        zzxc zzxcVar;
        zzws zzwsVarZzb;
        WeakHashMap weakHashMap = f12091b;
        synchronized (weakHashMap) {
            cause = th2;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            weakHashMap.put(th2, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = f12090a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th2;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (cause2 == null) {
                zzxcVar = null;
            } else {
                weakHashMap2.put(th2, (zzww) weakHashMap2.get(cause2));
                zzxcVar = new zzxc();
            }
        }
        if (zzxcVar != null || (zzwsVarZzb = zzvy.c().f12135b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (zzwsVarZzb = zzvy.c().f12135b; zzwsVarZzb != null; zzwsVarZzb = zzwsVarZzb.zzb()) {
            arrayList.add(zzwsVarZzb);
        }
        zzvo zzvoVar = new zzvo();
        UUID uuidZzc = ((zzws) arrayList.get(0)).zzc();
        if (uuidZzc == null) {
            throw new NullPointerException("Null rootTraceId");
        }
        zzvoVar.f12082c = uuidZzc;
        ((zzws) arrayList.get(0)).getClass();
        zzvoVar.f12083d = -1L;
        zzvoVar.f12084e = (byte) 1;
        ImmutableList.Builder builderL = ImmutableList.l(arrayList.size());
        ImmutableList.Builder builderL2 = ImmutableList.l(arrayList.size());
        for (zzws zzwsVar : Lists.d(arrayList)) {
            builderL2.h(zzwsVar.zze());
            builderL.h(zzwsVar.zzh());
        }
        WeakHashMap weakHashMap3 = f12090a;
        synchronized (weakHashMap3) {
            try {
                ImmutableList immutableListJ = builderL2.j();
                if (immutableListJ == null) {
                    throw new NullPointerException("Null spansNames");
                }
                zzvoVar.f12080a = immutableListJ;
                ImmutableList immutableListJ2 = builderL.j();
                if (immutableListJ2 == null) {
                    throw new NullPointerException("Null extras");
                }
                zzvoVar.f12081b = immutableListJ2;
                weakHashMap3.put(th2, zzvoVar.a());
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
