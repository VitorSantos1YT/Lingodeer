package com.skydoves.cloudy.internals.render;

import android.graphics.Bitmap;
import hh.p0;
import qx.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RenderScriptToolkit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RenderScriptToolkit f22412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f22413b;

    static {
        RenderScriptToolkit renderScriptToolkit = new RenderScriptToolkit();
        f22412a = renderScriptToolkit;
        System.loadLibrary("renderscript-toolkit");
        f22413b = renderScriptToolkit.createNative();
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap2, int i11) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888 && bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            throw new IllegalArgumentException(("RenderScript Toolkit. blur supports only ARGB_8888 and ALPHA_8 bitmaps. " + bitmap.getConfig() + " provided.").toString());
        }
        if (b.N(bitmap) * bitmap.getWidth() != bitmap.getRowBytes()) {
            throw new IllegalArgumentException(("RenderScript Toolkit blur. Only bitmaps with rowSize equal to the width * vectorSize are currently supported. Provided were rowBytes=" + bitmap.getRowBytes() + ", width={" + bitmap.getWidth() + ", and vectorSize=" + b.N(bitmap) + '.').toString());
        }
        if (i11 == 0) {
            return bitmap;
        }
        if (1 > i11 || i11 >= 26) {
            throw new IllegalArgumentException(p0.h(i11, "RenderScript Toolkit blur. The radius should be between 1 and 25. ", " provided.").toString());
        }
        bitmap.getWidth();
        bitmap.getHeight();
        f22412a.nativeBlurBitmap(f22413b, bitmap, bitmap2, i11, null);
        return bitmap2;
    }

    private final native long createNative();

    private final native void destroyNative(long j11);

    private final native void nativeBlur(long j11, byte[] bArr, int i11, int i12, int i13, int i14, byte[] bArr2, Range2d range2d);

    private final native void nativeBlurBitmap(long j11, Bitmap bitmap, Bitmap bitmap2, int i11, Range2d range2d);
}
