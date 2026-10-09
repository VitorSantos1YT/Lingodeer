package com.google.android.material.internal;

import a5.f;
import a5.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.i2;
import com.lingodeer.R;
import java.util.ArrayList;
import q.b0;
import q.l;
import q.n;
import q.v;
import q.x;
import z4.b;
import z4.s0;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuPresenter implements v {
    public ColorStateList H;
    public ColorStateList M;
    public ColorStateList N;
    public Drawable O;
    public RippleDrawable P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NavigationMenuView f14683a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f14684a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f14685b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f14686b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f14687c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f14688c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NavigationMenuAdapter f14691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LayoutInflater f14693f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14694t = 0;
    public int K = 0;
    public boolean L = true;
    public boolean Z = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f14690d0 = -1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final View.OnClickListener f14692e0 = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean z11 = true;
            navigationMenuPresenter.n(true);
            n itemData = ((NavigationMenuItemView) view).getItemData();
            boolean zQ = navigationMenuPresenter.f14687c.q(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && zQ) {
                navigationMenuPresenter.f14691e.b(itemData);
            } else {
                z11 = false;
            }
            navigationMenuPresenter.n(false);
            if (z11) {
                navigationMenuPresenter.c(false);
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class HeaderViewHolder extends ViewHolder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class NavigationMenuAdapter extends b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f14696a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n f14697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f14698c;

        public NavigationMenuAdapter() {
            a();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a() {
            if (this.f14698c) {
                return;
            }
            this.f14698c = true;
            ArrayList arrayList = this.f14696a;
            arrayList.clear();
            arrayList.add(new NavigationMenuHeaderItem());
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int size = navigationMenuPresenter.f14687c.l().size();
            boolean z11 = false;
            int i11 = -1;
            int i12 = 0;
            boolean z12 = false;
            int size2 = 0;
            while (i12 < size) {
                n nVar = (n) navigationMenuPresenter.f14687c.l().get(i12);
                if (nVar.isChecked()) {
                    b(nVar);
                }
                if (nVar.isCheckable()) {
                    nVar.f(z11);
                }
                if (nVar.hasSubMenu()) {
                    b0 b0Var = nVar.Q;
                    if (b0Var.hasVisibleItems()) {
                        if (i12 != 0) {
                            arrayList.add(new NavigationMenuSeparatorItem(navigationMenuPresenter.f14688c0, z11 ? 1 : 0));
                        }
                        arrayList.add(new NavigationMenuTextItem(nVar));
                        int size3 = b0Var.size();
                        int i13 = z11 ? 1 : 0;
                        int i14 = i13;
                        while (i13 < size3) {
                            n nVar2 = (n) b0Var.getItem(i13);
                            if (nVar2.isVisible()) {
                                if (i14 == 0 && nVar2.getIcon() != null) {
                                    i14 = 1;
                                }
                                if (nVar2.isCheckable()) {
                                    nVar2.f(z11);
                                }
                                if (nVar2.isChecked()) {
                                    b(nVar2);
                                }
                                arrayList.add(new NavigationMenuTextItem(nVar2));
                            }
                            i13++;
                            z11 = false;
                        }
                        if (i14 != 0) {
                            int size4 = arrayList.size();
                            for (int size5 = arrayList.size(); size5 < size4; size5++) {
                                ((NavigationMenuTextItem) arrayList.get(size5)).f14706b = true;
                            }
                        }
                    }
                } else {
                    int i15 = nVar.f47292b;
                    if (i15 != i11) {
                        size2 = arrayList.size();
                        z12 = nVar.getIcon() != null;
                        if (i12 != 0) {
                            size2++;
                            int i16 = navigationMenuPresenter.f14688c0;
                            arrayList.add(new NavigationMenuSeparatorItem(i16, i16));
                        }
                    } else if (!z12 && nVar.getIcon() != null) {
                        int size6 = arrayList.size();
                        for (int i17 = size2; i17 < size6; i17++) {
                            ((NavigationMenuTextItem) arrayList.get(i17)).f14706b = true;
                        }
                        z12 = true;
                    }
                    NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(nVar);
                    navigationMenuTextItem.f14706b = z12;
                    arrayList.add(navigationMenuTextItem);
                    i11 = i15;
                }
                i12++;
                z11 = false;
            }
            this.f14698c = z11;
        }

        public final void b(n nVar) {
            if (this.f14697b == nVar || !nVar.isCheckable()) {
                return;
            }
            n nVar2 = this.f14697b;
            if (nVar2 != null) {
                nVar2.setChecked(false);
            }
            this.f14697b = nVar;
            nVar.setChecked(true);
        }

        @Override // androidx.recyclerview.widget.b1
        public final int getItemCount() {
            return this.f14696a.size();
        }

        @Override // androidx.recyclerview.widget.b1
        public final long getItemId(int i11) {
            return i11;
        }

        @Override // androidx.recyclerview.widget.b1
        public final int getItemViewType(int i11) {
            NavigationMenuItem navigationMenuItem = (NavigationMenuItem) this.f14696a.get(i11);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).f14705a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.b1
        public final void onBindViewHolder(g2 g2Var, final int i11) {
            ViewHolder viewHolder = (ViewHolder) g2Var;
            int itemViewType = getItemViewType(i11);
            ArrayList arrayList = this.f14696a;
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (itemViewType != 0) {
                final boolean z11 = true;
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) arrayList.get(i11);
                    viewHolder.itemView.setPaddingRelative(navigationMenuPresenter.U, navigationMenuSeparatorItem.f14703a, navigationMenuPresenter.V, navigationMenuSeparatorItem.f14704b);
                    return;
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((NavigationMenuTextItem) arrayList.get(i11)).f14705a.f47298e);
                textView.setTextAppearance(navigationMenuPresenter.f14694t);
                textView.setPaddingRelative(navigationMenuPresenter.W, textView.getPaddingTop(), navigationMenuPresenter.X, textView.getPaddingBottom());
                ColorStateList colorStateList = navigationMenuPresenter.H;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                s0.q(textView, new b() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                    @Override // z4.b
                    public final void d(View view, g gVar) {
                        this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
                        NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
                        int i12 = i11;
                        int i13 = i12;
                        for (int i14 = 0; i14 < i12; i14++) {
                            if (navigationMenuPresenter2.f14691e.getItemViewType(i14) == 2 || navigationMenuPresenter2.f14691e.getItemViewType(i14) == 3) {
                                i13--;
                            }
                        }
                        gVar.o(f.o(i13, 1, 1, 1, z11, view.isSelected()));
                    }
                });
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(navigationMenuPresenter.N);
            navigationMenuItemView.setTextAppearance(navigationMenuPresenter.K);
            ColorStateList colorStateList2 = navigationMenuPresenter.M;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = navigationMenuPresenter.O;
            navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = navigationMenuPresenter.P;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) arrayList.get(i11);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.f14706b);
            int i12 = navigationMenuPresenter.Q;
            int i13 = navigationMenuPresenter.R;
            navigationMenuItemView.setPadding(i12, i13, i12, i13);
            navigationMenuItemView.setIconPadding(navigationMenuPresenter.S);
            if (navigationMenuPresenter.Y) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter.T);
            }
            navigationMenuItemView.setMaxLines(navigationMenuPresenter.f14684a0);
            n nVar = navigationMenuTextItem.f14705a;
            navigationMenuItemView.f14674d0 = navigationMenuPresenter.L;
            navigationMenuItemView.c(nVar);
            final boolean z12 = false;
            s0.q(navigationMenuItemView, new b() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                @Override // z4.b
                public final void d(View view, g gVar) {
                    this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
                    NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
                    int i14 = i11;
                    int i15 = i14;
                    for (int i16 = 0; i16 < i14; i16++) {
                        if (navigationMenuPresenter2.f14691e.getItemViewType(i16) == 2 || navigationMenuPresenter2.f14691e.getItemViewType(i16) == 3) {
                            i15--;
                        }
                    }
                    gVar.o(f.o(i15, 1, 1, 1, z12, view.isSelected()));
                }
            });
        }

        @Override // androidx.recyclerview.widget.b1
        public final g2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (i11 == 0) {
                LayoutInflater layoutInflater = navigationMenuPresenter.f14693f;
                View.OnClickListener onClickListener = navigationMenuPresenter.f14692e0;
                NormalViewHolder normalViewHolder = new NormalViewHolder(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
                normalViewHolder.itemView.setOnClickListener(onClickListener);
                return normalViewHolder;
            }
            if (i11 == 1) {
                return new SubheaderViewHolder(navigationMenuPresenter.f14693f.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
            }
            if (i11 == 2) {
                return new SeparatorViewHolder(navigationMenuPresenter.f14693f.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
            }
            if (i11 != 3) {
                return null;
            }
            return new HeaderViewHolder(navigationMenuPresenter.f14685b);
        }

        @Override // androidx.recyclerview.widget.b1
        public final void onViewRecycled(g2 g2Var) {
            ViewHolder viewHolder = (ViewHolder) g2Var;
            if (viewHolder instanceof NormalViewHolder) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
                FrameLayout frameLayout = navigationMenuItemView.f14676f0;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f14675e0.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface NavigationMenuItem {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f14703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14704b;

        public NavigationMenuSeparatorItem(int i11, int i12) {
            this.f14703a = i11;
            this.f14704b = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class NavigationMenuTextItem implements NavigationMenuItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f14705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14706b;

        public NavigationMenuTextItem(n nVar) {
            this.f14705a = nVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class NavigationMenuViewAccessibilityDelegate extends i2 {
        public NavigationMenuViewAccessibilityDelegate(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.i2, z4.b
        public final void d(View view, g gVar) {
            super.d(view, gVar);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i11 = 0;
            for (int i12 = 0; i12 < navigationMenuPresenter.f14691e.f14696a.size(); i12++) {
                int itemViewType = navigationMenuPresenter.f14691e.getItemViewType(i12);
                if (itemViewType == 0 || itemViewType == 1) {
                    i11++;
                }
            }
            gVar.f380a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i11, 1, false));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class NormalViewHolder extends ViewHolder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SeparatorViewHolder extends ViewHolder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SubheaderViewHolder extends ViewHolder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ViewHolder extends g2 {
    }

    public final n a() {
        return this.f14691e.f14697b;
    }

    public final x b(ViewGroup viewGroup) {
        if (this.f14683a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f14693f.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.f14683a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.f14683a));
            if (this.f14691e == null) {
                NavigationMenuAdapter navigationMenuAdapter = new NavigationMenuAdapter();
                this.f14691e = navigationMenuAdapter;
                navigationMenuAdapter.setHasStableIds(true);
            }
            int i11 = this.f14690d0;
            if (i11 != -1) {
                this.f14683a.setOverScrollMode(i11);
            }
            LinearLayout linearLayout = (LinearLayout) this.f14693f.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.f14683a, false);
            this.f14685b = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            this.f14683a.setAdapter(this.f14691e);
        }
        return this.f14683a;
    }

    @Override // q.v
    public final void c(boolean z11) {
        NavigationMenuAdapter navigationMenuAdapter = this.f14691e;
        if (navigationMenuAdapter != null) {
            ArrayList arrayList = navigationMenuAdapter.f14696a;
            int size = arrayList.size();
            navigationMenuAdapter.a();
            navigationMenuAdapter.notifyDataSetChanged();
            if (size == arrayList.size()) {
                navigationMenuAdapter.notifyItemRangeChanged(0, arrayList.size());
            }
        }
    }

    @Override // q.v
    public final void d(l lVar, boolean z11) {
    }

    @Override // q.v
    public final boolean e() {
        return false;
    }

    @Override // q.v
    public final boolean f(b0 b0Var) {
        return false;
    }

    @Override // q.v
    public final void g(Parcelable parcelable) {
        n nVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f14683a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                NavigationMenuAdapter navigationMenuAdapter = this.f14691e;
                ArrayList arrayList = navigationMenuAdapter.f14696a;
                int i11 = bundle2.getInt("android:menu:checked", 0);
                if (i11 != 0) {
                    navigationMenuAdapter.f14698c = true;
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        NavigationMenuItem navigationMenuItem = (NavigationMenuItem) arrayList.get(i12);
                        if (navigationMenuItem instanceof NavigationMenuTextItem) {
                            n nVar2 = ((NavigationMenuTextItem) navigationMenuItem).f14705a;
                            if (nVar2.f47290a == i11) {
                                navigationMenuAdapter.b(nVar2);
                                break;
                            }
                        }
                    }
                    navigationMenuAdapter.f14698c = false;
                    navigationMenuAdapter.a();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        NavigationMenuItem navigationMenuItem2 = (NavigationMenuItem) arrayList.get(i13);
                        if ((navigationMenuItem2 instanceof NavigationMenuTextItem) && (actionView = (nVar = ((NavigationMenuTextItem) navigationMenuItem2).f14705a).getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(nVar.f47290a)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f14685b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // q.v
    public final int getId() {
        return this.f14689d;
    }

    public final void h(n nVar) {
        this.f14691e.b(nVar);
    }

    @Override // q.v
    public final boolean i(n nVar) {
        return false;
    }

    @Override // q.v
    public final void j(Context context, l lVar) {
        this.f14693f = LayoutInflater.from(context);
        this.f14687c = lVar;
        this.f14688c0 = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // q.v
    public final boolean m(n nVar) {
        return false;
    }

    public final void n(boolean z11) {
        NavigationMenuAdapter navigationMenuAdapter = this.f14691e;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.f14698c = z11;
        }
    }

    public final void o() {
        NavigationMenuAdapter navigationMenuAdapter = this.f14691e;
        if (navigationMenuAdapter != null) {
            ArrayList arrayList = navigationMenuAdapter.f14696a;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof NavigationMenuSeparatorItem) {
                    navigationMenuAdapter.notifyItemChanged(i11);
                }
            }
        }
    }

    public final void p() {
        NavigationMenuAdapter navigationMenuAdapter = this.f14691e;
        if (navigationMenuAdapter != null) {
            ArrayList arrayList = navigationMenuAdapter.f14696a;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if ((arrayList.get(i11) instanceof NavigationMenuTextItem) && navigationMenuAdapter.getItemViewType(i11) == 1) {
                    navigationMenuAdapter.notifyItemChanged(i11);
                }
            }
        }
    }

    public final void q() {
        NavigationMenuAdapter navigationMenuAdapter = this.f14691e;
        if (navigationMenuAdapter != null) {
            ArrayList arrayList = navigationMenuAdapter.f14696a;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if ((arrayList.get(i11) instanceof NavigationMenuTextItem) && navigationMenuAdapter.getItemViewType(i11) == 0) {
                    navigationMenuAdapter.notifyItemChanged(i11);
                }
            }
        }
    }

    @Override // q.v
    public final Parcelable k() {
        Bundle bundle = new Bundle();
        if (this.f14683a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f14683a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.f14691e;
        if (navigationMenuAdapter != null) {
            ArrayList arrayList = navigationMenuAdapter.f14696a;
            Bundle bundle2 = new Bundle();
            n nVar = navigationMenuAdapter.f14697b;
            if (nVar != null) {
                bundle2.putInt(anrPHlQ.qVFJahtG, nVar.f47290a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                NavigationMenuItem navigationMenuItem = (NavigationMenuItem) arrayList.get(i11);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    n nVar2 = ((NavigationMenuTextItem) navigationMenuItem).f14705a;
                    View actionView = nVar2 != null ? nVar2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(nVar2.f47290a, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f14685b != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f14685b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }
}
