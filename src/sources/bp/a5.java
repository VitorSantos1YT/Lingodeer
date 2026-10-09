package bp;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a5 implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4492b;

    public /* synthetic */ a5(View view, int i11) {
        this.f4491a = i11;
        this.f4492b = view;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f4491a) {
            case 0:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                View view = this.f4492b;
                view.setVisibility(4);
                view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                break;
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ((ConstraintLayout) this.f4492b.findViewById(R.id.item_view)).performClick();
                break;
        }
    }
}
