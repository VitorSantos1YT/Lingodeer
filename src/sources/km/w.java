package km;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.japanskill.ui.syllable.SyllableIntroductionActivity;
import com.lingo.lingoskill.japanskill.ui.syllable.SyllableTest;
import com.lingo.lingoskill.japanskill.ui.syllable.adapter.SyllableIndexRecyclerAdapter;
import com.lingo.lingoskill.object.Lesson;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements i.b, BaseQuickAdapter.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f38297a;

    public /* synthetic */ w(c0 c0Var) {
        this.f38297a = c0Var;
    }

    @Override // i.b
    public void f(Object obj) {
        c0 c0Var = this.f38297a;
        i.a it = (i.a) obj;
        kotlin.jvm.internal.m.f(it, "it");
        if (c0Var.N.size() <= 0) {
            return;
        }
        c0Var.x();
        SyllableIndexRecyclerAdapter syllableIndexRecyclerAdapter = c0Var.O;
        if (syllableIndexRecyclerAdapter != null) {
            if (ij.l.f34436b == null) {
                synchronized (ij.l.class) {
                    if (ij.l.f34436b == null) {
                        ij.l.f34436b = new ij.l();
                    }
                }
            }
            syllableIndexRecyclerAdapter.f21905b = b7.e0.d(ij.l.f34436b, 1);
        }
        SyllableIndexRecyclerAdapter syllableIndexRecyclerAdapter2 = c0Var.O;
        if (syllableIndexRecyclerAdapter2 != null) {
            syllableIndexRecyclerAdapter2.notifyDataSetChanged();
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        c0 c0Var = this.f38297a;
        Object obj = c0Var.N.get(i11);
        kotlin.jvm.internal.m.e(obj, "get(...)");
        Lesson lesson = (Lesson) obj;
        int sortIndex = lesson.getSortIndex();
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        if (sortIndex > b7.e0.d(ij.l.f34436b, 1)) {
            Toast.makeText(c0Var.requireContext(), R.string.please_complete_previous_lesson, 0).show();
            return;
        }
        c0Var.r().hasEnterAlphabet = true;
        c0Var.r().updateEntry("hasEnterAlphabet");
        int sortIndex2 = lesson.getSortIndex();
        if (sortIndex2 == -3) {
            int[] iArr = bq.r.f4959a;
            Context contextRequireContext = c0Var.requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            bq.m.C(contextRequireContext, BuildConfig.VERSION_NAME);
            return;
        }
        if (sortIndex2 == -2) {
            c0Var.startActivity(new Intent(c0Var.f36398d, (Class<?>) SyllableIntroductionActivity.class));
            return;
        }
        c0Var.t().c("jxz_alphabet_click_lesson", new hh.o(lesson, 23));
        i.c cVar = c0Var.Q;
        int i12 = SyllableTest.Q;
        l.m mVar = c0Var.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        cVar.a(g.a(mVar, lesson.getSortIndex()));
    }
}
