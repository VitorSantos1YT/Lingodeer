package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f33040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f33041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f33042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f33043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f33044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f33045g;

    public o5(LinearLayout linearLayout, MaterialButton materialButton, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3) {
        this.f33039a = linearLayout;
        this.f33040b = materialButton;
        this.f33041c = recyclerView;
        this.f33042d = recyclerView2;
        this.f33043e = textView;
        this.f33044f = textView2;
        this.f33045g = textView3;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33039a;
    }
}
