package tp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import hj.x3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import jp.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends p0 {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f52491m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ArrayList f52492n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f52493o0;

    public r() {
        LearnType learnType = LearnType.LEARN;
        this.f52493o0 = -1;
    }

    @Override // jp.p0
    public final void D() {
        this.W = true;
        this.f52491m0 = requireArguments().getInt(INTENTS.EXTRA_INT);
        this.f52492n0 = requireArguments().getParcelableArrayList(INTENTS.EXTRA_ARRAY_LIST);
        this.f52493o0 = requireArguments().getInt(INTENTS.EXTRA_INT_2);
        ArrayList arrayList = this.f52492n0;
        if (arrayList != null) {
            new pp.g(this, this.f52491m0, arrayList);
        }
    }

    @Override // jp.p0
    public final void F() {
        if (this.f52491m0 == 4) {
            l.m mVar = this.f36398d;
            if (mVar != null) {
                int i11 = this.f52493o0;
                Bundle bundle = new Bundle();
                bundle.putInt(INTENTS.EXTRA_INT, i11);
                sm.c cVar = new sm.c();
                cVar.setArguments(bundle);
                ff.h.A(mVar, cVar);
                return;
            }
            return;
        }
        l.m mVar2 = this.f36398d;
        if (mVar2 != null) {
            ii.a aVar = this.N;
            kotlin.jvm.internal.m.c(aVar);
            HashMap knowPoint = ((mp.a) aVar).s();
            ii.a aVar2 = this.N;
            kotlin.jvm.internal.m.c(aVar2);
            int i12 = ((mp.a) aVar2).i();
            int i13 = this.f52493o0;
            int i14 = this.f52491m0;
            kotlin.jvm.internal.m.f(knowPoint, "knowPoint");
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable(INTENTS.EXTRA_OBJECT, knowPoint);
            bundle2.putInt(INTENTS.EXTRA_INT, i12);
            bundle2.putInt(INTENTS.EXTRA_INT_2, i13);
            bundle2.putInt(INTENTS.EXTRA_INT_3, i14);
            b0 b0Var = new b0();
            b0Var.setArguments(bundle2);
            ff.h.A(mVar2, b0Var);
        }
    }

    @Override // jp.p0
    public final void M() {
        String str;
        String str2;
        if (r().handWriteLanguage == -1) {
            if (this.f52493o0 != -1) {
                t().c("jxz_main_vocab_quit", new s0.u(this, 10));
                return;
            }
            int i11 = r().reviewCateSortBy;
            if (i11 == 0) {
                str = "custom";
            } else if (i11 == 1) {
                str = "all";
            } else if (i11 != 2) {
                str = i11 != 3 ? "weak_only" : "shuffle_40";
            } else {
                str = "shuffle_20";
            }
            int i12 = this.f52491m0;
            if (i12 != 0) {
                str2 = i12 != 1 ? "character" : "grammar";
            } else {
                str2 = "vocabulary";
            }
            t().c("jxz_review_quit", new gp.k0(str2, str, 1));
        }
    }

    @Override // jp.p0
    public final void U(int i11) {
        this.f52493o0 = i11;
    }

    @Override // jp.p0, mp.b
    public final int d() {
        return this.f52493o0;
    }

    @Override // jp.p0, mp.b
    public final void h(String status, boolean z11) {
        kotlin.jvm.internal.m.f(status, "status");
        super.h(status, z11);
        if (!z11 || getView() == null) {
            return;
        }
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((TextView) ((x3) aVar).f33575h.f32800i).setVisibility(0);
        mp.a aVar2 = (mp.a) this.N;
        String string = getString(R.string._s_questions_in_total, aVar2 != null ? Integer.valueOf(aVar2.i()) : "0");
        kotlin.jvm.internal.m.e(string, "getString(...)");
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((TextView) ((x3) aVar3).f33575h.f32800i).setText(string);
        th.j.a(qx.h.m(1500L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new t7.d(this, 2), d.f52449d), this.f36401t);
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent();
        ArrayList<? extends Parcelable> arrayList = this.f52492n0;
        if (arrayList != null) {
            intent.putParcelableArrayListExtra(INTENTS.EXTRA_ARRAY_LIST, arrayList);
            requireActivity().setResult(-1, intent);
        }
    }
}
