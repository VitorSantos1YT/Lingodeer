package ua;

import android.database.DataSetObserver;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends DataSetObserver implements j, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerTitleStrip f52885b;

    public c(PagerTitleStrip pagerTitleStrip) {
        this.f52885b = pagerTitleStrip;
    }

    @Override // ua.i
    public final void a(ViewPager viewPager, a aVar, a aVar2) {
        this.f52885b.a(aVar, aVar2);
    }

    @Override // ua.j
    public final void b(int i11, float f5) {
        if (f5 > 0.5f) {
            i11++;
        }
        this.f52885b.c(f5, i11, false);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        PagerTitleStrip pagerTitleStrip = this.f52885b;
        pagerTitleStrip.b(pagerTitleStrip.f2735a.getCurrentItem(), pagerTitleStrip.f2735a.getAdapter());
        float f5 = pagerTitleStrip.f2740f;
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = 0.0f;
        }
        pagerTitleStrip.c(f5, pagerTitleStrip.f2735a.getCurrentItem(), true);
    }

    @Override // ua.j
    public final void onPageScrollStateChanged(int i11) {
        this.f52884a = i11;
    }

    @Override // ua.j
    public final void onPageSelected(int i11) {
        if (this.f52884a == 0) {
            PagerTitleStrip pagerTitleStrip = this.f52885b;
            pagerTitleStrip.b(pagerTitleStrip.f2735a.getCurrentItem(), pagerTitleStrip.f2735a.getAdapter());
            float f5 = pagerTitleStrip.f2740f;
            if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                f5 = 0.0f;
            }
            pagerTitleStrip.c(f5, pagerTitleStrip.f2735a.getCurrentItem(), true);
        }
    }
}
