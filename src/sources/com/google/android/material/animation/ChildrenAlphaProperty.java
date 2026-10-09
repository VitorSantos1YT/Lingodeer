package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChildrenAlphaProperty f13774a = new ChildrenAlphaProperty(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Float get(ViewGroup viewGroup) {
        Float f5 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f5 != null ? f5 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(ViewGroup viewGroup, Float f5) {
        ViewGroup viewGroup2 = viewGroup;
        Float f11 = f5;
        float fFloatValue = f11.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, f11);
        int childCount = viewGroup2.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            viewGroup2.getChildAt(i11).setAlpha(fFloatValue);
        }
    }
}
