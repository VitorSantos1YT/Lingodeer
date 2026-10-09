package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.ktFt.FpIL;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.j1;
import androidx.recyclerview.widget.n1;
import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ji.e f47748b;

    public /* synthetic */ c(ji.e eVar, int i11) {
        this.f47747a = i11;
        this.f47748b = eVar;
    }

    @Override // androidx.recyclerview.widget.j1
    public final void onDraw(Canvas c11, RecyclerView parent, c2 state) {
        switch (this.f47747a) {
            case 0:
                kotlin.jvm.internal.m.f(c11, scqhIrGXy.AuFFIe);
                kotlin.jvm.internal.m.f(parent, "parent");
                kotlin.jvm.internal.m.f(state, "state");
                super.onDraw(c11, parent, state);
                e eVar = (e) this.f47748b;
                Context contextRequireContext = eVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                float fZ = j3.Z(16, contextRequireContext);
                float measuredWidth = parent.getMeasuredWidth();
                Context contextRequireContext2 = eVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                float fZ2 = measuredWidth - j3.Z(16, contextRequireContext2);
                int childCount = parent.getChildCount();
                int i11 = 0;
                while (i11 < childCount) {
                    View childAt = parent.getChildAt(i11);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    float bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((n1) layoutParams)).bottomMargin;
                    Double dValueOf = Double.valueOf(0.5d);
                    Context contextRequireContext3 = eVar.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                    float fZ3 = j3.Z(dValueOf, contextRequireContext3) + bottom;
                    Paint paint = new Paint(1);
                    paint.setColor(Color.parseColor("#4Dffffff"));
                    paint.setStyle(Paint.Style.FILL);
                    float f5 = fZ;
                    c11.drawRect(f5, bottom, fZ2, fZ3, paint);
                    i11++;
                    fZ = f5;
                }
                break;
            case 1:
                kotlin.jvm.internal.m.f(c11, "c");
                kotlin.jvm.internal.m.f(parent, "parent");
                kotlin.jvm.internal.m.f(state, "state");
                super.onDraw(c11, parent, state);
                c0 c0Var = (c0) this.f47748b;
                Context contextRequireContext4 = c0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                float fZ4 = j3.Z(16, contextRequireContext4);
                float measuredWidth2 = parent.getMeasuredWidth();
                Context contextRequireContext5 = c0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
                float fZ5 = measuredWidth2 - j3.Z(16, contextRequireContext5);
                int childCount2 = parent.getChildCount();
                int i12 = 0;
                while (i12 < childCount2) {
                    View childAt2 = parent.getChildAt(i12);
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    kotlin.jvm.internal.m.d(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    float bottom2 = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((n1) layoutParams2)).bottomMargin;
                    Double dValueOf2 = Double.valueOf(0.5d);
                    Context contextRequireContext6 = c0Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext6, "requireContext(...)");
                    float fZ6 = j3.Z(dValueOf2, contextRequireContext6) + bottom2;
                    Paint paint2 = new Paint(1);
                    paint2.setColor(Color.parseColor("#4Dffffff"));
                    paint2.setStyle(Paint.Style.FILL);
                    float f11 = fZ4;
                    c11.drawRect(f11, bottom2, fZ5, fZ6, paint2);
                    i12++;
                    fZ4 = f11;
                }
                break;
            default:
                kotlin.jvm.internal.m.f(c11, "c");
                kotlin.jvm.internal.m.f(parent, "parent");
                kotlin.jvm.internal.m.f(state, "state");
                super.onDraw(c11, parent, state);
                k0 k0Var = (k0) this.f47748b;
                Context contextRequireContext7 = k0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext7, "requireContext(...)");
                float fZ7 = j3.Z(16, contextRequireContext7);
                float measuredWidth3 = parent.getMeasuredWidth();
                Context contextRequireContext8 = k0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext8, "requireContext(...)");
                float fZ8 = measuredWidth3 - j3.Z(16, contextRequireContext8);
                int childCount3 = parent.getChildCount();
                int i13 = 0;
                while (i13 < childCount3) {
                    View childAt3 = parent.getChildAt(i13);
                    ViewGroup.LayoutParams layoutParams3 = childAt3.getLayoutParams();
                    kotlin.jvm.internal.m.d(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    float bottom3 = childAt3.getBottom() + ((ViewGroup.MarginLayoutParams) ((n1) layoutParams3)).bottomMargin;
                    Double dValueOf3 = Double.valueOf(0.5d);
                    Context contextRequireContext9 = k0Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext9, "requireContext(...)");
                    float fZ9 = j3.Z(dValueOf3, contextRequireContext9) + bottom3;
                    Paint paint3 = new Paint(1);
                    paint3.setColor(Color.parseColor("#4Dffffff"));
                    paint3.setStyle(Paint.Style.FILL);
                    float f12 = fZ7;
                    c11.drawRect(f12, bottom3, fZ8, fZ9, paint3);
                    i13++;
                    fZ7 = f12;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.j1
    public final void getItemOffsets(Rect outRect, View view, RecyclerView recyclerView, c2 state) {
        switch (this.f47747a) {
            case 0:
                kotlin.jvm.internal.m.f(outRect, "outRect");
                kotlin.jvm.internal.m.f(state, "state");
                super.getItemOffsets(outRect, view, recyclerView, state);
                Context contextRequireContext = ((e) this.f47748b).requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                outRect.set(0, 0, 0, (int) j3.Z(1, contextRequireContext));
                break;
            case 1:
                kotlin.jvm.internal.m.f(outRect, "outRect");
                kotlin.jvm.internal.m.f(state, "state");
                super.getItemOffsets(outRect, view, recyclerView, state);
                Context contextRequireContext2 = ((c0) this.f47748b).requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                outRect.set(0, 0, 0, (int) j3.Z(1, contextRequireContext2));
                break;
            default:
                kotlin.jvm.internal.m.f(outRect, FpIL.pxs);
                kotlin.jvm.internal.m.f(state, "state");
                super.getItemOffsets(outRect, view, recyclerView, state);
                Context contextRequireContext3 = ((k0) this.f47748b).requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                outRect.set(0, 0, 0, (int) j3.Z(1, contextRequireContext3));
                break;
        }
    }
}
