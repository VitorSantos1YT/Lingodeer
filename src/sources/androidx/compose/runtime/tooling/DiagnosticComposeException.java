package androidx.compose.runtime.tooling;

import hz.b;
import java.util.ArrayList;
import ns.o;
import oz.j;
import ry.m;
import sy.c;
import y1.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticComposeException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1134a;

    public DiagnosticComposeException(a aVar) {
        this.f1134a = aVar;
        if (aVar.a()) {
            return;
        }
        ArrayList arrayListX = b.x(aVar);
        int size = arrayListX.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i11 = 0; i11 < size; i11++) {
            stackTraceElementArr[i11] = new StackTraceElement("$$compose", "m$" + ((y1.b) arrayListX.get(i11)).f56812a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        a aVar = this.f1134a;
        if (!aVar.a()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
        int i11 = 0;
        if (aVar.a()) {
            c cVarO = o.o();
            j jVarF0 = m.f0(aVar.f56811a);
            int iB = jVarF0.b();
            for (int i12 = 0; i12 < iB; i12++) {
                ((y1.b) jVarF0.get(i12)).getClass();
            }
            j jVarF1 = m.f0(o.e(cVarO));
            int iB2 = jVarF1.b();
            while (i11 < iB2) {
                String str = (String) jVarF1.get(i11);
                sb2.append("\tat ");
                sb2.append(str);
                sb2.append('\n');
                i11++;
            }
        } else {
            ArrayList arrayListX = b.x(aVar);
            int size = arrayListX.size();
            while (i11 < size) {
                y1.b bVar = (y1.b) arrayListX.get(i11);
                sb2.append("\tat $$compose.m$");
                sb2.append(bVar.f56812a);
                sb2.append("(SourceFile:1)\n");
                i11++;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }
}
