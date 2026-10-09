package tp;

import android.widget.TextView;
import androidx.recyclerview.widget.b1;
import androidx.viewpager2.widget.ViewPager2;
import com.lingo.lingoskill.object.LanCustomInfo;
import com.lingo.lingoskill.ui.review.AckCardActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AckCardActivity f52444a;

    public c(AckCardActivity ackCardActivity) {
        this.f52444a = ackCardActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i11) {
        super.onPageSelected(i11);
        AckCardActivity ackCardActivity = this.f52444a;
        if (ackCardActivity.S == 0) {
            LanCustomInfo lanCustomInfoA = ub.a.Z().a();
            lanCustomInfoA.setAckEnterPos(Integer.valueOf(i11));
            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoA);
        }
        TextView textView = ((hj.f) ackCardActivity.j()).f32553i;
        int i12 = i11 + 1;
        b1 adapter = ((hj.f) ackCardActivity.j()).f32555k.getAdapter();
        textView.setText(i12 + "/" + (adapter != null ? Integer.valueOf(adapter.getItemCount()) : null));
    }
}
