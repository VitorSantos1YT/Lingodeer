package hj;

import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f33003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialButton f33004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EditText f33005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecyclerView f33006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f33007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MaterialSwitch f33008g;

    public o0(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, EditText editText, RecyclerView recyclerView, View view, MaterialSwitch materialSwitch) {
        this.f33002a = constraintLayout;
        this.f33003b = materialButton;
        this.f33004c = materialButton2;
        this.f33005d = editText;
        this.f33006e = recyclerView;
        this.f33007f = view;
        this.f33008g = materialSwitch;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33002a;
    }
}
