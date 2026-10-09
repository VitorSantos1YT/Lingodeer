package p7;

import android.net.Uri;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7.p f46325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x7.m f46326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x7.j f46327c;

    public b(x7.p pVar) {
        this.f46325a = pVar;
    }

    public final long a() {
        x7.j jVar = this.f46327c;
        if (jVar != null) {
            return jVar.f55901d;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    public final void b(d7.f fVar, Uri uri, Map map, long j11, long j12, s0 s0Var) throws UnrecognizedInputFormatException {
        x7.j jVar = new x7.j(fVar, j11, j12);
        this.f46327c = jVar;
        if (this.f46326b != null) {
            return;
        }
        x7.m[] mVarArrG = this.f46325a.g(uri, map);
        ImmutableList.Builder builderL = ImmutableList.l(mVarArrG.length);
        boolean z11 = true;
        if (mVarArrG.length == 1) {
            this.f46326b = mVarArrG[0];
        } else {
            for (x7.m mVar : mVarArrG) {
                try {
                    if (mVar.c(jVar)) {
                        this.f46326b = mVar;
                        jVar.f55903f = 0;
                        break;
                    }
                    builderL.f(mVar.h());
                    boolean z12 = this.f46326b != null || jVar.f55901d == j11;
                    b7.a.j(z12);
                    jVar.f55903f = 0;
                } catch (EOFException unused) {
                    if (this.f46326b != null || jVar.f55901d == j11) {
                    }
                } catch (Throwable th2) {
                    if (this.f46326b == null && jVar.f55901d != j11) {
                        z11 = false;
                    }
                    b7.a.j(z11);
                    jVar.f55903f = 0;
                    throw th2;
                }
                b7.a.j(z12);
                jVar.f55903f = 0;
            }
            if (this.f46326b == null) {
                String str = "None of the available extractors (" + new Joiner(", ").c(Lists.e(ImmutableList.o(mVarArrG), new a7.c(5))) + ") could read the stream.";
                uri.getClass();
                ImmutableList immutableListJ = builderL.j();
                UnrecognizedInputFormatException unrecognizedInputFormatException = new UnrecognizedInputFormatException(str, null, false, 1);
                ImmutableList.n(immutableListJ);
                throw unrecognizedInputFormatException;
            }
        }
        this.f46326b.e(s0Var);
    }
}
