package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import hj.j4;
import hj.p2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import qp.k2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f32227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditText f32228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32229d;

    public /* synthetic */ f0(Object obj, View view, EditText editText, int i11) {
        this.f32226a = i11;
        this.f32229d = obj;
        this.f32227b = view;
        this.f32228c = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        switch (this.f32226a) {
            case 0:
                j0 j0Var = (j0) this.f32229d;
                ta.a aVar = j0Var.f36400f;
                HashMap map = j0Var.S;
                kotlin.jvm.internal.m.c(aVar);
                if (z11) {
                    ta.a aVar2 = j0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((j4) aVar2).f32769f.removeAllViews();
                    View view2 = this.f32227b;
                    ArrayList arrayList = (ArrayList) map.get(view2);
                    EditText editText = this.f32228c;
                    int i11 = 0;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ta.a aVar3 = j0Var.f36400f;
                            kotlin.jvm.internal.m.c(aVar3);
                            ((j4) aVar3).f32769f.addView((View) obj);
                        }
                    } else {
                        ArrayList arrayList2 = (ArrayList) j0Var.Q.get(view2);
                        ArrayList arrayList3 = new ArrayList();
                        if (arrayList2 != null) {
                            Collections.shuffle(arrayList2);
                        }
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                int i13 = i12 + 1;
                                PdWord pdWord = (PdWord) arrayList2.get(i12);
                                LayoutInflater layoutInflaterFrom = LayoutInflater.from(j0Var.requireContext());
                                ta.a aVar4 = j0Var.f36400f;
                                kotlin.jvm.internal.m.c(aVar4);
                                View viewInflate = layoutInflaterFrom.inflate(R.layout.item_pd_dictation_option, (ViewGroup) ((j4) aVar4).f32769f, false);
                                kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                linearLayout.setTag(pdWord);
                                View viewFindViewById = linearLayout.findViewById(R.id.tv_top);
                                kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                                View viewFindViewById2 = linearLayout.findViewById(R.id.tv_middle);
                                kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                                View viewFindViewById3 = linearLayout.findViewById(R.id.tv_bottom);
                                kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
                                th.h.a(pdWord, (TextView) viewFindViewById, (TextView) viewFindViewById2, (TextView) viewFindViewById3);
                                ta.a aVar5 = j0Var.f36400f;
                                kotlin.jvm.internal.m.c(aVar5);
                                ((j4) aVar5).f32769f.addView(linearLayout);
                                bq.z.b(linearLayout, new b1.a(linearLayout, j0Var, editText, pdWord, view2, 12));
                                arrayList3.add(linearLayout);
                                i12 = i13;
                            }
                        }
                        map.put(view2, arrayList3);
                    }
                    ta.a aVar6 = j0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar6);
                    bq.z.b(((j4) aVar6).f32771h, new fu.j0(j0Var, view2, editText, 5));
                    editText.addTextChangedListener(new s(j0Var, 1));
                    j0Var.z();
                }
                break;
            default:
                k2 k2Var = (k2) this.f32229d;
                ta.a aVar7 = k2Var.f47886f;
                HashMap map2 = k2Var.m;
                kotlin.jvm.internal.m.c(aVar7);
                if (z11) {
                    ta.a aVar8 = k2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar8);
                    ((p2) aVar8).f33082b.removeAllViews();
                    View view3 = this.f32227b;
                    ArrayList arrayList4 = (ArrayList) map2.get(view3);
                    EditText editText2 = this.f32228c;
                    int i14 = 0;
                    if (arrayList4 != null) {
                        int size3 = arrayList4.size();
                        while (i14 < size3) {
                            Object obj2 = arrayList4.get(i14);
                            i14++;
                            ta.a aVar9 = k2Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar9);
                            ((p2) aVar9).f33082b.addView((View) obj2);
                        }
                    } else {
                        ArrayList arrayList5 = (ArrayList) k2Var.f48010k.get(view3);
                        ArrayList arrayList6 = new ArrayList();
                        if (arrayList5 != null) {
                            Collections.shuffle(arrayList5);
                        }
                        if (arrayList5 != null) {
                            int size4 = arrayList5.size();
                            int i15 = 0;
                            while (i15 < size4) {
                                int i16 = i15 + 1;
                                Word word = (Word) arrayList5.get(i15);
                                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(k2Var.f47883c);
                                ta.a aVar10 = k2Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar10);
                                View viewInflate2 = layoutInflaterFrom2.inflate(R.layout.item_pd_dictation_option, (ViewGroup) ((p2) aVar10).f33082b, false);
                                kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                                LinearLayout linearLayout2 = (LinearLayout) viewInflate2;
                                linearLayout2.setTag(word);
                                View viewFindViewById4 = linearLayout2.findViewById(R.id.tv_top);
                                kotlin.jvm.internal.m.e(viewFindViewById4, "findViewById(...)");
                                View viewFindViewById5 = linearLayout2.findViewById(R.id.tv_middle);
                                kotlin.jvm.internal.m.e(viewFindViewById5, "findViewById(...)");
                                View viewFindViewById6 = linearLayout2.findViewById(R.id.tv_bottom);
                                kotlin.jvm.internal.m.e(viewFindViewById6, "findViewById(...)");
                                zq.c.e(word, (TextView) viewFindViewById4, (TextView) viewFindViewById5, (TextView) viewFindViewById6, false);
                                ta.a aVar11 = k2Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar11);
                                ((p2) aVar11).f33082b.addView(linearLayout2);
                                bq.z.b(linearLayout2, new b1.a(linearLayout2, k2Var, editText2, word, view3, 19));
                                arrayList6.add(linearLayout2);
                                i15 = i16;
                            }
                        }
                        map2.put(view3, arrayList6);
                    }
                    ta.a aVar12 = k2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar12);
                    bq.z.b(((p2) aVar12).f33084d, new pr.a0(k2Var, view3, editText2, 6));
                    editText2.addTextChangedListener(new s(k2Var, 3));
                    k2Var.r();
                }
                break;
        }
    }
}
