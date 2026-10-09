package zi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bq.r;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.v1;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import jp.p0;
import kotlin.jvm.internal.m;
import qh.z;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f59236b;

    public /* synthetic */ d(g gVar, int i11) {
        this.f59235a = i11;
        this.f59236b = gVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f59235a;
        b0 b0Var = b0.f48488a;
        g gVar = this.f59236b;
        int i12 = 0;
        switch (i11) {
            case 0:
                View v11 = (View) obj;
                m.f(v11, "v");
                mp.b bVar = gVar.f59222a;
                ArrayList arrayList = gVar.f59242j;
                String str = (String) arrayList.get(gVar.f59243k);
                xi.b bVar2 = gVar.f59223b;
                String strR = com.bumptech.glide.f.r(bVar2.f56089c, str);
                ta.a aVar = gVar.f59227f;
                m.c(aVar);
                ((p0) bVar).H((ImageView) ((v1) aVar).f33450d.f32408d, strR);
                int[] iArr = r.f4959a;
                long jB = bq.m.B(com.bumptech.glide.f.r(bVar2.f56089c, (String) arrayList.get(gVar.f59243k)));
                int[] iArr2 = new int[2];
                ta.a aVar2 = gVar.f59227f;
                m.c(aVar2);
                int[] iArr3 = {(((v1) aVar).f33451e.getWidth() / 2) + i, (((v1) aVar).f33451e.getHeight() / 2) + i};
                ((v1) aVar2).f33451e.getLocationOnScreen(iArr3);
                int i13 = iArr3[0];
                ta.a aVar3 = gVar.f59227f;
                m.c(aVar3);
                int i14 = 1;
                int i15 = iArr3[1];
                ta.a aVar4 = gVar.f59227f;
                m.c(aVar4);
                ta.a aVar5 = gVar.f59227f;
                m.c(aVar5);
                int childCount = ((v1) aVar5).f33448b.getChildCount();
                View view = null;
                int i16 = 0;
                while (i16 < childCount) {
                    ta.a aVar6 = gVar.f59227f;
                    m.c(aVar6);
                    View childAt = ((v1) aVar6).f33448b.getChildAt(i16);
                    TextView textView = (TextView) childAt.findViewById(R.id.tv_pinyin);
                    String string = textView.getText().toString();
                    int i17 = i14;
                    ta.a aVar7 = gVar.f59227f;
                    m.c(aVar7);
                    if (m.a(string, ((v1) aVar7).f33451e.getText().toString())) {
                        childAt.getLocationOnScreen(iArr2);
                        iArr2[0] = com.google.android.material.datepicker.d.c(childAt, 2, iArr2[0]);
                        iArr2[i17] = (childAt.getHeight() / 2) + iArr2[i17];
                        textView.setVisibility(0);
                        view = childAt;
                    }
                    i16++;
                    i14 = i17;
                }
                int i18 = i14;
                if (view != null) {
                    ta.a aVar8 = gVar.f59227f;
                    m.c(aVar8);
                    TextView textView2 = ((v1) aVar8).f33451e;
                    float[] fArr = new float[i18];
                    fArr[0] = iArr2[0] - iArr3[0];
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView2, "translationX", fArr);
                    m.e(objectAnimatorOfFloat, "ofFloat(...)");
                    ta.a aVar9 = gVar.f59227f;
                    m.c(aVar9);
                    TextView textView3 = ((v1) aVar9).f33451e;
                    float f5 = iArr2[i18] - iArr3[i18];
                    float[] fArr2 = new float[i18];
                    fArr2[0] = f5;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView3, "translationY", fArr2);
                    m.e(objectAnimatorOfFloat2, "ofFloat(...)");
                    AnimatorSet animatorSet = new AnimatorSet();
                    gVar.f59244l = animatorSet;
                    animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
                    AnimatorSet animatorSet2 = gVar.f59244l;
                    m.c(animatorSet2);
                    animatorSet2.setDuration(300L);
                    gVar.m = new f(view, gVar, jB);
                    AnimatorSet animatorSet3 = gVar.f59244l;
                    m.c(animatorSet3);
                    animatorSet3.addListener(gVar.m);
                    AnimatorSet animatorSet4 = gVar.f59244l;
                    m.c(animatorSet4);
                    animatorSet4.start();
                }
                break;
            case 1:
                View it = (View) obj;
                m.f(it, "it");
                gVar.f59241i = 0L;
                xi.b bVar3 = gVar.f59223b;
                int i19 = gVar.f59243k;
                ArrayList arrayList2 = gVar.f59242j;
                if (i19 >= arrayList2.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    String strA = bVar3.a();
                    int i21 = bVar3.f56089c;
                    if (!strA.equals(BuildConfig.VERSION_NAME) && new File(com.bumptech.glide.f.r(i21, bVar3.a())).exists()) {
                        arrayList3.add(com.bumptech.glide.f.r(i21, bVar3.a()));
                    }
                    if (!bVar3.c().equals(BuildConfig.VERSION_NAME) && new File(com.bumptech.glide.f.r(i21, bVar3.c())).exists()) {
                        arrayList3.add(com.bumptech.glide.f.r(i21, bVar3.c()));
                    }
                    if (new File(com.bumptech.glide.f.s(bVar3)).exists()) {
                        arrayList3.add(com.bumptech.glide.f.s(bVar3));
                    }
                    int size = arrayList3.size();
                    while (i12 < size) {
                        Object obj2 = arrayList3.get(i12);
                        i12++;
                        m.e(obj2, "next(...)");
                        String str2 = (String) obj2;
                        int iIndexOf = arrayList3.indexOf(str2);
                        if (iIndexOf > 0) {
                            long j11 = gVar.f59241i;
                            int[] iArr4 = r.f4959a;
                            gVar.f59241i = bq.m.B((String) arrayList3.get(iIndexOf - 1)) + j11;
                        }
                        th.j.a(qx.h.m(gVar.f59241i, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new z(14, gVar, str2), a.f59217d), gVar.f59228g);
                    }
                } else {
                    mp.b bVar4 = gVar.f59222a;
                    String strR2 = com.bumptech.glide.f.r(bVar3.f56089c, (String) arrayList2.get(gVar.f59243k));
                    ta.a aVar10 = gVar.f59227f;
                    m.c(aVar10);
                    ((p0) bVar4).H((ImageView) ((v1) aVar10).f33450d.f32408d, strR2);
                }
                break;
            default:
                View it2 = (View) obj;
                m.f(it2, "it");
                ta.a aVar11 = gVar.f59227f;
                m.c(aVar11);
                ((ImageView) ((v1) aVar11).f33450d.f32408d).performClick();
                break;
        }
        return b0Var;
    }
}
