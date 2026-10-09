package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahn implements Supplier {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzahn f11389b = new zzahn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f11390a = Suppliers.b(new zzahp());

    public static void a() {
        ((zzaho) f11389b.f11390a.get()).getClass();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzaho) this.f11390a.get();
    }
}
