package hj;

import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f32373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f32374d;

    public b1(ConstraintLayout constraintLayout, MaterialButton materialButton, EditText editText, View view) {
        this.f32371a = constraintLayout;
        this.f32372b = materialButton;
        this.f32373c = editText;
        this.f32374d = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32371a;
    }
}
