package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import hd.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ChipGroup extends FlowLayout {
    public final CheckableGroup H;
    public final int K;
    public final PassThroughHierarchyChangeListener L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14260f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public OnCheckedStateChangeListener f14261t;

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass1 implements CheckableGroup.OnCheckedStateChangeListener {
        public AnonymousClass1() {
        }

        @Override // com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener
        public final void a() {
            ChipGroup chipGroup = ChipGroup.this;
            OnCheckedStateChangeListener onCheckedStateChangeListener = chipGroup.f14261t;
            if (onCheckedStateChangeListener != null) {
                chipGroup.H.c(chipGroup);
                onCheckedStateChangeListener.a(chipGroup);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public interface OnCheckedChangeListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnCheckedStateChangeListener {
        void a(ChipGroup chipGroup);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f14265a;

        public PassThroughHierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                chipGroup.H.a((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f14265a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                CheckableGroup checkableGroup = chipGroup.H;
                Chip chip = (Chip) view2;
                checkableGroup.getClass();
                chip.setInternalOnCheckedChangeListener(null);
                checkableGroup.f14591a.remove(Integer.valueOf(chip.getId()));
                checkableGroup.f14592b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f14265a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof Chip) && getChildAt(i12).getVisibility() == 0) {
                i11++;
            }
        }
        return i11;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public final boolean a() {
        return this.f14666c;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.H.d();
    }

    public List<Integer> getCheckedChipIds() {
        return this.H.c(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f14259e;
    }

    public int getChipSpacingVertical() {
        return this.f14260f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        CheckableGroup.OnCheckedStateChangeListener onCheckedStateChangeListener;
        super.onFinishInflate();
        int i11 = this.K;
        if (i11 != -1) {
            CheckableGroup checkableGroup = this.H;
            MaterialCheckable materialCheckable = (MaterialCheckable) checkableGroup.f14591a.get(Integer.valueOf(i11));
            if (materialCheckable == null || !checkableGroup.b(materialCheckable) || (onCheckedStateChangeListener = checkableGroup.f14593c) == null) {
                return;
            }
            new HashSet(checkableGroup.f14592b);
            ((AnonymousClass1) onCheckedStateChangeListener).a();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.v(getRowCount(), this.f14666c ? getVisibleChipCount() : -1, this.H.f14594d ? 1 : 2, false).f32187b);
    }

    public void setChipSpacing(int i11) {
        setChipSpacingHorizontal(i11);
        setChipSpacingVertical(i11);
    }

    public void setChipSpacingHorizontal(int i11) {
        if (this.f14259e != i11) {
            this.f14259e = i11;
            setItemSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i11) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingResource(int i11) {
        setChipSpacing(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingVertical(int i11) {
        if (this.f14260f != i11) {
            this.f14260f = i11;
            setLineSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i11) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i11));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i11) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(final OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.2
                @Override // com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
                public final void a(ChipGroup chipGroup) {
                    ChipGroup chipGroup2 = ChipGroup.this;
                    if (chipGroup2.H.f14594d) {
                        chipGroup2.getCheckedChipId();
                        onCheckedChangeListener.a();
                    }
                }
            });
        }
    }

    public void setOnCheckedStateChangeListener(OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.f14261t = onCheckedStateChangeListener;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.L.f14265a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z11) {
        this.H.f14595e = z11;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z11) {
        super.setSingleLine(z11);
    }

    public void setSingleSelection(boolean z11) {
        CheckableGroup.OnCheckedStateChangeListener onCheckedStateChangeListener;
        CheckableGroup checkableGroup = this.H;
        boolean z12 = checkableGroup.f14594d;
        HashSet hashSet = checkableGroup.f14592b;
        if (z12 != z11) {
            checkableGroup.f14594d = z11;
            boolean zIsEmpty = hashSet.isEmpty();
            Iterator it = checkableGroup.f14591a.values().iterator();
            while (it.hasNext()) {
                checkableGroup.e((MaterialCheckable) it.next(), false);
            }
            if (zIsEmpty || (onCheckedStateChangeListener = checkableGroup.f14593c) == null) {
                return;
            }
            new HashSet(hashSet);
            ((AnonymousClass1) onCheckedStateChangeListener).a();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    public void setSingleLine(int i11) {
        setSingleLine(getResources().getBoolean(i11));
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, i11);
        CheckableGroup checkableGroup = new CheckableGroup();
        this.H = checkableGroup;
        PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = new PassThroughHierarchyChangeListener();
        this.L = passThroughHierarchyChangeListener;
        TypedArray typedArrayD = ThemeEnforcement.d(getContext(), attributeSet, com.google.android.material.R.styleable.f13747j, i11, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayD.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayD.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayD.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayD.getBoolean(5, false));
        setSingleSelection(typedArrayD.getBoolean(6, false));
        setSelectionRequired(typedArrayD.getBoolean(4, false));
        this.K = typedArrayD.getResourceId(0, -1);
        typedArrayD.recycle();
        checkableGroup.f14593c = new AnonymousClass1();
        super.setOnHierarchyChangeListener(passThroughHierarchyChangeListener);
        setImportantForAccessibility(1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleSelection(int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }
}
