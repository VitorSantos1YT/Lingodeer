package wy;

import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f55498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vy.d f55499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vy.d dVar, i iVar, fz.e eVar, vy.d dVar2) {
        super(dVar, iVar);
        this.f55498b = eVar;
        this.f55499c = dVar2;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f55497a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f55497a = 2;
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        this.f55497a = 1;
        com.bumptech.glide.e.F(obj);
        fz.e eVar = this.f55498b;
        m.d(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        c0.d(2, eVar);
        return eVar.invoke(this.f55499c, this);
    }
}
