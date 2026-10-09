package hj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f33255b;

    public /* synthetic */ s0(ViewGroup viewGroup, int i11) {
        this.f33254a = i11;
        this.f33255b = viewGroup;
    }

    public static s0 a(View view) {
        int i11 = R.id.tv_bottom;
        if (((TextView) fr.j3.q(view, R.id.tv_bottom)) != null) {
            i11 = R.id.tv_middle;
            if (((TextView) fr.j3.q(view, R.id.tv_middle)) != null) {
                i11 = R.id.tv_top;
                if (((TextView) fr.j3.q(view, R.id.tv_top)) != null) {
                    return new s0((CardView) view, 1);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f33254a) {
            case 0:
                return (LinearLayout) this.f33255b;
            default:
                return (CardView) this.f33255b;
        }
    }
}
