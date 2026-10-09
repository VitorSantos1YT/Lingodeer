package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.lingodeer.R;
import java.lang.reflect.Method;
import q.z;
import r.l1;
import r.m1;
import r.n1;
import r.o1;
import r.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class h implements z {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Method f1090c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Method f1091d0;
    public final int H;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public final int O;
    public i5.b P;
    public View Q;
    public AdapterView.OnItemClickListener R;
    public AdapterView.OnItemSelectedListener S;
    public final py.b T;
    public final o1 U;
    public final n1 V;
    public final e W;
    public final Handler X;
    public final Rect Y;
    public Rect Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1092a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f1093a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f1094b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final w f1095b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DropDownListView f1096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1099f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1100t;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1090c0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f1091d0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public h(Context context) {
        this(context, null, R.attr.listPopupWindowStyle, 0);
    }

    @Override // q.z
    public final void a() {
        int i11;
        int iMakeMeasureSpec;
        int paddingBottom;
        DropDownListView dropDownListView;
        DropDownListView dropDownListView2 = this.f1096c;
        Context context = this.f1092a;
        w wVar = this.f1095b0;
        if (dropDownListView2 == null) {
            DropDownListView dropDownListViewQ = q(context, !this.f1093a0);
            this.f1096c = dropDownListViewQ;
            dropDownListViewQ.setAdapter(this.f1094b);
            this.f1096c.setOnItemClickListener(this.R);
            this.f1096c.setFocusable(true);
            this.f1096c.setFocusableInTouchMode(true);
            this.f1096c.setOnItemSelectedListener(new g(this));
            this.f1096c.setOnScrollListener(this.V);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.S;
            if (onItemSelectedListener != null) {
                this.f1096c.setOnItemSelectedListener(onItemSelectedListener);
            }
            wVar.setContentView(this.f1096c);
        }
        Drawable background = wVar.getBackground();
        Rect rect = this.Y;
        if (background != null) {
            background.getPadding(rect);
            int i12 = rect.top;
            i11 = rect.bottom + i12;
            if (!this.K) {
                this.f1100t = -i12;
            }
        } else {
            rect.setEmpty();
            i11 = 0;
        }
        int iA = l1.a(wVar, this.Q, this.f1100t, wVar.getInputMethodMode() == 2);
        int i13 = this.f1097d;
        if (i13 == -1) {
            paddingBottom = iA + i11;
        } else {
            int i14 = this.f1098e;
            if (i14 != -2) {
                iMakeMeasureSpec = i14 != -1 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f1096c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f1096c.getPaddingBottom() + this.f1096c.getPaddingTop() + i11 : 0);
        }
        boolean z11 = wVar.getInputMethodMode() == 2;
        wVar.setWindowLayoutType(this.H);
        if (wVar.isShowing()) {
            if (this.Q.isAttachedToWindow()) {
                int width = this.f1098e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.Q.getWidth();
                }
                if (i13 == -1) {
                    i13 = z11 ? paddingBottom : -1;
                    if (z11) {
                        wVar.setWidth(this.f1098e == -1 ? -1 : 0);
                        wVar.setHeight(0);
                    } else {
                        wVar.setWidth(this.f1098e == -1 ? -1 : 0);
                        wVar.setHeight(-1);
                    }
                } else if (i13 == -2) {
                    i13 = paddingBottom;
                }
                wVar.setOutsideTouchable(true);
                int i15 = width;
                View view = this.Q;
                int i16 = this.f1099f;
                int i17 = this.f1100t;
                int i18 = i15 < 0 ? -1 : i15;
                if (i13 < 0) {
                    i13 = -1;
                }
                wVar.update(view, i16, i17, i18, i13);
                return;
            }
            return;
        }
        int width2 = this.f1098e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.Q.getWidth();
        }
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = paddingBottom;
        }
        wVar.setWidth(width2);
        wVar.setHeight(i13);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1090c0;
            if (method != null) {
                try {
                    method.invoke(wVar, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            m1.b(wVar, true);
        }
        wVar.setOutsideTouchable(true);
        wVar.setTouchInterceptor(this.U);
        if (this.M) {
            wVar.setOverlapAnchor(this.L);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f1091d0;
            if (method2 != null) {
                try {
                    method2.invoke(wVar, this.Z);
                } catch (Exception unused2) {
                }
            }
        } else {
            m1.a(wVar, this.Z);
        }
        wVar.showAsDropDown(this.Q, this.f1099f, this.f1100t, this.N);
        this.f1096c.setSelection(-1);
        if ((!this.f1093a0 || this.f1096c.isInTouchMode()) && (dropDownListView = this.f1096c) != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
        if (this.f1093a0) {
            return;
        }
        this.X.post(this.W);
    }

    @Override // q.z
    public final boolean b() {
        return this.f1095b0.isShowing();
    }

    public final int c() {
        return this.f1099f;
    }

    public final void d(int i11) {
        this.f1099f = i11;
    }

    @Override // q.z
    public final void dismiss() {
        w wVar = this.f1095b0;
        wVar.dismiss();
        wVar.setContentView(null);
        this.f1096c = null;
        this.X.removeCallbacks(this.T);
    }

    public final Drawable f() {
        return this.f1095b0.getBackground();
    }

    @Override // q.z
    public final ListView h() {
        return this.f1096c;
    }

    public final void j(Drawable drawable) {
        this.f1095b0.setBackgroundDrawable(drawable);
    }

    public final void k(int i11) {
        this.f1100t = i11;
        this.K = true;
    }

    public final int n() {
        if (this.K) {
            return this.f1100t;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        i5.b bVar = this.P;
        if (bVar == null) {
            this.P = new i5.b(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f1094b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f1094b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.P);
        }
        DropDownListView dropDownListView = this.f1096c;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f1094b);
        }
    }

    public DropDownListView q(Context context, boolean z11) {
        return new DropDownListView(context, z11);
    }

    public final void r(int i11) {
        Drawable background = this.f1095b0.getBackground();
        if (background == null) {
            this.f1098e = i11;
            return;
        }
        Rect rect = this.Y;
        background.getPadding(rect);
        this.f1098e = rect.left + rect.right + i11;
    }

    public h(Context context, AttributeSet attributeSet, int i11, int i12) {
        int resourceId;
        this.f1097d = -2;
        this.f1098e = -2;
        this.H = 1002;
        this.N = 0;
        this.O = Integer.MAX_VALUE;
        this.T = new py.b(this, 1);
        this.U = new o1(this);
        this.V = new n1(this);
        this.W = new e(this, 1);
        this.Y = new Rect();
        this.f1092a = context;
        this.X = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f37414q, i11, 0);
        this.f1099f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1100t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.K = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        w wVar = new w(context, attributeSet, i11, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, k.a.f37418u, i11, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            wVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        wVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : jh.h.k(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f1095b0 = wVar;
        wVar.setInputMethodMode(1);
    }
}
