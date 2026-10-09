package fr;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f27896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f27897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x4 f27900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(x4 x4Var, xy.c cVar) {
        super(cVar);
        this.f27900e = x4Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27899d = obj;
        this.f27901f |= Integer.MIN_VALUE;
        return x4.h(this.f27900e, this);
    }
}
