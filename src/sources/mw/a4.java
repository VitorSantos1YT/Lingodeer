package mw;

import com.google.common.base.Strings;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a4 extends lw.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f42339a;

    static {
        f42339a = !Strings.b(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // lw.y
    public final lw.q0 g(lw.f fVar) {
        return f42339a ? new u3(fVar) : new z3(fVar);
    }

    @Override // lw.r0
    public final String r() {
        return "pick_first";
    }

    @Override // lw.r0
    public final lw.g1 s(Map map) {
        try {
            return new lw.g1(new x3(e2.b("shuffleAddressList", map)));
        } catch (RuntimeException e8) {
            return new lw.g1(lw.q1.m.g(e8).h("Failed parsing configuration for pick_first"));
        }
    }
}
