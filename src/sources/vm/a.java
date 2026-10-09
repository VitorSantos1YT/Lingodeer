package vm;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import kotlin.jvm.internal.m;
import ua.k;
import zc.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements k, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f54075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54076b;

    public a(ViewPager viewPager, float f5) {
        this.f54076b = viewPager;
        this.f54075a = f5;
        ua.a adapter = viewPager.getAdapter();
        m.c(adapter);
        viewPager.setOffscreenPageLimit(adapter.c());
    }

    @Override // zc.b
    public boolean a(float f5) {
        if (this.f54075a == f5) {
            return true;
        }
        this.f54075a = f5;
        return false;
    }

    @Override // zc.b
    public ld.a c() {
        return (ld.a) this.f54076b;
    }

    @Override // zc.b
    public boolean d(float f5) {
        return !((ld.a) this.f54076b).c();
    }

    @Override // zc.b
    public float f() {
        return ((ld.a) this.f54076b).a();
    }

    @Override // zc.b
    public float g() {
        return ((ld.a) this.f54076b).b();
    }

    @Override // ua.k
    public void h(View view) {
        float f5 = this.f54075a;
        ViewPager viewPager = (ViewPager) this.f54076b;
        float left = (view.getLeft() - (viewPager.getPaddingLeft() + viewPager.getScrollX())) / ((viewPager.getMeasuredWidth() - viewPager.getPaddingLeft()) - viewPager.getPaddingRight());
        float f11 = 1;
        view.setAlpha(Math.abs(Math.abs(left) - f11) + 0.5f);
        if (left < -1.0f) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
            view.setAlpha(1.0f);
            view.setTranslationX(f5);
            return;
        }
        if (left > 1.0f) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
            view.setAlpha(1.0f);
            view.setTranslationX(-f5);
            return;
        }
        float fAbs = ((f11 - Math.abs(left)) * 0.100000024f) + 0.9f;
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
        view.setAlpha(1.0f);
        view.setTranslationX(left * (-f5));
    }

    @Override // zc.b
    public boolean isEmpty() {
        return false;
    }

    public a(List list) {
        this.f54075a = -1.0f;
        this.f54076b = (ld.a) list.get(0);
    }
}
