package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCardView f32571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialButton f32572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f32573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SlowPlaySwitchBtn f32574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32575f;

    public f5(LinearLayout linearLayout, MaterialCardView materialCardView, MaterialButton materialButton, RecyclerView recyclerView, SlowPlaySwitchBtn slowPlaySwitchBtn, View view) {
        this.f32570a = linearLayout;
        this.f32571b = materialCardView;
        this.f32572c = materialButton;
        this.f32573d = recyclerView;
        this.f32574e = slowPlaySwitchBtn;
        this.f32575f = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32570a;
    }
}
