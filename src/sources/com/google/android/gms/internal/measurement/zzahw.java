package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahw implements Supplier {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzahw f11401b = new zzahw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f11402a = Suppliers.b(new zzahy());

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzahx) this.f11402a.get();
    }
}
