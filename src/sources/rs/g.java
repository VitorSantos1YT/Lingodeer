package rs;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import hh.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49409c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return m.a(this.f49407a, gVar.f49407a) && m.a(this.f49408b, gVar.f49408b) && this.f49409c == gVar.f49409c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49409c) + defpackage.e.d(this.f49407a.hashCode() * 31, 31, this.f49408b);
    }

    public final String toString() {
        return p0.i(this.f49409c, ")", defpackage.e.s("SessionSentenceWordStructure(word=", this.f49407a, ", zhuyin=", this.f49408b, ", wordType="));
    }

    public g(String word, String str, int i11) {
        m.f(word, "word");
        m.f(str, scqhIrGXy.cTYLpf);
        this.f49407a = word;
        this.f49408b = str;
        this.f49409c = i11;
    }
}
