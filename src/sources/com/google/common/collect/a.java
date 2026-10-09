package com.google.common.collect;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17305a;

    public /* synthetic */ a(int i11) {
        this.f17305a = i11;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f17305a) {
            case 0:
                int i11 = CollectCollectors.f16628a;
                return new CollectCollectors.EnumSetAccumulator(0);
            case 1:
                return new MoreCollectors.ToOptionalState();
            case 2:
                int i12 = ImmutableSet.f16842c;
                return new ImmutableSet.Builder();
            case 3:
                ImmutableRangeSet immutableRangeSet = ImmutableRangeSet.f16827b;
                return new ImmutableRangeSet.Builder();
            default:
                UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
                return new ImmutableList.Builder();
        }
    }
}
