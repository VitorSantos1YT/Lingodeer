package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.yalantis.ucrop.view.CropImageView;
import d4.a;
import d4.c;
import d4.g;
import d4.h;
import d4.l;
import d4.n;
import e4.j;
import e4.m;
import j4.e;
import j4.f;
import j4.i;
import j4.p;
import j4.r;
import j4.t;
import j4.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import ko.Zea.ealNNtLp;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static v R;
    public boolean H;
    public int K;
    public p L;
    public i M;
    public int N;
    public HashMap O;
    public final SparseArray P;
    public final f Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f1361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f1363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1366f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1367t;

    public ConstraintLayout(Context context) {
        super(context);
        this.f1361a = new SparseArray();
        this.f1362b = new ArrayList(4);
        this.f1363c = new h();
        this.f1364d = 0;
        this.f1365e = 0;
        this.f1366f = Integer.MAX_VALUE;
        this.f1367t = Integer.MAX_VALUE;
        this.H = true;
        this.K = 257;
        this.L = null;
        this.M = null;
        this.N = -1;
        this.O = new HashMap();
        this.P = new SparseArray();
        this.Q = new f(this, this);
        k(null, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static v getSharedValues() {
        if (R == null) {
            v vVar = new v();
            new SparseIntArray();
            vVar.f36051a = new HashMap();
            R = vVar;
        }
        return R;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x018b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x02ba -> B:153:0x02bb). Please report as a decompilation issue!!! */
    public final void a(boolean z11, View view, g gVar, e eVar, SparseArray sparseArray) {
        ConstraintLayout constraintLayout;
        g gVar2;
        g gVar3;
        g gVar4;
        g gVar5;
        e eVar2;
        g gVar6;
        float f5;
        int i11;
        float fAbs;
        int i12;
        g gVar7 = gVar;
        eVar.a();
        gVar7.f23133i0 = view.getVisibility();
        if (eVar.f35859f0) {
            gVar7.F = true;
            gVar7.f23133i0 = 8;
        }
        gVar7.f23131h0 = view;
        if (view instanceof ConstraintHelper) {
            constraintLayout = this;
            ((ConstraintHelper) view).m(gVar7, constraintLayout.f1363c.f23166z0);
        } else {
            constraintLayout = this;
        }
        int i13 = -1;
        if (eVar.f35855d0) {
            l lVar = (l) gVar7;
            int i14 = eVar.f35874n0;
            int i15 = eVar.f35876o0;
            float f11 = eVar.f35878p0;
            if (f11 != -1.0f) {
                if (f11 > -1.0f) {
                    lVar.f23189u0 = f11;
                    lVar.f23190v0 = -1;
                    lVar.f23191w0 = -1;
                    return;
                }
                return;
            }
            if (i14 != -1) {
                if (i14 > -1) {
                    lVar.f23189u0 = -1.0f;
                    lVar.f23190v0 = i14;
                    lVar.f23191w0 = -1;
                    return;
                }
                return;
            }
            if (i15 == -1 || i15 <= -1) {
                return;
            }
            lVar.f23189u0 = -1.0f;
            lVar.f23190v0 = -1;
            lVar.f23191w0 = i15;
            return;
        }
        int i16 = eVar.f35861g0;
        int i17 = eVar.f35863h0;
        int i18 = eVar.f35865i0;
        int i19 = eVar.f35867j0;
        int i21 = eVar.f35869k0;
        int i22 = eVar.f35871l0;
        float f12 = eVar.f35872m0;
        int i23 = eVar.f35877p;
        if (i23 != -1) {
            g gVar8 = (g) sparseArray.get(i23);
            if (gVar8 != null) {
                float f13 = eVar.f35881r;
                int i24 = eVar.f35879q;
                c cVar = c.CENTER;
                gVar.w(cVar, gVar8, cVar, i24, 0);
                gVar7 = gVar;
                gVar7.D = f13;
            }
            gVar6 = gVar7;
            eVar2 = eVar;
        } else {
            if (i16 != -1) {
                g gVar9 = (g) sparseArray.get(i16);
                if (gVar9 != null) {
                    c cVar2 = c.LEFT;
                    gVar.w(cVar2, gVar9, cVar2, ((ViewGroup.MarginLayoutParams) eVar).leftMargin, i21);
                }
            } else if (i17 != -1 && (gVar2 = (g) sparseArray.get(i17)) != null) {
                gVar.w(c.LEFT, gVar2, c.RIGHT, ((ViewGroup.MarginLayoutParams) eVar).leftMargin, i21);
            }
            if (i18 != -1) {
                g gVar10 = (g) sparseArray.get(i18);
                if (gVar10 != null) {
                    gVar.w(c.RIGHT, gVar10, c.LEFT, ((ViewGroup.MarginLayoutParams) eVar).rightMargin, i22);
                }
            } else if (i19 != -1 && (gVar3 = (g) sparseArray.get(i19)) != null) {
                c cVar3 = c.RIGHT;
                gVar.w(cVar3, gVar3, cVar3, ((ViewGroup.MarginLayoutParams) eVar).rightMargin, i22);
            }
            int i25 = eVar.f35864i;
            if (i25 != -1) {
                g gVar11 = (g) sparseArray.get(i25);
                if (gVar11 != null) {
                    c cVar4 = c.TOP;
                    gVar.w(cVar4, gVar11, cVar4, ((ViewGroup.MarginLayoutParams) eVar).topMargin, eVar.f35887x);
                }
            } else {
                int i26 = eVar.f35866j;
                if (i26 != -1 && (gVar4 = (g) sparseArray.get(i26)) != null) {
                    gVar.w(c.TOP, gVar4, c.BOTTOM, ((ViewGroup.MarginLayoutParams) eVar).topMargin, eVar.f35887x);
                }
            }
            int i27 = eVar.f35868k;
            if (i27 != -1) {
                g gVar12 = (g) sparseArray.get(i27);
                if (gVar12 != null) {
                    gVar.w(c.BOTTOM, gVar12, c.TOP, ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, eVar.f35889z);
                }
            } else {
                int i28 = eVar.f35870l;
                if (i28 != -1 && (gVar5 = (g) sparseArray.get(i28)) != null) {
                    c cVar5 = c.BOTTOM;
                    gVar.w(cVar5, gVar5, cVar5, ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, eVar.f35889z);
                }
            }
            int i29 = eVar.m;
            if (i29 != -1) {
                eVar2 = eVar;
                constraintLayout.p(gVar, eVar2, sparseArray, i29, c.BASELINE);
            } else {
                eVar2 = eVar;
                int i30 = eVar2.f35873n;
                if (i30 != -1) {
                    p(gVar, eVar2, sparseArray, i30, c.TOP);
                } else {
                    int i31 = eVar2.f35875o;
                    if (i31 != -1) {
                        p(gVar, eVar2, sparseArray, i31, c.BOTTOM);
                        gVar6 = gVar;
                    }
                    if (f12 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        gVar6.f23127f0 = f12;
                    }
                    f5 = eVar2.F;
                    if (f5 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        gVar6.f23129g0 = f5;
                    }
                }
            }
            gVar6 = gVar;
            if (f12 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                gVar6.f23127f0 = f12;
            }
            f5 = eVar2.F;
            if (f5 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                gVar6.f23129g0 = f5;
            }
        }
        if (z11 && ((i12 = eVar2.T) != -1 || eVar2.U != -1)) {
            int i32 = eVar2.U;
            gVar6.f23117a0 = i12;
            gVar6.f23119b0 = i32;
        }
        if (eVar2.f35849a0) {
            gVar6.N(d4.f.FIXED);
            gVar6.P(((ViewGroup.MarginLayoutParams) eVar2).width);
            if (((ViewGroup.MarginLayoutParams) eVar2).width == -2) {
                gVar6.N(d4.f.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) eVar2).width == -1) {
            if (eVar2.W) {
                gVar6.N(d4.f.MATCH_CONSTRAINT);
            } else {
                gVar6.N(d4.f.MATCH_PARENT);
            }
            gVar6.j(c.LEFT).f23112g = ((ViewGroup.MarginLayoutParams) eVar2).leftMargin;
            gVar6.j(c.RIGHT).f23112g = ((ViewGroup.MarginLayoutParams) eVar2).rightMargin;
        } else {
            gVar6.N(d4.f.MATCH_CONSTRAINT);
            gVar6.P(0);
        }
        if (eVar2.f35851b0) {
            gVar6.O(d4.f.FIXED);
            gVar6.M(((ViewGroup.MarginLayoutParams) eVar2).height);
            if (((ViewGroup.MarginLayoutParams) eVar2).height == -2) {
                gVar6.O(d4.f.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) eVar2).height == -1) {
            if (eVar2.X) {
                gVar6.O(d4.f.MATCH_CONSTRAINT);
            } else {
                gVar6.O(d4.f.MATCH_PARENT);
            }
            gVar6.j(c.TOP).f23112g = ((ViewGroup.MarginLayoutParams) eVar2).topMargin;
            gVar6.j(c.BOTTOM).f23112g = ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin;
        } else {
            gVar6.O(d4.f.MATCH_CONSTRAINT);
            gVar6.M(0);
        }
        String str = eVar2.G;
        if (str == null || str.length() == 0) {
            gVar6.Y = CropImageView.DEFAULT_ASPECT_RATIO;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i11 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i13 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i13 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    } else {
                        fAbs = 0.0f;
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        fAbs = 0.0f;
                    } else {
                        float f14 = Float.parseFloat(strSubstring3);
                        float f15 = Float.parseFloat(strSubstring4);
                        if (f14 <= CropImageView.DEFAULT_ASPECT_RATIO || f15 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                            fAbs = 0.0f;
                        } else {
                            fAbs = i13 == 1 ? Math.abs(f15 / f14) : Math.abs(f14 / f15);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
            if (fAbs > CropImageView.DEFAULT_ASPECT_RATIO) {
                gVar6.Y = fAbs;
                gVar6.Z = i13;
            }
        }
        float f16 = eVar2.H;
        float[] fArr = gVar6.f23142n0;
        fArr[0] = f16;
        fArr[1] = eVar2.I;
        gVar6.f23139l0 = eVar2.J;
        gVar6.f23140m0 = eVar2.K;
        int i33 = eVar2.Z;
        if (i33 >= 0 && i33 <= 3) {
            gVar6.f23147q = i33;
        }
        int i34 = eVar2.L;
        int i35 = eVar2.N;
        int i36 = eVar2.P;
        float f17 = eVar2.R;
        gVar6.f23149r = i34;
        gVar6.f23155u = i35;
        if (i36 == Integer.MAX_VALUE) {
            i36 = 0;
        }
        gVar6.f23156v = i36;
        gVar6.f23157w = f17;
        if (f17 > CropImageView.DEFAULT_ASPECT_RATIO && f17 < 1.0f && i34 == 0) {
            gVar6.f23149r = 2;
        }
        int i37 = eVar2.M;
        int i38 = eVar2.O;
        int i39 = eVar2.Q;
        float f18 = eVar2.S;
        gVar6.f23151s = i37;
        gVar6.f23158x = i38;
        gVar6.f23159y = i39 != Integer.MAX_VALUE ? i39 : 0;
        gVar6.f23160z = f18;
        if (f18 <= CropImageView.DEFAULT_ASPECT_RATIO || f18 >= 1.0f || i37 != 0) {
            return;
        }
        gVar6.f23151s = 2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1362b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((ConstraintHelper) arrayList.get(i11)).o(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i13 = Integer.parseInt(strArrSplit[0]);
                        int i14 = Integer.parseInt(strArrSplit[1]);
                        int i15 = Integer.parseInt(strArrSplit[2]);
                        int i16 = (int) ((i13 / 1080.0f) * width);
                        int i17 = (int) ((i14 / 1920.0f) * height);
                        int i18 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f5 = i16;
                        float f11 = i17;
                        float f12 = i16 + ((int) ((i15 / 1080.0f) * width));
                        canvas.drawLine(f5, f11, f12, f11, paint);
                        float f13 = i17 + i18;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f5, f13, paint);
                        canvas.drawLine(f5, f13, f5, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f5, f11, f12, f13, paint);
                        canvas.drawLine(f5, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    public final View e(int i11) {
        return (View) this.f1361a.get(i11);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.H = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f1367t;
    }

    public int getMaxWidth() {
        return this.f1366f;
    }

    public int getMinHeight() {
        return this.f1365e;
    }

    public int getMinWidth() {
        return this.f1364d;
    }

    public int getOptimizationLevel() {
        return this.f1363c.H0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        h hVar = this.f1363c;
        if (hVar.f23134j == null) {
            int id3 = getId();
            if (id3 != -1) {
                hVar.f23134j = getContext().getResources().getResourceEntryName(id3);
            } else {
                hVar.f23134j = "parent";
            }
        }
        if (hVar.f23137k0 == null) {
            hVar.f23137k0 = hVar.f23134j;
        }
        ArrayList arrayList = hVar.f23161u0;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            g gVar = (g) obj;
            View view = gVar.f23131h0;
            if (view != null) {
                if (gVar.f23134j == null && (id2 = view.getId()) != -1) {
                    gVar.f23134j = getContext().getResources().getResourceEntryName(id2);
                }
                if (gVar.f23137k0 == null) {
                    gVar.f23137k0 = gVar.f23134j;
                }
            }
        }
        hVar.o(sb2);
        return sb2.toString();
    }

    public final g j(View view) {
        if (view == this) {
            return this.f1363c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f35880q0;
        }
        view.setLayoutParams(new e(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f35880q0;
        }
        return null;
    }

    public final void k(AttributeSet attributeSet, int i11) {
        h hVar = this.f1363c;
        hVar.f23131h0 = this;
        f fVar = this.Q;
        hVar.f23165y0 = fVar;
        hVar.f23163w0.f24797h = fVar;
        this.f1361a.put(getId(), this);
        this.L = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f36028c, i11, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 16) {
                    this.f1364d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1364d);
                } else if (index == 17) {
                    this.f1365e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1365e);
                } else if (index == 14) {
                    this.f1366f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1366f);
                } else if (index == 15) {
                    this.f1367t = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1367t);
                } else if (index == 113) {
                    this.K = typedArrayObtainStyledAttributes.getInt(index, this.K);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.M = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        p pVar = new p();
                        this.L = pVar;
                        pVar.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.L = null;
                    }
                    this.N = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        hVar.H0 = this.K;
        b4.c.f3892q = hVar.X(512);
    }

    public final boolean l() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void m(int i11) {
        String str;
        Context context = getContext();
        i iVar = new i();
        iVar.f35908a = -1;
        iVar.f35909b = -1;
        iVar.f35911d = new SparseArray();
        iVar.f35912e = new SparseArray();
        iVar.f35910c = this;
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            j4.g gVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                iVar.b(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                j4.g gVar2 = new j4.g(context, xml);
                                ((SparseArray) iVar.f35911d).put(gVar2.f35898a, gVar2);
                                gVar = gVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                j4.h hVar = new j4.h(context, xml);
                                if (gVar != null) {
                                    gVar.f35899b.add(hVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        this.M = iVar;
    }

    public final void n(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        f fVar = this.Q;
        int i15 = fVar.f35894e;
        int iResolveSizeAndState = View.resolveSizeAndState(i13 + fVar.f35893d, i11, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i14 + i15, i12, 0) & 16777215;
        int iMin = Math.min(this.f1366f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f1367t, iResolveSizeAndState2);
        if (z11) {
            iMin |= 16777216;
        }
        if (z12) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b4 A[PHI: r12
      0x00b4: PHI (r12v31 d4.f) = (r12v30 d4.f), (r12v1 d4.f) binds: [B:33:0x00c1, B:29:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    public final void o(h hVar, int i11, int i12, int i13) {
        d4.f fVar;
        d4.f fVar2;
        int i14;
        int iMin;
        int iMax;
        int iMax2;
        int i15;
        boolean z11;
        ArrayList arrayList;
        f fVar3;
        int i16;
        boolean zU;
        int i17;
        f fVar4;
        int i18;
        boolean z12;
        boolean z13;
        f fVar5;
        m mVar;
        e4.p pVar;
        boolean z14;
        int i19;
        int i21;
        int i22;
        int i23;
        boolean z15;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i24 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        f fVar6 = this.Q;
        fVar6.f35891b = iMax3;
        fVar6.f35892c = iMax4;
        fVar6.f35893d = paddingWidth;
        fVar6.f35894e = i24;
        fVar6.f35895f = i12;
        fVar6.f35896g = i13;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if (l()) {
            iMax5 = iMax6;
        }
        int i25 = size - paddingWidth;
        int i26 = size2 - i24;
        int i27 = fVar6.f35894e;
        int i28 = fVar6.f35893d;
        d4.f fVar7 = d4.f.FIXED;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            fVar = d4.f.WRAP_CONTENT;
            if (childCount == 0) {
                iMax = Math.max(0, this.f1364d);
                int i29 = iMax;
                fVar2 = fVar;
                iMin = i29;
                i14 = Integer.MIN_VALUE;
            } else {
                fVar2 = fVar;
                i14 = Integer.MIN_VALUE;
                iMin = i25;
            }
        } else if (mode != 0) {
            iMin = mode != 1073741824 ? 0 : Math.min(this.f1366f - i28, i25);
            i14 = Integer.MIN_VALUE;
            fVar2 = fVar7;
        } else {
            fVar = d4.f.WRAP_CONTENT;
            if (childCount == 0) {
                iMax = Math.max(0, this.f1364d);
                int i210 = iMax;
                fVar2 = fVar;
                iMin = i210;
                i14 = Integer.MIN_VALUE;
            } else {
                iMin = 0;
                i14 = Integer.MIN_VALUE;
                fVar2 = fVar;
            }
        }
        if (mode2 == i14) {
            fVar7 = d4.f.WRAP_CONTENT;
            iMax2 = childCount == 0 ? Math.max(0, this.f1365e) : i26;
        } else if (mode2 == 0) {
            fVar7 = d4.f.WRAP_CONTENT;
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f1365e);
            } else {
                iMax2 = 0;
            }
        } else if (mode2 != 1073741824) {
            iMax2 = 0;
        } else {
            iMax2 = Math.min(this.f1367t - i27, i26);
        }
        int iR = hVar.r();
        e4.e eVar = hVar.f23163w0;
        if (iMin != iR || iMax2 != hVar.l()) {
            eVar.f24792c = true;
        }
        hVar.f23117a0 = 0;
        hVar.f23119b0 = 0;
        int i30 = this.f1366f - i28;
        int[] iArr = hVar.C;
        iArr[0] = i30;
        iArr[1] = this.f1367t - i27;
        hVar.f23123d0 = 0;
        hVar.f23125e0 = 0;
        hVar.N(fVar2);
        hVar.P(iMin);
        hVar.O(fVar7);
        hVar.M(iMax2);
        int i31 = this.f1364d - i28;
        if (i31 < 0) {
            hVar.f23123d0 = 0;
        } else {
            hVar.f23123d0 = i31;
        }
        int i32 = this.f1365e - i27;
        if (i32 < 0) {
            hVar.f23125e0 = 0;
        } else {
            hVar.f23125e0 = i32;
        }
        hVar.B0 = iMax5;
        hVar.C0 = iMax3;
        ob.m mVar2 = hVar.f23162v0;
        h hVar2 = (h) mVar2.f44828d;
        ArrayList arrayList2 = (ArrayList) mVar2.f44826b;
        f fVar8 = hVar.f23165y0;
        int size3 = hVar.f23161u0.size();
        int iR2 = hVar.r();
        int iL = hVar.l();
        boolean zC = n.c(i11, 128);
        boolean z16 = zC || n.c(i11, 64);
        if (z16) {
            int i33 = 0;
            while (true) {
                if (i33 < size3) {
                    boolean z17 = z16;
                    g gVar = (g) hVar.f23161u0.get(i33);
                    int i34 = i33;
                    d4.f[] fVarArr = gVar.U;
                    d4.f fVar9 = fVarArr[0];
                    i15 = size3;
                    d4.f fVar10 = d4.f.MATCH_CONSTRAINT;
                    boolean z18 = (fVar9 == fVar10) && (fVarArr[1] == fVar10) && gVar.Y > CropImageView.DEFAULT_ASPECT_RATIO;
                    if ((gVar.y() && z18) || ((gVar.z() && z18) || (gVar instanceof d4.p) || gVar.y() || gVar.z())) {
                        z11 = false;
                    } else {
                        i33 = i34 + 1;
                        z16 = z17;
                        size3 = i15;
                    }
                } else {
                    i15 = size3;
                    z11 = z16;
                }
            }
        } else {
            i15 = size3;
            z11 = z16;
        }
        boolean z19 = z11 & ((mode == 1073741824 && mode2 == 1073741824) || zC);
        if (z19) {
            int iMin2 = Math.min(hVar.C[0], i25);
            int iMin3 = Math.min(hVar.C[1], i26);
            if (mode != 1073741824 || hVar.r() == iMin2) {
                z14 = true;
            } else {
                hVar.P(iMin2);
                z14 = true;
                eVar.f24791b = true;
            }
            if (mode2 == 1073741824 && hVar.l() != iMin3) {
                hVar.M(iMin3);
                eVar.f24791b = z14;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                ArrayList arrayList3 = (ArrayList) eVar.f24795f;
                h hVar3 = (h) eVar.f24793d;
                if (eVar.f24791b || eVar.f24792c) {
                    ArrayList arrayList4 = hVar3.f23161u0;
                    int size4 = arrayList4.size();
                    int i35 = 0;
                    while (i35 < size4) {
                        Object obj = arrayList4.get(i35);
                        int i36 = i35 + 1;
                        g gVar2 = (g) obj;
                        gVar2.i();
                        gVar2.f23116a = false;
                        gVar2.f23122d.n();
                        gVar2.f23124e.m();
                        arrayList4 = arrayList4;
                        i35 = i36;
                    }
                    hVar3.i();
                    i22 = 0;
                    hVar3.f23116a = false;
                    hVar3.f23122d.n();
                    hVar3.f23124e.m();
                    eVar.f24792c = false;
                } else {
                    i22 = 0;
                }
                eVar.b((h) eVar.f24794e);
                hVar3.f23117a0 = i22;
                hVar3.f23119b0 = i22;
                d4.f fVarK = hVar3.k(i22);
                d4.f fVarK2 = hVar3.k(1);
                if (eVar.f24791b) {
                    eVar.c();
                }
                int iS = hVar3.s();
                fVar3 = fVar8;
                int iT = hVar3.t();
                arrayList = arrayList2;
                hVar3.f23122d.f24833h.d(iS);
                hVar3.f23124e.f24833h.d(iT);
                eVar.g();
                d4.f fVar11 = d4.f.WRAP_CONTENT;
                if (fVarK == fVar11 || fVarK2 == fVar11) {
                    if (zC) {
                        int size5 = arrayList3.size();
                        i23 = iS;
                        int i37 = 0;
                        while (i37 < size5) {
                            Object obj2 = arrayList3.get(i37);
                            i37++;
                            if (!((e4.t) obj2).k()) {
                                zC = false;
                                break;
                            }
                        }
                    } else {
                        i23 = iS;
                    }
                    if (zC && fVarK == d4.f.WRAP_CONTENT) {
                        hVar3.N(d4.f.FIXED);
                        hVar3.P(eVar.d(hVar3, 0));
                        hVar3.f23122d.f24830e.d(hVar3.r());
                    }
                    if (zC && fVarK2 == d4.f.WRAP_CONTENT) {
                        hVar3.O(d4.f.FIXED);
                        hVar3.M(eVar.d(hVar3, 1));
                        hVar3.f23124e.f24830e.d(hVar3.l());
                    }
                } else {
                    i23 = iS;
                }
                d4.f fVar12 = hVar3.U[0];
                d4.f fVar13 = d4.f.FIXED;
                if (fVar12 == fVar13 || fVar12 == d4.f.MATCH_PARENT) {
                    int iR3 = hVar3.r() + i23;
                    hVar3.f23122d.f24834i.d(iR3);
                    hVar3.f23122d.f24830e.d(iR3 - i23);
                    eVar.g();
                    d4.f fVar14 = hVar3.U[1];
                    if (fVar14 == fVar13 || fVar14 == d4.f.MATCH_PARENT) {
                        int iL2 = hVar3.l() + iT;
                        hVar3.f23124e.f24834i.d(iL2);
                        hVar3.f23124e.f24830e.d(iL2 - iT);
                    }
                    eVar.g();
                    z15 = true;
                } else {
                    z15 = false;
                }
                int size6 = arrayList3.size();
                int i38 = 0;
                while (i38 < size6) {
                    Object obj3 = arrayList3.get(i38);
                    i38++;
                    e4.t tVar = (e4.t) obj3;
                    if (tVar.f24827b != hVar3 || tVar.f24832g) {
                        tVar.e();
                    }
                }
                int size7 = arrayList3.size();
                int i39 = 0;
                while (true) {
                    if (i39 >= size7) {
                        zU = true;
                        break;
                    }
                    Object obj4 = arrayList3.get(i39);
                    i39++;
                    e4.t tVar2 = (e4.t) obj4;
                    if (z15 || tVar2.f24827b != hVar3) {
                        if (!tVar2.f24833h.f24808j || ((!tVar2.f24834i.f24808j && !(tVar2 instanceof j)) || (!tVar2.f24830e.f24808j && !(tVar2 instanceof e4.c) && !(tVar2 instanceof j)))) {
                            zU = false;
                            break;
                        }
                    }
                }
                hVar3.N(fVarK);
                hVar3.O(fVarK2);
                i16 = 2;
                i21 = 1073741824;
            } else {
                z19 = z19;
                arrayList = arrayList2;
                fVar3 = fVar8;
                h hVar4 = (h) eVar.f24793d;
                if (eVar.f24791b) {
                    ArrayList arrayList5 = hVar4.f23161u0;
                    int size8 = arrayList5.size();
                    int i40 = 0;
                    while (i40 < size8) {
                        Object obj5 = arrayList5.get(i40);
                        i40++;
                        g gVar3 = (g) obj5;
                        gVar3.i();
                        gVar3.f23116a = false;
                        m mVar3 = gVar3.f23122d;
                        ArrayList arrayList6 = arrayList5;
                        mVar3.f24830e.f24808j = false;
                        mVar3.f24832g = false;
                        mVar3.n();
                        e4.p pVar2 = gVar3.f23124e;
                        pVar2.f24830e.f24808j = false;
                        pVar2.f24832g = false;
                        pVar2.m();
                        arrayList5 = arrayList6;
                    }
                    i19 = 0;
                    hVar4.i();
                    hVar4.f23116a = false;
                    m mVar4 = hVar4.f23122d;
                    mVar4.f24830e.f24808j = false;
                    mVar4.f24832g = false;
                    mVar4.n();
                    e4.p pVar3 = hVar4.f23124e;
                    pVar3.f24830e.f24808j = false;
                    pVar3.f24832g = false;
                    pVar3.m();
                    eVar.c();
                } else {
                    i19 = 0;
                }
                eVar.b((h) eVar.f24794e);
                hVar4.f23117a0 = i19;
                hVar4.f23119b0 = i19;
                hVar4.f23122d.f24833h.d(i19);
                hVar4.f23124e.f24833h.d(i19);
                i21 = 1073741824;
                if (mode == 1073741824) {
                    zU = hVar.U(i19, zC);
                    i16 = 1;
                } else {
                    i16 = 0;
                    zU = true;
                }
                if (mode2 == 1073741824) {
                    zU &= hVar.U(1, zC);
                    i16++;
                }
            }
            if (zU) {
                hVar.Q(mode == i21, mode2 == i21);
            }
        } else {
            z19 = z19;
            arrayList = arrayList2;
            fVar3 = fVar8;
            i16 = 0;
            zU = false;
        }
        if (zU && i16 == 2) {
            return;
        }
        int i41 = hVar.H0;
        if (i15 > 0) {
            int size9 = hVar.f23161u0.size();
            boolean zX = hVar.X(64);
            f fVar15 = hVar.f23165y0;
            for (int i42 = 0; i42 < size9; i42++) {
                g gVar4 = (g) hVar.f23161u0.get(i42);
                if (!(gVar4 instanceof l) && !(gVar4 instanceof a) && !gVar4.G && (!zX || (mVar = gVar4.f23122d) == null || (pVar = gVar4.f23124e) == null || !mVar.f24830e.f24808j || !pVar.f24830e.f24808j)) {
                    d4.f fVarK3 = gVar4.k(0);
                    d4.f fVarK4 = gVar4.k(1);
                    d4.f fVar16 = d4.f.MATCH_CONSTRAINT;
                    boolean z20 = fVarK3 == fVar16 && gVar4.f23149r != 1 && fVarK4 == fVar16 && gVar4.f23151s != 1;
                    if (!z20 && hVar.X(1) && !(gVar4 instanceof d4.p)) {
                        if (fVarK3 == fVar16 && gVar4.f23149r == 0 && fVarK4 != fVar16 && !gVar4.y()) {
                            z20 = true;
                        }
                        if (fVarK4 == fVar16 && gVar4.f23151s == 0 && fVarK3 != fVar16 && !gVar4.y()) {
                            z20 = true;
                        }
                        if ((fVarK3 == fVar16 || fVarK4 == fVar16) && gVar4.Y > CropImageView.DEFAULT_ASPECT_RATIO) {
                            z20 = true;
                        }
                    }
                    if (!z20) {
                        mVar2.L(0, gVar4, fVar15);
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar15.f35890a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.f1362b;
            for (int i43 = 0; i43 < childCount2; i43++) {
                View childAt = constraintLayout.getChildAt(i43);
                if (childAt instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) childAt;
                    if (placeholder.f1371b != null) {
                        e eVar2 = (e) placeholder.getLayoutParams();
                        e eVar3 = (e) placeholder.f1371b.getLayoutParams();
                        g gVar5 = eVar3.f35880q0;
                        gVar5.f23133i0 = 0;
                        g gVar6 = eVar2.f35880q0;
                        d4.f fVar17 = gVar6.U[0];
                        d4.f fVar18 = d4.f.FIXED;
                        if (fVar17 != fVar18) {
                            gVar6.P(gVar5.r());
                        }
                        g gVar7 = eVar2.f35880q0;
                        if (gVar7.U[1] != fVar18) {
                            gVar7.M(eVar3.f35880q0.l());
                        }
                        eVar3.f35880q0.f23133i0 = 8;
                    }
                }
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i44 = 0; i44 < size10; i44++) {
                    ((ConstraintHelper) arrayList7.get(i44)).getClass();
                }
            }
        }
        mVar2.U(hVar);
        int size11 = arrayList.size();
        if (i15 > 0) {
            mVar2.R(hVar, 0, iR2, iL);
        }
        if (size11 > 0) {
            d4.f[] fVarArr2 = hVar.U;
            d4.f fVar19 = fVarArr2[0];
            d4.f fVar20 = d4.f.WRAP_CONTENT;
            boolean z21 = fVar19 == fVar20;
            boolean z22 = fVarArr2[1] == fVar20;
            int iMax7 = Math.max(hVar.r(), hVar2.f23123d0);
            int iMax8 = Math.max(hVar.l(), hVar2.f23125e0);
            int i45 = 0;
            boolean zL = false;
            while (i45 < size11) {
                ArrayList arrayList8 = arrayList;
                g gVar8 = (g) arrayList8.get(i45);
                if (gVar8 instanceof d4.p) {
                    int iR4 = gVar8.r();
                    int iL3 = gVar8.l();
                    z12 = z22;
                    z13 = z21;
                    fVar5 = fVar3;
                    boolean zL2 = zL | mVar2.L(1, gVar8, fVar5);
                    int iR5 = gVar8.r();
                    boolean z23 = zL2;
                    int iL4 = gVar8.l();
                    if (iR5 != iR4) {
                        gVar8.P(iR5);
                        if (z13 && gVar8.s() + gVar8.W > iMax7) {
                            iMax7 = Math.max(iMax7, gVar8.j(c.RIGHT).e() + gVar8.s() + gVar8.W);
                        }
                        z23 = true;
                    }
                    if (iL4 != iL3) {
                        gVar8.M(iL4);
                        if (z12 && gVar8.t() + gVar8.X > iMax8) {
                            iMax8 = Math.max(iMax8, gVar8.j(c.BOTTOM).e() + gVar8.t() + gVar8.X);
                        }
                        z23 = true;
                    }
                    zL = z23 | ((d4.p) gVar8).C0;
                } else {
                    z12 = z22;
                    z13 = z21;
                    fVar5 = fVar3;
                }
                i45++;
                fVar3 = fVar5;
                arrayList = arrayList8;
                z21 = z13;
                z22 = z12;
            }
            boolean z24 = z22;
            boolean z25 = z21;
            f fVar21 = fVar3;
            ArrayList arrayList9 = arrayList;
            int i46 = 0;
            while (i46 < 2) {
                int i47 = 0;
                while (i47 < size11) {
                    g gVar9 = (g) arrayList9.get(i47);
                    if ((!(gVar9 instanceof d4.m) || (gVar9 instanceof d4.p)) && !(gVar9 instanceof l)) {
                        if (gVar9.f23133i0 != 8 && ((!z19 || !gVar9.f23122d.f24830e.f24808j || !gVar9.f23124e.f24830e.f24808j) && !(gVar9 instanceof d4.p))) {
                            int iR6 = gVar9.r();
                            int iL5 = gVar9.l();
                            i17 = size11;
                            int i48 = gVar9.f23121c0;
                            zL |= mVar2.L(i46 == 1 ? 2 : 1, gVar9, fVar21);
                            fVar4 = fVar21;
                            int iR7 = gVar9.r();
                            i18 = i46;
                            int iL6 = gVar9.l();
                            if (iR7 != iR6) {
                                gVar9.P(iR7);
                                if (z25 && gVar9.s() + gVar9.W > iMax7) {
                                    iMax7 = Math.max(iMax7, gVar9.j(c.RIGHT).e() + gVar9.s() + gVar9.W);
                                }
                                zL = true;
                            }
                            if (iL6 != iL5) {
                                gVar9.M(iL6);
                                if (z24 && gVar9.t() + gVar9.X > iMax8) {
                                    iMax8 = Math.max(iMax8, gVar9.j(c.BOTTOM).e() + gVar9.t() + gVar9.X);
                                }
                                zL = true;
                            }
                            if (gVar9.E && i48 != gVar9.f23121c0) {
                                zL = true;
                            }
                        }
                        i47++;
                        size11 = i17;
                        fVar21 = fVar4;
                        i46 = i18;
                    }
                    i17 = size11;
                    fVar4 = fVar21;
                    i18 = i46;
                    i47++;
                    size11 = i17;
                    fVar21 = fVar4;
                    i46 = i18;
                }
                int i49 = size11;
                f fVar22 = fVar21;
                int i50 = i46;
                if (!zL) {
                    break;
                }
                i46 = i50 + 1;
                mVar2.R(hVar, i46, iR2, iL);
                size11 = i49;
                fVar21 = fVar22;
                zL = false;
            }
        }
        hVar.H0 = i41;
        b4.c.f3892q = hVar.X(512);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            e eVar = (e) childAt.getLayoutParams();
            g gVar = eVar.f35880q0;
            if ((childAt.getVisibility() != 8 || eVar.f35855d0 || eVar.f35857e0 || zIsInEditMode) && !eVar.f35859f0) {
                int iS = gVar.s();
                int iT = gVar.t();
                int iR = gVar.r() + iS;
                int iL = gVar.l() + iT;
                childAt.layout(iS, iT, iR, iL);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iS, iT, iR, iL);
                }
            }
        }
        ArrayList arrayList = this.f1362b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i16 = 0; i16 < size; i16++) {
                ((ConstraintHelper) arrayList.get(i16)).n();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        g gVarJ = j(view);
        if ((view instanceof Guideline) && !(gVarJ instanceof l)) {
            e eVar = (e) view.getLayoutParams();
            l lVar = new l();
            eVar.f35880q0 = lVar;
            eVar.f35855d0 = true;
            lVar.T(eVar.V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.q();
            ((e) view.getLayoutParams()).f35857e0 = true;
            ArrayList arrayList = this.f1362b;
            if (!arrayList.contains(constraintHelper)) {
                arrayList.add(constraintHelper);
            }
        }
        this.f1361a.put(view.getId(), view);
        this.H = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1361a.remove(view.getId());
        g gVarJ = j(view);
        this.f1363c.f23161u0.remove(gVarJ);
        gVarJ.D();
        this.f1362b.remove(view);
        this.H = true;
    }

    public final void p(g gVar, e eVar, SparseArray sparseArray, int i11, c cVar) {
        View view = (View) this.f1361a.get(i11);
        g gVar2 = (g) sparseArray.get(i11);
        if (gVar2 == null || view == null || !(view.getLayoutParams() instanceof e)) {
            return;
        }
        eVar.f35853c0 = true;
        c cVar2 = c.BASELINE;
        if (cVar == cVar2) {
            e eVar2 = (e) view.getLayoutParams();
            eVar2.f35853c0 = true;
            eVar2.f35880q0.E = true;
        }
        gVar.j(cVar2).b(gVar2.j(cVar), eVar.D, eVar.C, true);
        gVar.E = true;
        gVar.j(c.TOP).j();
        gVar.j(c.BOTTOM).j();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.H = true;
        super.requestLayout();
    }

    public void setConstraintSet(p pVar) {
        this.L = pVar;
    }

    @Override // android.view.View
    public void setId(int i11) {
        int id2 = getId();
        SparseArray sparseArray = this.f1361a;
        sparseArray.remove(id2);
        super.setId(i11);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i11) {
        if (i11 == this.f1367t) {
            return;
        }
        this.f1367t = i11;
        requestLayout();
    }

    public void setMaxWidth(int i11) {
        if (i11 == this.f1366f) {
            return;
        }
        this.f1366f = i11;
        requestLayout();
    }

    public void setMinHeight(int i11) {
        if (i11 == this.f1365e) {
            return;
        }
        this.f1365e = i11;
        requestLayout();
    }

    public void setMinWidth(int i11) {
        if (i11 == this.f1364d) {
            return;
        }
        this.f1364d = i11;
        requestLayout();
    }

    public void setOnConstraintsChanged(r rVar) {
        i iVar = this.M;
        if (iVar != null) {
            iVar.getClass();
        }
    }

    public void setOptimizationLevel(int i11) {
        this.K = i11;
        h hVar = this.f1363c;
        hVar.H0 = i11;
        b4.c.f3892q = hVar.X(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01c6  */
    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        boolean z11;
        String str;
        int iH;
        g gVar;
        boolean z12 = this.H;
        this.H = z12;
        int i13 = 0;
        if (!z12) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                if (getChildAt(i14).isLayoutRequested()) {
                    this.H = true;
                    break;
                }
            }
        }
        boolean zL = l();
        h hVar = this.f1363c;
        hVar.f23166z0 = zL;
        if (this.H) {
            this.H = false;
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    z11 = false;
                    break;
                } else {
                    if (getChildAt(i15).isLayoutRequested()) {
                        z11 = true;
                        break;
                    }
                    i15++;
                }
            }
            if (z11) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    g gVarJ = j(getChildAt(i16));
                    if (gVarJ != null) {
                        gVarJ.D();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt = getChildAt(i17);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.O == null) {
                                    this.O = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf(ealNNtLp.ijvyHBRtBsxwHj);
                                this.O.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 != 0) {
                                View viewFindViewById = (View) this.f1361a.get(id2);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                gVar = viewFindViewById == this ? hVar : viewFindViewById == null ? null : ((e) viewFindViewById.getLayoutParams()).f35880q0;
                            }
                            gVar.f23137k0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.N != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        View childAt2 = getChildAt(i18);
                        if (childAt2.getId() == this.N && (childAt2 instanceof Constraints)) {
                            this.L = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                p pVar = this.L;
                if (pVar != null) {
                    pVar.c(this);
                }
                hVar.f23161u0.clear();
                ArrayList arrayList = this.f1362b;
                int size = arrayList.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        ConstraintHelper constraintHelper = (ConstraintHelper) arrayList.get(i19);
                        HashMap map = constraintHelper.K;
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.f1359f);
                        }
                        d4.m mVar = constraintHelper.f1357d;
                        if (mVar != null) {
                            mVar.f23196v0 = i13;
                            Arrays.fill(mVar.f23195u0, obj);
                            for (int i21 = i13; i21 < constraintHelper.f1355b; i21++) {
                                int i22 = constraintHelper.f1354a[i21];
                                View viewE = e(i22);
                                if (viewE == null && (iH = constraintHelper.h(this, (str = (String) map.get(Integer.valueOf(i22))))) != 0) {
                                    constraintHelper.f1354a[i21] = iH;
                                    map.put(Integer.valueOf(iH), str);
                                    viewE = e(iH);
                                }
                                View view = viewE;
                                if (view != null) {
                                    constraintHelper.f1357d.S(j(view));
                                }
                            }
                            constraintHelper.f1357d.U();
                        }
                        i19++;
                        i13 = 0;
                        obj = null;
                    }
                }
                for (int i23 = 0; i23 < childCount3; i23++) {
                    View childAt3 = getChildAt(i23);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.f1370a == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.f1372c);
                        }
                        View viewFindViewById2 = findViewById(placeholder.f1370a);
                        placeholder.f1371b = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((e) viewFindViewById2.getLayoutParams()).f35859f0 = true;
                            placeholder.f1371b.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                SparseArray sparseArray = this.P;
                sparseArray.clear();
                sparseArray.put(0, hVar);
                sparseArray.put(getId(), hVar);
                for (int i24 = 0; i24 < childCount3; i24++) {
                    View childAt4 = getChildAt(i24);
                    sparseArray.put(childAt4.getId(), j(childAt4));
                }
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt5 = getChildAt(i25);
                    g gVarJ2 = j(childAt5);
                    if (gVarJ2 != null) {
                        e eVar = (e) childAt5.getLayoutParams();
                        hVar.f23161u0.add(gVarJ2);
                        g gVar2 = gVarJ2.V;
                        if (gVar2 != null) {
                            ((h) gVar2).f23161u0.remove(gVarJ2);
                            gVarJ2.D();
                        }
                        gVarJ2.V = hVar;
                        a(zIsInEditMode, childAt5, gVarJ2, eVar, sparseArray);
                    }
                }
            }
            if (z11) {
                hVar.f23162v0.U(hVar);
            }
        }
        hVar.A0.getClass();
        o(hVar, this.K, i11, i12);
        n(i11, i12, hVar.r(), hVar.l(), hVar.I0, hVar.J0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1361a = new SparseArray();
        this.f1362b = new ArrayList(4);
        this.f1363c = new h();
        this.f1364d = 0;
        this.f1365e = 0;
        this.f1366f = Integer.MAX_VALUE;
        this.f1367t = Integer.MAX_VALUE;
        this.H = true;
        this.K = 257;
        this.L = null;
        this.M = null;
        this.N = -1;
        this.O = new HashMap();
        this.P = new SparseArray();
        this.Q = new f(this, this);
        k(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1361a = new SparseArray();
        this.f1362b = new ArrayList(4);
        this.f1363c = new h();
        this.f1364d = 0;
        this.f1365e = 0;
        this.f1366f = Integer.MAX_VALUE;
        this.f1367t = Integer.MAX_VALUE;
        this.H = true;
        this.K = 257;
        this.L = null;
        this.M = null;
        this.N = -1;
        this.O = new HashMap();
        this.P = new SparseArray();
        this.Q = new f(this, this);
        k(attributeSet, i11);
    }
}
