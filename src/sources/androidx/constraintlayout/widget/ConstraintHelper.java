package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yalantis.ucrop.view.CropImageView;
import d4.g;
import d4.m;
import j4.e;
import j4.k;
import j4.l;
import j4.q;
import j4.s;
import j4.t;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {
    public View[] H;
    public final HashMap K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f1357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1359f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f1360t;

    public ConstraintHelper(Context context) {
        super(context);
        this.f1354a = new int[32];
        this.f1358e = false;
        this.H = null;
        this.K = new HashMap();
        this.f1356c = context;
        k(null);
    }

    public final void b(String str) {
        String strTrim;
        int i11;
        if (str == null || str.length() == 0 || this.f1356c == null || (i11 = i((strTrim = str.trim()))) == 0) {
            return;
        }
        this.K.put(Integer.valueOf(i11), strTrim);
        c(i11);
    }

    public final void c(int i11) {
        if (i11 == getId()) {
            return;
        }
        int i12 = this.f1355b + 1;
        int[] iArr = this.f1354a;
        if (i12 > iArr.length) {
            this.f1354a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1354a;
        int i13 = this.f1355b;
        iArr2[i13] = i11;
        this.f1355b = i13 + 1;
    }

    public final void d(String str) {
        if (str == null || str.length() == 0 || this.f1356c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof e) && strTrim.equals(((e) layoutParams).Y) && childAt.getId() != -1) {
                c(childAt.getId());
            }
        }
    }

    public final void e() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i11 = 0; i11 < this.f1355b; i11++) {
            View viewE = constraintLayout.e(this.f1354a[i11]);
            if (viewE != null) {
                viewE.setVisibility(visibility);
                if (elevation > CropImageView.DEFAULT_ASPECT_RATIO) {
                    viewE.setTranslationZ(viewE.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1354a, this.f1355b);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f1356c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = constraintLayout.getChildAt(i11);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public final int i(String str) {
        int iH;
        HashMap map;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            iH = 0;
        } else {
            Object obj = (str == null || (map = constraintLayout.O) == null || !map.containsKey(str)) ? null : constraintLayout.O.get(str);
            if (obj instanceof Integer) {
                iH = ((Integer) obj).intValue();
            } else {
                iH = 0;
            }
        }
        if (iH == 0 && constraintLayout != null) {
            iH = h(constraintLayout, str);
        }
        if (iH == 0) {
            try {
                iH = s.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iH != 0) {
            return iH;
        }
        Context context = this.f1356c;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public final View[] j(ConstraintLayout constraintLayout) {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.f1355b) {
            this.H = new View[this.f1355b];
        }
        for (int i11 = 0; i11 < this.f1355b; i11++) {
            this.H[i11] = constraintLayout.e(this.f1354a[i11]);
        }
        return this.H;
    }

    public void k(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f36028c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1359f = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f1360t = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void l(k kVar, m mVar, q qVar, SparseArray sparseArray) {
        l lVar = kVar.f35929e;
        int[] iArr = lVar.f35953j0;
        int i11 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = lVar.f35955k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = lVar.f35955k0.split(",");
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i12 = 0;
                    for (String str2 : strArrSplit) {
                        int i13 = i(str2.trim());
                        if (i13 != 0) {
                            iArrCopyOf[i12] = i13;
                            i12++;
                        }
                    }
                    if (i12 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i12);
                    }
                    lVar.f35953j0 = iArrCopyOf;
                } else {
                    lVar.f35953j0 = null;
                }
            }
        }
        mVar.f23196v0 = 0;
        Arrays.fill(mVar.f23195u0, (Object) null);
        if (lVar.f35953j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = lVar.f35953j0;
            if (i11 >= iArr2.length) {
                return;
            }
            g gVar = (g) sparseArray.get(iArr2[i11]);
            if (gVar != null) {
                mVar.S(gVar);
            }
            i11++;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1359f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1360t;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.f1358e) {
            super.onMeasure(i11, i12);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(m mVar, SparseArray sparseArray) {
        mVar.f23196v0 = 0;
        Arrays.fill(mVar.f23195u0, (Object) null);
        for (int i11 = 0; i11 < this.f1355b; i11++) {
            mVar.S((g) sparseArray.get(this.f1354a[i11]));
        }
    }

    public final void q() {
        if (this.f1357d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof e) {
            ((e) layoutParams).f35880q0 = this.f1357d;
        }
    }

    public void setIds(String str) {
        this.f1359f = str;
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.f1355b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i11);
            if (iIndexOf == -1) {
                b(str.substring(i11));
                return;
            } else {
                b(str.substring(i11, iIndexOf));
                i11 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1360t = str;
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.f1355b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i11);
            if (iIndexOf == -1) {
                d(str.substring(i11));
                return;
            } else {
                d(str.substring(i11, iIndexOf));
                i11 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1359f = null;
        this.f1355b = 0;
        for (int i11 : iArr) {
            c(i11);
        }
    }

    @Override // android.view.View
    public final void setTag(int i11, Object obj) {
        super.setTag(i11, obj);
        if (obj == null && this.f1359f == null) {
            c(i11);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1354a = new int[32];
        this.f1358e = false;
        this.H = null;
        this.K = new HashMap();
        this.f1356c = context;
        k(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1354a = new int[32];
        this.f1358e = false;
        this.H = null;
        this.K = new HashMap();
        this.f1356c = context;
        k(attributeSet);
    }

    public void n() {
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void m(g gVar, boolean z11) {
    }
}
