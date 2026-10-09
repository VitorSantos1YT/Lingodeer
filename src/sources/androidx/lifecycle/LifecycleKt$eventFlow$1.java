package androidx.lifecycle;

import qy.b0;
import se.k;
import tz.s;
import tz.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@xy.e(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", l = {373}, m = "invokeSuspend")
public final class LifecycleKt$eventFlow$1 extends xy.i implements fz.e {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, vy.d<? super LifecycleKt$eventFlow$1> dVar) {
        super(2, dVar);
        this.$this_eventFlow = lifecycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(t tVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        s sVar = (s) tVar;
        sVar.i(event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            sVar.a0(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 invokeSuspend$lambda$1(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        lifecycle.removeObserver(lifecycleEventObserver);
        return b0.f48488a;
    }

    @Override // xy.a
    public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, dVar);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            t tVar = (t) this.L$0;
            final g gVar = new g(tVar, 0);
            this.$this_eventFlow.addObserver(gVar);
            final Lifecycle lifecycle = this.$this_eventFlow;
            fz.a aVar2 = new fz.a() { // from class: androidx.lifecycle.h
                @Override // fz.a
                public final Object invoke() {
                    return LifecycleKt$eventFlow$1.invokeSuspend$lambda$1(lifecycle, gVar);
                }
            };
            this.label = 1;
            if (k.i(tVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return b0.f48488a;
    }

    @Override // fz.e
    public final Object invoke(t tVar, vy.d<? super b0> dVar) {
        return ((LifecycleKt$eventFlow$1) create(tVar, dVar)).invokeSuspend(b0.f48488a);
    }
}
