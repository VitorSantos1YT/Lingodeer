package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.ArrayList;
import l4.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableBehavior extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15862a = 0;

    public ExpandableBehavior() {
    }

    @Override // l4.b
    public abstract boolean h(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (expandableWidget.isExpanded()) {
            int i11 = this.f15862a;
            if (i11 != 0 && i11 != 2) {
                return false;
            }
        } else if (this.f15862a != 1) {
            return false;
        }
        this.f15862a = expandableWidget.isExpanded() ? 1 : 2;
        y((View) expandableWidget, view, expandableWidget.isExpanded(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.b
    public final boolean n(CoordinatorLayout coordinatorLayout, final View view, int i11) {
        final ExpandableWidget expandableWidget;
        int i12;
        if (!view.isLaidOut()) {
            ArrayList arrayListO = coordinatorLayout.o(view);
            int size = arrayListO.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    expandableWidget = null;
                    break;
                }
                View view2 = (View) arrayListO.get(i13);
                if (h(view, view2)) {
                    expandableWidget = (ExpandableWidget) view2;
                    break;
                }
                i13++;
            }
            if (expandableWidget != null) {
                if (!expandableWidget.isExpanded() ? this.f15862a == 1 : !((i12 = this.f15862a) != 0 && i12 != 2)) {
                    final int i14 = expandableWidget.isExpanded() ? 1 : 2;
                    this.f15862a = i14;
                    view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public final boolean onPreDraw() {
                            View view3 = view;
                            view3.getViewTreeObserver().removeOnPreDrawListener(this);
                            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                            if (expandableBehavior.f15862a == i14) {
                                ExpandableWidget expandableWidget2 = expandableWidget;
                                expandableBehavior.y((View) expandableWidget2, view3, expandableWidget2.isExpanded(), false);
                            }
                            return false;
                        }
                    });
                }
            }
        }
        return false;
    }

    public abstract void y(View view, View view2, boolean z11, boolean z12);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
