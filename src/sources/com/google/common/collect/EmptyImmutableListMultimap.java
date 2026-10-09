package com.google.common.collect;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {
    public static final EmptyImmutableListMultimap H = new EmptyImmutableListMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableListMultimap() {
        super(RegularImmutableMap.f17150t, 0);
    }

    private Object readResolve() {
        return H;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Map Y() {
        return this.f16798f;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: j */
    public final ImmutableMap Y() {
        return this.f16798f;
    }
}
