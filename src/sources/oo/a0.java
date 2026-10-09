package oo;

import android.os.Bundle;
import android.view.ViewGroup;
import hj.b5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f45632b;

    public /* synthetic */ a0(d0 d0Var, int i11) {
        this.f45631a = i11;
        this.f45632b = d0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f45631a) {
            case 0:
                d0 d0Var = this.f45632b;
                ta.a aVar = d0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ViewGroup.LayoutParams layoutParams = ((b5) aVar).f32402h.getLayoutParams();
                ta.a aVar2 = d0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                layoutParams.height = (int) (((b5) aVar2).f32402h.getWidth() * 0.5625f);
                ta.a aVar3 = d0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((b5) aVar3).f32402h.setLayoutParams(layoutParams);
                return qy.b0.f48488a;
            case 1:
                Bundle bundle = new Bundle();
                b7.e0.v(this.f45632b.Y, bundle, "U", "unit");
                return bundle;
            case 2:
                ta.a aVar4 = this.f45632b.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((b5) aVar4).f32398d.performClick();
                return qy.b0.f48488a;
            default:
                Bundle bundle2 = new Bundle();
                b7.e0.v(this.f45632b.Y, bundle2, "U", "unit");
                return bundle2;
        }
    }
}
