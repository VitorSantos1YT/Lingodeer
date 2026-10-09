package q4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import c4.o;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f47429a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f5;
        int iF;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r9 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r9 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = m4.a.f40859a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i11, i11);
                int resourceId = ObtainAttributes.getResourceId(i11, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f47429a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r9);
                    int i13 = typedValue.type;
                    if (i13 < 28 || i13 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i11, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i11, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i11, -65281);
                }
                if (ObtainAttributes.hasValue(r9)) {
                    f5 = ObtainAttributes.getFloat(r9, 1.0f);
                } else {
                    f5 = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r9;
                float f11 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i14 = i11;
                int i15 = i14;
                while (i14 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i14);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i16 = i15 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i14, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i15] = attributeNameResource;
                        i15 = i16;
                    }
                    i14++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i15);
                float f12 = 100.0f;
                boolean z11 = (f11 < CropImageView.DEFAULT_ASPECT_RATIO || f11 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f5 != 1.0f || z11) {
                    int iN = ue.f.n((int) ((Color.alpha(color) * f5) + 0.5f), 0, 255);
                    if (z11) {
                        o oVarB = o.b(color);
                        float f13 = oVarB.f6594a;
                        float f14 = oVarB.f6595b;
                        k kVar = k.f47450k;
                        if (f14 >= 1.0d && Math.round(f11) > 0.0d && Math.round(f11) < 100.0d) {
                            float fMin = f13 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : Math.min(360.0f, f13);
                            float f15 = 0.0f;
                            float f16 = f14;
                            boolean z12 = r16 == true ? 1 : 0;
                            o oVar = null;
                            while (true) {
                                if (Math.abs(f15 - f14) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (oVar != null) {
                                        iF = oVar.d(kVar);
                                        break;
                                    }
                                    iF = a.f(f11);
                                    break;
                                }
                                float f17 = 1000.0f;
                                float f18 = f12;
                                float f19 = 0.0f;
                                float f21 = 1000.0f;
                                o oVar2 = null;
                                while (true) {
                                    if (Math.abs(f19 - f18) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f12 = f12;
                                        break;
                                    }
                                    f12 = f12;
                                    float f22 = ((f18 - f19) / 2.0f) + f19;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iD = o.c(f22, f16, fMin).d(k.f47450k);
                                    float fG = a.g(Color.red(iD));
                                    float fG2 = a.g(Color.green(iD));
                                    float fG3 = a.g(Color.blue(iD));
                                    float[] fArr = a.f47425d[r16 == true ? 1 : 0];
                                    float f23 = ((fG3 * fArr[2]) + ((fG2 * fArr[r16 == true ? 1 : 0]) + (fG * fArr[0]))) / f12;
                                    float fCbrt = f23 <= 0.008856452f ? f23 * 903.2963f : (((float) Math.cbrt(f23)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f11 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        o oVarB2 = o.b(iD);
                                        o oVarC = o.c(oVarB2.f6596c, oVarB2.f6595b, fMin);
                                        float f24 = oVarB2.f6597d - oVarC.f6597d;
                                        float f25 = oVarB2.f6598e - oVarC.f6598e;
                                        float f26 = oVarB2.f6599f - oVarC.f6599f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f26 * f26) + (f25 * f25) + (f24 * f24)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f21 = fPow;
                                            f17 = fAbs;
                                            oVar2 = oVarB2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f17 == CropImageView.DEFAULT_ASPECT_RATIO && f21 == CropImageView.DEFAULT_ASPECT_RATIO) {
                                        break;
                                    }
                                    if (fCbrt < f11) {
                                        f19 = f22;
                                    } else {
                                        f18 = f22;
                                    }
                                    f12 = f12;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                o oVar3 = oVar2;
                                if (!z12) {
                                    if (oVar3 == null) {
                                        f14 = f16;
                                    } else {
                                        oVar = oVar3;
                                        f15 = f16;
                                    }
                                    f16 = ((f14 - f15) / 2.0f) + f15;
                                } else {
                                    if (oVar3 != null) {
                                        iF = oVar3.d(kVar);
                                        break;
                                    }
                                    f16 = ((f14 - f15) / 2.0f) + f15;
                                    z12 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iF = a.f(f11);
                        }
                        color = iF;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iN << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i17 = i12 + 1;
                if (i17 > iArr.length) {
                    int[] iArr4 = new int[i12 <= 4 ? 8 : i12 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i12);
                    iArr = iArr4;
                }
                iArr[i12] = color;
                if (i17 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i12 > 4 ? i12 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i12);
                    objArr = objArr2;
                }
                objArr[i12] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i12 = i17;
                r9 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i11 = 0;
            } else {
                int i18 = depth2;
                r9 = r9 == true ? 1 : 0;
                depth2 = i18;
                i11 = 0;
            }
        }
        int[] iArr5 = new int[i12];
        int[][] iArr6 = new int[i12][];
        System.arraycopy(iArr, 0, iArr5, 0, i12);
        System.arraycopy(objArr, 0, iArr6, 0, i12);
        return new ColorStateList(iArr6, iArr5);
    }
}
