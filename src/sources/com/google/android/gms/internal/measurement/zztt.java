package com.google.android.gms.internal.measurement;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zztt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f11990a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f11991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzru f11992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AsyncFunction f11993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f11994e;

    public zztt(Executor executor, zzru zzruVar, zzvc zzvcVar, HashMap map) {
        executor.getClass();
        this.f11991b = executor;
        zzruVar.getClass();
        this.f11992c = zzruVar;
        zzvcVar.getClass();
        map.getClass();
        this.f11994e = map;
        Preconditions.g(!map.isEmpty());
        this.f11993d = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzts
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return Futures.g(BuildConfig.VERSION_NAME);
            }
        };
    }
}
