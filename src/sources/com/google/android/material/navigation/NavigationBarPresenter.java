package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;
import q.b0;
import q.l;
import q.n;
import q.v;
import qa.a;
import qa.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationBarPresenter implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NavigationBarMenuView f14907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14908b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14909c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f14910a = parcel.readInt();
                savedState.f14911b = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ParcelableSparseArray f14911b;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f14910a);
            parcel.writeParcelable(this.f14911b, 0);
        }
    }

    @Override // q.v
    public final void c(boolean z11) {
        NavigationBarMenuBuilder navigationBarMenuBuilder;
        a aVar;
        if (this.f14908b) {
            return;
        }
        if (z11) {
            this.f14907a.b();
            return;
        }
        NavigationBarMenuView navigationBarMenuView = this.f14907a;
        NavigationBarMenuBuilder navigationBarMenuBuilder2 = navigationBarMenuView.f14896r0;
        if (navigationBarMenuBuilder2 == null || navigationBarMenuView.f14898t == null) {
            return;
        }
        navigationBarMenuView.f14895q0.f14908b = true;
        navigationBarMenuBuilder2.b();
        navigationBarMenuView.f14895q0.f14908b = false;
        if (navigationBarMenuView.f14898t != null && (navigationBarMenuBuilder = navigationBarMenuView.f14896r0) != null && navigationBarMenuBuilder.f14869b.size() == navigationBarMenuView.f14898t.length) {
            for (int i11 = 0; i11 < navigationBarMenuView.f14898t.length; i11++) {
                if (!(navigationBarMenuView.f14896r0.a(i11) instanceof DividerMenuItem) || (navigationBarMenuView.f14898t[i11] instanceof NavigationBarDividerView)) {
                    boolean z12 = navigationBarMenuView.f14896r0.a(i11).hasSubMenu() && !(navigationBarMenuView.f14898t[i11] instanceof NavigationBarSubheaderView);
                    boolean z13 = (navigationBarMenuView.f14896r0.a(i11).hasSubMenu() || (navigationBarMenuView.f14898t[i11] instanceof NavigationBarItemView)) ? false : true;
                    if ((navigationBarMenuView.f14896r0.a(i11) instanceof DividerMenuItem) || (!z12 && !z13)) {
                    }
                }
            }
            int i12 = navigationBarMenuView.H;
            int size = navigationBarMenuView.f14896r0.f14869b.size();
            for (int i13 = 0; i13 < size; i13++) {
                MenuItem menuItemA = navigationBarMenuView.f14896r0.a(i13);
                if (menuItemA.isChecked()) {
                    navigationBarMenuView.setCheckedItem(menuItemA);
                    navigationBarMenuView.H = menuItemA.getItemId();
                    navigationBarMenuView.K = i13;
                }
            }
            if (i12 != navigationBarMenuView.H && (aVar = navigationBarMenuView.f14873a) != null) {
                z.a(navigationBarMenuView, aVar);
            }
            boolean zG = NavigationBarMenuView.g(navigationBarMenuView.f14881e, navigationBarMenuView.getCurrentVisibleContentItemCount());
            for (int i14 = 0; i14 < size; i14++) {
                navigationBarMenuView.f14895q0.f14908b = true;
                navigationBarMenuView.f14898t[i14].setExpanded(navigationBarMenuView.f14902w0);
                NavigationBarMenuItemView navigationBarMenuItemView = navigationBarMenuView.f14898t[i14];
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                    navigationBarItemView.setLabelVisibilityMode(navigationBarMenuView.f14881e);
                    navigationBarItemView.setItemIconGravity(navigationBarMenuView.f14883f);
                    navigationBarItemView.setItemGravity(navigationBarMenuView.f14891m0);
                    navigationBarItemView.setShifting(zG);
                }
                if (navigationBarMenuView.f14896r0.a(i14) instanceof n) {
                    navigationBarMenuView.f14898t[i14].c((n) navigationBarMenuView.f14896r0.a(i14));
                }
                navigationBarMenuView.f14895q0.f14908b = false;
            }
            return;
        }
        navigationBarMenuView.b();
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
        if (parcelable instanceof SavedState) {
            NavigationBarMenuView navigationBarMenuView = this.f14907a;
            SavedState savedState = (SavedState) parcelable;
            int i11 = savedState.f14910a;
            int size = navigationBarMenuView.f14896r0.f14869b.size();
            for (int i12 = 0; i12 < size; i12++) {
                MenuItem menuItemA = navigationBarMenuView.f14896r0.a(i12);
                if (i11 == menuItemA.getItemId()) {
                    navigationBarMenuView.H = i11;
                    navigationBarMenuView.K = i12;
                    navigationBarMenuView.setCheckedItem(menuItemA);
                    break;
                }
            }
            Context context = this.f14907a.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.f14911b;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            for (int i13 = 0; i13 < parcelableSparseArray.size(); i13++) {
                int iKeyAt = parcelableSparseArray.keyAt(i13);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i13);
                sparseArray.put(iKeyAt, state != null ? new BadgeDrawable(context, state) : null);
            }
            NavigationBarMenuView navigationBarMenuView2 = this.f14907a;
            SparseArray sparseArray2 = navigationBarMenuView2.f14874a0;
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                int iKeyAt2 = sparseArray.keyAt(i14);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (BadgeDrawable) sparseArray.get(iKeyAt2));
                }
            }
            NavigationBarMenuItemView[] navigationBarMenuItemViewArr = navigationBarMenuView2.f14898t;
            if (navigationBarMenuItemViewArr != null) {
                for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                    if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                        BadgeDrawable badgeDrawable = (BadgeDrawable) sparseArray2.get(navigationBarItemView.getId());
                        if (badgeDrawable != null) {
                            navigationBarItemView.setBadge(badgeDrawable);
                        }
                    }
                }
            }
        }
    }

    @Override // q.v
    public final int getId() {
        return this.f14909c;
    }

    @Override // q.v
    public final boolean i(n nVar) {
        return false;
    }

    @Override // q.v
    public final void j(Context context, l lVar) {
        this.f14907a.a(lVar);
    }

    @Override // q.v
    public final Parcelable k() {
        SavedState savedState = new SavedState();
        savedState.f14910a = this.f14907a.getSelectedItemId();
        SparseArray<BadgeDrawable> badgeDrawables = this.f14907a.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i11 = 0; i11 < badgeDrawables.size(); i11++) {
            int iKeyAt = badgeDrawables.keyAt(i11);
            BadgeDrawable badgeDrawableValueAt = badgeDrawables.valueAt(i11);
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt != null ? badgeDrawableValueAt.f13877e.f13880a : null);
        }
        savedState.f14911b = parcelableSparseArray;
        return savedState;
    }

    @Override // q.v
    public final boolean m(n nVar) {
        return false;
    }

    @Override // q.v
    public final void d(l lVar, boolean z11) {
    }
}
