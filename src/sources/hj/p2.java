package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f33081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f33082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f33083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f33084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f33085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f33086f;

    public p2(RelativeLayout relativeLayout, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, ImageView imageView, TextView textView, TextView textView2) {
        this.f33081a = relativeLayout;
        this.f33082b = flexboxLayout;
        this.f33083c = flexboxLayout2;
        this.f33084d = imageView;
        this.f33085e = textView;
        this.f33086f = textView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33081a;
    }
}
