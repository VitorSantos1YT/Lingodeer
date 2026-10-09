package com.google.common.collect;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public final class ImmutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ImmutableClassToInstanceMap f16759b = new ImmutableClassToInstanceMap(RegularImmutableMap.f17150t);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableMap f16760a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder<B> {
        public Builder() {
            new ImmutableMap.Builder();
        }
    }

    public ImmutableClassToInstanceMap(ImmutableMap immutableMap) {
        this.f16760a = immutableMap;
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: j0 */
    public final Object o0() {
        return this.f16760a;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* JADX INFO: renamed from: o0 */
    public final Map j0() {
        return this.f16760a;
    }

    public Object readResolve() {
        return isEmpty() ? f16759b : this;
    }
}
