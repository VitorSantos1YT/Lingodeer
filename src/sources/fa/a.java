package fa;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import cr.n;
import da.g;
import dt.p4;
import fr.p3;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f27029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f27030b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f27034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27035g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3 f27031c = new p3(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f27032d = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27036h = true;

    public a(g gVar, n nVar) {
        this.f27029a = gVar;
        this.f27030b = nVar;
    }

    public final void a() {
        g gVar = this.f27029a;
        if (gVar.getLifecycle().getCurrentState() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f27033e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f27030b.invoke();
        gVar.getLifecycle().addObserver(new p4(this, 1));
        this.f27033e = true;
    }
}
