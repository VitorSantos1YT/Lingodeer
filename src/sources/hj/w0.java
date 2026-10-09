package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f33496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialButton f33497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f33498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f33499e;

    public w0(ConstraintLayout constraintLayout, ImageView imageView, MaterialButton materialButton, TextView textView, View view) {
        this.f33495a = constraintLayout;
        this.f33496b = imageView;
        this.f33497c = materialButton;
        this.f33498d = textView;
        this.f33499e = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33495a;
    }
}
