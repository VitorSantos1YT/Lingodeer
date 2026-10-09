package km;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.lingodeer.R;
import fr.j3;
import hj.f5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f38311b;

    public /* synthetic */ y(c0 c0Var, int i11) {
        this.f38310a = i11;
        this.f38311b = c0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f38310a) {
            case 0:
                c0 c0Var = this.f38311b;
                ta.a aVar = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((f5) aVar).f32574e.setVisibility(0);
                ta.a aVar2 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ((f5) aVar2).f32574e.setResOpen(R.drawable.ic_ping_close);
                ta.a aVar3 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((f5) aVar3).f32574e.setResClose(R.drawable.ic_ping_open);
                ta.a aVar4 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((f5) aVar4).f32574e.setChecked(c0Var.r().isPing);
                ta.a aVar5 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ((f5) aVar5).f32574e.b();
                ta.a aVar6 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                bq.z.b(((f5) aVar6).f32574e, new x(c0Var, 3));
                return qy.b0.f48488a;
            default:
                c0 c0Var2 = this.f38311b;
                ta.a aVar7 = c0Var2.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((f5) aVar7).f32573d.getLayoutManager();
                if (linearLayoutManager != null) {
                    if (ij.l.f34436b == null) {
                        synchronized (ij.l.class) {
                            if (ij.l.f34436b == null) {
                                ij.l.f34436b = new ij.l();
                            }
                        }
                    }
                    ij.l lVar = ij.l.f34436b;
                    kotlin.jvm.internal.m.c(lVar);
                    int pronun = lVar.b(1).getPronun() + 1;
                    ta.a aVar8 = c0Var2.f36400f;
                    kotlin.jvm.internal.m.c(aVar8);
                    float height = ((f5) aVar8).f32573d.getHeight() / 2;
                    Context contextRequireContext = c0Var2.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                    linearLayoutManager.scrollToPositionWithOffset(pronun, (int) (height - j3.Z(80, contextRequireContext)));
                    break;
                }
                return qy.b0.f48488a;
        }
    }
}
