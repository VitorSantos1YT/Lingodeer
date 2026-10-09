package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.lingodeer.R;
import java.util.ArrayList;
import n9.q;
import q.b0;
import q.r;
import q.u;
import q.v;
import q.w;
import q.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements v {
    public x H;
    public int K;
    public ActionMenuPresenter$OverflowMenuButton L;
    public Drawable M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public r.e V;
    public r.e W;
    public r.g X;
    public r.f Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1067a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1068a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f1069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q.l f1070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f1071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f1072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1073f = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1074t = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray U = new SparseBooleanArray();
    public final q Z = new q(this, 20);

    public c(Context context) {
        this.f1067a = context;
        this.f1071d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(q.n nVar, View view, ViewGroup viewGroup) {
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            w wVar = view instanceof w ? (w) view : (w) this.f1071d.inflate(this.f1074t, viewGroup, false);
            wVar.c(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) wVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.H);
            if (this.Y == null) {
                this.Y = new r.f(this);
            }
            actionMenuItemView.setPopupCallback(this.Y);
            actionView = (View) wVar;
        }
        actionView.setVisibility(nVar.f47299e0 ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof r.j)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        r.g gVar = this.X;
        if (gVar != null && (obj = this.H) != null) {
            ((View) obj).removeCallbacks(gVar);
            this.X = null;
            return true;
        }
        r.e eVar = this.V;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.f47318i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q.v
    public final void c(boolean z11) {
        int i11;
        ViewGroup viewGroup = (ViewGroup) this.H;
        ArrayList arrayList = null;
        boolean z12 = false;
        if (viewGroup != null) {
            q.l lVar = this.f1070c;
            if (lVar != null) {
                lVar.i();
                ArrayList arrayListL = this.f1070c.l();
                int size = arrayListL.size();
                i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    q.n nVar = (q.n) arrayListL.get(i12);
                    if ((nVar.Z & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i11);
                        q.n itemData = childAt instanceof w ? ((w) childAt).getItemData() : null;
                        View viewA = a(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.H).addView(viewA, i11);
                        }
                        i11++;
                    }
                }
            } else {
                i11 = 0;
            }
            while (i11 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i11) == this.L) {
                    i11++;
                } else {
                    viewGroup.removeViewAt(i11);
                }
            }
        }
        ((View) this.H).requestLayout();
        q.l lVar2 = this.f1070c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.K;
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                z4.c cVar = ((q.n) arrayList2.get(i13)).f47295c0;
                if (cVar != null) {
                    cVar.f58815a = this;
                }
            }
        }
        q.l lVar3 = this.f1070c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.L;
        }
        if (this.O && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z12 = !((q.n) arrayList.get(0)).f47299e0;
            } else if (size3 > 0) {
                z12 = true;
            }
        }
        if (z12) {
            if (this.L == null) {
                this.L = new ActionMenuPresenter$OverflowMenuButton(this, this.f1067a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.L.getParent();
            if (viewGroup3 != this.H) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.L);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.H;
                ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = this.L;
                actionMenuView.getClass();
                r.j jVarJ = ActionMenuView.j();
                jVarJ.f48580a = true;
                actionMenuView.addView(actionMenuPresenter$OverflowMenuButton, jVarJ);
            }
        } else {
            ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton2 = this.L;
            if (actionMenuPresenter$OverflowMenuButton2 != null) {
                Object parent = actionMenuPresenter$OverflowMenuButton2.getParent();
                Object obj = this.H;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.L);
                }
            }
        }
        ((ActionMenuView) this.H).setOverflowReserved(this.O);
    }

    @Override // q.v
    public final void d(q.l lVar, boolean z11) {
        b();
        r.e eVar = this.W;
        if (eVar != null && eVar.b()) {
            eVar.f47318i.dismiss();
        }
        u uVar = this.f1072e;
        if (uVar != null) {
            uVar.d(lVar, z11);
        }
    }

    @Override // q.v
    public final boolean e() {
        int size;
        ArrayList arrayListL;
        int i11;
        boolean z11;
        c cVar = this;
        q.l lVar = cVar.f1070c;
        if (lVar != null) {
            arrayListL = lVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i12 = cVar.S;
        int i13 = cVar.R;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.H;
        int i14 = 0;
        boolean z12 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z11 = true;
            if (i14 >= size) {
                break;
            }
            q.n nVar = (q.n) arrayListL.get(i14);
            int i17 = nVar.f47291a0;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z12 = true;
            }
            if (cVar.T && nVar.f47299e0) {
                i12 = 0;
            }
            i14++;
        }
        if (cVar.O && (z12 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = cVar.U;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i21 = 0;
        while (i19 < size) {
            q.n nVar2 = (q.n) arrayListL.get(i19);
            int i22 = nVar2.f47291a0;
            boolean z13 = (i22 & 2) == i11 ? z11 : false;
            int i23 = nVar2.f47292b;
            if (z13) {
                View viewA = cVar.a(nVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i21 == 0) {
                    i21 = measuredWidth;
                }
                if (i23 != 0) {
                    sparseBooleanArray.put(i23, z11);
                }
                nVar2.g(z11);
            } else {
                if ((i22 & 1) == z11) {
                    boolean z14 = sparseBooleanArray.get(i23);
                    boolean z15 = ((i18 > 0 || z14) && i13 > 0) ? z11 : false;
                    if (z15) {
                        View viewA2 = cVar.a(nVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i13 -= measuredWidth2;
                        if (i21 == 0) {
                            i21 = measuredWidth2;
                        }
                        z15 &= i13 + i21 > 0;
                    }
                    if (z15 && i23 != 0) {
                        sparseBooleanArray.put(i23, true);
                    } else if (z14) {
                        sparseBooleanArray.put(i23, false);
                        for (int i24 = 0; i24 < i19; i24++) {
                            q.n nVar3 = (q.n) arrayListL.get(i24);
                            if (nVar3.f47292b == i23) {
                                if ((nVar3.Z & 32) == 32) {
                                    i18++;
                                }
                                nVar3.g(false);
                            }
                        }
                    }
                    if (z15) {
                        i18--;
                    }
                    nVar2.g(z15);
                } else {
                    nVar2.g(false);
                }
                i19++;
                i11 = 2;
                cVar = this;
                z11 = true;
            }
            i19++;
            i11 = 2;
            cVar = this;
            z11 = true;
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q.v
    public final boolean f(b0 b0Var) {
        boolean z11;
        if (b0Var.hasVisibleItems()) {
            b0 b0Var2 = b0Var;
            while (true) {
                q.l lVar = b0Var2.f47250b0;
                if (lVar == this.f1070c) {
                    break;
                }
                b0Var2 = (b0) lVar;
            }
            q.n nVar = b0Var2.f47251c0;
            ViewGroup viewGroup = (ViewGroup) this.H;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if ((childAt instanceof w) && ((w) childAt).getItemData() == nVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.f1068a0 = b0Var.f47251c0.f47290a;
                int size = b0Var.f47285f.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        z11 = false;
                        break;
                    }
                    MenuItem item = b0Var.getItem(i12);
                    if (item.isVisible() && item.getIcon() != null) {
                        z11 = true;
                        break;
                    }
                    i12++;
                }
                r.e eVar = new r.e(this, this.f1069b, b0Var, view);
                this.W = eVar;
                eVar.f47316g = z11;
                r rVar = eVar.f47318i;
                if (rVar != null) {
                    rVar.q(z11);
                }
                r.e eVar2 = this.W;
                if (!eVar2.b()) {
                    if (eVar2.f47314e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    eVar2.d(0, 0, false, false);
                }
                u uVar = this.f1072e;
                if (uVar != null) {
                    uVar.q(b0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // q.v
    public final void g(Parcelable parcelable) {
        int i11;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof r.h) && (i11 = ((r.h) parcelable).f48570a) > 0 && (menuItemFindItem = this.f1070c.findItem(i11)) != null) {
            f((b0) menuItemFindItem.getSubMenu());
        }
    }

    @Override // q.v
    public final int getId() {
        return this.K;
    }

    public final boolean h() {
        r.e eVar = this.V;
        return eVar != null && eVar.b();
    }

    @Override // q.v
    public final boolean i(q.n nVar) {
        return false;
    }

    @Override // q.v
    public final void j(Context context, q.l lVar) {
        this.f1069b = context;
        LayoutInflater.from(context);
        this.f1070c = lVar;
        Resources resources = context.getResources();
        p.a aVarA = p.a.a(context);
        if (!this.P) {
            this.O = true;
        }
        this.Q = aVarA.f46178b.getResources().getDisplayMetrics().widthPixels / 2;
        this.S = aVarA.b();
        int measuredWidth = this.Q;
        if (this.O) {
            if (this.L == null) {
                ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = new ActionMenuPresenter$OverflowMenuButton(this, this.f1067a);
                this.L = actionMenuPresenter$OverflowMenuButton;
                if (this.N) {
                    actionMenuPresenter$OverflowMenuButton.setImageDrawable(this.M);
                    this.M = null;
                    this.N = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.L.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.L.getMeasuredWidth();
        } else {
            this.L = null;
        }
        this.R = measuredWidth;
        float f5 = resources.getDisplayMetrics().density;
    }

    @Override // q.v
    public final Parcelable k() {
        r.h hVar = new r.h();
        hVar.f48570a = this.f1068a0;
        return hVar;
    }

    @Override // q.v
    public final void l(u uVar) {
        throw null;
    }

    @Override // q.v
    public final boolean m(q.n nVar) {
        return false;
    }

    public final boolean n() {
        q.l lVar;
        if (!this.O || h() || (lVar = this.f1070c) == null || this.H == null || this.X != null) {
            return false;
        }
        lVar.i();
        if (lVar.L.isEmpty()) {
            return false;
        }
        r.g gVar = new r.g(0, this, new r.e(this, this.f1069b, this.f1070c, this.L));
        this.X = gVar;
        ((View) this.H).post(gVar);
        return true;
    }
}
