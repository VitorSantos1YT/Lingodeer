package g6;

import androidx.datastore.core.CorruptionException;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.h0;
import androidx.glance.appwidget.protobuf.t0;
import androidx.glance.appwidget.protobuf.w0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;
import n5.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f28782a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f28783b;

    static {
        f fVarN = f.n();
        kotlin.jvm.internal.m.e(fVarN, "getDefaultInstance()");
        f28783b = fVarN;
    }

    @Override // n5.s0
    public final Object a() {
        return f28783b;
    }

    @Override // n5.s0
    public final Object b(FileInputStream fileInputStream) throws CorruptionException {
        try {
            return f.q(fileInputStream);
        } catch (InvalidProtocolBufferException e8) {
            throw new CorruptionException("Cannot read proto.", e8);
        }
    }

    @Override // n5.s0
    public final void c(Object obj, m00.h hVar) throws IOException {
        f fVar = (f) obj;
        fVar.getClass();
        int iA = fVar.a(null);
        Logger logger = androidx.glance.appwidget.protobuf.l.f1958h;
        if (iA > 4096) {
            iA = 4096;
        }
        androidx.glance.appwidget.protobuf.l lVar = new androidx.glance.appwidget.protobuf.l(hVar, iA);
        fVar.getClass();
        t0 t0Var = t0.f1996c;
        t0Var.getClass();
        w0 w0VarA = t0Var.a(fVar.getClass());
        h0 h0Var = lVar.f1960c;
        if (h0Var == null) {
            h0Var = new h0(lVar);
        }
        w0VarA.h(fVar, h0Var);
        if (lVar.f1963f > 0) {
            lVar.d0();
        }
    }
}
