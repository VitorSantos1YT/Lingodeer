package i1;

import androidx.lifecycle.LifecycleOwner;
import dt.p4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f33964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f33965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f33966c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LifecycleOwner lifecycleOwner, fz.c cVar, fz.a aVar) {
        super(1);
        this.f33964a = lifecycleOwner;
        this.f33965b = cVar;
        this.f33966c = aVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        p4 p4Var = new p4(this.f33965b, 2);
        LifecycleOwner lifecycleOwner = this.f33964a;
        lifecycleOwner.getLifecycle().addObserver(p4Var);
        return new a0.i(this.f33966c, lifecycleOwner, p4Var, 1);
    }
}
