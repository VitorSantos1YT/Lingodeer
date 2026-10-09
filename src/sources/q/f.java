package q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.DropDownListView;
import com.lingodeer.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import r.q1;
import r.r1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends r implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View P;
    public View Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public boolean X;
    public u Y;
    public ViewTreeObserver Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public PopupWindow.OnDismissListener f47257a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f47258b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f47259b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f47262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f47263f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f47264t = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final d K = new d(this, 0);
    public final g2.f L = new g2.f(this, 1);
    public final o20.i M = new o20.i(this, 6);
    public int N = 0;
    public int O = 0;
    public boolean W = false;

    public f(Context context, View view, int i11, boolean z11) {
        this.f47258b = context;
        this.P = view;
        this.f47261d = i11;
        this.f47262e = z11;
        this.R = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f47260c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f47263f = new Handler();
    }

    @Override // q.z
    public final void a() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f47264t;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            w((l) obj);
        }
        arrayList.clear();
        View view = this.P;
        this.Q = view;
        if (view != null) {
            boolean z11 = this.Z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.Z = viewTreeObserver;
            if (z11) {
                viewTreeObserver.addOnGlobalLayoutListener(this.K);
            }
            this.Q.addOnAttachStateChangeListener(this.L);
        }
    }

    @Override // q.z
    public final boolean b() {
        ArrayList arrayList = this.H;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f47254a.f1095b0.isShowing();
    }

    @Override // q.v
    public final void c(boolean z11) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ListAdapter adapter = ((e) obj).f47254a.f1096c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // q.v
    public final void d(l lVar, boolean z11) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (lVar == ((e) arrayList.get(i11)).f47255b) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < arrayList.size()) {
            ((e) arrayList.get(i12)).f47255b.c(false);
        }
        e eVar = (e) arrayList.remove(i11);
        l lVar2 = eVar.f47255b;
        androidx.appcompat.widget.i iVar = eVar.f47254a;
        r.w wVar = iVar.f1095b0;
        lVar2.r(this);
        if (this.f47259b0) {
            q1.b(wVar, null);
            wVar.setAnimationStyle(0);
        }
        iVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.R = ((e) arrayList.get(size2 - 1)).f47256c;
        } else {
            this.R = this.P.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z11) {
                ((e) arrayList.get(0)).f47255b.c(false);
                return;
            }
            return;
        }
        dismiss();
        u uVar = this.Y;
        if (uVar != null) {
            uVar.d(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.Z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.Z.removeGlobalOnLayoutListener(this.K);
            }
            this.Z = null;
        }
        this.Q.removeOnAttachStateChangeListener(this.L);
        this.f47257a0.onDismiss();
    }

    @Override // q.z
    public final void dismiss() {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i11 = size - 1; i11 >= 0; i11--) {
                e eVar = eVarArr[i11];
                if (eVar.f47254a.f1095b0.isShowing()) {
                    eVar.f47254a.dismiss();
                }
            }
        }
    }

    @Override // q.v
    public final boolean e() {
        return false;
    }

    @Override // q.v
    public final boolean f(b0 b0Var) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            e eVar = (e) obj;
            if (b0Var == eVar.f47255b) {
                eVar.f47254a.f1096c.requestFocus();
                return true;
            }
        }
        if (!b0Var.hasVisibleItems()) {
            return false;
        }
        n(b0Var);
        u uVar = this.Y;
        if (uVar != null) {
            uVar.q(b0Var);
        }
        return true;
    }

    @Override // q.z
    public final ListView h() {
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) nv.p.f(1, arrayList)).f47254a.f1096c;
    }

    @Override // q.v
    public final Parcelable k() {
        return null;
    }

    @Override // q.v
    public final void l(u uVar) {
        this.Y = uVar;
    }

    @Override // q.r
    public final void n(l lVar) {
        lVar.b(this, this.f47258b);
        if (b()) {
            w(lVar);
        } else {
            this.f47264t.add(lVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i11);
            if (!eVar.f47254a.f1095b0.isShowing()) {
                break;
            } else {
                i11++;
            }
        }
        if (eVar != null) {
            eVar.f47255b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i11 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // q.r
    public final void p(View view) {
        if (this.P != view) {
            this.P = view;
            this.O = Gravity.getAbsoluteGravity(this.N, view.getLayoutDirection());
        }
    }

    @Override // q.r
    public final void q(boolean z11) {
        this.W = z11;
    }

    @Override // q.r
    public final void r(int i11) {
        if (this.N != i11) {
            this.N = i11;
            this.O = Gravity.getAbsoluteGravity(i11, this.P.getLayoutDirection());
        }
    }

    @Override // q.r
    public final void s(int i11) {
        this.S = true;
        this.U = i11;
    }

    @Override // q.r
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f47257a0 = onDismissListener;
    }

    @Override // q.r
    public final void u(boolean z11) {
        this.X = z11;
    }

    @Override // q.r
    public final void v(int i11) {
        this.T = true;
        this.V = i11;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:111:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0163  */
    /* JADX WARN: Code duplicated, block: B:74:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x016f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0174  */
    /* JADX WARN: Code duplicated, block: B:80:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b4 A[PHI: r5
      0x01b4: PHI (r5v17 int) = (r5v9 int), (r5v18 int) binds: [B:88:0x01b6, B:86:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dd  */
    public final void w(l lVar) {
        boolean z11;
        int i11;
        e eVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i12;
        r.w wVar;
        DropDownListView dropDownListView;
        int[] iArr;
        Rect rect3;
        int i13;
        boolean z12;
        int[] iArr2;
        int[] iArr3;
        int i14;
        int i15;
        int width;
        Method method;
        MenuItem item;
        i iVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f47258b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        i iVar2 = new i(lVar, layoutInflaterFrom, this.f47262e, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.W) {
            iVar2.f47275c = true;
        } else if (b()) {
            int size = lVar.f47285f.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size) {
                    z11 = false;
                    break;
                }
                MenuItem item2 = lVar.getItem(i16);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z11 = true;
                    break;
                }
                i16++;
            }
            iVar2.f47275c = z11;
        }
        int iO = r.o(iVar2, context, this.f47260c);
        androidx.appcompat.widget.i iVar3 = new androidx.appcompat.widget.i(context, null, this.f47261d, 0);
        iVar3.f1102e0 = this.M;
        iVar3.R = this;
        iVar3.f1095b0.setOnDismissListener(this);
        iVar3.Q = this.P;
        iVar3.N = this.O;
        iVar3.f1093a0 = true;
        iVar3.f1095b0.setFocusable(true);
        iVar3.f1095b0.setInputMethodMode(2);
        iVar3.p(iVar2);
        iVar3.r(iO);
        iVar3.N = this.O;
        ArrayList arrayList = this.H;
        if (arrayList.size() > 0) {
            eVar = (e) nv.p.f(1, arrayList);
            l lVar2 = eVar.f47255b;
            int size2 = lVar2.f47285f.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size2) {
                    item = null;
                    break;
                }
                item = lVar2.getItem(i17);
                if (item.hasSubMenu() && lVar == item.getSubMenu()) {
                    break;
                } else {
                    i17++;
                }
            }
            if (item == null) {
                i11 = 1;
                childAt = null;
            } else {
                DropDownListView dropDownListView2 = eVar.f47254a.f1096c;
                ListAdapter adapter = dropDownListView2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    iVar = (i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    iVar = (i) adapter;
                    headersCount = 0;
                }
                int count = iVar.getCount();
                i11 = 1;
                int i18 = 0;
                while (true) {
                    if (i18 >= count) {
                        i18 = -1;
                        break;
                    } else if (item == iVar.getItem(i18)) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i18 != -1 && (firstVisiblePosition = (i18 + headersCount) - dropDownListView2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < dropDownListView2.getChildCount()) {
                    childAt = dropDownListView2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i12 = Build.VERSION.SDK_INT;
                wVar = iVar3.f1095b0;
                if (i12 <= 28) {
                    method = androidx.appcompat.widget.i.f1101f0;
                    if (method != null) {
                        try {
                            method.invoke(wVar, Boolean.FALSE);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    r1.a(wVar, false);
                }
                q1.a(iVar3.f1095b0, null);
                dropDownListView = ((e) arrayList.get(arrayList.size() - 1)).f47254a.f1096c;
                iArr = new int[2];
                dropDownListView.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.Q.getWindowVisibleDisplayFrame(rect3);
                if (this.R == i11) {
                    if (dropDownListView.getWidth() + iArr[0] + iO > rect3.right) {
                        i13 = 0;
                    } else {
                        i13 = 1;
                    }
                } else if (iArr[0] - iO < 0) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                if (i13 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.R = i13;
                if (Build.VERSION.SDK_INT >= 26) {
                    iVar3.Q = childAt;
                    i15 = 0;
                    i14 = 0;
                } else {
                    iArr2 = new int[2];
                    this.P.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.O & 7) == 5) {
                        iArr2[0] = this.P.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    i14 = iArr3[0] - iArr2[0];
                    i15 = iArr3[1] - iArr2[1];
                }
                if ((this.O & 5) == 5) {
                    if (z12) {
                        width = i14 + iO;
                    } else {
                        iO = childAt.getWidth();
                        width = i14 - iO;
                    }
                } else if (z12) {
                    width = i14 + childAt.getWidth();
                } else {
                    width = i14 - iO;
                }
                iVar3.f1099f = width;
                iVar3.M = true;
                iVar3.L = true;
                iVar3.k(i15);
            } else {
                if (this.S) {
                    iVar3.f1099f = this.U;
                }
                if (this.T) {
                    iVar3.k(this.V);
                }
                rect = this.f47308a;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                iVar3.Z = rect2;
            }
            arrayList.add(new e(iVar3, lVar, this.R));
            iVar3.a();
            DropDownListView dropDownListView3 = iVar3.f1096c;
            dropDownListView3.setOnKeyListener(this);
            if (eVar == null || !this.X || lVar.O == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(lVar.O);
            dropDownListView3.addHeaderView(frameLayout, null, false);
            iVar3.a();
            return;
        }
        i11 = 1;
        eVar = null;
        childAt = null;
        if (childAt != null) {
            i12 = Build.VERSION.SDK_INT;
            wVar = iVar3.f1095b0;
            if (i12 <= 28) {
                method = androidx.appcompat.widget.i.f1101f0;
                if (method != null) {
                    method.invoke(wVar, Boolean.FALSE);
                }
            } else {
                r1.a(wVar, false);
            }
            q1.a(iVar3.f1095b0, null);
            dropDownListView = ((e) arrayList.get(arrayList.size() - 1)).f47254a.f1096c;
            iArr = new int[2];
            dropDownListView.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.Q.getWindowVisibleDisplayFrame(rect3);
            if (this.R == i11) {
                if (dropDownListView.getWidth() + iArr[0] + iO > rect3.right) {
                    i13 = 0;
                } else {
                    i13 = 1;
                }
            } else if (iArr[0] - iO < 0) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            if (i13 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.R = i13;
            if (Build.VERSION.SDK_INT >= 26) {
                iVar3.Q = childAt;
                i15 = 0;
                i14 = 0;
            } else {
                iArr2 = new int[2];
                this.P.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.O & 7) == 5) {
                    iArr2[0] = this.P.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                i14 = iArr3[0] - iArr2[0];
                i15 = iArr3[1] - iArr2[1];
            }
            if ((this.O & 5) == 5) {
                if (z12) {
                    width = i14 + iO;
                } else {
                    iO = childAt.getWidth();
                    width = i14 - iO;
                }
            } else if (z12) {
                width = i14 + childAt.getWidth();
            } else {
                width = i14 - iO;
            }
            iVar3.f1099f = width;
            iVar3.M = true;
            iVar3.L = true;
            iVar3.k(i15);
        } else {
            if (this.S) {
                iVar3.f1099f = this.U;
            }
            if (this.T) {
                iVar3.k(this.V);
            }
            rect = this.f47308a;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            iVar3.Z = rect2;
        }
        arrayList.add(new e(iVar3, lVar, this.R));
        iVar3.a();
        DropDownListView dropDownListView4 = iVar3.f1096c;
        dropDownListView4.setOnKeyListener(this);
        if (eVar == null) {
        }
    }

    @Override // q.v
    public final void g(Parcelable parcelable) {
    }
}
