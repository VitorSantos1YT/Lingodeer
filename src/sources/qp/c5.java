package qp;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Word;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c5 implements LayoutTransition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlexboxLayout f47874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f47875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d5 f47876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ImageView f47877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CardView f47878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextView f47879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Word f47880g;

    public c5(FlexboxLayout flexboxLayout, View view, d5 d5Var, ImageView imageView, CardView cardView, TextView textView, Word word) {
        this.f47874a = flexboxLayout;
        this.f47875b = view;
        this.f47876c = d5Var;
        this.f47877d = imageView;
        this.f47878e = cardView;
        this.f47879f = textView;
        this.f47880g = word;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition transition, ViewGroup container, View view, int i11) {
        kotlin.jvm.internal.m.f(transition, "transition");
        kotlin.jvm.internal.m.f(container, "container");
        kotlin.jvm.internal.m.f(view, "view");
        view.getId();
        FlexboxLayout flexboxLayout = this.f47874a;
        if (flexboxLayout.indexOfChild(view) == flexboxLayout.indexOfChild(this.f47875b)) {
            ImageView imageView = this.f47877d;
            kotlin.jvm.internal.m.c(imageView);
            TextView textView = this.f47879f;
            kotlin.jvm.internal.m.c(textView);
            this.f47876c.w(imageView, this.f47878e, textView, this.f47880g);
        }
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition transition, ViewGroup container, View view, int i11) {
        kotlin.jvm.internal.m.f(transition, "transition");
        kotlin.jvm.internal.m.f(container, "container");
        kotlin.jvm.internal.m.f(view, "view");
    }
}
