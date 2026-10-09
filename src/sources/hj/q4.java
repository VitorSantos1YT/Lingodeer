package hj;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f33159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f33160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f33161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f33162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f33163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f33164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f33165h;

    public q4(ConstraintLayout constraintLayout, MaterialButton materialButton, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f33158a = constraintLayout;
        this.f33159b = materialButton;
        this.f33160c = recyclerView;
        this.f33161d = recyclerView2;
        this.f33162e = textView;
        this.f33163f = textView2;
        this.f33164g = textView3;
        this.f33165h = textView4;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33158a;
    }
}
