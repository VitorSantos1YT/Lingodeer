package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17309a;

    public /* synthetic */ e(int i11) {
        this.f17309a = i11;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f17309a) {
            case 0:
                return ((Range) obj).f17135a;
            case 1:
                return ((Range) obj).f17136b;
            case 2:
                return ((Iterable) obj).iterator();
            default:
                return ((Map) obj).keySet().iterator();
        }
    }
}
