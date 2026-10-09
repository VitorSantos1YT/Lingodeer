package sq;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bq.z;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.vtskill.ui.syllable.adapter.VTSyllableStudyAdapter;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.o5;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends a {
    public VTSyllableStudyAdapter O;
    public VTSyllableStudyAdapter P;
    public pq.b Q;
    public a9.i R;
    public final cm.a S;

    public d() {
        super(c.f51739a, BuildConfig.VERSION_NAME);
        this.S = new cm.a();
    }

    public static ArrayList y(String str) {
        String[] strArr = (String[]) oz.q.W0(str, new String[]{","}, 0, 6).toArray(new String[0]);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = kotlin.jvm.internal.m.h(str2.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            arrayList.add(str2.subSequence(i11, length + 1).toString());
        }
        return arrayList;
    }

    public abstract void A(TextView textView, TextView textView2);

    @Override // bp.m, androidx.fragment.app.k0
    public final void onPause() {
        MediaPlayer mediaPlayer;
        super.onPause();
        a9.i iVar = this.R;
        if (iVar == null || (mediaPlayer = (MediaPlayer) iVar.f519c) == null || !mediaPlayer.isPlaying()) {
            return;
        }
        ((MediaPlayer) iVar.f519c).pause();
    }

    @Override // ji.e
    public final void q() {
        a9.i iVar = this.R;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        Parcelable parcelable = requireArguments().getParcelable(INTENTS.EXTRA_OBJECT);
        kotlin.jvm.internal.m.c(parcelable);
        pq.b bVar = (pq.b) parcelable;
        this.Q = bVar;
        String str = bVar.f46987b;
        kotlin.jvm.internal.m.e(str, "getLessonName(...)");
        p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        View viewRequireView = requireView();
        kotlin.jvm.internal.m.e(viewRequireView, "requireView(...)");
        ve.i.H(str, (l.m) p0VarRequireActivity, viewRequireView);
        this.R = new a9.i(1);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((o5) aVar).f33041c.setNestedScrollingEnabled(false);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((o5) aVar2).f33042d.setNestedScrollingEnabled(false);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        z(((o5) aVar3).f33043e);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        RecyclerView recyclerView = ((o5) aVar4).f33041c;
        getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        pq.b bVar2 = this.Q;
        if (bVar2 == null) {
            kotlin.jvm.internal.m.n("mLesson");
            throw null;
        }
        String str2 = bVar2.f46989d;
        kotlin.jvm.internal.m.e(str2, "getFinalPool(...)");
        final ArrayList arrayListY = y(str2);
        this.O = new VTSyllableStudyAdapter(R.layout.vi_syllable_flex_item_study, arrayListY);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((o5) aVar5).f33041c.setAdapter(this.O);
        VTSyllableStudyAdapter vTSyllableStudyAdapter = this.O;
        kotlin.jvm.internal.m.c(vTSyllableStudyAdapter);
        final int i11 = 1;
        vTSyllableStudyAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener(this) { // from class: sq.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f51737b;

            {
                this.f51737b = this;
            }

            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                int i13 = i11;
                ArrayList arrayList = arrayListY;
                d dVar = this.f51737b;
                switch (i13) {
                    case 0:
                        String str3 = (String) arrayList.get(i12);
                        qy.q qVar = fv.b.f28186a;
                        String strA = dVar.S.a(str3);
                        kotlin.jvm.internal.m.e(strA, "getCharName(...)");
                        String strC = fv.b.c(strA, null, null);
                        a9.i iVar = dVar.R;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.v(strC);
                        break;
                    default:
                        String str4 = (String) arrayList.get(i12);
                        qy.q qVar2 = fv.b.f28186a;
                        String strA2 = dVar.S.a(str4);
                        kotlin.jvm.internal.m.e(strA2, "getCharName(...)");
                        String strC2 = fv.b.c(strA2, null, null);
                        a9.i iVar2 = dVar.R;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(strC2);
                        break;
                }
            }
        });
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        RecyclerView recyclerView2 = ((o5) aVar6).f33042d;
        getContext();
        recyclerView2.setLayoutManager(new GridLayoutManager(2));
        pq.b bVar3 = this.Q;
        if (bVar3 == null) {
            kotlin.jvm.internal.m.n("mLesson");
            throw null;
        }
        String str3 = bVar3.f46990e;
        kotlin.jvm.internal.m.e(str3, "getInitialPool(...)");
        final ArrayList arrayListY2 = y(str3);
        this.P = new VTSyllableStudyAdapter(R.layout.vi_syllable_flex_item_study, arrayListY2);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ((o5) aVar7).f33042d.setAdapter(this.P);
        VTSyllableStudyAdapter vTSyllableStudyAdapter2 = this.P;
        kotlin.jvm.internal.m.c(vTSyllableStudyAdapter2);
        final int i12 = 0;
        vTSyllableStudyAdapter2.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener(this) { // from class: sq.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f51737b;

            {
                this.f51737b = this;
            }

            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i13) {
                int i14 = i12;
                ArrayList arrayList = arrayListY2;
                d dVar = this.f51737b;
                switch (i14) {
                    case 0:
                        String str4 = (String) arrayList.get(i13);
                        qy.q qVar = fv.b.f28186a;
                        String strA = dVar.S.a(str4);
                        kotlin.jvm.internal.m.e(strA, "getCharName(...)");
                        String strC = fv.b.c(strA, null, null);
                        a9.i iVar = dVar.R;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.v(strC);
                        break;
                    default:
                        String str5 = (String) arrayList.get(i13);
                        qy.q qVar2 = fv.b.f28186a;
                        String strA2 = dVar.S.a(str5);
                        kotlin.jvm.internal.m.e(strA2, "getCharName(...)");
                        String strC2 = fv.b.c(strA2, null, null);
                        a9.i iVar2 = dVar.R;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(strC2);
                        break;
                }
            }
        });
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        TextView textView = ((o5) aVar8).f33044f;
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        A(textView, ((o5) aVar9).f33045g);
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        z.b(((o5) aVar10).f33040b, new s0.a(this, 3));
    }

    @Override // sq.a
    public final HashMap x(pq.b lesson) {
        cm.a aVar;
        kotlin.jvm.internal.m.f(lesson, "lesson");
        HashMap map = new HashMap();
        String str = lesson.f46990e;
        kotlin.jvm.internal.m.e(str, "getInitialPool(...)");
        String[] strArr = (String[]) oz.q.W0(str, new String[]{","}, 0, 6).toArray(new String[0]);
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            aVar = this.S;
            if (i11 >= length) {
                break;
            }
            String str2 = strArr[i11];
            qy.q qVar = fv.b.f28186a;
            String strA = aVar.a(str2);
            kotlin.jvm.internal.m.e(strA, "getCharName(...)");
            String strA2 = fv.b.a(strA, null, null);
            String strA3 = aVar.a(str2);
            kotlin.jvm.internal.m.e(strA3, "getCharName(...)");
            map.put(strA2, fv.b.e(strA3));
            i11++;
        }
        String str3 = lesson.f46989d;
        kotlin.jvm.internal.m.e(str3, "getFinalPool(...)");
        for (String str4 : (String[]) oz.q.W0(str3, new String[]{","}, 0, 6).toArray(new String[0])) {
            qy.q qVar2 = fv.b.f28186a;
            String strA4 = aVar.a(str4);
            kotlin.jvm.internal.m.e(strA4, "getCharName(...)");
            String strA5 = fv.b.a(strA4, null, null);
            String strA6 = aVar.a(str4);
            kotlin.jvm.internal.m.e(strA6, "getCharName(...)");
            map.put(strA5, fv.b.e(strA6));
        }
        String str5 = lesson.f46991f;
        kotlin.jvm.internal.m.e(str5, "getStudyPool(...)");
        for (String str6 : (String[]) oz.q.W0(str5, new String[]{","}, 0, 6).toArray(new String[0])) {
            qy.q qVar3 = fv.b.f28186a;
            String strA7 = aVar.a(str6);
            kotlin.jvm.internal.m.e(strA7, "getCharName(...)");
            String strA8 = fv.b.a(strA7, null, null);
            String strA9 = aVar.a(str6);
            kotlin.jvm.internal.m.e(strA9, "getCharName(...)");
            map.put(strA8, fv.b.e(strA9));
        }
        return map;
    }

    public abstract void z(TextView textView);
}
