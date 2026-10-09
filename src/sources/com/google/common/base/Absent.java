package com.google.common.base;

import com.google.common.collect.FluentIterable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class Absent<T> extends Optional<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Absent f16327a = new Absent();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    private Object readResolve() {
        return f16327a;
    }

    @Override // com.google.common.base.Optional
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public final boolean c() {
        return false;
    }

    @Override // com.google.common.base.Optional
    public final Object e(Supplier supplier) {
        return supplier.get();
    }

    @Override // com.google.common.base.Optional
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.Optional
    public final Object g() {
        return null;
    }

    @Override // com.google.common.base.Optional
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.common.base.Optional
    public final Object f(FluentIterable fluentIterable) {
        return fluentIterable;
    }
}
