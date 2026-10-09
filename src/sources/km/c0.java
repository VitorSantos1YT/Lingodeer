package km;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.lingo.lingoskill.japanskill.ui.syllable.adapter.SyllableIndexRecyclerAdapter;
import com.lingodeer.R;
import hj.f5;
import java.util.ArrayList;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends ji.e {
    public final ArrayList N;
    public SyllableIndexRecyclerAdapter O;
    public final ViewModelLazy P;
    public final i.c Q;

    public c0() {
        super(z.f38324a, "AlphabetLessonIndex");
        this.N = new ArrayList();
        bj.a aVar = new bj.a(this, 22);
        qy.j jVar = qy.j.NONE;
        com.bumptech.glide.d.u(jVar, new bp.b1(18, this, aVar));
        ju.d dVar = new ju.d(4);
        qy.h hVarU = com.bumptech.glide.d.u(jVar, new a0.c0(new a0.c0(this, 15), 16));
        this.P = new ViewModelLazy(kotlin.jvm.internal.z.a(pm.d.class), new a0.c0(hVarU, 17), dVar, new b0(hVarU));
        i.c cVarRegisterForActivityResult = registerForActivityResult(new androidx.fragment.app.e1(4), new w(this));
        kotlin.jvm.internal.m.e(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.Q = cVarRegisterForActivityResult;
    }

    @f10.k(threadMode = ThreadMode.MAIN)
    public final void onRefreshEvent(np.b refreshEvent) {
        kotlin.jvm.internal.m.f(refreshEvent, "refreshEvent");
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        String string = getString(R.string.alphabet);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(string, mVar, view);
        this.O = new SyllableIndexRecyclerAdapter(this.N, r());
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((f5) aVar).f32573d.setLayoutManager(new LinearLayoutManager(1));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((f5) aVar2).f32573d.setAdapter(this.O);
        View viewInflate = LayoutInflater.from(this.f36398d).inflate(R.layout.include_pinyin_lesson_index_header, (ViewGroup) null, false);
        kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewInflate;
        SyllableIndexRecyclerAdapter syllableIndexRecyclerAdapter = this.O;
        if (syllableIndexRecyclerAdapter != null) {
            syllableIndexRecyclerAdapter.addHeaderView(imageView);
        }
        pm.d dVar = (pm.d) this.P.getValue();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        x xVar = new x(this, 0);
        dVar.getClass();
        th.j.a(new ay.x(new bp.g(8)).k(ky.e.f38937b).g(px.b.a()).h(new b1.p(27, contextRequireContext, xVar), pm.c.f46957a), dVar.f46958a);
        SyllableIndexRecyclerAdapter syllableIndexRecyclerAdapter2 = this.O;
        if (syllableIndexRecyclerAdapter2 != null) {
            syllableIndexRecyclerAdapter2.setOnItemClickListener(new w(this));
        }
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((f5) aVar3).f32574e.setVisibility(4);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        bq.z.a(((f5) aVar4).f32574e, 0L, new y(this, 0));
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        bq.z.b(((f5) aVar5).f32572c, new x(this, 1));
    }

    @Override // ji.e
    public final boolean w() {
        return true;
    }

    public final void x() {
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        if (b7.e0.d(ij.l.f34436b, 1) > 2) {
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ((f5) aVar).f32571b.setVisibility(0);
        } else {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((f5) aVar2).f32571b.setVisibility(8);
        }
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        bq.z.b(((f5) aVar3).f32571b, new x(this, 2));
    }
}
