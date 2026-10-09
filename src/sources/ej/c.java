package ej;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScDetailAdapter;
import hj.w4;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import qy.b0;
import rz.e0;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f25682b;

    public /* synthetic */ c(g gVar, int i11) {
        this.f25681a = i11;
        this.f25682b = gVar;
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, qy.h] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f25681a;
        int i12 = 2;
        g gVar = this.f25682b;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                g gVar2 = this.f25682b;
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(gVar2);
                yz.f fVar = o0.f50940a;
                e0.B(lifecycleScope, yz.e.f58387a, null, new bh.l(jLongValue, gVar2, (vy.d) null, 5), 2);
                break;
            case 1:
                Integer num = (Integer) obj;
                m.c(num);
                if (num.intValue() == 100) {
                    ta.a aVar = gVar.f36400f;
                    m.c(aVar);
                    ((w4) aVar).f33523c.setVisibility(0);
                    ((fj.c) gVar.U.getValue()).K.observe(gVar.getViewLifecycleOwner(), new e(new c(gVar, i12), 0));
                }
                break;
            default:
                List list = (List) obj;
                m.c(list);
                gVar.x(false);
                ArrayList arrayList = gVar.N;
                arrayList.clear();
                arrayList.addAll(list);
                ScDetailAdapter scDetailAdapter = gVar.O;
                if (scDetailAdapter != null) {
                    scDetailAdapter.notifyDataSetChanged();
                }
                break;
        }
        return b0Var;
    }
}
