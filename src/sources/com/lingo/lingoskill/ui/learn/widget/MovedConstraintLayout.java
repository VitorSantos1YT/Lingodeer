package com.lingo.lingoskill.ui.learn.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MovedConstraintLayout extends ConstraintLayout {
    public int S;
    public int T;
    public int U;
    public int V;
    public float W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovedConstraintLayout(Context context) {
        super(context);
        m.c(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r0 != 3) goto L19;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.m.f(r8, r0)
            int r0 = r8.getAction()
            r1 = 0
            if (r0 == 0) goto L97
            r2 = 1
            if (r0 == r2) goto L46
            r3 = 2
            if (r0 == r3) goto L17
            r3 = 3
            if (r0 == r3) goto L46
            goto Lb6
        L17:
            float r0 = r8.getRawX()
            int r2 = r7.U
            float r2 = (float) r2
            float r0 = r0 - r2
            float r2 = r8.getRawY()
            int r3 = r7.V
            float r3 = (float) r3
            float r2 = r2 - r3
            float r3 = r7.getX()
            float r3 = r3 + r0
            r7.setX(r3)
            float r0 = r7.getY()
            float r0 = r0 + r2
            r7.setY(r0)
            float r0 = r8.getRawX()
            int r0 = (int) r0
            r7.U = r0
            float r8 = r8.getRawY()
            int r8 = (int) r8
            r7.V = r8
            goto Lb6
        L46:
            float r0 = r8.getRawX()
            int r3 = r7.S
            float r3 = (float) r3
            float r0 = r0 - r3
            float r3 = r8.getRawY()
            int r4 = r7.T
            float r4 = (float) r4
            float r3 = r3 - r4
            r8.getRawX()
            r8.getRawY()
            android.view.ViewPropertyAnimator r8 = r7.animate()
            r4 = 400(0x190, double:1.976E-321)
            android.view.ViewPropertyAnimator r8 = r8.setDuration(r4)
            android.view.animation.OvershootInterpolator r4 = new android.view.animation.OvershootInterpolator
            r4.<init>()
            android.view.ViewPropertyAnimator r8 = r8.setInterpolator(r4)
            float r4 = r7.W
            float r5 = r7.getX()
            int r6 = r7.getWidth()
            float r6 = (float) r6
            float r5 = r5 + r6
            float r4 = r4 - r5
            android.view.ViewPropertyAnimator r8 = r8.xBy(r4)
            r8.start()
            float r8 = java.lang.Math.abs(r0)
            r0 = 1106247680(0x41f00000, float:30.0)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L96
            float r8 = java.lang.Math.abs(r3)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L96
            return r1
        L96:
            return r2
        L97:
            java.lang.System.currentTimeMillis()
            float r0 = r8.getRawX()
            int r0 = (int) r0
            r7.S = r0
            float r0 = r8.getRawY()
            int r0 = (int) r0
            r7.T = r0
            float r0 = r8.getRawX()
            int r0 = (int) r0
            r7.U = r0
            float r8 = r8.getRawY()
            int r8 = (int) r8
            r7.V = r8
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingo.lingoskill.ui.learn.widget.MovedConstraintLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.W = getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovedConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.c(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovedConstraintLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m.c(context);
    }
}
