package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f33264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f33265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e3 f33266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecyclerView f33267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f33268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f33269g;

    public s3(ConstraintLayout constraintLayout, j jVar, ImageView imageView, e3 e3Var, RecyclerView recyclerView, View view, TextView textView) {
        this.f33263a = constraintLayout;
        this.f33264b = jVar;
        this.f33265c = imageView;
        this.f33266d = e3Var;
        this.f33267e = recyclerView;
        this.f33268f = view;
        this.f33269g = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33263a;
    }
}
