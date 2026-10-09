package qa;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f47639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f47640b;

    public j(View view, ArrayList arrayList) {
        this.f47639a = view;
        this.f47640b = arrayList;
    }

    @Override // qa.t
    public final void a(v vVar) {
        vVar.E(this);
        vVar.a(this);
    }

    @Override // qa.t
    public final void c(v vVar) {
        vVar.E(this);
        this.f47639a.setVisibility(8);
        ArrayList arrayList = this.f47640b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((View) arrayList.get(i11)).setVisibility(0);
        }
    }

    @Override // qa.t
    public final void b() {
    }

    @Override // qa.t
    public final void e() {
    }

    @Override // qa.t
    public final void f(v vVar) {
    }
}
