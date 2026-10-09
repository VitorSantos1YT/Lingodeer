package lp;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import b7.e0;
import bq.z;
import cf.x;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import java.util.ArrayList;
import kotlin.jvm.internal.u;
import lf.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Env f40204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f40205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f40206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f40207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f40208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f40212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FlexboxLayout f40213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final FlexboxLayout f40214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewGroup f40215l;
    public androidx.fragment.app.d m;

    public k(Env mEnv, Context mContext, View view, i iVar) {
        kotlin.jvm.internal.m.f(mEnv, "mEnv");
        kotlin.jvm.internal.m.f(mContext, "mContext");
        this.f40204a = mEnv;
        this.f40205b = mContext;
        this.f40206c = view;
        this.f40207d = iVar;
        this.f40208e = new Handler(Looper.getMainLooper());
        View viewFindViewById = view.findViewById(R.id.gap_view);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        this.f40212i = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.flex_top);
        kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
        this.f40213j = (FlexboxLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.flex_bottom);
        kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
        this.f40214k = (FlexboxLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.fl_drag_accept);
        kotlin.jvm.internal.m.e(viewFindViewById4, "findViewById(...)");
        this.f40215l = (ViewGroup) viewFindViewById4;
    }

    public static final void a(k kVar, FlexboxLayout flexboxLayout) {
        int childCount = flexboxLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = flexboxLayout.getChildAt(i11);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
            childAt.setLayoutParams(marginLayoutParams);
            childAt.requestLayout();
        }
    }

    public static void h(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.getMarginStart() == 0 && marginLayoutParams.getMarginEnd() == 0) {
            return;
        }
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        frameLayout.setLayoutParams(marginLayoutParams);
    }

    public static void j(FlexboxLayout flexboxLayout) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimator(2, null);
        layoutTransition.setAnimator(3, null);
        layoutTransition.setAnimator(4, null);
        if (flexboxLayout != null) {
            flexboxLayout.setLayoutTransition(layoutTransition);
        }
    }

    public final y4.b b() {
        int i11;
        char c11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.clear();
        FlexboxLayout flexboxLayout = this.f40213j;
        float f5 = 16.0f;
        int i12 = 0;
        char c12 = 1;
        if (flexboxLayout.getChildCount() == 0) {
            int[] iArr = new int[2];
            ViewParent parent = flexboxLayout.getParent();
            kotlin.jvm.internal.m.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.getLocationOnScreen(iArr);
            ArrayList arrayList4 = new ArrayList();
            Rect rect = new Rect();
            rect.left = iArr[0];
            rect.top = iArr[1] - ff.h.l(16.0f);
            rect.right = viewGroup.getWidth() + iArr[0];
            rect.bottom = ff.h.l(72.0f) + viewGroup.getHeight() + iArr[1];
            arrayList4.add(rect);
            arrayList2.add(arrayList4);
            return new y4.b(arrayList2, arrayList3);
        }
        int childCount = flexboxLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = flexboxLayout.getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8 && childAt.getVisibility() != 4) {
                int[] iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr2);
                arrayList.add(iArr2);
                childAt.setTag(R.id.tag_rects, null);
                arrayList3.add(childAt);
            }
        }
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            kotlin.jvm.internal.m.e(obj, "get(...)");
            int[] iArr3 = (int[]) obj;
            ArrayList arrayList5 = new ArrayList();
            if (i14 == 0) {
                Rect rect2 = new Rect();
                rect2.left = 0;
                rect2.top = iArr3[c12] - ff.h.l(f5);
                rect2.right = com.google.android.material.datepicker.d.c((View) arrayList3.get(i14), 2, iArr3[0]);
                rect2.bottom = ((View) arrayList3.get(i14)).getHeight() + iArr3[c12];
                arrayList5.add(rect2);
            }
            int i15 = i14 - 1;
            if (i15 >= 0) {
                Object obj2 = arrayList.get(i15);
                kotlin.jvm.internal.m.e(obj2, "get(...)");
                if (iArr3[c12] > ((int[]) obj2)[c12]) {
                    Rect rect3 = new Rect();
                    rect3.left = 0;
                    rect3.top = iArr3[c12] - ff.h.l(f5);
                    rect3.right = com.google.android.material.datepicker.d.c((View) arrayList3.get(i14), 2, iArr3[0]);
                    rect3.bottom = ((View) arrayList3.get(i14)).getHeight() + iArr3[c12];
                    arrayList5.add(rect3);
                }
            }
            int i16 = i14 + 1;
            if (i16 < arrayList.size()) {
                Object obj3 = arrayList.get(i16);
                kotlin.jvm.internal.m.e(obj3, "get(...)");
                int[] iArr4 = (int[]) obj3;
                if (iArr4[c12] == iArr3[c12]) {
                    Rect rect4 = new Rect();
                    c11 = c12;
                    rect4.left = com.google.android.material.datepicker.d.c((View) arrayList3.get(i14), 2, iArr3[0]);
                    rect4.right = com.google.android.material.datepicker.d.c((View) arrayList3.get(i16), 2, iArr4[0]);
                    rect4.top = iArr3[c11] - ff.h.l(f5);
                    rect4.bottom = ((View) arrayList3.get(i14)).getHeight() + iArr3[c11];
                    arrayList5.add(rect4);
                } else {
                    c11 = c12;
                    Rect rect5 = new Rect();
                    rect5.left = com.google.android.material.datepicker.d.c((View) arrayList3.get(i14), 2, iArr3[0]);
                    rect5.top = iArr3[c11] - ff.h.l(f5);
                    rect5.right = e0.f(LingoSkillApplication.f21665b).widthPixels;
                    rect5.bottom = ((View) arrayList3.get(i14)).getHeight() + iArr3[c11];
                    arrayList5.add(rect5);
                }
            } else {
                c11 = c12;
            }
            if (i14 == arrayList.size() - 1) {
                Rect rect6 = new Rect();
                rect6.left = com.google.android.material.datepicker.d.c((View) arrayList3.get(i14), 2, iArr3[0]);
                rect6.right = e0.f(LingoSkillApplication.f21665b).widthPixels;
                rect6.top = iArr3[c11] - ff.h.l(f5);
                rect6.bottom = ((View) arrayList3.get(i14)).getHeight() + iArr3[c11];
                arrayList5.add(rect6);
            }
            ((View) arrayList3.get(i14)).setTag(R.id.tag_rects, arrayList5);
            i14 = i16;
            f5 = f5;
            c12 = c11;
        }
        float f11 = f5;
        char c13 = c12;
        int size2 = arrayList.size();
        int i17 = 0;
        while (i17 < size2) {
            Object obj4 = arrayList.get(i17);
            kotlin.jvm.internal.m.e(obj4, "get(...)");
            int[] iArr5 = (int[]) obj4;
            if (i17 == 0) {
                ArrayList arrayList6 = new ArrayList();
                Rect rect7 = new Rect();
                rect7.left = i12;
                rect7.top = iArr5[c13] - ff.h.l(f11);
                rect7.right = com.google.android.material.datepicker.d.c((View) arrayList3.get(i17), 2, iArr5[i12]);
                rect7.bottom = ((View) arrayList3.get(i17)).getHeight() + iArr5[c13];
                arrayList6.add(rect7);
                arrayList2.add(arrayList6);
            }
            if (i17 > 0) {
                int i18 = i17 - 1;
                Object obj5 = arrayList.get(i18);
                kotlin.jvm.internal.m.e(obj5, "get(...)");
                int[] iArr6 = (int[]) obj5;
                if (iArr6[c13] != iArr5[c13]) {
                    ArrayList arrayList7 = new ArrayList();
                    Rect rect8 = new Rect();
                    rect8.left = i12;
                    rect8.right = com.google.android.material.datepicker.d.c((View) arrayList3.get(i17), 2, iArr5[i12]);
                    rect8.top = iArr5[c13] - ff.h.l(f11);
                    rect8.bottom = ((View) arrayList3.get(i17)).getHeight() + iArr5[c13];
                    Rect rect9 = new Rect();
                    i11 = i12;
                    rect9.left = com.google.android.material.datepicker.d.c((View) arrayList3.get(i18), 2, iArr6[i12]);
                    rect9.top = iArr6[c13] - ff.h.l(f11);
                    rect9.right = e0.f(LingoSkillApplication.f21665b).widthPixels;
                    rect9.bottom = ((View) arrayList3.get(i18)).getHeight() + iArr6[c13];
                    arrayList7.add(rect8);
                    arrayList7.add(rect9);
                    arrayList2.add(arrayList7);
                } else {
                    i11 = i12;
                    ArrayList arrayList8 = new ArrayList();
                    Rect rect10 = new Rect();
                    rect10.left = com.google.android.material.datepicker.d.c((View) arrayList3.get(i18), 2, iArr6[i11]);
                    rect10.right = com.google.android.material.datepicker.d.c((View) arrayList3.get(i17), 2, iArr5[i11]);
                    rect10.top = iArr5[c13] - ff.h.l(f11);
                    rect10.bottom = ((View) arrayList3.get(i17)).getHeight() + iArr5[c13];
                    arrayList8.add(rect10);
                    arrayList2.add(arrayList8);
                }
            } else {
                i11 = i12;
            }
            if (i17 == arrayList.size() - 1) {
                ArrayList arrayList9 = new ArrayList();
                Rect rect11 = new Rect();
                rect11.left = com.google.android.material.datepicker.d.c((View) arrayList3.get(i17), 2, iArr5[i11]);
                rect11.top = iArr5[c13] - ff.h.l(f11);
                rect11.right = e0.f(LingoSkillApplication.f21665b).widthPixels;
                rect11.bottom = ((View) arrayList3.get(i17)).getHeight() + iArr5[c13];
                arrayList9.add(rect11);
                arrayList2.add(arrayList9);
            }
            i17++;
            i12 = i11;
        }
        return new y4.b(arrayList2, arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00da  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:35:0x011d  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        if (r10.getMarginStart() == (ff.h.l(8.0f) + r17.getWidth())) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(final android.view.View r17, android.graphics.Point r18, java.util.List r19, final android.widget.FrameLayout r20) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.k.c(android.view.View, android.graphics.Point, java.util.List, android.widget.FrameLayout):boolean");
    }

    public final void d() {
        FlexboxLayout flexboxLayout = this.f40214k;
        int childCount = flexboxLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            flexboxLayout.getChildAt(i11).findViewById(R.id.card_item).setOnDragListener(null);
        }
        this.f40215l.setOnDragListener(null);
        FlexboxLayout flexboxLayout2 = this.f40213j;
        int childCount2 = flexboxLayout2.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            flexboxLayout2.getChildAt(i12).setOnDragListener(null);
        }
    }

    public final void e() {
        j(this.f40213j);
        FlexboxLayout flexboxLayout = this.f40214k;
        j(flexboxLayout);
        int childCount = flexboxLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewFindViewById = flexboxLayout.getChildAt(i11).findViewById(R.id.card_item);
            kotlin.jvm.internal.m.c(viewFindViewById);
            z.b(viewFindViewById, new kp.j(this, 12));
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(x.n().keyLanguage))) {
                j jVar = new j(this, 0);
                com.bumptech.glide.d.I(viewFindViewById, this.f40215l);
                u uVar = new u();
                uVar.f38357a = true;
                viewFindViewById.setOnTouchListener(new g(uVar, this, jVar));
            }
        }
    }

    public final View f(View view, Word word) {
        View viewInflate = LayoutInflater.from(this.f40205b).inflate(R.layout.item_word_card_framlayout, (ViewGroup) this.f40213j, false);
        kotlin.jvm.internal.m.c(viewInflate);
        k(viewInflate, word);
        viewInflate.setTag(R.id.bottom_view, view);
        viewInflate.setTag(word);
        z.b(viewInflate, new j9.h(15, this, view));
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(x.n().keyLanguage))) {
            x0 x0Var = new x0(this, 1);
            com.bumptech.glide.d.I(viewInflate, this.f40215l);
            u uVar = new u();
            uVar.f38357a = true;
            viewInflate.setOnTouchListener(new g(uVar, this, x0Var));
        }
        ef.e.B(viewInflate);
        return viewInflate;
    }

    public abstract void g(Word word);

    public final void i() {
        int childCount = this.f40213j.getChildCount();
        i iVar = this.f40207d;
        if (childCount > 0) {
            iVar.e();
        } else {
            iVar.l();
        }
    }

    public abstract void k(View view, Word word);
}
