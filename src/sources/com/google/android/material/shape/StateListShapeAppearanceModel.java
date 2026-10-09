package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.material.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class StateListShapeAppearanceModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShapeAppearanceModel f15326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[][] f15327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ShapeAppearanceModel[] f15328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StateListCornerSize f15329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateListCornerSize f15330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListCornerSize f15331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StateListCornerSize f15332h;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ShapeAppearanceModel f15334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[][] f15335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ShapeAppearanceModel[] f15336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public StateListCornerSize f15337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public StateListCornerSize f15338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public StateListCornerSize f15339g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public StateListCornerSize f15340h;

        public Builder(ShapeAppearanceModel shapeAppearanceModel) {
            b();
            a(StateSet.WILD_CARD, shapeAppearanceModel);
        }

        public final void a(int[] iArr, ShapeAppearanceModel shapeAppearanceModel) {
            int i11 = this.f15333a;
            if (i11 == 0 || iArr.length == 0) {
                this.f15334b = shapeAppearanceModel;
            }
            int[][] iArr2 = this.f15335c;
            if (i11 >= iArr2.length) {
                int i12 = i11 + 10;
                int[][] iArr3 = new int[i12][];
                System.arraycopy(iArr2, 0, iArr3, 0, i11);
                this.f15335c = iArr3;
                ShapeAppearanceModel[] shapeAppearanceModelArr = new ShapeAppearanceModel[i12];
                System.arraycopy(this.f15336d, 0, shapeAppearanceModelArr, 0, i11);
                this.f15336d = shapeAppearanceModelArr;
            }
            int[][] iArr4 = this.f15335c;
            int i13 = this.f15333a;
            iArr4[i13] = iArr;
            this.f15336d[i13] = shapeAppearanceModel;
            this.f15333a = i13 + 1;
        }

        public final void b() {
            this.f15334b = new ShapeAppearanceModel();
            this.f15335c = new int[10][];
            this.f15336d = new ShapeAppearanceModel[10];
        }
    }

    public StateListShapeAppearanceModel(Builder builder) {
        this.f15325a = builder.f15333a;
        this.f15326b = builder.f15334b;
        this.f15327c = builder.f15335c;
        this.f15328d = builder.f15336d;
        this.f15329e = builder.f15337e;
        this.f15330f = builder.f15338f;
        this.f15331g = builder.f15339g;
        this.f15332h = builder.f15340h;
    }

    public static void a(Builder builder, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = R.styleable.K;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                ShapeAppearanceModel shapeAppearanceModelA = ShapeAppearanceModel.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i11 = 0;
                for (int i12 = 0; i12 < attributeCount; i12++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                    if (attributeNameResource != com.lingodeer.R.attr.shapeAppearance && attributeNameResource != com.lingodeer.R.attr.shapeAppearanceOverlay) {
                        int i13 = i11 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i11] = attributeNameResource;
                        i11 = i13;
                    }
                }
                builder.a(StateSet.trimStateSet(iArr2, i11), shapeAppearanceModelA);
            }
        }
    }

    public static StateListShapeAppearanceModel b(Context context, TypedArray typedArray, int i11) {
        int next;
        int resourceId = typedArray.getResourceId(i11, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        Builder builder = new Builder();
        builder.b();
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    a(builder, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                if (builder.f15333a == 0) {
                    return null;
                }
                return new StateListShapeAppearanceModel(builder);
            } catch (Throwable th2) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            builder.b();
        }
    }

    public final ShapeAppearanceModel c() {
        ShapeAppearanceModel shapeAppearanceModel = this.f15326b;
        StateListCornerSize stateListCornerSize = this.f15332h;
        StateListCornerSize stateListCornerSize2 = this.f15331g;
        StateListCornerSize stateListCornerSize3 = this.f15330f;
        StateListCornerSize stateListCornerSize4 = this.f15329e;
        if (stateListCornerSize4 == null && stateListCornerSize3 == null && stateListCornerSize2 == null && stateListCornerSize == null) {
            return shapeAppearanceModel;
        }
        ShapeAppearanceModel.Builder builderH = shapeAppearanceModel.h();
        if (stateListCornerSize4 != null) {
            builderH.f15261e = stateListCornerSize4.f15322b;
        }
        if (stateListCornerSize3 != null) {
            builderH.f15262f = stateListCornerSize3.f15322b;
        }
        if (stateListCornerSize2 != null) {
            builderH.f15264h = stateListCornerSize2.f15322b;
        }
        if (stateListCornerSize != null) {
            builderH.f15263g = stateListCornerSize.f15322b;
        }
        return builderH.a();
    }

    public final boolean d() {
        StateListCornerSize stateListCornerSize;
        StateListCornerSize stateListCornerSize2;
        StateListCornerSize stateListCornerSize3;
        StateListCornerSize stateListCornerSize4;
        return this.f15325a > 1 || ((stateListCornerSize = this.f15329e) != null && stateListCornerSize.f15321a > 1) || (((stateListCornerSize2 = this.f15330f) != null && stateListCornerSize2.f15321a > 1) || (((stateListCornerSize3 = this.f15331g) != null && stateListCornerSize3.f15321a > 1) || ((stateListCornerSize4 = this.f15332h) != null && stateListCornerSize4.f15321a > 1)));
    }
}
