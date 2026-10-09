package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TabLayout f32565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewPager2 f32566d;

    public f3(LinearLayout linearLayout, MaterialButton materialButton, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f32563a = linearLayout;
        this.f32564b = materialButton;
        this.f32565c = tabLayout;
        this.f32566d = viewPager2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32563a;
    }
}
