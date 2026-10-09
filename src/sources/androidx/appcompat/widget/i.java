package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import r.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h implements p1 {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Method f1101f0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public o20.i f1102e0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1101f0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // r.p1
    public final void i(q.l lVar, MenuItem menuItem) {
        o20.i iVar = this.f1102e0;
        if (iVar != null) {
            iVar.i(lVar, menuItem);
        }
    }

    @Override // r.p1
    public final void o(q.l lVar, q.n nVar) {
        o20.i iVar = this.f1102e0;
        if (iVar != null) {
            iVar.o(lVar, nVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.DropDownListView, androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView] */
    @Override // androidx.appcompat.widget.h
    public final DropDownListView q(final Context context, final boolean z11) {
        ?? r9 = new DropDownListView(context, z11) { // from class: androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView
            public final int O;
            public final int P;
            public p1 Q;
            public q.n R;

            {
                super(context, z11);
                if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                    this.O = 21;
                    this.P = 22;
                } else {
                    this.O = 22;
                    this.P = 21;
                }
            }

            @Override // androidx.appcompat.widget.DropDownListView, android.view.View
            public final boolean onHoverEvent(MotionEvent motionEvent) {
                q.i iVar;
                int headersCount;
                int iPointToPosition;
                int i11;
                if (this.Q != null) {
                    ListAdapter adapter = getAdapter();
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        headersCount = headerViewListAdapter.getHeadersCount();
                        iVar = (q.i) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        iVar = (q.i) adapter;
                        headersCount = 0;
                    }
                    q.n nVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i11 = iPointToPosition - headersCount) < 0 || i11 >= iVar.getCount()) ? null : iVar.b(i11);
                    q.n nVar = this.R;
                    if (nVar != nVarB) {
                        q.l lVar = iVar.f47273a;
                        if (nVar != null) {
                            this.Q.i(lVar, nVar);
                        }
                        this.R = nVarB;
                        if (nVarB != null) {
                            this.Q.o(lVar, nVarB);
                        }
                    }
                }
                return super.onHoverEvent(motionEvent);
            }

            @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
            public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
                ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
                if (listMenuItemView != null && i11 == this.O) {
                    if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                        performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                    }
                    return true;
                }
                if (listMenuItemView == null || i11 != this.P) {
                    return super.onKeyDown(i11, keyEvent);
                }
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (q.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (q.i) adapter).f47273a.c(false);
                return true;
            }

            public void setHoverListener(p1 p1Var) {
                this.Q = p1Var;
            }

            @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
            public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
                super.setSelector(drawable);
            }
        };
        r9.setHoverListener(this);
        return r9;
    }
}
