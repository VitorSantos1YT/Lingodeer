package hj;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.lingo.fluent.widget.DonutProgress;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f32585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DonutProgress f32587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PlayerView f32588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32589f;

    public g(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, DonutProgress donutProgress, PlayerView playerView, View view) {
        this.f32584a = constraintLayout;
        this.f32585b = imageView;
        this.f32586c = imageView2;
        this.f32587d = donutProgress;
        this.f32588e = playerView;
        this.f32589f = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32584a;
    }
}
