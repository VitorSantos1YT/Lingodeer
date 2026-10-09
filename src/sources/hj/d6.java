package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f32502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f32503c;

    public /* synthetic */ d6(LinearLayout linearLayout, LinearLayout linearLayout2, int i11) {
        this.f32501a = i11;
        this.f32502b = linearLayout;
        this.f32503c = linearLayout2;
    }

    public static d6 a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R.id.tv_trans;
        if (((TextView) fr.j3.q(view, R.id.tv_trans)) != null) {
            i11 = R.id.tv_word;
            if (((TextView) fr.j3.q(view, R.id.tv_word)) != null) {
                i11 = R.id.tv_zhuyin;
                if (((TextView) fr.j3.q(view, R.id.tv_zhuyin)) != null) {
                    return new d6(linearLayout, linearLayout, 0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f32501a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f32502b;
    }

    public d6(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView) {
        this.f32501a = 1;
        this.f32502b = linearLayout;
        this.f32503c = linearLayout2;
    }
}
