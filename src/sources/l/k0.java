package l;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.yalantis.ucrop.view.CropImageView;
import java.util.WeakHashMap;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends ve.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f39026e;

    public /* synthetic */ k0(m0 m0Var, int i11) {
        this.f39025d = i11;
        this.f39026e = m0Var;
    }

    @Override // z4.x0
    public final void b(View view) {
        View view2;
        int i11 = this.f39025d;
        m0 m0Var = this.f39026e;
        switch (i11) {
            case 0:
                if (m0Var.f39048o && (view2 = m0Var.f39041g) != null) {
                    view2.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                    m0Var.f39038d.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                }
                m0Var.f39038d.setVisibility(8);
                m0Var.f39038d.setTransitioning(false);
                m0Var.f39052s = null;
                ob.u uVar = m0Var.f39045k;
                if (uVar != null) {
                    uVar.j(m0Var.f39044j);
                    m0Var.f39044j = null;
                    m0Var.f39045k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = m0Var.f39037c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = s0.f58893a;
                    z4.h0.c(actionBarOverlayLayout);
                }
                break;
            default:
                m0Var.f39052s = null;
                m0Var.f39038d.requestLayout();
                break;
        }
    }
}
