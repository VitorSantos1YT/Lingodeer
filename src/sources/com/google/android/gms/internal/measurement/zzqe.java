package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Supplier f11844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Supplier f11845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Supplier f11846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f11847e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f11848f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11849g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile ListenableFuture f11850h = null;

    public zzqe(Context context, Supplier supplier, Supplier supplier2, Supplier supplier3) {
        this.f11843a = context;
        this.f11844b = supplier;
        this.f11845c = supplier2;
        this.f11846d = supplier3;
    }
}
