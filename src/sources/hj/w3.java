package hj;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f33517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f33518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f33519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f33520e;

    public w3(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        this.f33516a = linearLayout;
        this.f33517b = linearLayout2;
        this.f33518c = linearLayout3;
        this.f33519d = linearLayout4;
        this.f33520e = linearLayout5;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33516a;
    }
}
