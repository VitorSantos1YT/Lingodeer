package t5;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l5.e f52046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final py.b f52047c = new py.b(this, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f52048d;

    public f(DrawerLayout drawerLayout, int i11) {
        this.f52048d = drawerLayout;
        this.f52045a = i11;
    }

    @Override // com.bumptech.glide.d
    public final void A(int i11, int i12) {
        int i13 = i11 & 1;
        DrawerLayout drawerLayout = this.f52048d;
        View viewD = i13 == 1 ? drawerLayout.d(3) : drawerLayout.d(5);
        if (viewD == null || drawerLayout.f(viewD) != 0) {
            return;
        }
        this.f52046b.c(viewD, i12);
    }

    @Override // com.bumptech.glide.d
    public final void B(int i11) {
        this.f52048d.postDelayed(this.f52047c, 160L);
    }

    @Override // com.bumptech.glide.d
    public final void C(View view, int i11) {
        ((c) view.getLayoutParams()).f52038c = false;
        int i12 = this.f52045a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f52048d;
        View viewD = drawerLayout.d(i12);
        if (viewD != null) {
            drawerLayout.b(viewD, true);
        }
    }

    @Override // com.bumptech.glide.d
    public final void D(int i11) {
        this.f52048d.q(this.f52046b.f39766t, i11);
    }

    @Override // com.bumptech.glide.d
    public final void E(View view, int i11, int i12) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f52048d;
        float width2 = (drawerLayout.a(view, 3) ? i11 + width : drawerLayout.getWidth() - i11) / width;
        drawerLayout.n(view, width2);
        view.setVisibility(width2 == CropImageView.DEFAULT_ASPECT_RATIO ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // com.bumptech.glide.d
    public final void F(View view, float f5, float f11) {
        int i11;
        int[] iArr = DrawerLayout.f1582i0;
        float f12 = ((c) view.getLayoutParams()).f52037b;
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f52048d;
        if (drawerLayout.a(view, 3)) {
            i11 = (f5 > CropImageView.DEFAULT_ASPECT_RATIO || (f5 == CropImageView.DEFAULT_ASPECT_RATIO && f12 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f5 < CropImageView.DEFAULT_ASPECT_RATIO || (f5 == CropImageView.DEFAULT_ASPECT_RATIO && f12 > 0.5f)) {
                width2 -= width;
            }
            i11 = width2;
        }
        this.f52046b.r(i11, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // com.bumptech.glide.d
    public final boolean M(View view, int i11) {
        if (!DrawerLayout.k(view)) {
            return false;
        }
        int i12 = this.f52045a;
        DrawerLayout drawerLayout = this.f52048d;
        return drawerLayout.a(view, i12) && drawerLayout.f(view) == 0;
    }

    @Override // com.bumptech.glide.d
    public final int h(View view, int i11) {
        DrawerLayout drawerLayout = this.f52048d;
        if (drawerLayout.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i11, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i11, width));
    }

    @Override // com.bumptech.glide.d
    public final int i(View view, int i11) {
        return view.getTop();
    }

    @Override // com.bumptech.glide.d
    public final int q(View view) {
        if (DrawerLayout.k(view)) {
            return view.getWidth();
        }
        return 0;
    }
}
