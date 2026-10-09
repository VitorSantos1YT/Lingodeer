package j00;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String message, int i11) {
        super(message);
        switch (i11) {
            case 1:
                m.f(message, "message");
                super(message);
                break;
            default:
                m.f(message, "msg");
                break;
        }
    }
}
