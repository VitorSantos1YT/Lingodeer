package com.google.common.graph;

import com.google.common.base.Function;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17336a;

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f17336a) {
            case 0:
                int i11 = AbstractBaseGraph.AnonymousClass2.f17325a;
                return new EndpointPair.Ordered(obj, null);
            case 1:
                int i12 = AbstractBaseGraph.AnonymousClass2.f17325a;
                new EndpointPair.Ordered(null, obj);
                throw null;
            default:
                int i13 = AbstractBaseGraph.AnonymousClass2.f17325a;
                return new EndpointPair.Unordered(obj, null);
        }
    }
}
