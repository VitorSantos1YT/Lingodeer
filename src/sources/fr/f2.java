package fr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f27502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f27503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.u f27505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f27506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i3 f27507f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f27508t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(i3 i3Var, xy.c cVar) {
        super(cVar);
        this.f27507f = i3Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27506e = obj;
        this.f27508t |= Integer.MIN_VALUE;
        return i3.a(this.f27507f, this);
    }
}
