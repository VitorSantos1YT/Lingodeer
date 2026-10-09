package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import kotlin.jvm.internal.m;
import sc.a;
import vc.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogScrollView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogLayout f7421a;

    public DialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        if (getChildCount() != 0 && getMeasuredHeight() != 0) {
            View childAt = getChildAt(0);
            m.b(childAt, "getChildAt(0)");
            if (childAt.getMeasuredHeight() > getHeight()) {
                View view = getChildAt(getChildCount() - 1);
                m.b(view, "view");
                int bottom = view.getBottom() - (getScrollY() + getMeasuredHeight());
                DialogLayout dialogLayout = this.f7421a;
                if (dialogLayout != null) {
                    dialogLayout.b(getScrollY() > 0, bottom > 0);
                    return;
                }
                return;
            }
        }
        DialogLayout dialogLayout2 = this.f7421a;
        if (dialogLayout2 != null) {
            dialogLayout2.b(false, false);
        }
    }

    @Override // android.view.View
    public final DialogLayout getRootView() {
        return this.f7421a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int measuredWidth = getMeasuredWidth();
        a aVar = a.f51532a;
        if (measuredWidth <= 0 || getMeasuredHeight() <= 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new b(this, aVar));
        } else {
            aVar.invoke(this);
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        a();
    }

    public final void setRootView(DialogLayout dialogLayout) {
        this.f7421a = dialogLayout;
    }
}
