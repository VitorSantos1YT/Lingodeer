package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f32633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f32635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f32636e;

    public /* synthetic */ g6(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, int i11) {
        this.f32632a = i11;
        this.f32633b = linearLayout;
        this.f32634c = textView;
        this.f32635d = textView2;
        this.f32636e = textView3;
    }

    public static g6 a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R.id.tv_bottom;
        TextView textView = (TextView) fr.j3.q(view, R.id.tv_bottom);
        if (textView != null) {
            i11 = R.id.tv_middle;
            TextView textView2 = (TextView) fr.j3.q(view, R.id.tv_middle);
            if (textView2 != null) {
                i11 = R.id.tv_top;
                TextView textView3 = (TextView) fr.j3.q(view, R.id.tv_top);
                if (textView3 != null) {
                    return new g6(linearLayout, textView, textView2, textView3, 2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f32632a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f32633b;
    }
}
