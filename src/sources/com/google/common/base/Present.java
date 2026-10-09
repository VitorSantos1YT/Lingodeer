package com.google.common.base;

import com.google.common.collect.FluentIterable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16383a;

    public Present(Object obj) {
        this.f16383a = obj;
    }

    @Override // com.google.common.base.Optional
    public final Object b() {
        return this.f16383a;
    }

    @Override // com.google.common.base.Optional
    public final boolean c() {
        return true;
    }

    @Override // com.google.common.base.Optional
    public final Object e(Supplier supplier) {
        return this.f16383a;
    }

    @Override // com.google.common.base.Optional
    public final boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.f16383a.equals(((Present) obj).f16383a);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public final Object f(FluentIterable fluentIterable) {
        return this.f16383a;
    }

    @Override // com.google.common.base.Optional
    public final Object g() {
        return this.f16383a;
    }

    @Override // com.google.common.base.Optional
    public final int hashCode() {
        return this.f16383a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f16383a + ")";
    }
}
