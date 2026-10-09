package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonGroup extends LinearLayout {
    public static final /* synthetic */ int M = 0;
    public int H;
    public StateListSizeChange K;
    public boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PressedStateTracker f14069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f14070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer[] f14071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public StateListCornerSize f14072f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public StateListShapeAppearanceModel f14073t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        public PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public final void a() {
            MaterialButtonGroup.this.invalidate();
        }
    }

    public MaterialButtonGroup(Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (c(i11)) {
                return i11;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i11 = firstVisibleChildIndex + 1; i11 < getChildCount(); i11++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i11);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i11 - 1);
            if (this.H <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.H - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.H - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            d();
            this.L = true;
            super.addView(view, i11, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            materialButton.setOnPressedChangeListenerInternal(this.f14069c);
            this.f14067a.add(materialButton.getShapeAppearanceModel());
            this.f14068b.add(materialButton.getStateListShapeAppearanceModel());
            materialButton.setEnabled(isEnabled());
        }
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.K == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i11 = firstVisibleChildIndex; i11 <= lastVisibleChildIndex; i11++) {
            if (c(i11)) {
                int iMin2 = 0;
                if (c(i11) && this.K != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i11);
                    StateListSizeChange stateListSizeChange = this.K;
                    int width = materialButton3.getWidth();
                    int i12 = -width;
                    for (int i13 = 0; i13 < stateListSizeChange.f15341a; i13++) {
                        StateListSizeChange.SizeChangeAmount sizeChangeAmount = stateListSizeChange.f15344d[i13].f15345a;
                        StateListSizeChange.SizeChangeType sizeChangeType = sizeChangeAmount.f15346a;
                        float f5 = sizeChangeAmount.f15347b;
                        if (sizeChangeType == StateListSizeChange.SizeChangeType.PIXELS) {
                            fMax = Math.max(i12, f5);
                        } else {
                            if (sizeChangeType == StateListSizeChange.SizeChangeType.PERCENT) {
                                fMax = Math.max(i12, width * f5);
                            }
                        }
                        i12 = (int) fMax;
                    }
                    int iMax = Math.max(0, i12);
                    int i14 = i11 - 1;
                    while (true) {
                        materialButton = null;
                        if (i14 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i14)) {
                                materialButton2 = (MaterialButton) getChildAt(i14);
                                break;
                            }
                            i14--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    for (int i15 = i11 + 1; i15 < childCount; i15++) {
                        if (c(i15)) {
                            materialButton = (MaterialButton) getChildAt(i15);
                            break;
                        }
                    }
                    iMin2 = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i11 != firstVisibleChildIndex && i11 != lastVisibleChildIndex) {
                    iMin2 /= 2;
                }
                iMin = Math.min(iMin, iMin2);
            }
        }
        int i16 = firstVisibleChildIndex;
        while (i16 <= lastVisibleChildIndex) {
            if (c(i16)) {
                ((MaterialButton) getChildAt(i16)).setSizeChange(this.K);
                ((MaterialButton) getChildAt(i16)).setWidthChangeMax((i16 == firstVisibleChildIndex || i16 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i16++;
        }
    }

    public final boolean c(int i11) {
        return getChildAt(i11).getVisibility() != 8;
    }

    public final void d() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = materialButton.f14050a0;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f14050a0 = null;
                materialButton.U = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f14070d);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            treeMap.put((MaterialButton) getChildAt(i11), Integer.valueOf(i11));
        }
        this.f14071e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        StateListShapeAppearanceModel.Builder builder;
        int i11;
        if (!(this.f14072f == null && this.f14073t == null) && this.L) {
            this.L = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i12 = 0;
            while (i12 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i12);
                if (materialButton.getVisibility() != 8) {
                    boolean z11 = i12 == firstVisibleChildIndex;
                    boolean z12 = i12 == lastVisibleChildIndex;
                    StateListShapeAppearanceModel stateListShapeAppearanceModel = this.f14073t;
                    if (stateListShapeAppearanceModel == null || (!z11 && !z12)) {
                        stateListShapeAppearanceModel = (StateListShapeAppearanceModel) this.f14068b.get(i12);
                    }
                    if (stateListShapeAppearanceModel == null) {
                        builder = new StateListShapeAppearanceModel.Builder((ShapeAppearanceModel) this.f14067a.get(i12));
                    } else {
                        StateListShapeAppearanceModel.Builder builder2 = new StateListShapeAppearanceModel.Builder();
                        int i13 = stateListShapeAppearanceModel.f15325a;
                        builder2.f15333a = i13;
                        builder2.f15334b = stateListShapeAppearanceModel.f15326b;
                        int[][] iArr = stateListShapeAppearanceModel.f15327c;
                        int[][] iArr2 = new int[iArr.length][];
                        builder2.f15335c = iArr2;
                        ShapeAppearanceModel[] shapeAppearanceModelArr = stateListShapeAppearanceModel.f15328d;
                        builder2.f15336d = new ShapeAppearanceModel[shapeAppearanceModelArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i13);
                        System.arraycopy(shapeAppearanceModelArr, 0, builder2.f15336d, 0, builder2.f15333a);
                        builder2.f15337e = stateListShapeAppearanceModel.f15329e;
                        builder2.f15338f = stateListShapeAppearanceModel.f15330f;
                        builder2.f15339g = stateListShapeAppearanceModel.f15331g;
                        builder2.f15340h = stateListShapeAppearanceModel.f15332h;
                        builder = builder2;
                    }
                    boolean z13 = getOrientation() == 0;
                    boolean z14 = getLayoutDirection() == 1;
                    if (z13) {
                        i11 = z11 ? 5 : 0;
                        if (z12) {
                            i11 |= 10;
                        }
                        if (z14) {
                            i11 = ((i11 & 10) >> 1) | ((i11 & 5) << 1);
                        }
                    } else {
                        i11 = z11 ? 3 : 0;
                        if (z12) {
                            i11 |= 12;
                        }
                    }
                    int i14 = ~i11;
                    StateListCornerSize stateListCornerSize = this.f14072f;
                    if ((i14 | 1) == i14) {
                        builder.f15337e = stateListCornerSize;
                    }
                    if ((i14 | 2) == i14) {
                        builder.f15338f = stateListCornerSize;
                    }
                    if ((i14 | 4) == i14) {
                        builder.f15339g = stateListCornerSize;
                    }
                    if ((i14 | 8) == i14) {
                        builder.f15340h = stateListCornerSize;
                    }
                    StateListShapeAppearanceModel stateListShapeAppearanceModel2 = builder.f15333a == 0 ? null : new StateListShapeAppearanceModel(builder);
                    if (stateListShapeAppearanceModel2.d()) {
                        materialButton.setStateListShapeAppearanceModel(stateListShapeAppearanceModel2);
                    } else {
                        materialButton.setShapeAppearanceModel(stateListShapeAppearanceModel2.c());
                    }
                }
                i12++;
            }
        }
    }

    public StateListSizeChange getButtonSizeChange() {
        return this.K;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i11, int i12) {
        Integer[] numArr = this.f14071e;
        return (numArr == null || i12 >= numArr.length) ? i12 : numArr[i12].intValue();
    }

    public CornerSize getInnerCornerSize() {
        return this.f14072f.f15322b;
    }

    public StateListCornerSize getInnerCornerSizeStateList() {
        return this.f14072f;
    }

    public ShapeAppearanceModel getShapeAppearance() {
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.f14073t;
        if (stateListShapeAppearanceModel == null) {
            return null;
        }
        return stateListShapeAppearanceModel.c();
    }

    public int getSpacing() {
        return this.H;
    }

    public StateListShapeAppearanceModel getStateListShapeAppearance() {
        return this.f14073t;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        e();
        a();
        super.onMeasure(i11, i12);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f14067a.remove(iIndexOfChild);
            this.f14068b.remove(iIndexOfChild);
        }
        this.L = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(StateListSizeChange stateListSizeChange) {
        if (this.K != stateListSizeChange) {
            this.K = stateListSizeChange;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            ((MaterialButton) getChildAt(i11)).setEnabled(z11);
        }
    }

    public void setInnerCornerSize(CornerSize cornerSize) {
        this.f14072f = StateListCornerSize.b(cornerSize);
        this.L = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(StateListCornerSize stateListCornerSize) {
        this.f14072f = stateListCornerSize;
        this.L = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i11) {
        if (getOrientation() != i11) {
            this.L = true;
        }
        super.setOrientation(i11);
    }

    public void setShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
        StateListShapeAppearanceModel.Builder builder = new StateListShapeAppearanceModel.Builder(shapeAppearanceModel);
        this.f14073t = builder.f15333a == 0 ? null : new StateListShapeAppearanceModel(builder);
        this.L = true;
        e();
        invalidate();
    }

    public void setSpacing(int i11) {
        this.H = i11;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        this.f14073t = stateListShapeAppearanceModel;
        this.L = true;
        e();
        invalidate();
    }

    public MaterialButtonGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonGroupStyle);
    }

    public MaterialButtonGroup(Context context, AttributeSet attributeSet, int i11) {
        StateListCornerSize stateListCornerSizeB;
        int next;
        StateListSizeChange stateListSizeChange;
        int next2;
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, i11);
        this.f14067a = new ArrayList();
        this.f14068b = new ArrayList();
        this.f14069c = new PressedStateTracker();
        this.f14070d = new a(this, 0);
        this.L = true;
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.C, i11, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayD.hasValue(2)) {
            int resourceId = typedArrayD.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    XmlResourceParser xml = context2.getResources().getXml(resourceId);
                    try {
                        stateListSizeChange = new StateListSizeChange();
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 == 2) {
                            if (xml.getName().equals("selector")) {
                                stateListSizeChange.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                            }
                            xml.close();
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    } catch (Throwable th2) {
                        if (xml == null) {
                            throw th2;
                        }
                        try {
                            xml.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    stateListSizeChange = null;
                }
            } else {
                stateListSizeChange = null;
            }
            this.K = stateListSizeChange;
        }
        if (typedArrayD.hasValue(4)) {
            StateListShapeAppearanceModel stateListShapeAppearanceModelB = StateListShapeAppearanceModel.b(context2, typedArrayD, 4);
            this.f14073t = stateListShapeAppearanceModelB;
            if (stateListShapeAppearanceModelB == null) {
                StateListShapeAppearanceModel.Builder builder = new StateListShapeAppearanceModel.Builder(ShapeAppearanceModel.a(context2, typedArrayD.getResourceId(4, 0), typedArrayD.getResourceId(5, 0)).a());
                this.f14073t = builder.f15333a != 0 ? new StateListShapeAppearanceModel(builder) : null;
            }
        }
        if (typedArrayD.hasValue(3)) {
            AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);
            int resourceId2 = typedArrayD.getResourceId(3, 0);
            if (resourceId2 == 0 || !context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                stateListCornerSizeB = StateListCornerSize.b(ShapeAppearanceModel.e(typedArrayD, 3, absoluteCornerSize));
            } else {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        StateListCornerSize stateListCornerSize = new StateListCornerSize();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next == 2) {
                            if (xml2.getName().equals("selector")) {
                                stateListCornerSize.d(context2, xml2, attributeSetAsAttributeSet2, context2.getTheme());
                            }
                            xml2.close();
                            stateListCornerSizeB = stateListCornerSize;
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    } catch (Throwable th4) {
                        if (xml2 == null) {
                            throw th4;
                        }
                        try {
                            xml2.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    stateListCornerSizeB = StateListCornerSize.b(absoluteCornerSize);
                }
            }
            this.f14072f = stateListCornerSizeB;
        }
        this.H = typedArrayD.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
    }
}
