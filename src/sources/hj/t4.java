package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.ObservableHorizonalScrollView;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.ObservableScrollView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f33341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f33342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f33343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f33344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ObservableScrollView f33345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ObservableHorizonalScrollView f33346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ObservableScrollView f33347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ObservableHorizonalScrollView f33348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TableLayout f33349j;

    public t4(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ObservableScrollView observableScrollView, ObservableHorizonalScrollView observableHorizonalScrollView, ObservableScrollView observableScrollView2, ObservableHorizonalScrollView observableHorizonalScrollView2, TableLayout tableLayout) {
        this.f33340a = linearLayout;
        this.f33341b = imageView;
        this.f33342c = imageView2;
        this.f33343d = imageView3;
        this.f33344e = imageView4;
        this.f33345f = observableScrollView;
        this.f33346g = observableHorizonalScrollView;
        this.f33347h = observableScrollView2;
        this.f33348i = observableHorizonalScrollView2;
        this.f33349j = tableLayout;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33340a;
    }
}
