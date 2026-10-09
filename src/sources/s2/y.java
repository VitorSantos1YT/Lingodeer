package s2;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f51372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, int i11) {
        super(1);
        this.f51371a = i11;
        this.f51372b = zVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f51371a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                a0 a0Var = this.f51372b.f51373a;
                if (a0Var != null) {
                    a0Var.invoke(motionEvent);
                    return qy.b0.f48488a;
                }
                kotlin.jvm.internal.m.n("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                a0 a0Var2 = this.f51372b.f51373a;
                if (a0Var2 != null) {
                    a0Var2.invoke(motionEvent2);
                    return qy.b0.f48488a;
                }
                kotlin.jvm.internal.m.n("onTouchEvent");
                throw null;
        }
    }
}
