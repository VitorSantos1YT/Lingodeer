package app.rive;

import app.rive.core.CommandQueue;
import app.rive.core.StateMachineHandle;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Fit;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class RiveUIKt$RiveUI$9$1$pointerFn$3 extends j implements fz.j {
    public RiveUIKt$RiveUI$9$1$pointerFn$3(Object obj) {
        super(7, 0, CommandQueue.class, obj, "pointerDown", "pointerDown-iHGrxBs(JLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;FFFF)V");
    }

    @Override // fz.j
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        m41invokeiHGrxBs(((StateMachineHandle) obj).m192unboximpl(), (Fit) obj2, (Alignment) obj3, ((Number) obj4).floatValue(), ((Number) obj5).floatValue(), ((Number) obj6).floatValue(), ((Number) obj7).floatValue());
        return b0.f48488a;
    }

    /* JADX INFO: renamed from: invoke-iHGrxBs, reason: not valid java name */
    public final void m41invokeiHGrxBs(long j11, Fit p4, Alignment p11, float f5, float f11, float f12, float f13) {
        m.f(p4, "p1");
        m.f(p11, "p2");
        ((CommandQueue) this.receiver).m136pointerDowniHGrxBs(j11, p4, p11, f5, f11, f12, f13);
    }
}
