package kc;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import kotlin.jvm.internal.y;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Lifecycle lifecycle, xy.c cVar) throws Throwable {
        b bVar;
        Lifecycle lifecycle2;
        y yVar;
        Throwable th2;
        LifecycleObserver lifecycleObserver;
        LifecycleObserver lifecycleObserver2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i11 = bVar.f38052d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f38052d = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(cVar);
            }
        } else {
            bVar = new b(cVar);
        }
        Object obj = bVar.f38051c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = bVar.f38052d;
        b0 b0Var = b0.f48488a;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                y yVar2 = new y();
                try {
                    bVar.f38049a = lifecycle;
                    bVar.f38050b = yVar2;
                    bVar.f38052d = 1;
                    rz.m mVar = new rz.m(1, ue.f.x(bVar));
                    mVar.s();
                    c cVar2 = new c(mVar);
                    yVar2.f38361a = cVar2;
                    lifecycle.addObserver(cVar2);
                    if (mVar.r() == aVar) {
                        return aVar;
                    }
                    lifecycle2 = lifecycle;
                    yVar = yVar2;
                    lifecycleObserver2 = (LifecycleObserver) yVar.f38361a;
                    if (lifecycleObserver2 != null) {
                        lifecycle2.removeObserver(lifecycleObserver2);
                    }
                } catch (Throwable th3) {
                    lifecycle2 = lifecycle;
                    yVar = yVar2;
                    th2 = th3;
                    lifecycleObserver = (LifecycleObserver) yVar.f38361a;
                    if (lifecycleObserver != null) {
                        lifecycle2.removeObserver(lifecycleObserver);
                    }
                    throw th2;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = bVar.f38050b;
            lifecycle2 = bVar.f38049a;
            try {
                com.bumptech.glide.e.F(obj);
                lifecycleObserver2 = (LifecycleObserver) yVar.f38361a;
                if (lifecycleObserver2 != null) {
                    lifecycle2.removeObserver(lifecycleObserver2);
                }
            } catch (Throwable th4) {
                th2 = th4;
                lifecycleObserver = (LifecycleObserver) yVar.f38361a;
                if (lifecycleObserver != null) {
                    lifecycle2.removeObserver(lifecycleObserver);
                }
                throw th2;
            }
        }
        return b0Var;
    }
}
