package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import com.yalantis.ucrop.view.CropImageView;
import j4.e;
import j4.t;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Grid extends VirtualLayout {
    public View[] N;
    public ConstraintLayout O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public String T;
    public String U;
    public String V;
    public String W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f1255a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f1256b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f1257c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f1258d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean[][] f1259e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final HashSet f1260f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int[] f1261g0;

    public Grid(Context context) {
        super(context);
        this.f1258d0 = 0;
        this.f1260f0 = new HashSet();
    }

    public static int[][] B(String str) {
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            String[] strArrSplit2 = strArrSplit[i11].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i11][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i11][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i11][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    public static float[] C(int i11, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != i11) {
            return null;
        }
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i12] = Float.parseFloat(strArrSplit[i12].trim());
        }
        return fArr;
    }

    private int getNextPosition() {
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11 = this.f1258d0;
            if (i11 >= this.P * this.R) {
                return -1;
            }
            int iX = x(i11);
            int iW = w(this.f1258d0);
            boolean[] zArr = this.f1259e0[iX];
            if (zArr[iW]) {
                zArr[iW] = false;
                z11 = true;
            }
            this.f1258d0++;
        }
        return i11;
    }

    public static void s(View view) {
        e eVar = (e) view.getLayoutParams();
        eVar.H = -1.0f;
        eVar.f35858f = -1;
        eVar.f35856e = -1;
        eVar.f35860g = -1;
        eVar.f35862h = -1;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = -1;
        view.setLayoutParams(eVar);
    }

    public static void t(View view) {
        e eVar = (e) view.getLayoutParams();
        eVar.I = -1.0f;
        eVar.f35866j = -1;
        eVar.f35864i = -1;
        eVar.f35868k = -1;
        eVar.f35870l = -1;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = -1;
        view.setLayoutParams(eVar);
    }

    public final View A() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.O.addView(view, new e(0, 0));
        return view;
    }

    public final void D() {
        int i11;
        int i12 = this.Q;
        if (i12 != 0 && (i11 = this.S) != 0) {
            this.P = i12;
            this.R = i11;
            return;
        }
        int i13 = this.S;
        if (i13 > 0) {
            this.R = i13;
            this.P = ((this.f1355b + i13) - 1) / i13;
        } else if (i12 > 0) {
            this.P = i12;
            this.R = ((this.f1355b + i12) - 1) / i12;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f1355b) + 1.5d);
            this.P = iSqrt;
            this.R = ((this.f1355b + iSqrt) - 1) / iSqrt;
        }
    }

    public String getColumnWeights() {
        return this.W;
    }

    public int getColumns() {
        return this.S;
    }

    public float getHorizontalGaps() {
        return this.f1255a0;
    }

    public int getOrientation() {
        return this.f1257c0;
    }

    public String getRowWeights() {
        return this.V;
    }

    public int getRows() {
        return this.Q;
    }

    public String getSkips() {
        return this.U;
    }

    public String getSpans() {
        return this.T;
    }

    public float getVerticalGaps() {
        return this.f1256b0;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.f1358e = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f36034i);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 5) {
                    this.Q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 1) {
                    this.S = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 7) {
                    this.T = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 6) {
                    this.U = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.V = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 0) {
                    this.W = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 3) {
                    this.f1257c0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 2) {
                    this.f1255a0 = typedArrayObtainStyledAttributes.getDimension(index, CropImageView.DEFAULT_ASPECT_RATIO);
                } else if (index == 10) {
                    this.f1256b0 = typedArrayObtainStyledAttributes.getDimension(index, CropImageView.DEFAULT_ASPECT_RATIO);
                } else if (index == 9) {
                    typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == 8) {
                    typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            D();
            y();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = (ConstraintLayout) getParent();
        v(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(-65536);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            for (View view : this.N) {
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                canvas.drawRect(left2, CropImageView.DEFAULT_ASPECT_RATIO, right2, bottom - top, paint);
                canvas.drawRect(CropImageView.DEFAULT_ASPECT_RATIO, top2, right - left, bottom2, paint);
            }
        }
    }

    public void setColumnWeights(String str) {
        String str2 = this.W;
        if (str2 == null || !str2.equals(str)) {
            this.W = str;
            v(true);
            invalidate();
        }
    }

    public void setColumns(int i11) {
        if (i11 <= 50 && this.S != i11) {
            this.S = i11;
            D();
            y();
            v(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f5) {
        if (f5 >= CropImageView.DEFAULT_ASPECT_RATIO && this.f1255a0 != f5) {
            this.f1255a0 = f5;
            v(true);
            invalidate();
        }
    }

    public void setOrientation(int i11) {
        if ((i11 == 0 || i11 == 1) && this.f1257c0 != i11) {
            this.f1257c0 = i11;
            v(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        String str2 = this.V;
        if (str2 == null || !str2.equals(str)) {
            this.V = str;
            v(true);
            invalidate();
        }
    }

    public void setRows(int i11) {
        if (i11 <= 50 && this.Q != i11) {
            this.Q = i11;
            D();
            y();
            v(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        String str2 = this.U;
        if (str2 == null || !str2.equals(str)) {
            this.U = str;
            v(true);
            invalidate();
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.T;
        if (str == null || !str.contentEquals(charSequence)) {
            this.T = charSequence.toString();
            v(true);
            invalidate();
        }
    }

    public void setVerticalGaps(float f5) {
        if (f5 >= CropImageView.DEFAULT_ASPECT_RATIO && this.f1256b0 != f5) {
            this.f1256b0 = f5;
            v(true);
            invalidate();
        }
    }

    public final void u(View view, int i11, int i12, int i13, int i14) {
        e eVar = (e) view.getLayoutParams();
        int[] iArr = this.f1261g0;
        eVar.f35856e = iArr[i12];
        eVar.f35864i = iArr[i11];
        eVar.f35862h = iArr[(i12 + i14) - 1];
        eVar.f35870l = iArr[(i11 + i13) - 1];
        view.setLayoutParams(eVar);
    }

    public final void v(boolean z11) {
        int i11;
        int i12;
        int[][] iArrB;
        int[][] iArrB2;
        if (this.O == null || this.P < 1 || this.R < 1) {
            return;
        }
        HashSet hashSet = this.f1260f0;
        if (z11) {
            for (int i13 = 0; i13 < this.f1259e0.length; i13++) {
                int i14 = 0;
                while (true) {
                    boolean[][] zArr = this.f1259e0;
                    if (i14 < zArr[0].length) {
                        zArr[i13][i14] = true;
                        i14++;
                    }
                }
            }
            hashSet.clear();
        }
        this.f1258d0 = 0;
        int iMax = Math.max(this.P, this.R);
        View[] viewArr = this.N;
        if (viewArr == null) {
            this.N = new View[iMax];
            int i15 = 0;
            while (true) {
                View[] viewArr2 = this.N;
                if (i15 >= viewArr2.length) {
                    break;
                }
                viewArr2[i15] = A();
                i15++;
            }
        } else if (iMax != viewArr.length) {
            View[] viewArr3 = new View[iMax];
            for (int i16 = 0; i16 < iMax; i16++) {
                View[] viewArr4 = this.N;
                if (i16 < viewArr4.length) {
                    viewArr3[i16] = viewArr4[i16];
                } else {
                    viewArr3[i16] = A();
                }
            }
            int i17 = iMax;
            while (true) {
                View[] viewArr5 = this.N;
                if (i17 >= viewArr5.length) {
                    break;
                }
                this.O.removeView(viewArr5[i17]);
                i17++;
            }
            this.N = viewArr3;
        }
        this.f1261g0 = new int[iMax];
        int i18 = 0;
        while (true) {
            View[] viewArr6 = this.N;
            if (i18 >= viewArr6.length) {
                break;
            }
            this.f1261g0[i18] = viewArr6[i18].getId();
            i18++;
        }
        int id2 = getId();
        int iMax2 = Math.max(this.P, this.R);
        float[] fArrC = C(this.P, this.V);
        if (this.P == 1) {
            e eVar = (e) this.N[0].getLayoutParams();
            t(this.N[0]);
            eVar.f35864i = id2;
            eVar.f35870l = id2;
            this.N[0].setLayoutParams(eVar);
        } else {
            int i19 = 0;
            while (true) {
                i11 = this.P;
                if (i19 >= i11) {
                    break;
                }
                e eVar2 = (e) this.N[i19].getLayoutParams();
                t(this.N[i19]);
                if (fArrC != null) {
                    eVar2.I = fArrC[i19];
                }
                if (i19 > 0) {
                    eVar2.f35866j = this.f1261g0[i19 - 1];
                } else {
                    eVar2.f35864i = id2;
                }
                if (i19 < this.P - 1) {
                    eVar2.f35868k = this.f1261g0[i19 + 1];
                } else {
                    eVar2.f35870l = id2;
                }
                if (i19 > 0) {
                    ((ViewGroup.MarginLayoutParams) eVar2).topMargin = (int) this.f1255a0;
                }
                this.N[i19].setLayoutParams(eVar2);
                i19++;
            }
            while (i11 < iMax2) {
                e eVar3 = (e) this.N[i11].getLayoutParams();
                t(this.N[i11]);
                eVar3.f35864i = id2;
                eVar3.f35870l = id2;
                this.N[i11].setLayoutParams(eVar3);
                i11++;
            }
        }
        int id3 = getId();
        int iMax3 = Math.max(this.P, this.R);
        float[] fArrC2 = C(this.R, this.W);
        e eVar4 = (e) this.N[0].getLayoutParams();
        if (this.R == 1) {
            s(this.N[0]);
            eVar4.f35856e = id3;
            eVar4.f35862h = id3;
            this.N[0].setLayoutParams(eVar4);
        } else {
            int i21 = 0;
            while (true) {
                i12 = this.R;
                if (i21 >= i12) {
                    break;
                }
                e eVar5 = (e) this.N[i21].getLayoutParams();
                s(this.N[i21]);
                if (fArrC2 != null) {
                    eVar5.H = fArrC2[i21];
                }
                if (i21 > 0) {
                    eVar5.f35858f = this.f1261g0[i21 - 1];
                } else {
                    eVar5.f35856e = id3;
                }
                if (i21 < this.R - 1) {
                    eVar5.f35860g = this.f1261g0[i21 + 1];
                } else {
                    eVar5.f35862h = id3;
                }
                if (i21 > 0) {
                    ((ViewGroup.MarginLayoutParams) eVar5).leftMargin = (int) this.f1255a0;
                }
                this.N[i21].setLayoutParams(eVar5);
                i21++;
            }
            while (i12 < iMax3) {
                e eVar6 = (e) this.N[i12].getLayoutParams();
                s(this.N[i12]);
                eVar6.f35856e = id3;
                eVar6.f35862h = id3;
                this.N[i12].setLayoutParams(eVar6);
                i12++;
            }
        }
        String str = this.U;
        if (str != null && !str.trim().isEmpty() && (iArrB2 = B(this.U)) != null) {
            for (int i22 = 0; i22 < iArrB2.length; i22++) {
                int iX = x(iArrB2[i22][0]);
                int iW = w(iArrB2[i22][0]);
                int[] iArr = iArrB2[i22];
                if (!z(iX, iW, iArr[1], iArr[2])) {
                    break;
                }
            }
        }
        String str2 = this.T;
        if (str2 != null && !str2.trim().isEmpty() && (iArrB = B(this.T)) != null) {
            int[] iArr2 = this.f1354a;
            View[] viewArrJ = j(this.O);
            for (int i23 = 0; i23 < iArrB.length; i23++) {
                int iX2 = x(iArrB[i23][0]);
                int iW2 = w(iArrB[i23][0]);
                int[] iArr3 = iArrB[i23];
                if (!z(iX2, iW2, iArr3[1], iArr3[2])) {
                    break;
                }
                View view = viewArrJ[i23];
                int[] iArr4 = iArrB[i23];
                u(view, iX2, iW2, iArr4[1], iArr4[2]);
                hashSet.add(Integer.valueOf(iArr2[i23]));
            }
        }
        View[] viewArrJ2 = j(this.O);
        for (int i24 = 0; i24 < this.f1355b; i24++) {
            if (!hashSet.contains(Integer.valueOf(this.f1354a[i24]))) {
                int nextPosition = getNextPosition();
                int iX3 = x(nextPosition);
                int iW3 = w(nextPosition);
                if (nextPosition == -1) {
                    return;
                } else {
                    u(viewArrJ2[i24], iX3, iW3, 1, 1);
                }
            }
        }
    }

    public final int w(int i11) {
        return this.f1257c0 == 1 ? i11 / this.P : i11 % this.R;
    }

    public final int x(int i11) {
        return this.f1257c0 == 1 ? i11 % this.P : i11 / this.R;
    }

    public final void y() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.P, this.R);
        this.f1259e0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    public final boolean z(int i11, int i12, int i13, int i14) {
        for (int i15 = i11; i15 < i11 + i13; i15++) {
            for (int i16 = i12; i16 < i12 + i14; i16++) {
                boolean[][] zArr = this.f1259e0;
                if (i15 < zArr.length && i16 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i15];
                    if (zArr2[i16]) {
                        zArr2[i16] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public Grid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1258d0 = 0;
        this.f1260f0 = new HashSet();
    }

    public Grid(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1258d0 = 0;
        this.f1260f0 = new HashSet();
    }
}
