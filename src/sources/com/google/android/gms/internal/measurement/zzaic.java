package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaic implements Supplier {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzaic f11409b = new zzaic();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f11410a = Suppliers.b(new zzaie());

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzaid get() {
        return (zzaid) this.f11410a.get();
    }
}
