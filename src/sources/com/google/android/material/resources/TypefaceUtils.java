package com.google.android.material.resources;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TypefaceUtils {
    private TypefaceUtils() {
    }

    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i11;
        if (Build.VERSION.SDK_INT < 31 || (i11 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i11 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, f.n(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
