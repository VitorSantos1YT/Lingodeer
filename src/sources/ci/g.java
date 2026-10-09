package ci;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.e1;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.ar.ui.syllable.adapter.ARSyllableIndexAdapter;
import com.lingodeer.R;
import hj.h3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends ji.e {
    public final ArrayList N;
    public ARSyllableIndexAdapter O;
    public final ViewModelLazy P;
    public final i.c Q;

    public g() {
        super(d.f7128a, "AlphabetLessonIndex");
        this.N = new ArrayList();
        this.P = new ViewModelLazy(kotlin.jvm.internal.z.a(gi.f.class), new f(this, 0), new bq.u(17), new f(this, 1));
        i.c cVarRegisterForActivityResult = registerForActivityResult(new e1(4), new b(this));
        kotlin.jvm.internal.m.e(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.Q = cVarRegisterForActivityResult;
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        String string = getString(R.string.alphabet);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        androidx.fragment.app.p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        View viewRequireView = requireView();
        kotlin.jvm.internal.m.e(viewRequireView, "requireView(...)");
        ve.i.H(string, (l.m) p0VarRequireActivity, viewRequireView);
        ARSyllableIndexAdapter aRSyllableIndexAdapter = new ARSyllableIndexAdapter(R.layout.item_pinyin_lesson_index_ko, this.N);
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        aRSyllableIndexAdapter.f21673a = b7.e0.d(ij.l.f34436b, 51);
        this.O = aRSyllableIndexAdapter;
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        RecyclerView recyclerView = ((h3) aVar).f32657c;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        RecyclerView recyclerView2 = ((h3) aVar2).f32657c;
        ARSyllableIndexAdapter aRSyllableIndexAdapter2 = this.O;
        if (aRSyllableIndexAdapter2 == null) {
            kotlin.jvm.internal.m.n("adapter");
            throw null;
        }
        recyclerView2.setAdapter(aRSyllableIndexAdapter2);
        View viewInflate = LayoutInflater.from(this.f36398d).inflate(R.layout.include_pinyin_lesson_index_header, (ViewGroup) null, false);
        kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewInflate;
        ARSyllableIndexAdapter aRSyllableIndexAdapter3 = this.O;
        if (aRSyllableIndexAdapter3 == null) {
            kotlin.jvm.internal.m.n("adapter");
            throw null;
        }
        aRSyllableIndexAdapter3.addHeaderView(imageView);
        gi.f fVar = (gi.f) this.P.getValue();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        fVar.getClass();
        MutableLiveData mutableLiveData = fVar.f29268b;
        if (wh.a.f55170d == null) {
            synchronized (wh.a.class) {
                if (wh.a.f55170d == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    wh.a.f55170d = new wh.a(lingoSkillApplication);
                }
            }
        }
        kotlin.jvm.internal.m.c(wh.a.f55170d);
        mutableLiveData.setValue(wh.a.b(contextRequireContext));
        fVar.f29268b.observe(getViewLifecycleOwner(), new c(this, 0));
        ARSyllableIndexAdapter aRSyllableIndexAdapter4 = this.O;
        if (aRSyllableIndexAdapter4 == null) {
            kotlin.jvm.internal.m.n("adapter");
            throw null;
        }
        aRSyllableIndexAdapter4.setOnItemClickListener(new b(this));
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        bq.z.b(((h3) aVar3).f32656b, new a00.c(this, 22));
    }
}
