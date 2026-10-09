package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import bp.h2;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import l1.i1;
import rt.tf;
import rz.e0;
import rz.o0;
import ys.n3;
import z4.o;
import z4.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2054d;

    public /* synthetic */ e(Object obj, Serializable serializable, Object obj2, int i11) {
        this.f2051a = i11;
        this.f2054d = obj;
        this.f2052b = serializable;
        this.f2053c = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i11 = this.f2051a;
        Object obj = this.f2053c;
        Object obj2 = this.f2052b;
        Object obj3 = this.f2054d;
        switch (i11) {
            case 0:
                LifecycleEffectKt.LifecycleStartEffectImpl$lambda$19$lambda$18$lambda$16((LifecycleStartStopEffectScope) obj3, (y) obj2, (fz.c) obj, lifecycleOwner, event);
                break;
            case 1:
                LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$34$lambda$33$lambda$31((LifecycleResumePauseEffectScope) obj3, (y) obj2, (fz.c) obj, lifecycleOwner, event);
                break;
            case 2:
                tf tfVar = (tf) obj3;
                fz.c cVar = (fz.c) obj;
                i1 i1Var = (i1) obj2;
                m.f(lifecycleOwner, "<unused var>");
                m.f(event, "event");
                int i12 = n3.f58184a[event.ordinal()];
                if (i12 == 1) {
                    i1Var.n(System.currentTimeMillis());
                } else if (i12 == 2 && i1Var.l() > 0) {
                    long jCurrentTimeMillis = (System.currentTimeMillis() - i1Var.l()) / 1000;
                    tfVar.getClass();
                    yz.f fVar = o0.f50940a;
                    e0.B(e0.c(yz.e.f58387a), null, null, new h2(tfVar, (int) jCurrentTimeMillis, (vy.d) null, 12), 3);
                    cVar.invoke(Long.valueOf(jCurrentTimeMillis));
                    i1Var.n(0L);
                }
                break;
            default:
                o oVar = (o) obj3;
                Lifecycle.State state = (Lifecycle.State) obj2;
                p pVar = (p) obj;
                oVar.getClass();
                Runnable runnable = oVar.f58876a;
                CopyOnWriteArrayList copyOnWriteArrayList = oVar.f58877b;
                if (event == Lifecycle.Event.upTo(state)) {
                    copyOnWriteArrayList.add(pVar);
                    runnable.run();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    oVar.b(pVar);
                } else if (event == Lifecycle.Event.downFrom(state)) {
                    copyOnWriteArrayList.remove(pVar);
                    runnable.run();
                }
                break;
        }
    }

    public /* synthetic */ e(tf tfVar, fz.c cVar, i1 i1Var) {
        this.f2051a = 2;
        this.f2054d = tfVar;
        this.f2053c = cVar;
        this.f2052b = i1Var;
    }
}
