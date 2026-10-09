package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f32577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f32578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f32579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f32580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f32581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f32583h;

    public /* synthetic */ f6(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, int i11) {
        this.f32576a = i11;
        this.f32577b = relativeLayout;
        this.f32578c = linearLayout;
        this.f32579d = linearLayout2;
        this.f32580e = linearLayout3;
        this.f32581f = textView;
        this.f32582g = textView2;
        this.f32583h = textView3;
    }

    public static f6 a(View view) {
        int i11 = R.id.ll_hira;
        LinearLayout linearLayout = (LinearLayout) fr.j3.q(view, R.id.ll_hira);
        if (linearLayout != null) {
            i11 = R.id.ll_kanji;
            LinearLayout linearLayout2 = (LinearLayout) fr.j3.q(view, R.id.ll_kanji);
            if (linearLayout2 != null) {
                i11 = R.id.ll_katana;
                LinearLayout linearLayout3 = (LinearLayout) fr.j3.q(view, R.id.ll_katana);
                if (linearLayout3 != null) {
                    i11 = R.id.tv_1;
                    TextView textView = (TextView) fr.j3.q(view, R.id.tv_1);
                    if (textView != null) {
                        i11 = R.id.tv_2;
                        TextView textView2 = (TextView) fr.j3.q(view, R.id.tv_2);
                        if (textView2 != null) {
                            i11 = R.id.tv_3;
                            TextView textView3 = (TextView) fr.j3.q(view, R.id.tv_3);
                            if (textView3 != null) {
                                i11 = R.id.tv_4;
                                if (((TextView) fr.j3.q(view, R.id.tv_4)) != null) {
                                    i11 = R.id.tv_5;
                                    if (((TextView) fr.j3.q(view, R.id.tv_5)) != null) {
                                        i11 = R.id.tv_6;
                                        if (((TextView) fr.j3.q(view, R.id.tv_6)) != null) {
                                            return new f6((RelativeLayout) view, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f32576a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f32577b;
    }
}
