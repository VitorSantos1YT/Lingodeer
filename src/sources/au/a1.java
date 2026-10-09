package au;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.widget.DeleteWordView;
import com.lingodeer.R;
import com.lingodeer.database.model.SRSStatusEntity;
import com.yalantis.ucrop.view.CropImageView;
import hj.h2;
import j0.a2;
import j0.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qp.q1;
import s0.m1;
import s0.o1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2941e;

    public /* synthetic */ a1(Object obj, Object obj2, int i11, Object obj3, int i12) {
        this.f2937a = i12;
        this.f2939c = obj;
        this.f2940d = obj2;
        this.f2938b = i11;
        this.f2941e = obj3;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        ImageView imageView;
        TextView textView;
        TextView textView2;
        TextView textView3;
        int i11;
        int i12 = this.f2937a;
        qy.b0 b0Var = qy.b0.f48488a;
        int i13 = 1;
        Object obj2 = this.f2941e;
        Object obj3 = this.f2940d;
        int i14 = this.f2938b;
        Object obj4 = this.f2939c;
        switch (i12) {
            case 0:
                List list = (List) obj3;
                List list2 = (List) obj2;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1((String) obj4);
                try {
                    Iterator it = list.iterator();
                    int i15 = 1;
                    while (it.hasNext()) {
                        cVarB1.b0(i15, (String) it.next());
                        i15++;
                    }
                    int i16 = i14 + 1;
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        cVarB1.g(i16, ((Number) it2.next()).longValue());
                        i16++;
                    }
                    int iM = com.bumptech.glide.g.m(cVarB1, "id");
                    int iM2 = com.bumptech.glide.g.m(cVarB1, "unit_id");
                    int iM3 = com.bumptech.glide.g.m(cVarB1, "elem_id");
                    int iM4 = com.bumptech.glide.g.m(cVarB1, "elem_type");
                    int iM5 = com.bumptech.glide.g.m(cVarB1, "lan");
                    int iM6 = com.bumptech.glide.g.m(cVarB1, "type");
                    int iM7 = com.bumptech.glide.g.m(cVarB1, "last_study_time");
                    int iM8 = com.bumptech.glide.g.m(cVarB1, "last_study_status");
                    int iM9 = com.bumptech.glide.g.m(cVarB1, "is_reviewed");
                    int iM10 = com.bumptech.glide.g.m(cVarB1, "status");
                    int iM11 = com.bumptech.glide.g.m(cVarB1, "last_review_time");
                    int iM12 = com.bumptech.glide.g.m(cVarB1, "next_review_time");
                    int iM13 = com.bumptech.glide.g.m(cVarB1, "interval");
                    int iM14 = com.bumptech.glide.g.m(cVarB1, "ease_factor");
                    int iM15 = com.bumptech.glide.g.m(cVarB1, "learning_step");
                    int iM16 = com.bumptech.glide.g.m(cVarB1, "lapses");
                    int iM17 = com.bumptech.glide.g.m(cVarB1, "so_easy_count");
                    int iM18 = com.bumptech.glide.g.m(cVarB1, "last_high_so_easy_count");
                    int iM19 = com.bumptech.glide.g.m(cVarB1, "last_modifier_time");
                    int iM20 = com.bumptech.glide.g.m(cVarB1, "pending_update");
                    int iM21 = com.bumptech.glide.g.m(cVarB1, "is_excluded_from_review");
                    ArrayList arrayList = new ArrayList();
                    while (cVarB1.r1()) {
                        String strB0 = cVarB1.B0(iM);
                        long j11 = cVarB1.getLong(iM2);
                        long j12 = cVarB1.getLong(iM3);
                        int i17 = iM2;
                        int i18 = iM3;
                        int i19 = (int) cVarB1.getLong(iM4);
                        String strB1 = cVarB1.B0(iM5);
                        String strB2 = cVarB1.B0(iM6);
                        long j13 = cVarB1.getLong(iM7);
                        int i21 = (int) cVarB1.getLong(iM8);
                        int i22 = (int) cVarB1.getLong(iM9);
                        int i23 = (int) cVarB1.getLong(iM10);
                        long j14 = cVarB1.getLong(iM11);
                        long j15 = cVarB1.getLong(iM12);
                        long j16 = cVarB1.getLong(iM13);
                        float f5 = (float) cVarB1.getDouble(iM14);
                        int i24 = iM15;
                        int i25 = iM4;
                        int i26 = iM5;
                        int i27 = (int) cVarB1.getLong(i24);
                        int i28 = iM16;
                        int i29 = (int) cVarB1.getLong(i28);
                        int i30 = iM17;
                        int i31 = (int) cVarB1.getLong(i30);
                        int i32 = iM18;
                        int i33 = iM19;
                        int i34 = iM;
                        int i35 = iM20;
                        int i36 = iM21;
                        arrayList.add(new SRSStatusEntity(strB0, j11, j12, i19, strB1, strB2, j13, i21, i22, i23, j14, j15, j16, f5, i27, i29, i31, (int) cVarB1.getLong(i32), cVarB1.getLong(i33), ((int) cVarB1.getLong(i35)) != 0, (int) cVarB1.getLong(i36)));
                        iM20 = i35;
                        iM = i34;
                        iM19 = i33;
                        iM4 = i25;
                        iM21 = i36;
                        iM15 = i24;
                        iM16 = i28;
                        iM17 = i30;
                        iM2 = i17;
                        iM3 = i18;
                        iM18 = i32;
                        iM5 = i26;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarB1.close();
                }
            case 1:
                w2.g1[] g1VarArr = (w2.g1[]) obj4;
                a2 a2Var = (a2) obj3;
                int[] iArr = (int[]) obj2;
                w2.f1 f1Var = (w2.f1) obj;
                int length = g1VarArr.length;
                int i37 = 0;
                int i38 = 0;
                while (i37 < length) {
                    w2.g1 g1Var = g1VarArr[i37];
                    int i39 = i38 + 1;
                    kotlin.jvm.internal.m.c(g1Var);
                    Object objG = g1Var.G();
                    y1 y1Var = objG instanceof y1 ? (y1) objG : null;
                    j0.c cVar = y1Var != null ? y1Var.f35443c : null;
                    f1Var.f(g1Var, iArr[i38], cVar != null ? cVar.i(i14 - g1Var.f54502b, v3.m.Ltr) : a2Var.f35248b.a(0, i14 - g1Var.f54502b), CropImageView.DEFAULT_ASPECT_RATIO);
                    i37++;
                    i38 = i39;
                }
                return b0Var;
            case 2:
                t1.f fVar = (t1.f) obj3;
                y.d0 d0Var = (y.d0) obj2;
                if (obj == ((l1.g0) obj4)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof x1.y) {
                    int i40 = fVar.f51988a - i14;
                    int iD = d0Var.d(obj);
                    d0Var.g(Math.min(i40, iD >= 0 ? d0Var.f56679c[iD] : Integer.MAX_VALUE), obj);
                }
                return b0Var;
            case 3:
                q1 q1Var = (q1) obj4;
                ImageView imageView2 = (ImageView) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                View v11 = (View) obj;
                kotlin.jvm.internal.m.f(v11, "v");
                FrameLayout frameLayout2 = q1Var.f48129j;
                if (frameLayout2 != null && (textView3 = (TextView) frameLayout2.findViewById(R.id.tv_top)) != null) {
                    textView3.setAlpha(1.0f);
                }
                FrameLayout frameLayout3 = q1Var.f48129j;
                if (frameLayout3 != null && (textView2 = (TextView) frameLayout3.findViewById(R.id.tv_middle)) != null) {
                    textView2.setAlpha(1.0f);
                }
                FrameLayout frameLayout4 = q1Var.f48129j;
                if (frameLayout4 != null && (textView = (TextView) frameLayout4.findViewById(R.id.tv_bottom)) != null) {
                    textView.setAlpha(1.0f);
                }
                FrameLayout frameLayout5 = q1Var.f48129j;
                if (frameLayout5 != null && (imageView = (ImageView) frameLayout5.findViewById(R.id.iv_delete)) != null) {
                    imageView.setVisibility(0);
                }
                imageView2.setVisibility(8);
                ta.a aVar = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                int i41 = 4;
                ((h2) aVar).f32654d.setVisibility(4);
                ta.a aVar2 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((h2) aVar2).f32654d.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                ta.a aVar3 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((h2) aVar3).f32654d.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                if (q1Var.f48129j != null) {
                    q1Var.f48129j = null;
                    q1Var.f48133o = -1;
                }
                q1Var.f48129j = (FrameLayout) v11;
                q1Var.f48133o = i14;
                ta.a aVar4 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ViewGroup.LayoutParams layoutParams = ((h2) aVar4).f32654d.getLayoutParams();
                FrameLayout frameLayout6 = q1Var.f48129j;
                kotlin.jvm.internal.m.c(frameLayout6);
                layoutParams.width = frameLayout6.getWidth();
                FrameLayout frameLayout7 = q1Var.f48129j;
                kotlin.jvm.internal.m.c(frameLayout7);
                layoutParams.height = frameLayout7.getHeight();
                ta.a aVar5 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((h2) aVar5).f32654d.setLayoutParams(layoutParams);
                ta.a aVar6 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                DeleteWordView deleteWordView = ((h2) aVar6).f32654d;
                deleteWordView.postDelayed(new b2.c(i41, deleteWordView, new mt.l0(q1Var, frameLayout, v11, 16)), 0L);
                return b0Var;
            case 4:
                s0.j0 j0Var = (s0.j0) obj4;
                w2.s0 s0Var = (w2.s0) obj3;
                w2.g1 g1Var2 = (w2.g1) obj2;
                w2.f1 f1Var2 = (w2.f1) obj;
                int i42 = j0Var.f51069b;
                m1 m1Var = j0Var.f51068a;
                o3.d0 d0Var2 = j0Var.f51070c;
                o1 o1Var = (o1) j0Var.f51071d.invoke();
                m1Var.a(f0.h1.Horizontal, s0.o0.l(f1Var2, i42, d0Var2, o1Var != null ? o1Var.f51124a : null, s0Var.getLayoutDirection() == v3.m.Rtl, g1Var2.f54501a), i14, g1Var2.f54501a);
                w2.f1.k(f1Var2, g1Var2, Math.round(-m1Var.f51099a.l()), 0);
                return b0Var;
            default:
                zq.b bVar = (zq.b) obj4;
                Word word = (Word) obj3;
                FrameLayout frameLayout8 = (FrameLayout) obj2;
                View view = (View) obj;
                kotlin.jvm.internal.m.f(view, "view");
                PopupWindow popupWindow = bVar.f59275k;
                FlexboxLayout flexboxLayout = bVar.f59267c;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                bVar.f59276l = i14;
                String strC = bVar.c(word);
                bVar.f59275k = null;
                try {
                    PopupWindow popupWindowQ = cf.x.q(view, bVar.f59265a, word, strC, bVar.m, bVar.f59278o);
                    bVar.f59275k = popupWindowQ;
                    popupWindowQ.setOnDismissListener(new jp.b(bVar, i13, frameLayout8));
                    int width = (view.getWidth() / 2) - (popupWindowQ.getWidth() / 2);
                    String explanation = word.getExplanation();
                    kotlin.jvm.internal.m.e(explanation, "getExplanation(...)");
                    int length2 = explanation.length() - 1;
                    int i43 = 0;
                    boolean z11 = false;
                    while (true) {
                        if (i43 <= length2) {
                            i11 = 0;
                            boolean z12 = kotlin.jvm.internal.m.h(explanation.charAt(!z11 ? i43 : length2), 32) <= 0;
                            if (z11) {
                                if (z12) {
                                    length2--;
                                }
                            } else if (z12) {
                                i43++;
                            } else {
                                z11 = true;
                            }
                        } else {
                            i11 = 0;
                        }
                    }
                    if (TextUtils.isEmpty(explanation.subSequence(i43, length2 + 1).toString())) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
                            popupWindowQ.showAsDropDown(view, -width, 0);
                        } else {
                            popupWindowQ.showAsDropDown(view, width, 0);
                        }
                    } else {
                        int[] iArr2 = new int[2];
                        view.getLocationOnScreen(iArr2);
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
                            popupWindowQ.showAsDropDown(view, ff.h.l(40.0f) - ((iArr2[i11] + view.getWidth()) - popupWindowQ.getWidth()), i11);
                        } else {
                            popupWindowQ.showAsDropDown(view, ff.h.l(40.0f) - iArr2[0], 0);
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                zq.a aVar7 = bVar.m;
                if (aVar7 != null) {
                    aVar7.x(strC);
                }
                int childCount = flexboxLayout.getChildCount();
                for (int i44 = 0; i44 < childCount; i44++) {
                    View childAt = flexboxLayout.getChildAt(i44);
                    kotlin.jvm.internal.m.e(childAt, "getChildAt(...)");
                    if (!(childAt instanceof ImageView)) {
                        childAt.setBackgroundResource(0);
                    }
                }
                frameLayout8.setBackgroundResource(R.drawable.bg_sentence_item_click);
                return b0Var;
        }
    }

    public /* synthetic */ a1(Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f2937a = i12;
        this.f2939c = obj;
        this.f2940d = obj2;
        this.f2941e = obj3;
        this.f2938b = i11;
    }

    public /* synthetic */ a1(zq.b bVar, int i11, Word word, FrameLayout frameLayout) {
        this.f2937a = 5;
        this.f2939c = bVar;
        this.f2938b = i11;
        this.f2940d = word;
        this.f2941e = frameLayout;
    }
}
