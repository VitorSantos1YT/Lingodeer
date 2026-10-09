package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import r.b3;
import r.d0;
import r.e0;
import r.f0;
import r.h0;
import r.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements h0 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public CharSequence f1075e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public d0 f1076f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Rect f1077g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f1078h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f1079i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, 0);
        this.f1079i0 = appCompatSpinner;
        this.f1077g0 = new Rect();
        this.Q = appCompatSpinner;
        this.f1093a0 = true;
        this.f1095b0.setFocusable(true);
        this.R = new e0(this, 0);
    }

    @Override // r.h0
    public final CharSequence e() {
        return this.f1075e0;
    }

    @Override // r.h0
    public final void g(CharSequence charSequence) {
        this.f1075e0 = charSequence;
    }

    @Override // r.h0
    public final void l(int i11) {
        this.f1078h0 = i11;
    }

    @Override // r.h0
    public final void m(int i11, int i12) {
        ViewTreeObserver viewTreeObserver;
        w wVar = this.f1095b0;
        boolean zIsShowing = wVar.isShowing();
        s();
        wVar.setInputMethodMode(2);
        a();
        DropDownListView dropDownListView = this.f1096c;
        dropDownListView.setChoiceMode(1);
        dropDownListView.setTextDirection(i11);
        dropDownListView.setTextAlignment(i12);
        AppCompatSpinner appCompatSpinner = this.f1079i0;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        DropDownListView dropDownListView2 = this.f1096c;
        if (wVar.isShowing() && dropDownListView2 != null) {
            dropDownListView2.setListSelectionHidden(false);
            dropDownListView2.setSelection(selectedItemPosition);
            if (dropDownListView2.getChoiceMode() != 0) {
                dropDownListView2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        q.d dVar = new q.d(this, 4);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        wVar.setOnDismissListener(new f0(this, dVar));
    }

    @Override // androidx.appcompat.widget.h, r.h0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f1076f0 = (d0) listAdapter;
    }

    public final void s() {
        int i11;
        AppCompatSpinner appCompatSpinner = this.f1079i0;
        Rect rect = appCompatSpinner.H;
        w wVar = this.f1095b0;
        Drawable background = wVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z11 = b3.f48531a;
            i11 = appCompatSpinner.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i11 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i12 = appCompatSpinner.f932t;
        if (i12 == -2) {
            int iA = appCompatSpinner.a(this.f1076f0, wVar.getBackground());
            int i13 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i13) {
                iA = i13;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i12 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i12);
        }
        boolean z12 = b3.f48531a;
        this.f1099f = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f1098e) - this.f1078h0) + i11 : paddingLeft + this.f1078h0 + i11;
    }
}
