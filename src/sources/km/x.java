package km;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.lingo.lingoskill.japanskill.ui.syllable.SyllableTest;
import com.lingo.lingoskill.japanskill.ui.syllable.YinTuActivity;
import com.lingo.lingoskill.japanskill.ui.syllable.adapter.SyllableIndexRecyclerAdapter;
import com.lingodeer.data.env.Env;
import hj.f5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f38307b;

    public /* synthetic */ x(c0 c0Var, int i11) {
        this.f38306a = i11;
        this.f38307b = c0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = 1;
        switch (this.f38306a) {
            case 0:
                c0 c0Var = this.f38307b;
                List it = (List) obj;
                kotlin.jvm.internal.m.f(it, "it");
                c0Var.x();
                c0Var.N.clear();
                c0Var.N.addAll(it);
                SyllableIndexRecyclerAdapter syllableIndexRecyclerAdapter = c0Var.O;
                if (syllableIndexRecyclerAdapter != null) {
                    syllableIndexRecyclerAdapter.notifyDataSetChanged();
                }
                if (ij.l.f34436b == null) {
                    synchronized (ij.l.class) {
                        if (ij.l.f34436b == null) {
                            ij.l.f34436b = new ij.l();
                        }
                        break;
                    }
                }
                if (b7.e0.d(ij.l.f34436b, 1) > 1) {
                    ta.a aVar = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    RecyclerView recyclerView = ((f5) aVar).f32573d;
                    recyclerView.postDelayed(new b2.c(4, recyclerView, new y(c0Var, i11)), 0L);
                }
                return qy.b0.f48488a;
            case 1:
                c0 c0Var2 = this.f38307b;
                kotlin.jvm.internal.m.f((View) obj, "it");
                c0Var2.r().hasEnterAlphabet = true;
                c0Var2.r().updateEntry("hasEnterAlphabet");
                int i12 = YinTuActivity.R;
                l.m mVar = c0Var2.f36398d;
                kotlin.jvm.internal.m.c(mVar);
                c0Var2.startActivity(new Intent(mVar, (Class<?>) YinTuActivity.class));
                b7.e0.A(c0Var2.t(), "jxz_alphabet_click_chart");
                break;
            case 2:
                c0 c0Var3 = this.f38307b;
                kotlin.jvm.internal.m.f((View) obj, "it");
                c0Var3.t().c("jxz_alphabet_start_exam", new ju.d(5));
                i.c cVar = c0Var3.Q;
                int i13 = SyllableTest.Q;
                l.m mVar2 = c0Var3.f36398d;
                kotlin.jvm.internal.m.c(mVar2);
                cVar.a(g.a(mVar2, -1));
                break;
            default:
                c0 c0Var4 = this.f38307b;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ta.a aVar2 = c0Var4.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ((f5) aVar2).f32574e.c();
                Env envR = c0Var4.r();
                ta.a aVar3 = c0Var4.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                envR.isPing = ((f5) aVar3).f32574e.f22150c;
                c0Var4.r().updateEntry("isPing");
                SyllableIndexRecyclerAdapter syllableIndexRecyclerAdapter2 = c0Var4.O;
                if (syllableIndexRecyclerAdapter2 != null) {
                    syllableIndexRecyclerAdapter2.notifyDataSetChanged();
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }
}
