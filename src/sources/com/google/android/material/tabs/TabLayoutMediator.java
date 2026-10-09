package com.google.android.material.tabs;

import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.d1;
import androidx.viewpager2.widget.ViewPager2;
import com.yalantis.ucrop.view.CropImageView;
import hh.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import km.f2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class TabLayoutMediator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TabLayout f15581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager2 f15582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f15583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b1 f15584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TabLayout.OnTabSelectedListener f15586f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class PagerAdapterObserver extends d1 {
        public PagerAdapterObserver() {
        }

        @Override // androidx.recyclerview.widget.d1
        public final void onChanged() {
            TabLayoutMediator.this.b();
        }

        @Override // androidx.recyclerview.widget.d1
        public final void onItemRangeChanged(int i11, int i12) {
            TabLayoutMediator.this.b();
        }

        @Override // androidx.recyclerview.widget.d1
        public final void onItemRangeInserted(int i11, int i12) {
            TabLayoutMediator.this.b();
        }

        @Override // androidx.recyclerview.widget.d1
        public final void onItemRangeMoved(int i11, int i12, int i13) {
            TabLayoutMediator.this.b();
        }

        @Override // androidx.recyclerview.widget.d1
        public final void onItemRangeRemoved(int i11, int i12) {
            TabLayoutMediator.this.b();
        }

        @Override // androidx.recyclerview.widget.d1
        public final void onItemRangeChanged(int i11, int i12, Object obj) {
            TabLayoutMediator.this.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface TabConfigurationStrategy {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TabLayoutOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f15588a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15590c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15589b = 0;

        public TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
            this.f15588a = new WeakReference(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageScrollStateChanged(int i11) {
            this.f15589b = this.f15590c;
            this.f15590c = i11;
            TabLayout tabLayout = (TabLayout) this.f15588a.get();
            if (tabLayout != null) {
                tabLayout.A0 = this.f15590c;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageScrolled(int i11, float f5, int i12) {
            TabLayout tabLayout = (TabLayout) this.f15588a.get();
            if (tabLayout != null) {
                int i13 = this.f15590c;
                boolean z11 = true;
                if (i13 == 2 && this.f15589b != 1) {
                    z11 = false;
                }
                if (i13 == 2 && this.f15589b == 0) {
                    z11 = false;
                }
                tabLayout.m(i11, f5, z11, z11, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i11) {
            TabLayout tabLayout = (TabLayout) this.f15588a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i11 || i11 >= tabLayout.getTabCount()) {
                return;
            }
            int i12 = this.f15590c;
            tabLayout.k(tabLayout.g(i11), i12 == 0 || (i12 == 2 && this.f15589b == 0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewPager2 f15591a;

        public ViewPagerOnTabSelectedListener(ViewPager2 viewPager2) {
            this.f15591a = viewPager2;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void a(TabLayout.Tab tab) {
            this.f15591a.setCurrentItem(tab.f15564d, true);
        }
    }

    public TabLayoutMediator(TabLayout tabLayout, ViewPager2 viewPager2, c cVar) {
        this.f15581a = tabLayout;
        this.f15582b = viewPager2;
        this.f15583c = cVar;
    }

    public final void a() {
        if (this.f15585e) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ViewPager2 viewPager2 = this.f15582b;
        b1 adapter = viewPager2.getAdapter();
        this.f15584d = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f15585e = true;
        TabLayout tabLayout = this.f15581a;
        viewPager2.registerOnPageChangeCallback(new TabLayoutOnPageChangeCallback(tabLayout));
        ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager2);
        this.f15586f = viewPagerOnTabSelectedListener;
        ArrayList arrayList = tabLayout.f15541r0;
        if (!arrayList.contains(viewPagerOnTabSelectedListener)) {
            arrayList.add(viewPagerOnTabSelectedListener);
        }
        this.f15584d.registerAdapterDataObserver(new PagerAdapterObserver());
        b();
        tabLayout.m(viewPager2.getCurrentItem(), CropImageView.DEFAULT_ASPECT_RATIO, true, true, true);
    }

    public final void b() {
        TabLayout tabLayout = this.f15581a;
        tabLayout.j();
        b1 b1Var = this.f15584d;
        if (b1Var != null) {
            int itemCount = b1Var.getItemCount();
            for (int i11 = 0; i11 < itemCount; i11++) {
                TabLayout.Tab tabH = tabLayout.h();
                tabH.a(((String[]) ((f2) this.f15583c.f32212b).P.getValue())[i11]);
                tabLayout.a(tabH, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f15582b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.k(tabLayout.g(iMin), true);
                }
            }
        }
    }
}
