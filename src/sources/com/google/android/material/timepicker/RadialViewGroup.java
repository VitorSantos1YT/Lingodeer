package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import j4.l;
import j4.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class RadialViewGroup extends ConstraintLayout {
    public final b S;
    public int T;
    public final MaterialShapeDrawable U;

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.U = materialShapeDrawable;
        RelativeCornerSize relativeCornerSize = new RelativeCornerSize(0.5f);
        ShapeAppearanceModel.Builder builderH = materialShapeDrawable.f15200b.f15214a.h();
        builderH.f15261e = relativeCornerSize;
        builderH.f15262f = relativeCornerSize;
        builderH.f15263g = relativeCornerSize;
        builderH.f15264h = relativeCornerSize;
        materialShapeDrawable.setShapeAppearanceModel(builderH.a());
        this.U.r(ColorStateList.valueOf(-1));
        setBackground(this.U);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.V, R.attr.materialClockStyle, 0);
        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.S = new b(this, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            b bVar = this.S;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            b bVar = this.S;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    public void q() {
        p pVar = new p();
        pVar.e(this);
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i12 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!map.containsKey(i12)) {
                    map.put(i12, new ArrayList());
                }
                ((List) map.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.T * 0.66f) : this.T;
            Iterator it = list.iterator();
            float size = CropImageView.DEFAULT_ASPECT_RATIO;
            while (it.hasNext()) {
                l lVar = pVar.h(((View) it.next()).getId()).f35929e;
                lVar.A = R.id.circle_center;
                lVar.B = iRound;
                lVar.C = size;
                size += 360.0f / list.size();
            }
        }
        pVar.b(this);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i11) {
        this.U.r(ColorStateList.valueOf(i11));
    }
}
