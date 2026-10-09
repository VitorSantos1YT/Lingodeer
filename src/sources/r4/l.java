package r4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import com.google.logging.type.LogSeverity;
import gb.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends r {
    public static Font a0(FontFamily fontFamily, int i11) {
        FontStyle fontStyle = new FontStyle((i11 & 1) != 0 ? LogSeverity.ALERT_VALUE : 400, (i11 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iC0 = c0(fontStyle, font.getStyle());
        for (int i12 = 1; i12 < fontFamily.getSize(); i12++) {
            Font font2 = fontFamily.getFont(i12);
            int iC1 = c0(fontStyle, font2.getStyle());
            if (iC1 < iC0) {
                font = font2;
                iC0 = iC1;
            }
        }
        return font;
    }

    public static FontFamily b0(w4.h[] hVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (w4.h hVar : hVarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(hVar.f54645a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(hVar.f54647c).setSlant(hVar.f54648d ? 1 : 0).setTtcIndex(hVar.f54646b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException unused) {
                continue;
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int c0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // gb.r
    public final Typeface h(Context context, q4.d dVar, Resources resources, int i11) {
        try {
            FontFamily.Builder builder = null;
            for (q4.e eVar : dVar.f47430a) {
                try {
                    Font fontBuild = new Font.Builder(resources, eVar.f47436f).setWeight(eVar.f47432b).setSlant(eVar.f47433c ? 1 : 0).setTtcIndex(eVar.f47435e).setFontVariationSettings(eVar.f47434d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(a0(fontFamilyBuild, i11).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // gb.r
    public final Typeface i(Context context, w4.h[] hVarArr, int i11) {
        try {
            FontFamily fontFamilyB0 = b0(hVarArr, context.getContentResolver());
            if (fontFamilyB0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyB0).setStyle(a0(fontFamilyB0, i11).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // gb.r
    public final Typeface j(Context context, List list, int i11) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyB0 = b0((w4.h[]) list.get(0), contentResolver);
            if (fontFamilyB0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyB0);
            for (int i12 = 1; i12 < list.size(); i12++) {
                FontFamily fontFamilyB1 = b0((w4.h[]) list.get(i12), contentResolver);
                if (fontFamilyB1 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyB1);
                }
            }
            return customFallbackBuilder.setStyle(a0(fontFamilyB0, i11).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // gb.r
    public final Typeface k(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // gb.r
    public final Typeface l(Context context, Resources resources, int i11, String str, int i12) {
        try {
            Font fontBuild = new Font.Builder(resources, i11).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // gb.r
    public final w4.h q(w4.h[] hVarArr, int i11) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
