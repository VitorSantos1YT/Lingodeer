package hj;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f32945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EditText f32946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialButton f32947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32948f;

    public n(LinearLayout linearLayout, MaterialButton materialButton, EditText editText, EditText editText2, MaterialButton materialButton2, View view) {
        this.f32943a = linearLayout;
        this.f32944b = materialButton;
        this.f32945c = editText;
        this.f32946d = editText2;
        this.f32947e = materialButton2;
        this.f32948f = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32943a;
    }
}
