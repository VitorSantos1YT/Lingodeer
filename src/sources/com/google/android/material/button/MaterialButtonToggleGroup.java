package com.google.android.material.button;

import a5.f;
import a5.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import hd.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends MaterialButtonGroup {
    public static final /* synthetic */ int T = 0;
    public final LinkedHashSet N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final int R;
    public HashSet S;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnButtonCheckedListener {
        void a(int i11, boolean z11);
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    private String getChildrenA11yClassName() {
        return (this.P ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof MaterialButton) && getChildAt(i12).getVisibility() != 8) {
                i11++;
            }
        }
        return i11;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i11, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setupButtonChild(materialButton);
            f(materialButton.getId(), materialButton.Q);
            s0.q(materialButton, new z4.b() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
                @Override // z4.b
                public final void d(View view2, g gVar) {
                    int i12;
                    this.f58810a.onInitializeAccessibilityNodeInfo(view2, gVar.f380a);
                    int i13 = MaterialButtonToggleGroup.T;
                    if (view2 instanceof MaterialButton) {
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                            if (i14 >= materialButtonToggleGroup.getChildCount()) {
                                break;
                            }
                            if (materialButtonToggleGroup.getChildAt(i14) == view2) {
                                i12 = i15;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i14) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i14).getVisibility() != 8) {
                                    i15++;
                                }
                                i14++;
                            }
                        }
                        i12 = -1;
                    } else {
                        i12 = -1;
                    }
                    gVar.o(f.o(0, 1, i12, 1, false, ((MaterialButton) view2).Q));
                }
            });
        }
    }

    public final void f(int i11, boolean z11) {
        if (i11 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.S);
        if (z11 && !hashSet.contains(Integer.valueOf(i11))) {
            if (this.P && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i11));
        } else {
            if (z11 || !hashSet.contains(Integer.valueOf(i11))) {
                return;
            }
            if (!this.Q || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i11));
            }
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.S;
        this.S = new HashSet(set);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int id2 = ((MaterialButton) getChildAt(i11)).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.O = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.O = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                boolean zContains2 = set.contains(Integer.valueOf(id2));
                Iterator it = this.N.iterator();
                while (it.hasNext()) {
                    ((OnButtonCheckedListener) it.next()).a(id2, zContains2);
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.P || this.S.isEmpty()) {
            return -1;
        }
        return ((Integer) this.S.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int id2 = ((MaterialButton) getChildAt(i11)).getId();
            if (this.S.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.R;
        if (i11 != -1) {
            g(Collections.singleton(Integer.valueOf(i11)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.v(1, getVisibleButtonCount(), this.P ? 1 : 2, false).f32187b);
    }

    public void setSelectionRequired(boolean z11) {
        this.Q = z11;
    }

    public void setSingleSelection(boolean z11) {
        if (this.P != z11) {
            this.P = z11;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            ((MaterialButton) getChildAt(i11)).setA11yClassName(childrenA11yClassName);
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, i11);
        this.N = new LinkedHashSet();
        this.O = false;
        this.S = new HashSet();
        TypedArray typedArrayD = ThemeEnforcement.d(getContext(), attributeSet, com.google.android.material.R.styleable.D, i11, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayD.getBoolean(7, false));
        this.R = typedArrayD.getResourceId(2, -1);
        this.Q = typedArrayD.getBoolean(4, false);
        if (this.f14072f == null) {
            this.f14072f = StateListCornerSize.b(new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO));
        }
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }
}
