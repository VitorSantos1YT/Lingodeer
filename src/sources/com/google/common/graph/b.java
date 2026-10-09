package com.google.common.graph;

import com.google.common.base.Function;
import java.util.Objects;
import r8.g;
import r8.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17338b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f17337a = i11;
        this.f17338b = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f17337a) {
            case 0:
                return ((Network) this.f17338b).i(obj);
            case 1:
                EndpointPair endpointPair = (EndpointPair) obj;
                Object objE = ((ValueGraph) this.f17338b).e(endpointPair.f17328a, endpointPair.f17329b);
                Objects.requireNonNull(objE);
                return objE;
            default:
                n nVar = (n) obj;
                ((g) this.f17338b).getClass();
                return nVar;
        }
    }
}
