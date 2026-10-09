package fr;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f27653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x4 f27656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(x4 x4Var, xy.c cVar) {
        super(cVar);
        this.f27656d = x4Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27655c = obj;
        this.f27657e |= Integer.MIN_VALUE;
        return x4.f(this.f27656d, null, null, this);
    }
}
