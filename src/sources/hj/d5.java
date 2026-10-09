package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.widget.ResponsiveScrollView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f32496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f32498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ResponsiveScrollView f32499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32500f;

    public d5(LinearLayout linearLayout, FlexboxLayout flexboxLayout, ImageView imageView, RecyclerView recyclerView, ResponsiveScrollView responsiveScrollView, View view) {
        this.f32495a = linearLayout;
        this.f32496b = flexboxLayout;
        this.f32497c = imageView;
        this.f32498d = recyclerView;
        this.f32499e = responsiveScrollView;
        this.f32500f = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32495a;
    }
}
