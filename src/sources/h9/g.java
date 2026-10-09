package h9;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.g2;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.List;
import y6.p0;
import y6.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f32033a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f32034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f32036d;

    public g(PlayerControlView playerControlView, int i11) {
        this.f32035c = i11;
        this.f32036d = playerControlView;
        this.f32034b = playerControlView;
    }

    public boolean a(t0 t0Var) {
        for (int i11 = 0; i11 < this.f32033a.size(); i11++) {
            if (t0Var.f57356s.containsKey(((p) this.f32033a.get(i11)).f32084a.f57364b)) {
                return true;
            }
        }
        return false;
    }

    public void b(List list) {
        PlayerControlView playerControlView = this.f32036d;
        ImageView imageView = playerControlView.f2243h0;
        boolean z11 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            p pVar = (p) list.get(i11);
            if (pVar.f32084a.f57367e[pVar.f32085b]) {
                z11 = true;
                break;
            }
        }
        if (imageView != null) {
            imageView.setImageDrawable(z11 ? playerControlView.J0 : playerControlView.K0);
            imageView.setContentDescription(z11 ? playerControlView.L0 : playerControlView.M0);
        }
        this.f32033a = list;
    }

    public void c(o oVar, int i11) {
        switch (this.f32035c) {
            case 1:
                d(oVar, i11);
                if (i11 > 0) {
                    p pVar = (p) this.f32033a.get(i11 - 1);
                    oVar.f32083b.setVisibility(pVar.f32084a.f57367e[pVar.f32085b] ? 0 : 4);
                }
                break;
            default:
                d(oVar, i11);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    public final void d(o oVar, int i11) {
        boolean z11;
        boolean z12;
        y6.j0 j0Var = this.f32034b.R0;
        if (j0Var == null) {
        }
        if (i11 != 0) {
            p pVar = (p) this.f32033a.get(i11 - 1);
            p0 p0Var = pVar.f32084a.f57364b;
            if (j0Var.J().f57356s.get(p0Var) != null) {
                z11 = pVar.f32084a.f57367e[pVar.f32085b];
            }
            oVar.f32082a.setText(pVar.f32086c);
            oVar.f32083b.setVisibility(z11 ? 0 : 4);
            oVar.itemView.setOnClickListener(new q(this, j0Var, p0Var, pVar, 0));
            return;
        }
        switch (this.f32035c) {
            case 0:
                oVar.f32082a.setText(R.string.exo_track_selection_auto);
                y6.j0 j0Var2 = this.f32036d.R0;
                j0Var2.getClass();
                oVar.f32083b.setVisibility(a(j0Var2.J()) ? 4 : 0);
                oVar.itemView.setOnClickListener(new aj.b(this, 5));
                break;
            default:
                oVar.f32082a.setText(R.string.exo_track_selection_none);
                int i12 = 0;
                while (true) {
                    if (i12 < this.f32033a.size()) {
                        p pVar2 = (p) this.f32033a.get(i12);
                        if (pVar2.f32084a.f57367e[pVar2.f32085b]) {
                            z12 = false;
                        } else {
                            i12++;
                        }
                    } else {
                        z12 = true;
                    }
                }
                oVar.f32083b.setVisibility(z12 ? 0 : 4);
                oVar.itemView.setOnClickListener(new aj.b(this, 7));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b1
    public final int getItemCount() {
        if (this.f32033a.isEmpty()) {
            return 0;
        }
        return this.f32033a.size() + 1;
    }

    @Override // androidx.recyclerview.widget.b1
    public /* bridge */ /* synthetic */ void onBindViewHolder(g2 g2Var, int i11) {
        switch (this.f32035c) {
            case 1:
                c((o) g2Var, i11);
                break;
            default:
                c((o) g2Var, i11);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b1
    public final g2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        return new o(LayoutInflater.from(this.f32034b.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    private final void e(String str) {
    }
}
