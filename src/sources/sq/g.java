package sq;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e1;
import androidx.fragment.app.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bq.z;
import com.lingo.lingoskill.vtskill.ui.syllable.adapter.VTSyllableIndexRecyclerAdapter;
import com.lingo.lingoskill.vtskill.ui.syllable.ui.VTSyllableStudyActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import hj.s5;
import java.util.ArrayList;
import lf.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends ji.f {
    public VTSyllableIndexRecyclerAdapter O;
    public final ArrayList P;
    public final i.c Q;

    public g() {
        super(f.f51741a, "AlphabetLessonIndex");
        this.P = new ArrayList();
        i.c cVarRegisterForActivityResult = registerForActivityResult(new e1(4), new hh.c(this, 22));
        kotlin.jvm.internal.m.e(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.Q = cVarRegisterForActivityResult;
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        new x0(this, contextRequireContext);
        String string = getString(R.string.alphabet);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        View viewRequireView = requireView();
        kotlin.jvm.internal.m.e(viewRequireView, "requireView(...)");
        ve.i.H(string, (l.m) p0VarRequireActivity, viewRequireView);
        this.O = new VTSyllableIndexRecyclerAdapter(this.P, this);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        RecyclerView recyclerView = ((s5) aVar).f33279c;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((s5) aVar2).f33279c.setAdapter(this.O);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireActivity());
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.include_pinyin_lesson_index_header, (ViewGroup) ((s5) aVar3).f33279c, false);
        VTSyllableIndexRecyclerAdapter vTSyllableIndexRecyclerAdapter = this.O;
        if (vTSyllableIndexRecyclerAdapter != null) {
            vTSyllableIndexRecyclerAdapter.addHeaderView(viewInflate);
        }
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        z.b(((s5) aVar4).f33278b, new s0.a(this, 4));
    }

    public final void x(pq.b syllableLesson) {
        kotlin.jvm.internal.m.f(syllableLesson, "syllableLesson");
        try {
            i.c cVar = this.Q;
            int i11 = VTSyllableStudyActivity.R;
            l.m mVar = this.f36398d;
            kotlin.jvm.internal.m.c(mVar);
            Intent intent = new Intent(mVar, (Class<?>) VTSyllableStudyActivity.class);
            intent.putExtra(INTENTS.EXTRA_OBJECT, syllableLesson);
            cVar.a(intent);
            t().c("jxz_alphabet_click_lesson", new s0.u(syllableLesson, 6));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
