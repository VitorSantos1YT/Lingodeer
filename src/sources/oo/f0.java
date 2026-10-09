package oo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingodeer.R;
import hj.d5;
import java.util.List;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f45655b;

    public /* synthetic */ f0(k0 k0Var, int i11) {
        this.f45654a = i11;
        this.f45655b = k0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        Bundle bundle;
        int i11;
        int i12 = this.f45654a;
        vy.d dVar = null;
        qy.b0 b0Var = qy.b0.f48488a;
        int i13 = 0;
        k0 k0Var = this.f45655b;
        switch (i12) {
            case 0:
                bundle = new Bundle();
                i11 = k0Var.U;
                break;
            case 1:
                bundle = new Bundle();
                i11 = k0Var.U;
                break;
            case 2:
                ta.a aVar = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((d5) aVar).f32498d.getLayoutManager();
                kotlin.jvm.internal.m.c(linearLayoutManager);
                List list = k0Var.Q;
                kotlin.jvm.internal.m.c(list);
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(list.size() - 1);
                View viewInflate = LayoutInflater.from(k0Var.f36398d).inflate(R.layout.foot_recycler_speak_try, (ViewGroup) null, false);
                k0Var.O = viewInflate;
                kotlin.jvm.internal.m.c(viewInflate);
                k0Var.P = (Button) viewInflate.findViewById(R.id.btn_preview);
                SpeakTryAdapter speakTryAdapter = k0Var.R;
                kotlin.jvm.internal.m.c(speakTryAdapter);
                speakTryAdapter.addFooterView(k0Var.O);
                Button button = k0Var.P;
                kotlin.jvm.internal.m.c(button);
                bq.z.b(button, new g0(k0Var, i13));
                View view = k0Var.O;
                kotlin.jvm.internal.m.c(view);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ta.a aVar2 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                int height = ((d5) aVar2).f32499e.getHeight();
                kotlin.jvm.internal.m.c(viewFindViewByPosition);
                layoutParams.height = height - viewFindViewByPosition.getHeight();
                View view2 = k0Var.O;
                kotlin.jvm.internal.m.c(view2);
                view2.setLayoutParams(layoutParams);
                k0Var.y();
                return b0Var;
            case 3:
                ta.a aVar3 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ImageView imageView = ((d5) aVar3).f32497c;
                kotlin.jvm.internal.m.c(imageView);
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                ta.a aVar4 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                layoutParams2.height = (int) (((d5) aVar4).f32497c.getWidth() * 0.5625f);
                ta.a aVar5 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ImageView imageView2 = ((d5) aVar5).f32497c;
                kotlin.jvm.internal.m.c(imageView2);
                imageView2.setLayoutParams(layoutParams2);
                return b0Var;
            case 4:
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(k0Var);
                yz.f fVar = o0.f50940a;
                rz.e0.B(lifecycleScope, wz.m.f55536a, null, new j0(k0Var, dVar, i13), 2);
                return b0Var;
            default:
                bundle = new Bundle();
                i11 = k0Var.U;
                break;
        }
        b7.e0.v(i11, bundle, "U", "unit");
        return bundle;
    }
}
