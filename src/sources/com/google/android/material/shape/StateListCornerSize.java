package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.google.android.material.R;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class StateListCornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CornerSize f15322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[][] f15323c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CornerSize[] f15324d = new CornerSize[10];

    public static StateListCornerSize b(CornerSize cornerSize) {
        StateListCornerSize stateListCornerSize = new StateListCornerSize();
        stateListCornerSize.a(StateSet.WILD_CARD, cornerSize);
        return stateListCornerSize;
    }

    public final void a(int[] iArr, CornerSize cornerSize) {
        int i11 = this.f15321a;
        if (i11 == 0 || iArr.length == 0) {
            this.f15322b = cornerSize;
        }
        int[][] iArr2 = this.f15323c;
        if (i11 >= iArr2.length) {
            int i12 = i11 + 10;
            int[][] iArr3 = new int[i12][];
            System.arraycopy(iArr2, 0, iArr3, 0, i11);
            this.f15323c = iArr3;
            CornerSize[] cornerSizeArr = new CornerSize[i12];
            System.arraycopy(this.f15324d, 0, cornerSizeArr, 0, i11);
            this.f15324d = cornerSizeArr;
        }
        int[][] iArr4 = this.f15323c;
        int i13 = this.f15321a;
        iArr4[i13] = iArr;
        this.f15324d[i13] = cornerSize;
        this.f15321a = i13 + 1;
    }

    public final CornerSize c(int[] iArr) {
        int i11;
        int[][] iArr2 = this.f15323c;
        int i12 = 0;
        while (true) {
            i11 = -1;
            if (i12 >= this.f15321a) {
                i12 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i12], iArr)) {
                break;
            }
            i12++;
        }
        if (i12 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f15323c;
            for (int i13 = 0; i13 < this.f15321a; i13++) {
                if (StateSet.stateSetMatches(iArr4[i13], iArr3)) {
                    i11 = i13;
                    break;
                }
            }
            i12 = i11;
        }
        return i12 < 0 ? this.f15322b : this.f15324d[i12];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals(EHjhWcesDUIsIw.JMz)) {
                        Resources resources = context.getResources();
                        int[] iArr = R.styleable.f13732b0;
                        if (theme == null) {
                            typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        CornerSize cornerSizeE = ShapeAppearanceModel.e(typedArrayObtainStyledAttributes, 5, new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO));
                        typedArrayObtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i11 = 0;
                        for (int i12 = 0; i12 < attributeCount; i12++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                            if (attributeNameResource != com.lingodeer.R.attr.cornerSize) {
                                int i13 = i11 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i11] = attributeNameResource;
                                i11 = i13;
                            }
                        }
                        a(StateSet.trimStateSet(iArr2, i11), cornerSizeE);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
