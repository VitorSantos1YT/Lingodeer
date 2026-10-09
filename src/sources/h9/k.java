package h9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.g2;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f32065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f32066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f32068d;

    public k(PlayerControlView playerControlView, String[] strArr, float[] fArr) {
        this.f32068d = playerControlView;
        this.f32065a = strArr;
        this.f32066b = fArr;
    }

    @Override // androidx.recyclerview.widget.b1
    public final int getItemCount() {
        return this.f32065a.length;
    }

    @Override // androidx.recyclerview.widget.b1
    public final void onBindViewHolder(g2 g2Var, final int i11) {
        o oVar = (o) g2Var;
        String[] strArr = this.f32065a;
        if (i11 < strArr.length) {
            oVar.f32082a.setText(strArr[i11]);
        }
        if (i11 == this.f32067c) {
            oVar.itemView.setSelected(true);
            oVar.f32083b.setVisibility(0);
        } else {
            oVar.itemView.setSelected(false);
            oVar.f32083b.setVisibility(4);
        }
        oVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: h9.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k kVar = this.f32063a;
                PlayerControlView playerControlView = kVar.f32068d;
                int i12 = kVar.f32067c;
                int i13 = i11;
                if (i13 != i12) {
                    playerControlView.setPlaybackSpeed(kVar.f32066b[i13]);
                }
                playerControlView.S.dismiss();
            }
        });
    }

    @Override // androidx.recyclerview.widget.b1
    public final g2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        return new o(LayoutInflater.from(this.f32068d.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
