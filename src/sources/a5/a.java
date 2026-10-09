package a5;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f358c;

    public a(int i11, g gVar, int i12) {
        this.f356a = i11;
        this.f357b = gVar;
        this.f358c = i12;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f356a);
        this.f357b.f380a.performAction(this.f358c, bundle);
    }
}
