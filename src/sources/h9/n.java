package h9;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.n1;
import b0.h2;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f32077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f32078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable[] f32079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f32080d;

    public n(PlayerControlView playerControlView, String[] strArr, Drawable[] drawableArr) {
        this.f32080d = playerControlView;
        this.f32077a = strArr;
        this.f32078b = new String[strArr.length];
        this.f32079c = drawableArr;
    }

    public final boolean a(int i11) {
        PlayerControlView playerControlView = this.f32080d;
        y6.j0 j0Var = playerControlView.R0;
        if (j0Var == null) {
            return false;
        }
        if (i11 == 0) {
            return ((h2) j0Var).e0(13);
        }
        if (i11 != 1) {
            return true;
        }
        return ((h2) j0Var).e0(30) && ((h2) playerControlView.R0).e0(29);
    }

    @Override // androidx.recyclerview.widget.b1
    public final int getItemCount() {
        return this.f32077a.length;
    }

    @Override // androidx.recyclerview.widget.b1
    public final long getItemId(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.b1
    public final void onBindViewHolder(g2 g2Var, int i11) {
        m mVar = (m) g2Var;
        if (a(i11)) {
            mVar.itemView.setLayoutParams(new n1(-1, -2));
        } else {
            mVar.itemView.setLayoutParams(new n1(0, 0));
        }
        TextView textView = mVar.f32071a;
        ImageView imageView = mVar.f32073c;
        TextView textView2 = mVar.f32072b;
        textView.setText(this.f32077a[i11]);
        String str = this.f32078b[i11];
        if (str == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str);
        }
        Drawable drawable = this.f32079c[i11];
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.b1
    public final g2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        PlayerControlView playerControlView = this.f32080d;
        return new m(playerControlView, LayoutInflater.from(playerControlView.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }
}
