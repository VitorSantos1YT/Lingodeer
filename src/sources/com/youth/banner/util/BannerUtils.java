package com.youth.banner.util;

import android.content.res.Resources;
import android.graphics.Outline;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class BannerUtils {
    public static int dp2px(float f5) {
        return (int) TypedValue.applyDimension(1, f5, Resources.getSystem().getDisplayMetrics());
    }

    public static int getRealPosition(boolean z11, int i11, int i12) {
        if (!z11) {
            return i11;
        }
        if (i11 == 0) {
            return i12 - 1;
        }
        if (i11 == i12 + 1) {
            return 0;
        }
        return i11 - 1;
    }

    public static View getView(ViewGroup viewGroup, int i11) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        if (layoutParams.height == -1 && layoutParams.width == -1) {
            return viewInflate;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
        viewInflate.setLayoutParams(layoutParams);
        return viewInflate;
    }

    public static void setBannerRound(View view, final float f5) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.youth.banner.util.BannerUtils.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f5);
            }
        });
        view.setClipToOutline(true);
    }
}
