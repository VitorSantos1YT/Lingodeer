package okhttp3.internal.http2;

import kotlin.jvm.internal.m;
import okhttp3.internal.http2.flowcontrol.WindowCounter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface FlowControlListener {
    void a(WindowCounter windowCounter);

    void b(WindowCounter windowCounter);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class None implements FlowControlListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f45388a = new None();

        private None() {
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public final void b(WindowCounter windowCounter) {
            m.f(windowCounter, "windowCounter");
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public final void a(WindowCounter windowCounter) {
        }
    }
}
