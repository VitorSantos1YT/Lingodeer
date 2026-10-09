package gf;

import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ se.f f29176c;

    public /* synthetic */ a(String str, se.f fVar, int i11) {
        this.f29174a = i11;
        this.f29175b = str;
        this.f29176c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = h.f29185a;
        int i11 = this.f29174a;
        se.f event = this.f29176c;
        String applicationId = this.f29175b;
        switch (i11) {
            case 0:
                if (!qf.a.b(c.class)) {
                    try {
                        m.f(applicationId, "$applicationId");
                        m.f(event, "$event");
                        List listK = o.K(event);
                        if (!qf.a.b(h.class)) {
                            try {
                                hVar.b(e.CUSTOM_APP_EVENTS, applicationId, listK);
                            } catch (Throwable th2) {
                                qf.a.a(h.class, th2);
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th3) {
                        qf.a.a(c.class, th3);
                        return;
                    }
                }
                break;
            default:
                if (!qf.a.b(ze.a.class)) {
                    try {
                        ze.a.f59209a.c(applicationId, event);
                    } catch (Throwable th4) {
                        qf.a.a(ze.a.class, th4);
                    }
                    break;
                }
                break;
        }
    }
}
