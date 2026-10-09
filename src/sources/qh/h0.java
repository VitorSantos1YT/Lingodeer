package qh;

import android.widget.TextView;
import bw.ORXQ.ADSb;
import com.yalantis.ucrop.view.CropImageView;
import hj.x5;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f47765b;

    public /* synthetic */ h0(k0 k0Var, int i11) {
        this.f47764a = i11;
        this.f47765b = k0Var;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f47764a) {
            case 0:
                Long l9 = (Long) obj;
                kotlin.jvm.internal.m.f(l9, ADSb.JIwDYKxuDxXN);
                k0 k0Var = this.f47765b;
                sh.d dVar = k0Var.T;
                if (dVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                dVar.f51699t = (int) ((((long) dVar.H) - l9.longValue()) - 1);
                sh.d dVar2 = k0Var.T;
                if (dVar2 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                int i11 = dVar2.f51699t;
                int i12 = i11 / 60;
                int i13 = i11 % 60;
                if (i13 < 10) {
                    ta.a aVar = k0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    ((x5) aVar).m.setText(i12 + ":0" + i13);
                } else {
                    ta.a aVar2 = k0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((x5) aVar2).m.setText(i12 + ":" + i13);
                }
                sh.d dVar3 = k0Var.T;
                if (dVar3 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (dVar3.f51699t <= 5) {
                    ta.a aVar3 = k0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((x5) aVar3).f33601l.setVisibility(0);
                    ta.a aVar4 = k0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    TextView textView = ((x5) aVar4).f33601l;
                    sh.d dVar4 = k0Var.T;
                    if (dVar4 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    textView.setText(String.valueOf(dVar4.f51699t));
                } else {
                    ta.a aVar5 = k0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar5);
                    ((x5) aVar5).f33601l.setVisibility(8);
                }
                sh.d dVar5 = k0Var.T;
                if (dVar5 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (dVar5.f51699t == 0 && k0Var.x().f32538c.getAlpha() == 1.0f) {
                    k0Var.C();
                    return;
                }
                return;
            default:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                k0 k0Var2 = this.f47765b;
                k0Var2.x().f32541f.animate().scaleX(CropImageView.DEFAULT_ASPECT_RATIO).scaleY(CropImageView.DEFAULT_ASPECT_RATIO).alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(300L).start();
                th.j.a(qx.h.m(500L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new g0(k0Var2, 1), vx.b.f54316e), k0Var2.f36401t);
                return;
        }
    }
}
