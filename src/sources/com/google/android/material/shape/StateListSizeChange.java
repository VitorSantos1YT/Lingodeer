package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.google.android.material.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class StateListSizeChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SizeChange f15342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[][] f15343c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SizeChange[] f15344d = new SizeChange[10];

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SizeChange {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SizeChangeAmount f15345a;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SizeChangeAmount {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SizeChangeType f15346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f15347b;

        public SizeChangeAmount(SizeChangeType sizeChangeType, float f5) {
            this.f15346a = sizeChangeType;
            this.f15347b = f5;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SizeChangeType {
        private static final /* synthetic */ SizeChangeType[] $VALUES;
        public static final SizeChangeType PERCENT;
        public static final SizeChangeType PIXELS;

        static {
            SizeChangeType sizeChangeType = new SizeChangeType("PERCENT", 0);
            PERCENT = sizeChangeType;
            SizeChangeType sizeChangeType2 = new SizeChangeType("PIXELS", 1);
            PIXELS = sizeChangeType2;
            $VALUES = new SizeChangeType[]{sizeChangeType, sizeChangeType2};
        }

        public static SizeChangeType valueOf(String str) {
            return (SizeChangeType) Enum.valueOf(SizeChangeType.class, str);
        }

        public static SizeChangeType[] values() {
            return (SizeChangeType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        SizeChangeAmount sizeChangeAmount;
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
                int[] iArr = R.styleable.f13742g0;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(0);
                if (typedValuePeekValue != null) {
                    int i11 = typedValuePeekValue.type;
                    if (i11 == 5) {
                        sizeChangeAmount = new SizeChangeAmount(SizeChangeType.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i11 == 6) {
                        sizeChangeAmount = new SizeChangeAmount(SizeChangeType.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
                    } else {
                        sizeChangeAmount = null;
                    }
                } else {
                    sizeChangeAmount = null;
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i12 = 0;
                for (int i13 = 0; i13 < attributeCount; i13++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i13);
                    if (attributeNameResource != com.lingodeer.R.attr.widthChange) {
                        int i14 = i12 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i13, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i12] = attributeNameResource;
                        i12 = i14;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i12);
                SizeChange sizeChange = new SizeChange();
                sizeChange.f15345a = sizeChangeAmount;
                int i15 = this.f15341a;
                if (i15 == 0 || iArrTrimStateSet.length == 0) {
                    this.f15342b = sizeChange;
                }
                int[][] iArr3 = this.f15343c;
                if (i15 >= iArr3.length) {
                    int i16 = i15 + 10;
                    int[][] iArr4 = new int[i16][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i15);
                    this.f15343c = iArr4;
                    SizeChange[] sizeChangeArr = new SizeChange[i16];
                    System.arraycopy(this.f15344d, 0, sizeChangeArr, 0, i15);
                    this.f15344d = sizeChangeArr;
                }
                int[][] iArr5 = this.f15343c;
                int i17 = this.f15341a;
                iArr5[i17] = iArrTrimStateSet;
                this.f15344d[i17] = sizeChange;
                this.f15341a = i17 + 1;
            }
        }
    }
}
