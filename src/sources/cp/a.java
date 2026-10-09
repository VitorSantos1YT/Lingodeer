package cp;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.Unit;
import com.lingo.lingoskill.ui.base.adapter.BaseLearnAdapter2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseLearnAdapter2 f22421b;

    public /* synthetic */ a(BaseLearnAdapter2 baseLearnAdapter2, View view, BaseViewHolder baseViewHolder, int i11) {
        this.f22420a = i11;
        this.f22421b = baseLearnAdapter2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f22420a) {
            case 0:
                this.f22421b.getClass();
                break;
            case 1:
                this.f22421b.getClass();
                break;
            case 2:
                this.f22421b.getClass();
                break;
            default:
                this.f22421b.getClass();
                break;
        }
    }

    public /* synthetic */ a(BaseLearnAdapter2 baseLearnAdapter2, Unit unit, ConstraintLayout constraintLayout, BaseViewHolder baseViewHolder, int i11) {
        this.f22420a = i11;
        this.f22421b = baseLearnAdapter2;
    }
}
