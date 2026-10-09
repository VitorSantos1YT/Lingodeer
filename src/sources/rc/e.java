package rc;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.recyclerview.widget.g2;
import com.lingodeer.R;
import fz.f;
import kotlin.jvm.internal.m;
import lc.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatRadioButton f49086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f49087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f49088c;

    public e(View view, d dVar) {
        super(view);
        this.f49088c = dVar;
        view.setOnClickListener(this);
        View viewFindViewById = view.findViewById(R.id.md_control);
        m.b(viewFindViewById, "itemView.findViewById(R.id.md_control)");
        this.f49086a = (AppCompatRadioButton) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.md_title);
        m.b(viewFindViewById2, "itemView.findViewById(R.id.md_title)");
        this.f49087b = (TextView) viewFindViewById2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (getAdapterPosition() < 0) {
            return;
        }
        int adapterPosition = getAdapterPosition();
        d dVar = this.f49088c;
        lc.d dVar2 = dVar.f49080c;
        int i11 = dVar.f49078a;
        if (adapterPosition != i11) {
            dVar.f49078a = adapterPosition;
            dVar.notifyItemChanged(i11, a.f49076b);
            dVar.notifyItemChanged(adapterPosition, a.f49075a);
        }
        if (dVar.f49082e && android.support.v4.media.session.a.z(dVar2)) {
            android.support.v4.media.session.a.r(dVar2, h.POSITIVE).setEnabled(true);
            return;
        }
        f fVar = dVar.f49083f;
        if (fVar != null) {
        }
        if (!dVar2.f39879b || android.support.v4.media.session.a.z(dVar2)) {
            return;
        }
        dVar2.dismiss();
    }
}
