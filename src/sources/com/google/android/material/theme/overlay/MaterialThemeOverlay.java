package com.google.android.material.theme.overlay;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialThemeOverlay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f15746a = {R.attr.theme, com.lingodeer.R.attr.theme};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f15747b = {com.lingodeer.R.attr.materialThemeOverlay};

    private MaterialThemeOverlay() {
    }

    public static Context a(Context context, AttributeSet attributeSet, int i11, int i12) {
        return b(context, attributeSet, i11, i12, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i11, int i12, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f15747b, i11, i12);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i13 = iArr2[0];
        boolean z11 = (context instanceof e) && ((e) context).f46182a == i13;
        if (i13 == 0 || z11) {
            return context;
        }
        e eVar = new e(context, i13);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
            for (int i14 = 0; i14 < iArr.length; i14++) {
                iArr3[i14] = typedArrayObtainStyledAttributes2.getResourceId(i14, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = iArr3[i15];
            if (i16 != 0) {
                eVar.getTheme().applyStyle(i16, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f15746a);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            eVar.getTheme().applyStyle(resourceId, true);
        }
        return eVar;
    }
}
