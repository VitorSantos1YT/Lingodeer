package qp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.itskill.ui.learn.ITSyllableIntroductionActivity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import rt.m5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements tx.c, jp.m0, tf.k0, z4.u, com.bumptech.glide.load.data.c, ki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f47832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f47833c;

    public /* synthetic */ b(int i11) {
        this.f47831a = i11;
    }

    @Override // jp.m0
    public void D(ConstraintLayout constraintLayout) {
        switch (this.f47831a) {
            case 1:
                ((TextView) ((jp.p0) ((y1) this.f47832b).f47881a).y().findViewById(R.id.txt_answer_txt_2)).setText((SpannableStringBuilder) this.f47833c);
                break;
            default:
                ((TextView) ((jp.p0) ((h3) this.f47832b).f47881a).y().findViewById(R.id.txt_answer_txt_2)).setText((SpannableStringBuilder) this.f47833c);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01ce A[PHI: r6 r8
      0x01ce: PHI (r6v12 float) = (r6v11 float), (r6v11 float), (r6v28 float) binds: [B:32:0x019c, B:43:0x020f, B:38:0x01cb] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r8v1 float) = (r8v0 float), (r8v0 float), (r8v12 float) binds: [B:32:0x019c, B:43:0x020f, B:38:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    public Path a(ArrayList arrayList) {
        int i11;
        float f5;
        float f11;
        float f12;
        Path path = (Path) this.f47833c;
        path.reset();
        xs.d dVar = (xs.d) this.f47832b;
        dVar.f56228a = CropImageView.DEFAULT_ASPECT_RATIO;
        dVar.f56229b = CropImageView.DEFAULT_ASPECT_RATIO;
        int size = arrayList.size();
        xs.c cVar = null;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            xs.c cVar2 = (xs.c) arrayList.get(i13);
            String str = cVar2.f56225a;
            ArrayList arrayList2 = cVar2.f56227c;
            if (str.equals("m")) {
                if (cVar2.f56226b) {
                    float f13 = ((xs.d) arrayList2.get(i12)).f56228a;
                    float f14 = ((xs.d) arrayList2.get(i12)).f56229b;
                    dVar.f56228a = f13;
                    dVar.f56229b = f14;
                } else {
                    float f15 = dVar.f56228a + ((xs.d) arrayList2.get(i12)).f56228a;
                    float f16 = dVar.f56229b + ((xs.d) arrayList2.get(i12)).f56229b;
                    dVar.f56228a = f15;
                    dVar.f56229b = f16;
                }
                path.moveTo(dVar.f56228a, dVar.f56229b);
                if (arrayList2.size() > 1) {
                    for (int i14 = 1; i14 < arrayList2.size(); i14++) {
                        if (cVar2.f56226b) {
                            float f17 = ((xs.d) arrayList2.get(i14)).f56228a;
                            float f18 = ((xs.d) arrayList2.get(i14)).f56229b;
                            dVar.f56228a = f17;
                            dVar.f56229b = f18;
                        } else {
                            float f19 = dVar.f56228a + ((xs.d) arrayList2.get(i14)).f56228a;
                            float f21 = dVar.f56229b + ((xs.d) arrayList2.get(i14)).f56229b;
                            dVar.f56228a = f19;
                            dVar.f56229b = f21;
                        }
                        path.lineTo(dVar.f56228a, dVar.f56229b);
                    }
                }
            } else if (cVar2.f56225a.equals("z")) {
                path.close();
            } else {
                if (!cVar2.f56225a.equals("c")) {
                    if (cVar2.f56225a.equals("s")) {
                        float f22 = dVar.f56228a;
                        float f23 = dVar.f56229b;
                        if (cVar != null) {
                            ArrayList arrayList3 = cVar.f56227c;
                            if (cVar.f56225a.equals("c")) {
                                if (cVar.f56226b) {
                                    f22 = (dVar.f56228a * 2.0f) + (((xs.d) arrayList3.get(1)).f56228a * (-1.0f));
                                    f11 = ((xs.d) arrayList3.get(1)).f56229b * (-1.0f);
                                    f12 = dVar.f56229b;
                                    f23 = (f12 * 2.0f) + f11;
                                    f5 = f22;
                                } else {
                                    float f24 = dVar.f56228a - ((xs.d) arrayList3.get(2)).f56228a;
                                    float f25 = dVar.f56229b - ((xs.d) arrayList3.get(2)).f56229b;
                                    f5 = (dVar.f56228a * 2.0f) + ((((xs.d) arrayList3.get(1)).f56228a + f24) * (-1.0f));
                                    f23 = (dVar.f56229b * 2.0f) + ((((xs.d) arrayList3.get(1)).f56229b + f25) * (-1.0f));
                                }
                            } else if (!cVar.f56225a.equals("s")) {
                                f5 = f22;
                            } else if (cVar.f56226b) {
                                f22 = (dVar.f56228a * 2.0f) + (((xs.d) arrayList3.get(0)).f56228a * (-1.0f));
                                f11 = ((xs.d) arrayList3.get(0)).f56229b * (-1.0f);
                                f12 = dVar.f56229b;
                                f23 = (f12 * 2.0f) + f11;
                                f5 = f22;
                            } else {
                                float f26 = dVar.f56228a - ((xs.d) arrayList3.get(1)).f56228a;
                                float f27 = dVar.f56229b - ((xs.d) arrayList3.get(1)).f56229b;
                                f5 = (dVar.f56228a * 2.0f) + ((((xs.d) arrayList3.get(0)).f56228a + f26) * (-1.0f));
                                f23 = (dVar.f56229b * 2.0f) + ((((xs.d) arrayList3.get(0)).f56229b + f27) * (-1.0f));
                            }
                        } else {
                            f5 = f22;
                        }
                        float f28 = f23;
                        if (cVar2.f56226b) {
                            path.cubicTo(f5, f28, ((xs.d) arrayList2.get(0)).f56228a, ((xs.d) arrayList2.get(0)).f56229b, ((xs.d) arrayList2.get(1)).f56228a, ((xs.d) arrayList2.get(1)).f56229b);
                            float f29 = ((xs.d) arrayList2.get(1)).f56228a;
                            float f30 = ((xs.d) arrayList2.get(1)).f56229b;
                            dVar.f56228a = f29;
                            dVar.f56229b = f30;
                        } else {
                            path.cubicTo(f5, f28, ((xs.d) arrayList2.get(0)).f56228a + dVar.f56228a, ((xs.d) arrayList2.get(0)).f56229b + dVar.f56229b, ((xs.d) arrayList2.get(1)).f56228a + dVar.f56228a, ((xs.d) arrayList2.get(1)).f56229b + dVar.f56229b);
                            float f31 = ((xs.d) arrayList2.get(1)).f56228a + dVar.f56228a;
                            float f32 = ((xs.d) arrayList2.get(1)).f56229b + dVar.f56229b;
                            dVar.f56228a = f31;
                            dVar.f56229b = f32;
                        }
                    } else if (cVar2.f56225a.equals("v")) {
                        if (cVar2.f56226b) {
                            path.lineTo(dVar.f56228a, ((xs.d) arrayList2.get(0)).f56229b);
                            dVar.f56229b = ((xs.d) arrayList2.get(0)).f56229b;
                        } else {
                            path.lineTo(dVar.f56228a, ((xs.d) arrayList2.get(0)).f56229b + dVar.f56229b);
                            dVar.f56229b = ((xs.d) arrayList2.get(0)).f56229b + dVar.f56229b;
                        }
                    } else if (cVar2.f56225a.equals("h")) {
                        if (cVar2.f56226b) {
                            path.lineTo(((xs.d) arrayList2.get(0)).f56228a, dVar.f56229b);
                            dVar.f56228a = ((xs.d) arrayList2.get(0)).f56228a;
                        } else {
                            path.lineTo(((xs.d) arrayList2.get(0)).f56228a + dVar.f56228a, dVar.f56229b);
                            dVar.f56228a = ((xs.d) arrayList2.get(0)).f56228a + dVar.f56228a;
                        }
                    } else if (cVar2.f56225a.equals("l")) {
                        if (cVar2.f56226b) {
                            i11 = 0;
                            float f33 = ((xs.d) arrayList2.get(0)).f56228a;
                            float f34 = ((xs.d) arrayList2.get(0)).f56229b;
                            dVar.f56228a = f33;
                            dVar.f56229b = f34;
                        } else {
                            i11 = 0;
                            float f35 = dVar.f56228a + ((xs.d) arrayList2.get(0)).f56228a;
                            float f36 = dVar.f56229b + ((xs.d) arrayList2.get(0)).f56229b;
                            dVar.f56228a = f35;
                            dVar.f56229b = f36;
                        }
                        path.lineTo(dVar.f56228a, dVar.f56229b);
                    }
                    i11 = 0;
                } else if (cVar2.f56226b) {
                    path.cubicTo(((xs.d) arrayList2.get(i12)).f56228a, ((xs.d) arrayList2.get(i12)).f56229b, ((xs.d) arrayList2.get(1)).f56228a, ((xs.d) arrayList2.get(1)).f56229b, ((xs.d) arrayList2.get(2)).f56228a, ((xs.d) arrayList2.get(2)).f56229b);
                    float f37 = ((xs.d) arrayList2.get(2)).f56228a;
                    float f38 = ((xs.d) arrayList2.get(2)).f56229b;
                    dVar.f56228a = f37;
                    dVar.f56229b = f38;
                } else {
                    path.cubicTo(((xs.d) arrayList2.get(i12)).f56228a + dVar.f56228a, ((xs.d) arrayList2.get(i12)).f56229b + dVar.f56229b, ((xs.d) arrayList2.get(1)).f56228a + dVar.f56228a, ((xs.d) arrayList2.get(1)).f56229b + dVar.f56229b, ((xs.d) arrayList2.get(2)).f56228a + dVar.f56228a, ((xs.d) arrayList2.get(2)).f56229b + dVar.f56229b);
                    float f39 = dVar.f56228a + ((xs.d) arrayList2.get(2)).f56228a;
                    float f40 = dVar.f56229b + ((xs.d) arrayList2.get(2)).f56229b;
                    dVar.f56228a = f39;
                    dVar.f56229b = f40;
                }
                i13++;
                i12 = i11;
                cVar = cVar2;
            }
            i11 = i12;
            i13++;
            i12 = i11;
            cVar = cVar2;
        }
        return path;
    }

    @Override // tx.c
    public void accept(Object obj) {
        Long it = (Long) obj;
        kotlin.jvm.internal.m.f(it, "it");
        ((d) this.f47832b).m((ViewGroup) this.f47833c);
    }

    public void b(w4.f fVar) {
        o20.a aVar = (o20.a) this.f47833c;
        o20.w wVar = (o20.w) this.f47832b;
        int i11 = fVar.f54640b;
        if (i11 != 0) {
            aVar.execute(new v5.h(wVar, i11));
        } else {
            aVar.execute(new aw.t(wVar, fVar.f54639a, false, 22));
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public void c(Exception exc) {
        vd.e0 e0Var = (vd.e0) this.f47833c;
        zd.p pVar = (zd.p) this.f47832b;
        zd.p pVar2 = e0Var.f53878f;
        if (pVar2 == null || pVar2 != pVar) {
            return;
        }
        vd.e0 e0Var2 = (vd.e0) this.f47833c;
        zd.p pVar3 = (zd.p) this.f47832b;
        vd.l lVar = e0Var2.f53874b;
        vd.e eVar = e0Var2.f53879t;
        com.bumptech.glide.load.data.d dVar = pVar3.f59182c;
        lVar.c(eVar, exc, dVar, dVar.d());
    }

    public void d(int i11, int i12, int i13, int i14) {
        CardView cardView = (CardView) this.f47833c;
        cardView.f1114d.set(i11, i12, i13, i14);
        Rect rect = cardView.f1113c;
        super/*android.view.View*/.setPadding(i11 + rect.left, i12 + rect.top, i13 + rect.right, i14 + rect.bottom);
    }

    @Override // z4.u
    public z4.v1 e(View view, z4.v1 v1Var) {
        ViewPager viewPager = (ViewPager) this.f47833c;
        z4.v1 v1VarK = z4.s0.k(view, v1Var);
        if (v1VarK.f58905a.o()) {
            return v1VarK;
        }
        Rect rect = (Rect) this.f47832b;
        rect.left = v1VarK.b();
        rect.top = v1VarK.d();
        rect.right = v1VarK.c();
        rect.bottom = v1VarK.a();
        int childCount = viewPager.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            z4.v1 v1VarC = z4.s0.c(viewPager.getChildAt(i11), v1VarK);
            rect.left = Math.min(v1VarC.b(), rect.left);
            rect.top = Math.min(v1VarC.d(), rect.top);
            rect.right = Math.min(v1VarC.c(), rect.right);
            rect.bottom = Math.min(v1VarC.a(), rect.bottom);
        }
        return v1VarK.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.bumptech.glide.load.data.c
    public void f(Object obj) {
        vd.e0 e0Var = (vd.e0) this.f47833c;
        zd.p pVar = (zd.p) this.f47832b;
        zd.p pVar2 = e0Var.f53878f;
        if (pVar2 == null || pVar2 != pVar) {
            return;
        }
        vd.e0 e0Var2 = (vd.e0) this.f47833c;
        zd.p pVar3 = (zd.p) this.f47832b;
        vd.n nVar = e0Var2.f53873a.f53894p;
        if (obj != null && nVar.a(pVar3.f59182c.d())) {
            e0Var2.f53877e = obj;
            e0Var2.f53874b.m(vd.j.SWITCH_TO_SOURCE_SERVICE);
        } else {
            vd.l lVar = e0Var2.f53874b;
            td.g gVar = pVar3.f59180a;
            com.bumptech.glide.load.data.d dVar = pVar3.f59182c;
            lVar.b(gVar, obj, dVar, dVar.d(), e0Var2.f53879t);
        }
    }

    @Override // ki.a
    public void m() {
        int[] iArr = bq.r.f4959a;
        String str = (String) ((kotlin.jvm.internal.y) this.f47832b).f38361a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        bq.m.L(str, bq.m.r(cf.x.n().keyLanguage) + ":" + bq.m.r(cf.x.n().locateLanguage) + "-ALPHABET.txt");
        Toast.makeText((ITSyllableIntroductionActivity) this.f47833c, R.string.success, 1).show();
    }

    @Override // tf.k0
    public Activity n() {
        Object obj = (i.j) this.f47832b;
        if (obj instanceof Activity) {
            return (Activity) obj;
        }
        return null;
    }

    @Override // tf.k0
    public void startActivityForResult(Intent intent, int i11) {
        m5 m5Var = new m5(3, false);
        i.h hVarD = ((i.j) this.f47832b).getActivityResultRegistry().d("facebook-login", new androidx.fragment.app.e1(8), new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(21, this, m5Var));
        m5Var.f50058b = hVarD;
        hVarD.a(intent);
    }

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f47831a = i11;
        this.f47832b = obj;
        this.f47833c = obj2;
    }

    public b() {
        this.f47831a = 11;
        this.f47832b = new xs.d();
        this.f47833c = new Path();
    }

    public b(vd.e0 e0Var, zd.p pVar) {
        this.f47831a = 7;
        this.f47833c = e0Var;
        this.f47832b = pVar;
    }

    public b(ViewPager viewPager) {
        this.f47831a = 5;
        this.f47833c = viewPager;
        this.f47832b = new Rect();
    }

    public b(CardView cardView) {
        this.f47831a = 9;
        this.f47833c = cardView;
    }

    public b(i.j jVar, lf.j callbackManager) {
        this.f47831a = 4;
        kotlin.jvm.internal.m.f(callbackManager, "callbackManager");
        this.f47832b = jVar;
        this.f47833c = callbackManager;
    }

    @Override // ki.a
    public void B() {
    }
}
