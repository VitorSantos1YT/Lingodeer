package h9;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.g2;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f32071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f32072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f32074d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PlayerControlView playerControlView, View view) {
        super(view);
        this.f32074d = playerControlView;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.f32071a = (TextView) view.findViewById(R.id.exo_main_text);
        this.f32072b = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f32073c = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new aj.b(this, 6));
    }
}
