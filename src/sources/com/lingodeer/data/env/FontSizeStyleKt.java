package com.lingodeer.data.env;

import hz.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class FontSizeStyleKt {
    public static final int FONT_SIZE_STYLE_MAX = 6;
    public static final int FONT_SIZE_STYLE_MIN = 0;
    private static final float[] FONT_SIZE_STYLE_SCALES = {0.8f, 1.0f, 1.08f, 1.15f, 1.2f, 1.25f, 1.3f};
    public static final int FONT_SIZE_STYLE_STANDARD = 1;

    public static final int coerceFontSizeStyle(int i11) {
        return b.l(i11, 0, 6);
    }

    public static final float fontSizeStyleScale(int i11) {
        return FONT_SIZE_STYLE_SCALES[coerceFontSizeStyle(i11)];
    }

    public static final int legacyFontSizeStyleGroup(int i11) {
        int iCoerceFontSizeStyle = coerceFontSizeStyle(i11);
        if (iCoerceFontSizeStyle != 0) {
            return iCoerceFontSizeStyle != 1 ? 2 : 1;
        }
        return 0;
    }

    public static final int legacyFontSizeStyleValueFromGroup(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? 6 : 1;
        }
        return 0;
    }

    public static final int migrateLegacyFontSizeStyle(int i11) {
        if (i11 != 0) {
            return (i11 == 1 || i11 != 2) ? 1 : 6;
        }
        return 0;
    }
}
