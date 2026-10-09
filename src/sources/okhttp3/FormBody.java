package okhttp3;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import m00.i;
import m00.j;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class FormBody extends RequestBody {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MediaType f45030c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45032b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f45033a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f45034b = new ArrayList();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        MediaType.f45062e.getClass();
        f45030c = MediaType.Companion.a("application/x-www-form-urlencoded");
    }

    public FormBody(ArrayList encodedNames, ArrayList encodedValues) {
        m.f(encodedNames, "encodedNames");
        m.f(encodedValues, "encodedValues");
        this.f45031a = _UtilJvmKt.j(encodedNames);
        this.f45032b = _UtilJvmKt.j(encodedValues);
    }

    public final long a(j jVar, boolean z11) throws EOFException {
        i iVarN;
        if (z11) {
            iVarN = new i();
        } else {
            m.c(jVar);
            iVarN = jVar.n();
        }
        List list = this.f45031a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                iVarN.J(38);
            }
            iVarN.Y((String) list.get(i11));
            iVarN.J(61);
            iVarN.Y((String) this.f45032b.get(i11));
        }
        if (!z11) {
            return 0L;
        }
        long j11 = iVarN.f40718b;
        iVarN.a();
        return j11;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return a(null, true);
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return f45030c;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(j jVar) throws EOFException {
        a(jVar, false);
    }
}
